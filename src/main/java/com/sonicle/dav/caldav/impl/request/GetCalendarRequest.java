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
package com.sonicle.dav.caldav.impl.request;

import com.sonicle.dav.impl.PropRequest;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author malbinola
 */
public class GetCalendarRequest extends PropRequest {
	public static final String PROP_DISPLAYNAME = "d:displayname";
	public static final String PROP_GETCTAG = "cs:getctag";
	public static final String PROP_SYNCTOKEN = "d:sync-token";
	
	public GetCalendarRequest(Builder builder) {
		super(builder.props);
	}
	
	@Override
	public String toXML() throws IOException {
		StringBuilder xml = new StringBuilder();
		xml.append("<d:propfind xmlns:d=\"DAV:\" xmlns:cs=\"http://calendarserver.org/ns/\">");
		xml.append("<d:prop>");
		for (String prop : props) {
			if (prop.equals(PROP_DISPLAYNAME)) {
				xml.append("<d:displayname />");
			} else if (prop.equals(PROP_GETCTAG)) {
				xml.append("<cs:getctag />");
			} else if (prop.equals(PROP_SYNCTOKEN)) {
				xml.append("<d:sync-token />");
			}
		}
		xml.append("</d:prop>");
		xml.append("</d:propfind>");
		return xml.toString();
	}
	
	public static class Builder {
		private Set<String> props;
		
		public Builder() {
			this(new LinkedHashSet<String>());
		}
		
		public Builder(Set<String> props) {
			this.props = props;
		}
		
		public Builder needPropDisplayName() {
			props.add(PROP_DISPLAYNAME);
			return this;
		}
		
		public Builder needPropCTag() {
			props.add(PROP_GETCTAG);
			return this;
		}
		
		public Builder needPropSyncToken() {
			props.add(PROP_SYNCTOKEN);
			return this;
		}
		
		public GetCalendarRequest build() {
			return new GetCalendarRequest(this);
		}
	}
}
