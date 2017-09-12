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
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}opaque"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}transparent"/>
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
    "opaque",
    "transparent"
})
@XmlRootElement(name = "schedule-calendar-transp", namespace = "urn:ietf:params:xml:ns:caldav")
public class ScheduleCalendarTransp {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:caldav")
    protected Opaque opaque;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:caldav")
    protected Transparent transparent;

    /**
     * Gets the value of the opaque property.
     * 
     * @return
     *     possible object is
     *     {@link Opaque }
     *     
     */
    public Opaque getOpaque() {
        return opaque;
    }

    /**
     * Sets the value of the opaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opaque }
     *     
     */
    public void setOpaque(Opaque value) {
        this.opaque = value;
    }

    /**
     * Gets the value of the transparent property.
     * 
     * @return
     *     possible object is
     *     {@link Transparent }
     *     
     */
    public Transparent getTransparent() {
        return transparent;
    }

    /**
     * Sets the value of the transparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transparent }
     *     
     */
    public void setTransparent(Transparent value) {
        this.transparent = value;
    }

}
