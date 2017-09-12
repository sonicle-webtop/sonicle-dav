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
package zswi.schemas.dav.userinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sonicle.sardine.schemas.dav.userinfo package. 
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

    private final static QName _Status_QNAME = new QName("DAV:", "status");
    private final static QName _Href_QNAME = new QName("DAV:", "href");
    private final static QName _Displayname_QNAME = new QName("DAV:", "displayname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sonicle.sardine.schemas.dav.userinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupportedReportSet }
     * 
     */
    public SupportedReportSet createSupportedReportSet() {
        return new SupportedReportSet();
    }

    /**
     * Create an instance of {@link SupportedReport }
     * 
     */
    public SupportedReport createSupportedReport() {
        return new SupportedReport();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link AclPrincipalPropSet }
     * 
     */
    public AclPrincipalPropSet createAclPrincipalPropSet() {
        return new AclPrincipalPropSet();
    }

    /**
     * Create an instance of {@link ExpandProperty }
     * 
     */
    public ExpandProperty createExpandProperty() {
        return new ExpandProperty();
    }

    /**
     * Create an instance of {@link PrincipalMatch }
     * 
     */
    public PrincipalMatch createPrincipalMatch() {
        return new PrincipalMatch();
    }

    /**
     * Create an instance of {@link PrincipalPropertySearch }
     * 
     */
    public PrincipalPropertySearch createPrincipalPropertySearch() {
        return new PrincipalPropertySearch();
    }

    /**
     * Create an instance of {@link CalendarserverPrincipalSearch }
     * 
     */
    public CalendarserverPrincipalSearch createCalendarserverPrincipalSearch() {
        return new CalendarserverPrincipalSearch();
    }

    /**
     * Create an instance of {@link CurrentUserPrincipal }
     * 
     */
    public CurrentUserPrincipal createCurrentUserPrincipal() {
        return new CurrentUserPrincipal();
    }

    /**
     * Create an instance of {@link Multistatus }
     * 
     */
    public Multistatus createMultistatus() {
        return new Multistatus();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Propstat }
     * 
     */
    public Propstat createPropstat() {
        return new Propstat();
    }

    /**
     * Create an instance of {@link Prop }
     * 
     */
    public Prop createProp() {
        return new Prop();
    }

    /**
     * Create an instance of {@link CalendarHomeSet }
     * 
     */
    public CalendarHomeSet createCalendarHomeSet() {
        return new CalendarHomeSet();
    }

    /**
     * Create an instance of {@link CalendarUserAddressSet }
     * 
     */
    public CalendarUserAddressSet createCalendarUserAddressSet() {
        return new CalendarUserAddressSet();
    }

    /**
     * Create an instance of {@link DropboxHomeURL }
     * 
     */
    public DropboxHomeURL createDropboxHomeURL() {
        return new DropboxHomeURL();
    }

    /**
     * Create an instance of {@link EmailAddressSet }
     * 
     */
    public EmailAddressSet createEmailAddressSet() {
        return new EmailAddressSet();
    }

    /**
     * Create an instance of {@link NotificationURL }
     * 
     */
    public NotificationURL createNotificationURL() {
        return new NotificationURL();
    }

    /**
     * Create an instance of {@link PrincipalCollectionSet }
     * 
     */
    public PrincipalCollectionSet createPrincipalCollectionSet() {
        return new PrincipalCollectionSet();
    }

    /**
     * Create an instance of {@link PrincipalURL }
     * 
     */
    public PrincipalURL createPrincipalURL() {
        return new PrincipalURL();
    }

    /**
     * Create an instance of {@link ResourceId }
     * 
     */
    public ResourceId createResourceId() {
        return new ResourceId();
    }

    /**
     * Create an instance of {@link ScheduleInboxURL }
     * 
     */
    public ScheduleInboxURL createScheduleInboxURL() {
        return new ScheduleInboxURL();
    }

    /**
     * Create an instance of {@link ScheduleOutboxURL }
     * 
     */
    public ScheduleOutboxURL createScheduleOutboxURL() {
        return new ScheduleOutboxURL();
    }

    /**
     * Create an instance of {@link CalendarProxyWriteFor }
     * 
     */
    public CalendarProxyWriteFor createCalendarProxyWriteFor() {
        return new CalendarProxyWriteFor();
    }

    /**
     * Create an instance of {@link CalendarProxyReadFor }
     * 
     */
    public CalendarProxyReadFor createCalendarProxyReadFor() {
        return new CalendarProxyReadFor();
    }

    /**
     * Create an instance of {@link AddressbookHomeSet }
     * 
     */
    public AddressbookHomeSet createAddressbookHomeSet() {
        return new AddressbookHomeSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DAV:", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "DAV:", name = "href")
    public JAXBElement<String> createHref(String value) {
        return new JAXBElement<String>(_Href_QNAME, String.class, null, value);
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
