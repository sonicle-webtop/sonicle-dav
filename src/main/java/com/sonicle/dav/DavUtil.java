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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import org.apache.commons.io.IOUtils;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author malbinola
 */
public class DavUtil {
	public static final String HTTP_SC_TEXT_OK = "HTTP/1.1 200 OK";
	public static final String HTTP_SC_TEXT_FORBIDDEN = "HTTP/1.1 403 Forbidden";
	
	public static <C> String toXml(Object jaxbElement, Class<C> objectFactory) throws IOException {
		Marshaller marshaller = createMarshaller(objectFactory);
		StringWriter writer = new StringWriter();
		
		try {
			marshaller.marshal(jaxbElement, writer);
		} catch(JAXBException ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		}
		return writer.toString();
	}
	
	public static <T, C> T unmarshal(InputStream in, Class<C> objectFactory) throws IOException {
		Unmarshaller unmarshaller = createUnmarshaller(objectFactory);
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			
			try {
				reader.setFeature("http://xml.org/sax/features/external-general-entities", Boolean.FALSE);
			} catch (SAXException ex) {
				//Not all parsers will support this attribute
			}
			try {
				reader.setFeature("http://xml.org/sax/features/external-parameter-entities", Boolean.FALSE);
			} catch (SAXException ex) {
				//Not all parsers will support this attribute
			}
			try {
				reader.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", Boolean.FALSE);
			} catch (SAXException ex) {
				//Not all parsers will support this attribute
			}
			try {
				reader.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.FALSE);
			} catch (SAXException ex) {
				//Not all parsers will support this attribute
			}
			return (T) unmarshaller.unmarshal(new SAXSource(reader, new InputSource(in)));
			
		} catch (SAXException ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		} catch (JAXBException ex) {
			// Server does not return any valid WebDAV XML that matches our JAXB context
			throw new IOException("Not a valid DAV response");
		} finally {
			if (unmarshaller instanceof Closeable) {
				IOUtils.closeQuietly((Closeable)unmarshaller);
			}
		}
		
		/*
		try {
			return (T) unmarshaller.unmarshal(in);
		} catch (JAXBException ex) {
			// Server does not return any valid WebDAV XML that matches our JAXB context
			throw new IOException("Not a valid DAV response");
		} finally {
			if (unmarshaller instanceof Closeable) {
				IOUtils.closeQuietly((Closeable)unmarshaller);
			}
		}
		*/
		/*
		try {
			final SAXParserFactory saxf = SAXParserFactory.newInstance();
			saxf.setNamespaceAware(false);
			XMLReader reader = saxf.newSAXParser().getXMLReader();
			
			return (T) unmarshaller.unmarshal(new SAXSource(reader, new InputSource(in)));
			
		} catch (SAXException | ParserConfigurationException ex) {
			throw new RuntimeException(ex.getMessage(), ex);
		} catch (JAXBException ex) {
			// Server does not return any valid WebDAV XML that matches our JAXB context
			throw new IOException("Not a valid DAV response");
		} finally {
			if (unmarshaller instanceof Closeable) {
				IOUtils.closeQuietly((Closeable)unmarshaller);
			}
		}
		*/
	}
	
	private static <C> Marshaller createMarshaller(Class<C> objectFactory) throws IOException {
		try {
			JAXBContext context = createContext(objectFactory);
			return context.createMarshaller();
		} catch (JAXBException ex) {
			throw new IOException(ex.getMessage(), ex);
		}
	}
	
	private static <C> Unmarshaller createUnmarshaller(Class<C> objectFactory) throws IOException {
		try {
			JAXBContext context = createContext(objectFactory);
			return context.createUnmarshaller();
		} catch (JAXBException ex) {
			throw new IOException(ex.getMessage(), ex);
		}
	}
	
	private static <C> JAXBContext createContext(Class<C> objectFactory) {
		try {
			return JAXBContext.newInstance(objectFactory);
		} catch (JAXBException ex) {
			throw new RuntimeException(ex);
		}
	}
}
