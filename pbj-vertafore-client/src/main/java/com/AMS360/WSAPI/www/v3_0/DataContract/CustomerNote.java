/**
 * CustomerNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerNote  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String noteText;

    private java.util.Calendar noteDate;

    private java.lang.String noteId;

    private java.util.Calendar purgeDate;

    private java.lang.String priority;

    private java.lang.Boolean attachment;

    private java.lang.Boolean isSticky;

    private java.lang.String claimId;

    private java.lang.String policyId;

    private java.lang.Boolean isNoteTruncated;

    public CustomerNote() {
    }

    public CustomerNote(
           java.lang.String customerId,
           java.lang.String noteText,
           java.util.Calendar noteDate,
           java.lang.String noteId,
           java.util.Calendar purgeDate,
           java.lang.String priority,
           java.lang.Boolean attachment,
           java.lang.Boolean isSticky,
           java.lang.String claimId,
           java.lang.String policyId,
           java.lang.Boolean isNoteTruncated) {
           this.customerId = customerId;
           this.noteText = noteText;
           this.noteDate = noteDate;
           this.noteId = noteId;
           this.purgeDate = purgeDate;
           this.priority = priority;
           this.attachment = attachment;
           this.isSticky = isSticky;
           this.claimId = claimId;
           this.policyId = policyId;
           this.isNoteTruncated = isNoteTruncated;
    }


    /**
     * Gets the customerId value for this CustomerNote.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerNote.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the noteText value for this CustomerNote.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this CustomerNote.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the noteDate value for this CustomerNote.
     * 
     * @return noteDate
     */
    public java.util.Calendar getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this CustomerNote.
     * 
     * @param noteDate
     */
    public void setNoteDate(java.util.Calendar noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the noteId value for this CustomerNote.
     * 
     * @return noteId
     */
    public java.lang.String getNoteId() {
        return noteId;
    }


    /**
     * Sets the noteId value for this CustomerNote.
     * 
     * @param noteId
     */
    public void setNoteId(java.lang.String noteId) {
        this.noteId = noteId;
    }


    /**
     * Gets the purgeDate value for this CustomerNote.
     * 
     * @return purgeDate
     */
    public java.util.Calendar getPurgeDate() {
        return purgeDate;
    }


    /**
     * Sets the purgeDate value for this CustomerNote.
     * 
     * @param purgeDate
     */
    public void setPurgeDate(java.util.Calendar purgeDate) {
        this.purgeDate = purgeDate;
    }


    /**
     * Gets the priority value for this CustomerNote.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CustomerNote.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the attachment value for this CustomerNote.
     * 
     * @return attachment
     */
    public java.lang.Boolean getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this CustomerNote.
     * 
     * @param attachment
     */
    public void setAttachment(java.lang.Boolean attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the isSticky value for this CustomerNote.
     * 
     * @return isSticky
     */
    public java.lang.Boolean getIsSticky() {
        return isSticky;
    }


    /**
     * Sets the isSticky value for this CustomerNote.
     * 
     * @param isSticky
     */
    public void setIsSticky(java.lang.Boolean isSticky) {
        this.isSticky = isSticky;
    }


    /**
     * Gets the claimId value for this CustomerNote.
     * 
     * @return claimId
     */
    public java.lang.String getClaimId() {
        return claimId;
    }


    /**
     * Sets the claimId value for this CustomerNote.
     * 
     * @param claimId
     */
    public void setClaimId(java.lang.String claimId) {
        this.claimId = claimId;
    }


    /**
     * Gets the policyId value for this CustomerNote.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this CustomerNote.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the isNoteTruncated value for this CustomerNote.
     * 
     * @return isNoteTruncated
     */
    public java.lang.Boolean getIsNoteTruncated() {
        return isNoteTruncated;
    }


    /**
     * Sets the isNoteTruncated value for this CustomerNote.
     * 
     * @param isNoteTruncated
     */
    public void setIsNoteTruncated(java.lang.Boolean isNoteTruncated) {
        this.isNoteTruncated = isNoteTruncated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerNote)) return false;
        CustomerNote other = (CustomerNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
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
            ((this.claimId==null && other.getClaimId()==null) || 
             (this.claimId!=null &&
              this.claimId.equals(other.getClaimId()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
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
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
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
        if (getClaimId() != null) {
            _hashCode += getClaimId().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getIsNoteTruncated() != null) {
            _hashCode += getIsNoteTruncated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("claimId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
