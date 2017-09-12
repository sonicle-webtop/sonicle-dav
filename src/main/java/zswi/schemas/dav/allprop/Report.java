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
 *       &lt;choice>
 *         &lt;element ref="{DAV}acl-principal-prop-set"/>
 *         &lt;element ref="{DAV}expand-property"/>
 *         &lt;element ref="{DAV}principal-match"/>
 *         &lt;element ref="{DAV}principal-property-search"/>
 *         &lt;element ref="{DAV}sync-collection"/>
 *         &lt;element ref="{http://calendarserver.org/ns/}calendarserver-principal-search"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-multiget"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}calendar-query"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}free-busy-query"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:carddav}addressbook-multiget"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:carddav}addressbook-query"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aclPrincipalPropSet",
    "expandProperty",
    "principalMatch",
    "principalPropertySearch",
    "syncCollection",
    "calendarserverPrincipalSearch",
    "calendarMultiget",
    "calendarQuery",
    "freeBusyQuery",
    "addressbookMultiget",
    "addressbookQuery"
})
@XmlRootElement(name = "report")
public class Report {

    @XmlElement(name = "acl-principal-prop-set")
    protected AclPrincipalPropSet aclPrincipalPropSet;
    @XmlElement(name = "expand-property")
    protected ExpandProperty expandProperty;
    @XmlElement(name = "principal-match")
    protected PrincipalMatch principalMatch;
    @XmlElement(name = "principal-property-search")
    protected PrincipalPropertySearch principalPropertySearch;
    @XmlElement(name = "sync-collection")
    protected SyncCollection syncCollection;
    @XmlElement(name = "calendarserver-principal-search", namespace = "http://calendarserver.org/ns/")
    protected CalendarserverPrincipalSearch calendarserverPrincipalSearch;
    @XmlElement(name = "calendar-multiget", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarMultiget calendarMultiget;
    @XmlElement(name = "calendar-query", namespace = "urn:ietf:params:xml:ns:caldav")
    protected CalendarQuery calendarQuery;
    @XmlElement(name = "free-busy-query", namespace = "urn:ietf:params:xml:ns:caldav")
    protected FreeBusyQuery freeBusyQuery;
    @XmlElement(name = "addressbook-multiget", namespace = "urn:ietf:params:xml:ns:carddav")
    protected AddressbookMultiget addressbookMultiget;
    @XmlElement(name = "addressbook-query", namespace = "urn:ietf:params:xml:ns:carddav")
    protected AddressbookQuery addressbookQuery;

    /**
     * Gets the value of the aclPrincipalPropSet property.
     * 
     * @return
     *     possible object is
     *     {@link AclPrincipalPropSet }
     *     
     */
    public AclPrincipalPropSet getAclPrincipalPropSet() {
        return aclPrincipalPropSet;
    }

    /**
     * Sets the value of the aclPrincipalPropSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclPrincipalPropSet }
     *     
     */
    public void setAclPrincipalPropSet(AclPrincipalPropSet value) {
        this.aclPrincipalPropSet = value;
    }

    /**
     * Gets the value of the expandProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ExpandProperty }
     *     
     */
    public ExpandProperty getExpandProperty() {
        return expandProperty;
    }

    /**
     * Sets the value of the expandProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpandProperty }
     *     
     */
    public void setExpandProperty(ExpandProperty value) {
        this.expandProperty = value;
    }

    /**
     * Gets the value of the principalMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalMatch }
     *     
     */
    public PrincipalMatch getPrincipalMatch() {
        return principalMatch;
    }

    /**
     * Sets the value of the principalMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalMatch }
     *     
     */
    public void setPrincipalMatch(PrincipalMatch value) {
        this.principalMatch = value;
    }

    /**
     * Gets the value of the principalPropertySearch property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalPropertySearch }
     *     
     */
    public PrincipalPropertySearch getPrincipalPropertySearch() {
        return principalPropertySearch;
    }

    /**
     * Sets the value of the principalPropertySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalPropertySearch }
     *     
     */
    public void setPrincipalPropertySearch(PrincipalPropertySearch value) {
        this.principalPropertySearch = value;
    }

    /**
     * Gets the value of the syncCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SyncCollection }
     *     
     */
    public SyncCollection getSyncCollection() {
        return syncCollection;
    }

    /**
     * Sets the value of the syncCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncCollection }
     *     
     */
    public void setSyncCollection(SyncCollection value) {
        this.syncCollection = value;
    }

    /**
     * Gets the value of the calendarserverPrincipalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarserverPrincipalSearch }
     *     
     */
    public CalendarserverPrincipalSearch getCalendarserverPrincipalSearch() {
        return calendarserverPrincipalSearch;
    }

    /**
     * Sets the value of the calendarserverPrincipalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarserverPrincipalSearch }
     *     
     */
    public void setCalendarserverPrincipalSearch(CalendarserverPrincipalSearch value) {
        this.calendarserverPrincipalSearch = value;
    }

    /**
     * Gets the value of the calendarMultiget property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarMultiget }
     *     
     */
    public CalendarMultiget getCalendarMultiget() {
        return calendarMultiget;
    }

    /**
     * Sets the value of the calendarMultiget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarMultiget }
     *     
     */
    public void setCalendarMultiget(CalendarMultiget value) {
        this.calendarMultiget = value;
    }

    /**
     * Gets the value of the calendarQuery property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarQuery }
     *     
     */
    public CalendarQuery getCalendarQuery() {
        return calendarQuery;
    }

    /**
     * Sets the value of the calendarQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarQuery }
     *     
     */
    public void setCalendarQuery(CalendarQuery value) {
        this.calendarQuery = value;
    }

    /**
     * Gets the value of the freeBusyQuery property.
     * 
     * @return
     *     possible object is
     *     {@link FreeBusyQuery }
     *     
     */
    public FreeBusyQuery getFreeBusyQuery() {
        return freeBusyQuery;
    }

    /**
     * Sets the value of the freeBusyQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBusyQuery }
     *     
     */
    public void setFreeBusyQuery(FreeBusyQuery value) {
        this.freeBusyQuery = value;
    }

    /**
     * Gets the value of the addressbookMultiget property.
     * 
     * @return
     *     possible object is
     *     {@link AddressbookMultiget }
     *     
     */
    public AddressbookMultiget getAddressbookMultiget() {
        return addressbookMultiget;
    }

    /**
     * Sets the value of the addressbookMultiget property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressbookMultiget }
     *     
     */
    public void setAddressbookMultiget(AddressbookMultiget value) {
        this.addressbookMultiget = value;
    }

    /**
     * Gets the value of the addressbookQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AddressbookQuery }
     *     
     */
    public AddressbookQuery getAddressbookQuery() {
        return addressbookQuery;
    }

    /**
     * Sets the value of the addressbookQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressbookQuery }
     *     
     */
    public void setAddressbookQuery(AddressbookQuery value) {
        this.addressbookQuery = value;
    }

}
