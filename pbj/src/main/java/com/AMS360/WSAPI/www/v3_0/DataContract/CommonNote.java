/**
 * CommonNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CommonNote  implements java.io.Serializable {
    private java.lang.String noteTypeId;

    private java.lang.Short noteType;

    private java.lang.String noteText;

    private java.util.Calendar noteDate;

    private java.lang.String noteId;

    private java.util.Calendar purgeDate;

    private java.lang.String priority;

    public CommonNote() {
    }

    public CommonNote(
           java.lang.String noteTypeId,
           java.lang.Short noteType,
           java.lang.String noteText,
           java.util.Calendar noteDate,
           java.lang.String noteId,
           java.util.Calendar purgeDate,
           java.lang.String priority) {
           this.noteTypeId = noteTypeId;
           this.noteType = noteType;
           this.noteText = noteText;
           this.noteDate = noteDate;
           this.noteId = noteId;
           this.purgeDate = purgeDate;
           this.priority = priority;
    }


    /**
     * Gets the noteTypeId value for this CommonNote.
     * 
     * @return noteTypeId
     */
    public java.lang.String getNoteTypeId() {
        return noteTypeId;
    }


    /**
     * Sets the noteTypeId value for this CommonNote.
     * 
     * @param noteTypeId
     */
    public void setNoteTypeId(java.lang.String noteTypeId) {
        this.noteTypeId = noteTypeId;
    }


    /**
     * Gets the noteType value for this CommonNote.
     * 
     * @return noteType
     */
    public java.lang.Short getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this CommonNote.
     * 
     * @param noteType
     */
    public void setNoteType(java.lang.Short noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the noteText value for this CommonNote.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this CommonNote.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the noteDate value for this CommonNote.
     * 
     * @return noteDate
     */
    public java.util.Calendar getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this CommonNote.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.util.Calendar noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the noteId value for this CommonNote.
     * 
     * @return noteId
     */
    public java.lang.String getNoteId() {
        return noteId;
    }


    /**
     * Sets the noteId value for this CommonNote.
     * 
     * @param noteId
     */
    public void setNoteId(java.lang.String noteId) {
        this.noteId = noteId;
    }


    /**
     * Gets the purgeDate value for this CommonNote.
     * 
     * @return purgeDate
     */
    public java.util.Calendar getPurgeDate() {
        return purgeDate;
    }


    /**
     * Sets the purgeDate value for this CommonNote.
     * 
     * @param purgeDate
     */
    public void setPurgeDate(java.util.Calendar purgeDate) {
        this.purgeDate = purgeDate;
    }


    /**
     * Gets the priority value for this CommonNote.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CommonNote.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonNote)) return false;
        CommonNote other = (CommonNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noteTypeId==null && other.getNoteTypeId()==null) || 
             (this.noteTypeId!=null &&
              this.noteTypeId.equals(other.getNoteTypeId()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
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
              this.priority.equals(other.getPriority())));
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
        if (getNoteTypeId() != null) {
            _hashCode += getNoteTypeId().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
