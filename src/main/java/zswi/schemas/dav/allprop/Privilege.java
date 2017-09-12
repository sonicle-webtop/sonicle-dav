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
 *         &lt;element ref="{DAV}write"/>
 *         &lt;element ref="{DAV}all"/>
 *         &lt;element ref="{DAV}bind"/>
 *         &lt;element ref="{DAV}read"/>
 *         &lt;element ref="{DAV}read-acl"/>
 *         &lt;element ref="{DAV}read-current-user-privilege-set"/>
 *         &lt;element ref="{DAV}unbind"/>
 *         &lt;element ref="{DAV}unlock"/>
 *         &lt;element ref="{DAV}write-acl"/>
 *         &lt;element ref="{DAV}write-content"/>
 *         &lt;element ref="{DAV}write-properties"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}read-free-busy"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-deliver"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:caldav}schedule-send"/>
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
    "write",
    "all",
    "bind",
    "read",
    "readAcl",
    "readCurrentUserPrivilegeSet",
    "unbind",
    "unlock",
    "writeAcl",
    "writeContent",
    "writeProperties",
    "readFreeBusy",
    "schedule",
    "scheduleDeliver",
    "scheduleSend"
})
@XmlRootElement(name = "privilege")
public class Privilege {

    protected Write write;
    protected All all;
    protected Bind bind;
    protected Read read;
    @XmlElement(name = "read-acl")
    protected ReadAcl readAcl;
    @XmlElement(name = "read-current-user-privilege-set")
    protected ReadCurrentUserPrivilegeSet readCurrentUserPrivilegeSet;
    protected Unbind unbind;
    protected Unlock unlock;
    @XmlElement(name = "write-acl")
    protected WriteAcl writeAcl;
    @XmlElement(name = "write-content")
    protected WriteContent writeContent;
    @XmlElement(name = "write-properties")
    protected WriteProperties writeProperties;
    @XmlElement(name = "read-free-busy", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ReadFreeBusy readFreeBusy;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:caldav")
    protected Schedule schedule;
    @XmlElement(name = "schedule-deliver", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleDeliver scheduleDeliver;
    @XmlElement(name = "schedule-send", namespace = "urn:ietf:params:xml:ns:caldav")
    protected ScheduleSend scheduleSend;

    /**
     * Gets the value of the write property.
     * 
     * @return
     *     possible object is
     *     {@link Write }
     *     
     */
    public Write getWrite() {
        return write;
    }

    /**
     * Sets the value of the write property.
     * 
     * @param value
     *     allowed object is
     *     {@link Write }
     *     
     */
    public void setWrite(Write value) {
        this.write = value;
    }

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link All }
     *     
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link All }
     *     
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Gets the value of the bind property.
     * 
     * @return
     *     possible object is
     *     {@link Bind }
     *     
     */
    public Bind getBind() {
        return bind;
    }

    /**
     * Sets the value of the bind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bind }
     *     
     */
    public void setBind(Bind value) {
        this.bind = value;
    }

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link Read }
     *     
     */
    public Read getRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link Read }
     *     
     */
    public void setRead(Read value) {
        this.read = value;
    }

    /**
     * Gets the value of the readAcl property.
     * 
     * @return
     *     possible object is
     *     {@link ReadAcl }
     *     
     */
    public ReadAcl getReadAcl() {
        return readAcl;
    }

    /**
     * Sets the value of the readAcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadAcl }
     *     
     */
    public void setReadAcl(ReadAcl value) {
        this.readAcl = value;
    }

    /**
     * Gets the value of the readCurrentUserPrivilegeSet property.
     * 
     * @return
     *     possible object is
     *     {@link ReadCurrentUserPrivilegeSet }
     *     
     */
    public ReadCurrentUserPrivilegeSet getReadCurrentUserPrivilegeSet() {
        return readCurrentUserPrivilegeSet;
    }

    /**
     * Sets the value of the readCurrentUserPrivilegeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCurrentUserPrivilegeSet }
     *     
     */
    public void setReadCurrentUserPrivilegeSet(ReadCurrentUserPrivilegeSet value) {
        this.readCurrentUserPrivilegeSet = value;
    }

    /**
     * Gets the value of the unbind property.
     * 
     * @return
     *     possible object is
     *     {@link Unbind }
     *     
     */
    public Unbind getUnbind() {
        return unbind;
    }

    /**
     * Sets the value of the unbind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unbind }
     *     
     */
    public void setUnbind(Unbind value) {
        this.unbind = value;
    }

    /**
     * Gets the value of the unlock property.
     * 
     * @return
     *     possible object is
     *     {@link Unlock }
     *     
     */
    public Unlock getUnlock() {
        return unlock;
    }

    /**
     * Sets the value of the unlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unlock }
     *     
     */
    public void setUnlock(Unlock value) {
        this.unlock = value;
    }

    /**
     * Gets the value of the writeAcl property.
     * 
     * @return
     *     possible object is
     *     {@link WriteAcl }
     *     
     */
    public WriteAcl getWriteAcl() {
        return writeAcl;
    }

    /**
     * Sets the value of the writeAcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteAcl }
     *     
     */
    public void setWriteAcl(WriteAcl value) {
        this.writeAcl = value;
    }

    /**
     * Gets the value of the writeContent property.
     * 
     * @return
     *     possible object is
     *     {@link WriteContent }
     *     
     */
    public WriteContent getWriteContent() {
        return writeContent;
    }

    /**
     * Sets the value of the writeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteContent }
     *     
     */
    public void setWriteContent(WriteContent value) {
        this.writeContent = value;
    }

    /**
     * Gets the value of the writeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link WriteProperties }
     *     
     */
    public WriteProperties getWriteProperties() {
        return writeProperties;
    }

    /**
     * Sets the value of the writeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteProperties }
     *     
     */
    public void setWriteProperties(WriteProperties value) {
        this.writeProperties = value;
    }

    /**
     * Gets the value of the readFreeBusy property.
     * 
     * @return
     *     possible object is
     *     {@link ReadFreeBusy }
     *     
     */
    public ReadFreeBusy getReadFreeBusy() {
        return readFreeBusy;
    }

    /**
     * Sets the value of the readFreeBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadFreeBusy }
     *     
     */
    public void setReadFreeBusy(ReadFreeBusy value) {
        this.readFreeBusy = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the scheduleDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDeliver }
     *     
     */
    public ScheduleDeliver getScheduleDeliver() {
        return scheduleDeliver;
    }

    /**
     * Sets the value of the scheduleDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDeliver }
     *     
     */
    public void setScheduleDeliver(ScheduleDeliver value) {
        this.scheduleDeliver = value;
    }

    /**
     * Gets the value of the scheduleSend property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleSend }
     *     
     */
    public ScheduleSend getScheduleSend() {
        return scheduleSend;
    }

    /**
     * Sets the value of the scheduleSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleSend }
     *     
     */
    public void setScheduleSend(ScheduleSend value) {
        this.scheduleSend = value;
    }

}
