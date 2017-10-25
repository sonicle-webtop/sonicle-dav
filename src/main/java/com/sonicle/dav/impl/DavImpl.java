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
package com.sonicle.dav.impl;

import com.github.sardine.impl.SardineImpl;
import com.github.sardine.impl.handler.HeadersResponseHandler;
import com.github.sardine.impl.methods.HttpPropFind;
import com.github.sardine.impl.methods.HttpReport;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.Map;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author malbinola
 */
public class DavImpl extends SardineImpl {
	public static final String UTF_8 = "UTF-8";
	
	public DavImpl() {
		super();
	}
	
	public DavImpl(String bearerAuth) {
		super(bearerAuth);
	}
	
	public DavImpl(String username, String password) {
		super(username, password);
	}
	
	public DavImpl(String username, String password, ProxySelector selector) {
		super(username, password, selector);
	}
	
	public <M, R> R propfind(String url, int depth, Request request, MultistatusHandler<M, R> handler) throws IOException, DavException {
		return propfind(url, depth, request.toXML(), handler);
	}
	
	public <M, R> R propfind(String url, int depth, String xmlRequest, MultistatusHandler<M, R> handler) throws IOException, DavException {
		HttpPropFind method = new HttpPropFind(url);
		method.setDepth(depth < 0 ? "infinity" : Integer.toString(depth));
		method.setEntity(new StringEntity(xmlRequest, UTF_8));
		return (R)handler.fromMultistatus(this.execute(method, handler.getResponseHandler()));
	}
	
	public <M, R> R report(String url, int depth, Request request, MultistatusHandler<M, R> handler) throws IOException, DavException {
		return report(url, depth, request.toXML(), handler);
	}
	
	public <M, R> R report(String url, int depth, String xmlRequest, MultistatusHandler<M, R> handler) throws IOException, DavException {
		HttpReport method = new HttpReport(url);
		method.setDepth(depth < 0 ? "infinity" : Integer.toString(depth));
		method.setEntity(new StringEntity(xmlRequest, UTF_8));
		return (R)handler.fromMultistatus(this.execute(method, handler.getResponseHandler()));
	}
	
	public Map<String, String> options(String url) throws IOException {
		HttpOptions method = new HttpOptions(url);
		return this.execute(method, new HeadersResponseHandler());
	}
}
