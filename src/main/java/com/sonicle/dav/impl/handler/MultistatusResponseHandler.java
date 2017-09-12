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
package com.sonicle.dav.impl.handler;

import com.github.sardine.impl.SardineException;
import com.github.sardine.impl.handler.ValidatingResponseHandler;
import com.sonicle.dav.DavUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;

/**
 *
 * @author malbinola
 * @param <T>
 */
public class MultistatusResponseHandler<T> extends ValidatingResponseHandler<T> {
	private final Class objectFactory;
	
	public MultistatusResponseHandler(Class objectFactory) {
		this.objectFactory = objectFactory;
	}

	@Override
	public T handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
		super.validateResponse(response);
		
		// Process the response from the server.
		HttpEntity entity = response.getEntity();
		StatusLine statusLine = response.getStatusLine();
		
		if (entity == null) {
			throw new SardineException("No entity found in response", statusLine.getStatusCode(), statusLine.getReasonPhrase());
		}
		try {
			return (T) this.getMultistatus(entity.getContent());
		} catch(IOException ex) {
			// JAXB error unmarshalling response stream
			throw new SardineException(ex.getMessage(), statusLine.getStatusCode(), statusLine.getReasonPhrase());
		}
	}
	
	protected T getMultistatus(InputStream stream) throws IOException {
		//System.out.println(getStringFromInputStream(stream));
		return (T) DavUtil.unmarshal(stream, objectFactory);
	}
	
	private String getStringFromInputStream(InputStream is) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String line;
		
		try {
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
}
