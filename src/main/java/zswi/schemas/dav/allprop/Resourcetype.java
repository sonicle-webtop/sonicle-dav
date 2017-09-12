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
package zswi.schemas.dav.allprop;

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
 *       &lt;sequence>
 *         &lt;element ref="{http://calendarserver.org/ns/}free-busy-url" minOccurs="0"/>
 *         &lt;element ref="{DAV}collection" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://calendarserver.org/ns/}dropbox-home"/>
 *           &lt;element ref="{http://calendarserver.org/ns/}notification"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-inbox"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-outbox"/>
 *         &lt;/choice>
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
    "freeBusyUrl",
    "collection",
    "dropboxHome",
    "notification",
    "calendar",
    "scheduleInbox",
    "scheduleOutbox"
})
@XmlRootElement(name = "resourcetype")
public class Resourcetype {

    @XmlElement(name = "free-busy-url", namespace = "http://calendarserver.org/ns/")
    protected FreeBusyUrl freeBusyUrl;
    protected Collection collection;
    @XmlElement(name = "dropbox-home", namespace = "http://calendarserver.org/ns/")
    protected DropboxHome dropboxHome;
    @XmlElement(namespace = "http://calendarserver.org/ns/")
    protected Notification notification;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:caldav")
    protected Calendar calendar;
    @XmlElement(name = "schedule-inbox", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleInbox scheduleInbox;
    @XmlElement(name = "schedule-outbox", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleOutbox scheduleOutbox;

    /**
     * Gets the value of the freeBusyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link FreeBusyUrl }
     *     
     */
    public FreeBusyUrl getFreeBusyUrl() {
        return freeBusyUrl;
    }

    /**
     * Sets the value of the freeBusyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBusyUrl }
     *     
     */
    public void setFreeBusyUrl(FreeBusyUrl value) {
        this.freeBusyUrl = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link Collection }
     *     
     */
    public Collection getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collection }
     *     
     */
    public void setCollection(Collection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the dropboxHome property.
     * 
     * @return
     *     possible object is
     *     {@link DropboxHome }
     *     
     */
    public DropboxHome getDropboxHome() {
        return dropboxHome;
    }

    /**
     * Sets the value of the dropboxHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropboxHome }
     *     
     */
    public void setDropboxHome(DropboxHome value) {
        this.dropboxHome = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setNotification(Notification value) {
        this.notification = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    public Calendar getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    public void setCalendar(Calendar value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the scheduleInbox property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleInbox }
     *     
     */
    public ScheduleInbox getScheduleInbox() {
        return scheduleInbox;
    }

    /**
     * Sets the value of the scheduleInbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleInbox }
     *     
     */
    public void setScheduleInbox(ScheduleInbox value) {
        this.scheduleInbox = value;
    }

    /**
     * Gets the value of the scheduleOutbox property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleOutbox }
     *     
     */
    public ScheduleOutbox getScheduleOutbox() {
        return scheduleOutbox;
    }

    /**
     * Sets the value of the scheduleOutbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleOutbox }
     *     
     */
    public void setScheduleOutbox(ScheduleOutbox value) {
        this.scheduleOutbox = value;
    }

}
