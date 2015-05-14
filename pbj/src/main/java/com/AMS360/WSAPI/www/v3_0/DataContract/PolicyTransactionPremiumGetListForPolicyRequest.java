/**
 * PolicyTransactionPremiumGetListForPolicyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyTransactionPremiumGetListForPolicyRequest  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.util.Calendar transactionEffectiveDate;

    private java.lang.Boolean filterIncludeCorrected;

    public PolicyTransactionPremiumGetListForPolicyRequest() {
    }

    public PolicyTransactionPremiumGetListForPolicyRequest(
           java.lang.String policyId,
           java.util.Calendar transactionEffectiveDate,
           java.lang.Boolean filterIncludeCorrected) {
           this.policyId = policyId;
           this.transactionEffectiveDate = transactionEffectiveDate;
           this.filterIncludeCorrected = filterIncludeCorrected;
    }


    /**
     * Gets the policyId value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the transactionEffectiveDate value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @return transactionEffectiveDate
     */
    public java.util.Calendar getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }


    /**
     * Sets the transactionEffectiveDate value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @param transactionEffectiveDate
     */
    public void setTransactionEffectiveDate(java.util.Calendar transactionEffectiveDate) {
        this.transactionEffectiveDate = transactionEffectiveDate;
    }


    /**
     * Gets the filterIncludeCorrected value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @return filterIncludeCorrected
     */
    public java.lang.Boolean getFilterIncludeCorrected() {
        return filterIncludeCorrected;
    }


    /**
     * Sets the filterIncludeCorrected value for this PolicyTransactionPremiumGetListForPolicyRequest.
     * 
     * @param filterIncludeCorrected
     */
    public void setFilterIncludeCorrected(java.lang.Boolean filterIncludeCorrected) {
        this.filterIncludeCorrected = filterIncludeCorrected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTransactionPremiumGetListForPolicyRequest)) return false;
        PolicyTransactionPremiumGetListForPolicyRequest other = (PolicyTransactionPremiumGetListForPolicyRequest) obj;
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
            ((this.transactionEffectiveDate==null && other.getTransactionEffectiveDate()==null) || 
             (this.transactionEffectiveDate!=null &&
              this.transactionEffectiveDate.equals(other.getTransactionEffectiveDate()))) &&
            ((this.filterIncludeCorrected==null && other.getFilterIncludeCorrected()==null) || 
             (this.filterIncludeCorrected!=null &&
              this.filterIncludeCorrected.equals(other.getFilterIncludeCorrected())));
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
        if (getTransactionEffectiveDate() != null) {
            _hashCode += getTransactionEffectiveDate().hashCode();
        }
        if (getFilterIncludeCorrected() != null) {
            _hashCode += getFilterIncludeCorrected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTransactionPremiumGetListForPolicyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetListForPolicyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterIncludeCorrected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FilterIncludeCorrected"));
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
