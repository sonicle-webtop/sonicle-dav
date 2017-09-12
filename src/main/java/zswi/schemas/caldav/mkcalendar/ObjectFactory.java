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
package zswi.schemas.caldav.mkcalendar;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sonicle.sardine.schemas.caldav.mkcalendar package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalendarColor_QNAME = new QName("http://apple.com/ns/ical/", "calendar-color");
    private final static QName _CalendarOrder_QNAME = new QName("http://apple.com/ns/ical/", "calendar-order");
    private final static QName _CalendarTimezone_QNAME = new QName("urn:ietf:params:xml:ns:caldav", "calendar-timezone");
    private final static QName _Displayname_QNAME = new QName("DAV:", "displayname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sonicle.sardine.schemas.caldav.mkcalendar
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupportedCalendarComponentSet }
     * 
     */
    public SupportedCalendarComponentSet createSupportedCalendarComponentSet() {
        return new SupportedCalendarComponentSet();
    }

    /**
     * Create an instance of {@link Comp }
     * 
     */
    public Comp createComp() {
        return new Comp();
    }

    /**
     * Create an instance of {@link Mkcalendar }
     * 
     */
    public Mkcalendar createMkcalendar() {
        return new Mkcalendar();
    }

    /**
     * Create an instance of {@link Set }
     * 
     */
    public Set createSet() {
        return new Set();
    }

    /**
     * Create an instance of {@link Prop }
     * 
     */
    public Prop createProp() {
        return new Prop();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apple.com/ns/ical/", name = "calendar-color")
    public JAXBElement<String> createCalendarColor(String value) {
        return new JAXBElement<String>(_CalendarColor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apple.com/ns/ical/", name = "calendar-order")
    public JAXBElement<BigInteger> createCalendarOrder(BigInteger value) {
        return new JAXBElement<BigInteger>(_CalendarOrder_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:caldav", name = "calendar-timezone")
    public JAXBElement<String> createCalendarTimezone(String value) {
        return new JAXBElement<String>(_CalendarTimezone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DAV:", name = "displayname")
    public JAXBElement<String> createDisplayname(String value) {
        return new JAXBElement<String>(_Displayname_QNAME, String.class, null, value);
    }

}
