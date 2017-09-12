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
package zswi.schemas.dav.proxies;

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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://calendarserver.org/ns/}calendar-proxy-read-for"/>
 *           &lt;element ref="{http://calendarserver.org/ns/}calendar-proxy-write-for"/>
 *         &lt;/choice>
 *         &lt;element ref="{DAV}displayname" minOccurs="0"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}email-address-set" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-user-address-set" minOccurs="0"/>
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
    "calendarProxyReadFor",
    "calendarProxyWriteFor",
    "displayname",
    "emailAddressSet",
    "calendarUserAddressSet"
})
@XmlRootElement(name = "prop")
public class Prop {

    @XmlElement(name = "calendar-proxy-read-for", namespace = "http://calendarserver.org/ns/")
    protected CalendarProxyReadFor calendarProxyReadFor;
    @XmlElement(name = "calendar-proxy-write-for", namespace = "http://calendarserver.org/ns/")
    protected CalendarProxyWriteFor calendarProxyWriteFor;
    protected String displayname;
    @XmlElement(name = "email-address-set", namespace = "http://calendarserver.org/ns/")
    protected EmailAddressSet emailAddressSet;
    @XmlElement(name = "calendar-user-address-set", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarUserAddressSet calendarUserAddressSet;

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

}
