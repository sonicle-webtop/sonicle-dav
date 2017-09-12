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
package zswi.schemas.caldav.query;

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
 *         &lt;element ref="{DAV}allprop"/>
 *         &lt;element ref="{DAV}propname"/>
 *         &lt;element ref="{DAV}prop"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}filter"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}timezone"/>
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
    "allprop",
    "propname",
    "prop",
    "filter",
    "timezone"
})
@XmlRootElement(name = "calendar-query")
public class CalendarQuery {

    @XmlElement(namespace = "DAV:", required = true)
    protected Allprop allprop;
    @XmlElement(namespace = "DAV:", required = true)
    protected Propname propname;
    @XmlElement(namespace = "DAV:", required = true)
    protected Prop prop;
    @XmlElement(required = true)
    protected Filter filter;
    @XmlElement(required = true)
    protected String timezone;

    /**
     * Gets the value of the allprop property.
     * 
     * @return
     *     possible object is
     *     {@link Allprop }
     *     
     */
    public Allprop getAllprop() {
        return allprop;
    }

    /**
     * Sets the value of the allprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allprop }
     *     
     */
    public void setAllprop(Allprop value) {
        this.allprop = value;
    }

    /**
     * Gets the value of the propname property.
     * 
     * @return
     *     possible object is
     *     {@link Propname }
     *     
     */
    public Propname getPropname() {
        return propname;
    }

    /**
     * Sets the value of the propname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Propname }
     *     
     */
    public void setPropname(Propname value) {
        this.propname = value;
    }

    /**
     * Gets the value of the prop property.
     * 
     * @return
     *     possible object is
     *     {@link Prop }
     *     
     */
    public Prop getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prop }
     *     
     */
    public void setProp(Prop value) {
        this.prop = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

}
