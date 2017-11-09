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
package com.sonicle.dav.caldav.impl.response;

import static com.sonicle.dav.DavUtil.HTTP_SC_TEXT_OK;
import com.sonicle.dav.caldav.DavCalendarEvent;
import com.sonicle.dav.impl.MultistatusHandler;
import com.sonicle.dav.impl.DavException;
import com.sonicle.dav.impl.handler.MultistatusResponseHandler;
import zswi.schemas.dav.icalendarobjects.ObjectFactory;
import zswi.schemas.dav.icalendarobjects.Multistatus;
import zswi.schemas.dav.icalendarobjects.Prop;
import zswi.schemas.dav.icalendarobjects.Propstat;
import zswi.schemas.dav.icalendarobjects.Response;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.CalendarParser;
import net.fortuna.ical4j.data.CalendarParserFactory;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ParameterFactoryRegistry;
import net.fortuna.ical4j.model.PropertyFactoryRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.ResponseHandler;

/**
 *
 * @author malbinola
 */
public class ICalendarObjectsHandler extends MultistatusHandler<Multistatus, List<DavCalendarEvent>> {
	
	@Override
	public ResponseHandler<Multistatus> getResponseHandler() {
		return new MultistatusResponseHandler<>(ObjectFactory.class);
	}

	@Override
	public List<DavCalendarEvent> fromMultistatus(Multistatus multistatus) throws DavException {
		List<DavCalendarEvent> result = new ArrayList<>(multistatus.getResponse().size());
		try {
			final CalendarBuilder builder = createCalendarBuilder();
			for (Response response : multistatus.getResponse()) {
				for (Propstat propstat : response.getPropstat()) {
					if (HTTP_SC_TEXT_OK.equals(propstat.getStatus())) {
						result.add(createDavCalendarEvent(builder, response, propstat));
					}
				}
			}
		} catch(IOException | ParserException ex) {
			throw new DavException(ex);
		}
		return result;
	}
	
	protected DavCalendarEvent createDavCalendarEvent(final CalendarBuilder builder, final Response response, final Propstat propstat) throws IOException, ParserException {
		final Prop prop = propstat.getProp();
		
		Calendar calendar = null;
		if (!StringUtils.isBlank(prop.getCalendarData())) {
			calendar = builder.build(new StringReader(prop.getCalendarData()));
		}
		return new DavCalendarEvent(
				response.getHref(),
				prop.getGetetag(),
				calendar
		);
	}
	
	protected CalendarBuilder createCalendarBuilder() {
		CalendarParser parser = CalendarParserFactory.getInstance().createParser();
		PropertyFactoryRegistry propertyRegistry = new PropertyFactoryRegistry();
		//propertyRegistry.register(PreferredLanguage.PROPERTY_NAME, PreferredLanguage.FACTORY);
		ParameterFactoryRegistry parameterRegistry = new ParameterFactoryRegistry();
		TimeZoneRegistry tzRegistry = TimeZoneRegistryFactory.getInstance().createRegistry();
		return new CalendarBuilder(parser, propertyRegistry, parameterRegistry, tzRegistry);
	}
}
