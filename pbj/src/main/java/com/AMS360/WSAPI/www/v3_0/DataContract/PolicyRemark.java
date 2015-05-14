/**
 * PolicyRemark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyRemark  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.lang.String remarkId;

    private java.lang.String remarkText;

    private java.util.Calendar transactionEffectiveDate;

    private java.lang.Boolean isSaved;

    private java.lang.Boolean isUploaded;

    public PolicyRemark() {
    }

    public PolicyRemark(
           java.lang.String policyId,
           java.lang.String remarkId,
           java.lang.String remarkText,
           java.util.Calendar transactionEffectiveDate,
           java.lang.Boolean isSaved,
           java.lang.Boolean isUploaded) {
           this.policyId = policyId;
           this.remarkId = remarkId;
           this.remarkText = remarkText;
           this.transactionEffectiveDate = transactionEffectiveDate;
           this.isSaved = isSaved;
           this.isUploaded = isUploaded;
    }


    /**
     * Gets the policyId value for this PolicyRemark.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyRemark.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the remarkId value for this PolicyRemark.
     * 
     * @return remarkId
     */
    public java.lang.String getRemarkId() {
        return remarkId;
    }


    /**
     * Sets the remarkId value for this PolicyRemark.
     * 
     * @param remarkId
     */
    public void setRemarkId(java.lang.String remarkId) {
        this.remarkId = remarkId;
    }


    /**
     * Gets the remarkText value for this PolicyRemark.
     * 
     * @return remarkText
     */
    public java.lang.String getRemarkText() {
        return remarkText;
    }


    /**
     * Sets the remarkText value for this PolicyRemark.
     * 
     * @param remarkText
     */
    public void setRemarkText(java.lang.String remarkText) {
        this.remarkText = remarkText;
    }


    /**
     * Gets the transactionEffectiveDate value for this PolicyRemark.
     * 
     * @return transactionEffectiveDate
     */
    public java.util.Calendar getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }


    /**
     * Sets the transactionEffectiveDate value for this PolicyRemark.
     * 
     * @param transactionEffectiveDate
     */
    public void setTransactionEffectiveDate(java.util.Calendar transactionEffectiveDate) {
        this.transactionEffectiveDate = transactionEffectiveDate;
    }


    /**
     * Gets the isSaved value for this PolicyRemark.
     * 
     * @return isSaved
     */
    public java.lang.Boolean getIsSaved() {
        return isSaved;
    }


    /**
     * Sets the isSaved value for this PolicyRemark.
     * 
     * @param isSaved
     */
    public void setIsSaved(java.lang.Boolean isSaved) {
        this.isSaved = isSaved;
    }


    /**
     * Gets the isUploaded value for this PolicyRemark.
     * 
     * @return isUploaded
     */
    public java.lang.Boolean getIsUploaded() {
        return isUploaded;
    }


    /**
     * Sets the isUploaded value for this PolicyRemark.
     * 
     * @param isUploaded
     */
    public void setIsUploaded(java.lang.Boolean isUploaded) {
        this.isUploaded = isUploaded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyRemark)) return false;
        PolicyRemark other = (PolicyRemark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.remarkId==null && other.getRemarkId()==null) || 
             (this.remarkId!=null &&
              this.remarkId.equals(other.getRemarkId()))) &&
            ((this.remarkText==null && other.getRemarkText()==null) || 
             (this.remarkText!=null &&
              this.remarkText.equals(other.getRemarkText()))) &&
            ((this.transactionEffectiveDate==null && other.getTransactionEffectiveDate()==null) || 
             (this.transactionEffectiveDate!=null &&
              this.transactionEffectiveDate.equals(other.getTransactionEffectiveDate()))) &&
            ((this.isSaved==null && other.getIsSaved()==null) || 
             (this.isSaved!=null &&
              this.isSaved.equals(other.getIsSaved()))) &&
            ((this.isUploaded==null && other.getIsUploaded()==null) || 
             (this.isUploaded!=null &&
              this.isUploaded.equals(other.getIsUploaded())));
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
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getRemarkId() != null) {
            _hashCode += getRemarkId().hashCode();
        }
        if (getRemarkText() != null) {
            _hashCode += getRemarkText().hashCode();
        }
        if (getTransactionEffectiveDate() != null) {
            _hashCode += getTransactionEffectiveDate().hashCode();
        }
        if (getIsSaved() != null) {
            _hashCode += getIsSaved().hashCode();
        }
        if (getIsUploaded() != null) {
            _hashCode += getIsUploaded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyRemark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRemark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "RemarkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarkText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "RemarkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUploaded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsUploaded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
