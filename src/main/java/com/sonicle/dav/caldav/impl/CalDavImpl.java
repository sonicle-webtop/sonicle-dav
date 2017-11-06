/* 
 * Copyright (C) 2017 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2017 Sonicle S.r.l.".
 */
package com.sonicle.dav.caldav.impl;

import com.sonicle.dav.caldav.impl.response.ICalendarObjectsHandler;
import com.github.sardine.model.ObjectFactory;
import com.github.sardine.model.Prop;
import com.github.sardine.model.Propfind;
import com.sonicle.dav.CalDav;
import com.sonicle.dav.DavSyncStatus;
import com.sonicle.dav.caldav.DavCalendarEvent;
import com.sonicle.dav.TrustAllCertsSSLConnectionSocketFactory;
import com.sonicle.dav.caldav.DavCalendar;
import com.sonicle.dav.caldav.impl.request.GetCalendarRequest;
import com.sonicle.dav.caldav.impl.request.MultigetRequest;
import com.sonicle.dav.caldav.impl.request.SyncCollectionRequest;
import com.sonicle.dav.caldav.impl.response.GetCalendarHandler;
import com.sonicle.dav.caldav.impl.response.SyncCollectionHandler;
import com.sonicle.dav.impl.DavException;
import com.sonicle.dav.impl.DavImpl;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author malbinola
 */
public class CalDavImpl extends DavImpl implements CalDav {
	private static final Logger log = (Logger) LoggerFactory.getLogger(CalDavImpl.class);
	
	public CalDavImpl() {
		super();
	}
	
	public CalDavImpl(String bearerAuth) {
		super(bearerAuth);
	}
	
	public CalDavImpl(String username, String password) {
		super(username, password);
	}
	
	public CalDavImpl(String username, String password, ProxySelector selector) {
		super(username, password, selector);
	}
	
	@Override
	protected ConnectionSocketFactory createDefaultSecureSocketFactory() {
		return TrustAllCertsSSLConnectionSocketFactory.getInstance();
	}
	
	@Override
	public DavCalendar getCalendar(String calendarUrl) throws DavException {
		GetCalendarRequest request = new GetCalendarRequest.Builder()
				.needPropCTag()
				.needPropDisplayName()
				.build();
		return getCalendar(calendarUrl, request);
	}
	
	@Override
	public DavCalendar getCalendar(String calendarUrl, GetCalendarRequest request) throws DavException {
		try {
			List<DavCalendar> result = propfind(calendarUrl, 0, request.toXML(), new GetCalendarHandler());
			return result.isEmpty() ? null :result.get(0);
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	@Override
	public DavCalendar getCalendarSyncToken(String calendarUrl) throws DavException {
		GetCalendarRequest request = new GetCalendarRequest.Builder()
				.needPropCTag()
				.needPropSyncToken()
				.build();
		return getCalendar(calendarUrl, request);
	}
	
	@Override
	public List<DavSyncStatus> getCalendarChanges(String calendarUrl, String syncToken) throws DavException {
		SyncCollectionRequest request = new SyncCollectionRequest.Builder()
				.setSyncToken(syncToken)
				.build();
		try {
			return this.report(calendarUrl, 0, request.toXML(), new SyncCollectionHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	@Override
	public List<DavCalendarEvent> listCalendarEventETags(String calendarUrl) throws DavException {
		String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"
				+ "<c:calendar-query xmlns:d=\"DAV:\" xmlns:c=\"urn:ietf:params:xml:ns:caldav\">\n"
				+ "  <d:prop>\n"
				+ "    <d:getetag/>\n"
				+ "  </d:prop>\n"
				+ "  <c:filter>\n"
				+ "    <c:comp-filter name=\"VCALENDAR\">\n"
				+ "      <c:comp-filter name=\"VEVENT\"/>\n"
				+ "    </c:comp-filter>\n"
				+ "  </c:filter>\n"
				+ "</c:calendar-query>";
		
		try {
			return this.report(calendarUrl, 1, xmlRequest, new ICalendarObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	@Override
	public List<DavCalendarEvent> listCalendarEvents(String calendarUrl) throws DavException {
		String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"
				+ "<c:calendar-query xmlns:d=\"DAV:\" xmlns:c=\"urn:ietf:params:xml:ns:caldav\">\n"
				+ "  <d:prop>\n"
				+ "    <c:calendar-data/>\n"
				+ "    <d:getetag/>\n"
				+ "  </d:prop>\n"
				+ "  <c:filter>\n"
				+ "    <c:comp-filter name=\"VCALENDAR\">\n"
				+ "      <c:comp-filter name=\"VEVENT\"/>\n"
				+ "    </c:comp-filter>\n"
				+ "  </c:filter>\n"
				+ "</c:calendar-query>";
		
		try {
			return this.report(calendarUrl, 1, xmlRequest, new ICalendarObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	@Override
	public List<DavCalendarEvent> listCalendarEvents(String calendarUrl, Collection<String> paths) throws DavException {
		MultigetRequest request = new MultigetRequest.Builder(paths)
				.build();
		try {
			return this.report(calendarUrl, 1, request, new ICalendarObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	protected Propfind createGetCalendarRequest() {
		ObjectFactory factory = new ObjectFactory();
		Prop prop = new Prop();
		prop.setGetetag(factory.createGetetag());
		prop.setDisplayname(factory.createDisplayname());
		
		Propfind propfind = new Propfind();
		propfind.setProp(prop);
		
		return propfind;
	}
	
	/*
	@Override
	public DavCalendar getCalendar(String calendarUrl) throws DavException {
		Propfind propfind = createGetCalendarRequest();
		
		try {
			List<DavResource> resources = propfind(calendarUrl, 0, propfind);
			return resources.isEmpty() ? null : new DavCalendar(resources.get(0));
		} catch(IOException ex) {
			throw new DavException(ex);
		}	
	}
	*/
	
	/*
	@Override
	public List<com.sonicle.sardine.CalendarEvent> query(String url) throws DavException {
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                     "<c:calendar-query xmlns:d=\"DAV:\" xmlns:c=\"urn:ietf:params:xml:ns:caldav\">\n" +
                     "  <d:prop>\n" +
                     "    <c:calendar-data/>\n" +
                     "    <d:getetag/>\n" +
                     "  </d:prop>\n" +
                     "  <c:filter>\n" +
                     "    <c:comp-filter name=\"VCALENDAR\">\n" +
                     "      <c:comp-filter name=\"VEVENT\">\n" +
                    // "        <c:time-range start=\"20070801T000000Z\" end=\"20070831T000000Z\"/>\n" +
                     "      </c:comp-filter>\n" +
                     "    </c:comp-filter>\n" +
                     "  </c:filter>\n" +
                     "</c:calendar-query>";
		
		try {
			return this.report(url, 1, xml, new ICalendarObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	*/
}
