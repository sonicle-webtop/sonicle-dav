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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-home-set"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-user-address-set"/>
 *         &lt;element ref="{DAV}current-user-principal"/>
 *         &lt;element ref="{DAV}displayname"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}dropbox-home-URL"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}email-address-set"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}notification-URL"/>
 *         &lt;element ref="{DAV}principal-collection-set"/>
 *         &lt;element ref="{DAV}principal-URL"/>
 *         &lt;element ref="{DAV}resource-id"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-inbox-URL"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-outbox-URL"/>
 *         &lt;element ref="{DAV}supported-report-set"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}calendar-proxy-write-for"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}calendar-proxy-read-for"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:carddav}addressbook-home-set"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calendarHomeSet",
    "calendarUserAddressSet",
    "currentUserPrincipal",
    "displayname",
    "dropboxHomeURL",
    "emailAddressSet",
    "notificationURL",
    "principalCollectionSet",
    "principalURL",
    "resourceId",
    "scheduleInboxURL",
    "scheduleOutboxURL",
    "supportedReportSet",
    "calendarProxyWriteFor",
    "calendarProxyReadFor",
    "addressbookHomeSet"
})
@XmlRootElement(name = "prop")
public class Prop {

    @XmlElement(name = "calendar-home-set", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarHomeSet calendarHomeSet;
    @XmlElement(name = "calendar-user-address-set", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarUserAddressSet calendarUserAddressSet;
    @XmlElement(name = "current-user-principal")
    protected CurrentUserPrincipal currentUserPrincipal;
    protected String displayname;
    @XmlElement(name = "dropbox-home-URL", namespace = "http://calendarserver.org/ns/")
    protected DropboxHomeURL dropboxHomeURL;
    @XmlElement(name = "email-address-set", namespace = "http://calendarserver.org/ns/")
    protected EmailAddressSet emailAddressSet;
    @XmlElement(name = "notification-URL", namespace = "http://calendarserver.org/ns/")
    protected NotificationURL notificationURL;
    @XmlElement(name = "principal-collection-set")
    protected PrincipalCollectionSet principalCollectionSet;
    @XmlElement(name = "principal-URL")
    protected PrincipalURL principalURL;
    @XmlElement(name = "resource-id")
    protected ResourceId resourceId;
    @XmlElement(name = "schedule-inbox-URL", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleInboxURL scheduleInboxURL;
    @XmlElement(name = "schedule-outbox-URL", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleOutboxURL scheduleOutboxURL;
    @XmlElement(name = "supported-report-set")
    protected SupportedReportSet supportedReportSet;
    @XmlElement(name = "calendar-proxy-write-for", namespace = "http://calendarserver.org/ns/")
    protected CalendarProxyWriteFor calendarProxyWriteFor;
    @XmlElement(name = "calendar-proxy-read-for", namespace = "http://calendarserver.org/ns/")
    protected CalendarProxyReadFor calendarProxyReadFor;
    @XmlElement(name = "addressbook-home-set", namespace = "urn:ietf:params:xml:ns:carddav")
    protected AddressbookHomeSet addressbookHomeSet;

    /**
     * Gets the value of the calendarHomeSet property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarHomeSet }
     *     
     */
    public CalendarHomeSet getCalendarHomeSet() {
        return calendarHomeSet;
    }

    /**
     * Sets the value of the calendarHomeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarHomeSet }
     *     
     */
    public void setCalendarHomeSet(CalendarHomeSet value) {
        this.calendarHomeSet = value;
    }

    /**
     * Gets the value of the calendarUserAddressSet property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarUserAddressSet }
     *     
     */
    public CalendarUserAddressSet getCalendarUserAddressSet() {
        return calendarUserAddressSet;
    }

    /**
     * Sets the value of the calendarUserAddressSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarUserAddressSet }
     *     
     */
    public void setCalendarUserAddressSet(CalendarUserAddressSet value) {
        this.calendarUserAddressSet = value;
    }

    /**
     * Gets the value of the currentUserPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public CurrentUserPrincipal getCurrentUserPrincipal() {
        return currentUserPrincipal;
    }

    /**
     * Sets the value of the currentUserPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentUserPrincipal }
     *     
     */
    public void setCurrentUserPrincipal(CurrentUserPrincipal value) {
        this.currentUserPrincipal = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayname(String value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the dropboxHomeURL property.
     * 
     * @return
     *     possible object is
     *     {@link DropboxHomeURL }
     *     
     */
    public DropboxHomeURL getDropboxHomeURL() {
        return dropboxHomeURL;
    }

    /**
     * Sets the value of the dropboxHomeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropboxHomeURL }
     *     
     */
    public void setDropboxHomeURL(DropboxHomeURL value) {
        this.dropboxHomeURL = value;
    }

    /**
     * Gets the value of the emailAddressSet property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressSet }
     *     
     */
    public EmailAddressSet getEmailAddressSet() {
        return emailAddressSet;
    }

    /**
     * Sets the value of the emailAddressSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressSet }
     *     
     */
    public void setEmailAddressSet(EmailAddressSet value) {
        this.emailAddressSet = value;
    }

    /**
     * Gets the value of the notificationURL property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationURL }
     *     
     */
    public NotificationURL getNotificationURL() {
        return notificationURL;
    }

    /**
     * Sets the value of the notificationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationURL }
     *     
     */
    public void setNotificationURL(NotificationURL value) {
        this.notificationURL = value;
    }

    /**
     * Gets the value of the principalCollectionSet property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalCollectionSet }
     *     
     */
    public PrincipalCollectionSet getPrincipalCollectionSet() {
        return principalCollectionSet;
    }

    /**
     * Sets the value of the principalCollectionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalCollectionSet }
     *     
     */
    public void setPrincipalCollectionSet(PrincipalCollectionSet value) {
        this.principalCollectionSet = value;
    }

    /**
     * Gets the value of the principalURL property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalURL }
     *     
     */
    public PrincipalURL getPrincipalURL() {
        return principalURL;
    }

    /**
     * Sets the value of the principalURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalURL }
     *     
     */
    public void setPrincipalURL(PrincipalURL value) {
        this.principalURL = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceId }
     *     
     */
    public ResourceId getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceId }
     *     
     */
    public void setResourceId(ResourceId value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the scheduleInboxURL property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleInboxURL }
     *     
     */
    public ScheduleInboxURL getScheduleInboxURL() {
        return scheduleInboxURL;
    }

    /**
     * Sets the value of the scheduleInboxURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleInboxURL }
     *     
     */
    public void setScheduleInboxURL(ScheduleInboxURL value) {
        this.scheduleInboxURL = value;
    }

    /**
     * Gets the value of the scheduleOutboxURL property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOutboxURL }
     *     
     */
    public ScheduleOutboxURL getScheduleOutboxURL() {
        return scheduleOutboxURL;
    }

    /**
     * Sets the value of the scheduleOutboxURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOutboxURL }
     *     
     */
    public void setScheduleOutboxURL(ScheduleOutboxURL value) {
        this.scheduleOutboxURL = value;
    }

    /**
     * Gets the value of the supportedReportSet property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedReportSet }
     *     
     */
    public SupportedReportSet getSupportedReportSet() {
        return supportedReportSet;
    }

    /**
     * Sets the value of the supportedReportSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedReportSet }
     *     
     */
    public void setSupportedReportSet(SupportedReportSet value) {
        this.supportedReportSet = value;
    }

    /**
     * Gets the value of the calendarProxyWriteFor property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarProxyWriteFor }
     *     
     */
    public CalendarProxyWriteFor getCalendarProxyWriteFor() {
        return calendarProxyWriteFor;
    }

    /**
     * Sets the value of the calendarProxyWriteFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarProxyWriteFor }
     *     
     */
    public void setCalendarProxyWriteFor(CalendarProxyWriteFor value) {
        this.calendarProxyWriteFor = value;
    }

    /**
     * Gets the value of the calendarProxyReadFor property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarProxyReadFor }
     *     
     */
    public CalendarProxyReadFor getCalendarProxyReadFor() {
        return calendarProxyReadFor;
    }

    /**
     * Sets the value of the calendarProxyReadFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarProxyReadFor }
     *     
     */
    public void setCalendarProxyReadFor(CalendarProxyReadFor value) {
        this.calendarProxyReadFor = value;
    }

    /**
     * Gets the value of the addressbookHomeSet property.
     * 
     * @return
     *     possible object is
     *     {@link AddressbookHomeSet }
     *     
     */
    public AddressbookHomeSet getAddressbookHomeSet() {
        return addressbookHomeSet;
    }

    /**
     * Sets the value of the addressbookHomeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressbookHomeSet }
     *     
     */
    public void setAddressbookHomeSet(AddressbookHomeSet value) {
        this.addressbookHomeSet = value;
    }

}
