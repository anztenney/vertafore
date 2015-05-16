/**
 * PersonalNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PersonalNote  implements java.io.Serializable {
    private java.lang.String employeeCode;

    private java.lang.String noteText;

    private java.util.Calendar noteDate;

    private java.lang.String noteId;

    private java.util.Calendar purgeDate;

    private java.lang.String priority;

    private java.lang.Boolean attachment;

    private java.lang.Boolean isSticky;

    private java.lang.Boolean isNoteTruncated;

    public PersonalNote() {
    }

    public PersonalNote(
           java.lang.String employeeCode,
           java.lang.String noteText,
           java.util.Calendar noteDate,
           java.lang.String noteId,
           java.util.Calendar purgeDate,
           java.lang.String priority,
           java.lang.Boolean attachment,
           java.lang.Boolean isSticky,
           java.lang.Boolean isNoteTruncated) {
           this.employeeCode = employeeCode;
           this.noteText = noteText;
           this.noteDate = noteDate;
           this.noteId = noteId;
           this.purgeDate = purgeDate;
           this.priority = priority;
           this.attachment = attachment;
           this.isSticky = isSticky;
           this.isNoteTruncated = isNoteTruncated;
    }


    /**
     * Gets the employeeCode value for this PersonalNote.
     * 
     * @return employeeCode
     */
    public java.lang.String getEmployeeCode() {
        return employeeCode;
    }


    /**
     * Sets the employeeCode value for this PersonalNote.
     * 
     * @param employeeCode
     */
    public void setEmployeeCode(java.lang.String employeeCode) {
        this.employeeCode = employeeCode;
    }


    /**
     * Gets the noteText value for this PersonalNote.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this PersonalNote.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the noteDate value for this PersonalNote.
     * 
     * @return noteDate
     */
    public java.util.Calendar getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this PersonalNote.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.util.Calendar noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the noteId value for this PersonalNote.
     * 
     * @return noteId
     */
    public java.lang.String getNoteId() {
        return noteId;
    }


    /**
     * Sets the noteId value for this PersonalNote.
     * 
     * @param noteId
     */
    public void setNoteId(java.lang.String noteId) {
        this.noteId = noteId;
    }


    /**
     * Gets the purgeDate value for this PersonalNote.
     * 
     * @return purgeDate
     */
    public java.util.Calendar getPurgeDate() {
        return purgeDate;
    }


    /**
     * Sets the purgeDate value for this PersonalNote.
     * 
     * @param purgeDate
     */
    public void setPurgeDate(java.util.Calendar purgeDate) {
        this.purgeDate = purgeDate;
    }


    /**
     * Gets the priority value for this PersonalNote.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PersonalNote.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the attachment value for this PersonalNote.
     * 
     * @return attachment
     */
    public java.lang.Boolean getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this PersonalNote.
     * 
     * @param attachment
     */
    public void setAttachment(java.lang.Boolean attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the isSticky value for this PersonalNote.
     * 
     * @return isSticky
     */
    public java.lang.Boolean getIsSticky() {
        return isSticky;
    }


    /**
     * Sets the isSticky value for this PersonalNote.
     * 
     * @param isSticky
     */
    public void setIsSticky(java.lang.Boolean isSticky) {
        this.isSticky = isSticky;
    }


    /**
     * Gets the isNoteTruncated value for this PersonalNote.
     * 
     * @return isNoteTruncated
     */
    public java.lang.Boolean getIsNoteTruncated() {
        return isNoteTruncated;
    }


    /**
     * Sets the isNoteTruncated value for this PersonalNote.
     * 
     * @param isNoteTruncated
     */
    public void setIsNoteTruncated(java.lang.Boolean isNoteTruncated) {
        this.isNoteTruncated = isNoteTruncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalNote)) return false;
        PersonalNote other = (PersonalNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeCode==null && other.getEmployeeCode()==null) || 
             (this.employeeCode!=null &&
              this.employeeCode.equals(other.getEmployeeCode()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              this.noteDate.equals(other.getNoteDate()))) &&
            ((this.noteId==null && other.getNoteId()==null) || 
             (this.noteId!=null &&
              this.noteId.equals(other.getNoteId()))) &&
            ((this.purgeDate==null && other.getPurgeDate()==null) || 
             (this.purgeDate!=null &&
              this.purgeDate.equals(other.getPurgeDate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              this.attachment.equals(other.getAttachment()))) &&
            ((this.isSticky==null && other.getIsSticky()==null) || 
             (this.isSticky!=null &&
              this.isSticky.equals(other.getIsSticky()))) &&
            ((this.isNoteTruncated==null && other.getIsNoteTruncated()==null) || 
             (this.isNoteTruncated!=null &&
              this.isNoteTruncated.equals(other.getIsNoteTruncated())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEmployeeCode() != null) {
            _hashCode += getEmployeeCode().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getNoteDate() != null) {
            _hashCode += getNoteDate().hashCode();
        }
        if (getNoteId() != null) {
            _hashCode += getNoteId().hashCode();
        }
        if (getPurgeDate() != null) {
            _hashCode += getPurgeDate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getAttachment() != null) {
            _hashCode += getAttachment().hashCode();
        }
        if (getIsSticky() != null) {
            _hashCode += getIsSticky().hashCode();
        }
        if (getIsNoteTruncated() != null) {
            _hashCode += getIsNoteTruncated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PurgeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSticky");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsSticky"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNoteTruncated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsNoteTruncated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
