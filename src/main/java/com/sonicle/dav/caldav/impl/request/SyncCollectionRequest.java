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

import com.sonicle.dav.impl.AbstractRequest;
import java.io.IOException;
import org.apache.commons.lang3.StringEscapeUtils;

/**
 *
 * @author malbinola
 */
public class SyncCollectionRequest extends AbstractRequest {
	private final String syncToken;
	private final int syncLevel;
	
	public SyncCollectionRequest(Builder builder) {
		this.syncToken = builder.syncToken;
		this.syncLevel = builder.syncLevel;
	}
	
	@Override
	public String toXML() throws IOException {
		StringBuilder xml = new StringBuilder();
		xml.append("<d:sync-collection xmlns:d=\"DAV:\">");
		xml.append("<d:sync-token>");
		//xml.append(StringEscapeUtils.escapeXml11(syncToken));
		xml.append(syncToken);
		xml.append("</d:sync-token>");
		xml.append("<d:sync-level>");
		xml.append(String.valueOf(syncLevel));
		xml.append("</d:sync-level>");
		xml.append("<d:prop>");
		xml.append("<d:getetag/>");
		xml.append("</d:prop>");
		xml.append("</d:sync-collection>");
		return xml.toString();
	}
	
	public static class Builder {
		private String syncToken;
		private int syncLevel;
		
		public Builder() {
			this.syncLevel = 1;
		}
		
		public Builder setSyncToken(String syncToken) {
			this.syncToken = syncToken;
			return this;
		}
		
		public Builder setSyncLevel(int syncLevel) {
			this.syncLevel = syncLevel;
			return this;
		}
		
		public SyncCollectionRequest build() {
			return new SyncCollectionRequest(this);
		}
	}
}
