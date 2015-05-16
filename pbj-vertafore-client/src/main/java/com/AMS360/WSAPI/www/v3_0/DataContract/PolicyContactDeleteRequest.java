/**
 * PolicyContactDeleteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyContactDeleteRequest  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.lang.String lineOfBusinessId;

    private java.lang.String policyContactId;

    private java.util.Calendar effectiveDate;

    public PolicyContactDeleteRequest() {
    }

    public PolicyContactDeleteRequest(
           java.lang.String policyId,
           java.lang.String lineOfBusinessId,
           java.lang.String policyContactId,
           java.util.Calendar effectiveDate) {
           this.policyId = policyId;
           this.lineOfBusinessId = lineOfBusinessId;
           this.policyContactId = policyContactId;
           this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the policyId value for this PolicyContactDeleteRequest.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyContactDeleteRequest.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the lineOfBusinessId value for this PolicyContactDeleteRequest.
     * 
     * @return lineOfBusinessId
     */
    public java.lang.String getLineOfBusinessId() {
        return lineOfBusinessId;
    }


    /**
     * Sets the lineOfBusinessId value for this PolicyContactDeleteRequest.
     * 
     * @param lineOfBusinessId
     */
    public void setLineOfBusinessId(java.lang.String lineOfBusinessId) {
        this.lineOfBusinessId = lineOfBusinessId;
    }


    /**
     * Gets the policyContactId value for this PolicyContactDeleteRequest.
     * 
     * @return policyContactId
     */
    public java.lang.String getPolicyContactId() {
        return policyContactId;
    }


    /**
     * Sets the policyContactId value for this PolicyContactDeleteRequest.
     * 
     * @param policyContactId
     */
    public void setPolicyContactId(java.lang.String policyContactId) {
        this.policyContactId = policyContactId;
    }


    /**
     * Gets the effectiveDate value for this PolicyContactDeleteRequest.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this PolicyContactDeleteRequest.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyContactDeleteRequest)) return false;
        PolicyContactDeleteRequest other = (PolicyContactDeleteRequest) obj;
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
            ((this.lineOfBusinessId==null && other.getLineOfBusinessId()==null) || 
             (this.lineOfBusinessId!=null &&
              this.lineOfBusinessId.equals(other.getLineOfBusinessId()))) &&
            ((this.policyContactId==null && other.getPolicyContactId()==null) || 
             (this.policyContactId!=null &&
              this.policyContactId.equals(other.getPolicyContactId()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate())));
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
        if (getLineOfBusinessId() != null) {
            _hashCode += getLineOfBusinessId().hashCode();
        }
        if (getPolicyContactId() != null) {
            _hashCode += getPolicyContactId().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyContactDeleteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactDeleteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
