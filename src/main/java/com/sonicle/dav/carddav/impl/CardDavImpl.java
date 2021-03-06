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
package com.sonicle.dav.carddav.impl;

import com.sonicle.dav.CardDav;
import com.sonicle.dav.DavSyncStatus;
import com.sonicle.dav.TrustAllCertsSSLConnectionSocketFactory;
import com.sonicle.dav.carddav.DavAddressbook;
import com.sonicle.dav.carddav.DavAddressbookCard;
import com.sonicle.dav.carddav.impl.request.GetAddressbookRequest;
import com.sonicle.dav.carddav.impl.request.MultigetRequest;
import com.sonicle.dav.carddav.impl.request.SyncCollectionRequest;
import com.sonicle.dav.carddav.impl.response.GetAddressbookHandler;
import com.sonicle.dav.carddav.impl.response.SyncCollectionHandler;
import com.sonicle.dav.carddav.impl.response.VCardObjectsHandler;
import com.sonicle.dav.impl.DavException;
import com.sonicle.dav.impl.DavImpl;
import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.conn.socket.ConnectionSocketFactory;

/**
 *
 * @author malbinola
 */
public class CardDavImpl extends DavImpl implements CardDav {
	
	public CardDavImpl() {
		super();
	}
	
	public CardDavImpl(String bearerAuth) {
		super(bearerAuth);
	}
	
	public CardDavImpl(String username, String password) {
		super(username, password);
	}
	
	public CardDavImpl(String username, String password, ProxySelector selector) {
		super(username, password, selector);
	}
	
	@Override
	protected ConnectionSocketFactory createDefaultSecureSocketFactory() {
		return TrustAllCertsSSLConnectionSocketFactory.getInstance();
	}

	@Override
	public DavAddressbook getAddressbook(String addressbookUrl) throws DavException {
		GetAddressbookRequest request = new GetAddressbookRequest.Builder()
				.needPropCTag()
				.needPropDisplayName()
				.build();
		return getAddressbook(addressbookUrl, request);
	}

	@Override
	public DavAddressbook getAddressbook(String addressbookUrl, GetAddressbookRequest request) throws DavException {
		try {
			List<DavAddressbook> result = propfind(addressbookUrl, 0, request.toXML(), new GetAddressbookHandler());
			return result.isEmpty() ? null :result.get(0);
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}

	@Override
	public DavAddressbook getAddressbookSyncToken(String addressbookUrl) throws DavException {
		GetAddressbookRequest request = new GetAddressbookRequest.Builder()
				.needPropCTag()
				.needPropSyncToken()
				.build();
		return getAddressbook(addressbookUrl, request);
	}

	@Override
	public List<DavSyncStatus> getAddressbookChanges(String addressbookUrl, String syncToken) throws DavException {
		SyncCollectionRequest request = new SyncCollectionRequest.Builder()
				.setSyncToken(syncToken)
				.build();
		try {
			return this.report(addressbookUrl, 1, request.toXML(), new SyncCollectionHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}

	@Override
	public List<DavAddressbookCard> listAddressbookCardETags(String addressbookUrl) throws DavException {
		// NB: c:filter element is required only by Google CardDAV backend!
		// See: https://stackoverflow.com/questions/23742568/google-carddav-api-addressbook-multiget-returns-400-bad-request
		String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"
				+ "<c:addressbook-query xmlns:d=\"DAV:\" xmlns:c=\"urn:ietf:params:xml:ns:carddav\">\n"
				+ "  <d:prop>\n"
				+ "    <d:getetag/>\n"
				+ "  </d:prop>\n"
				+ (!isGoogle(addressbookUrl) ? "" : "  <c:filter><c:prop-filter name=\"FN\"></c:prop-filter></c:filter>")
				//+ "  <c:filter>\n"
				//+ "    <c:prop-filter name=\"FN\">\n"
				//+ "    </c:prop-filter>\n"
				//+ "  </c:filter>\n"
				+ "</c:addressbook-query>";
		
		try {
			return this.report(addressbookUrl, 1, xmlRequest, new VCardObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}

	@Override
	public List<DavAddressbookCard> listAddressbookCards(String addressbookUrl) throws DavException {
		// NB: c:filter element is required only by Google CardDAV backend!
		// See: https://stackoverflow.com/questions/23742568/google-carddav-api-addressbook-multiget-returns-400-bad-request
		String xmlRequest = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"
				+ "<c:addressbook-query xmlns:d=\"DAV:\" xmlns:c=\"urn:ietf:params:xml:ns:carddav\">\n"
				+ "  <d:prop>\n"
				+ "    <d:getetag/>\n"
				+ "    <c:address-data />\n"
				+ "  </d:prop>\n"
				+ (!isGoogle(addressbookUrl) ? "" : "  <c:filter><c:prop-filter name=\"FN\"></c:prop-filter></c:filter>")
				//+ "  <c:filter>\n"
				//+ "    <c:prop-filter name=\"FN\">\n"
				//+ "    </c:prop-filter>\n"
				//+ "  </c:filter>\n"
				+ "</c:addressbook-query>";
		
		try {
			return this.report(addressbookUrl, 1, xmlRequest, new VCardObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}

	@Override
	public List<DavAddressbookCard> listAddressbookCards(String addressbookUrl, Collection<String> paths) throws DavException {
		MultigetRequest request = new MultigetRequest.Builder(paths)
				.build();
		try {
			return this.report(addressbookUrl, 1, request, new VCardObjectsHandler());
		} catch(IOException ex) {
			throw new DavException(ex);
		}
	}
	
	private boolean isGoogle(String url) {
		try {
			return StringUtils.containsIgnoreCase(new URI(url).getHost(), "google");
		} catch(URISyntaxException ex) {
			return false;
		}
	}
}
