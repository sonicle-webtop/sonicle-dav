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
package com.sonicle.dav;

import com.sonicle.dav.carddav.impl.CardDavImpl;
import java.net.ProxySelector;

/**
 *
 * @author malbinola
 */
public class CardDavFactory {
	
	/**
	 * Default begin() for when you don't need anything but no authentication
	 * and default settings for SSL.
	 * @return 
	 */
	public static CardDav begin() {
		return begin(null, null);
	}
	
	/**
	 * Pass in a HTTP Auth username/password for being used with all 
	 * connections.
	 * @param username Use in authentication header credentials.
	 * @param password Use in authentication header credentials.
	 * @return 
	 */
	public static CardDav begin(String username, String password) {
		return begin(username, password, null);
	}
	
	/**
	 * @param username Use in authentication header credentials.
	 * @param password Use in authentication header credentials.
	 * @param proxy Proxy configuration.
	 * @return 
	 */
	public static CardDav begin(String username, String password, ProxySelector proxy) {
		return new CardDavImpl(username, password, proxy);
	}
}
