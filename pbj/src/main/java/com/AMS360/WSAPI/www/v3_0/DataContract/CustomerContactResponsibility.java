/**
 * CustomerContactResponsibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerContactResponsibility  implements java.io.Serializable {
    private java.lang.String customerContactResponsibilityId;

    private java.lang.String responsibilityType;

    public CustomerContactResponsibility() {
    }

    public CustomerContactResponsibility(
           java.lang.String customerContactResponsibilityId,
           java.lang.String responsibilityType) {
           this.customerContactResponsibilityId = customerContactResponsibilityId;
           this.responsibilityType = responsibilityType;
    }


    /**
     * Gets the customerContactResponsibilityId value for this CustomerContactResponsibility.
     * 
     * @return customerContactResponsibilityId
     */
    public java.lang.String getCustomerContactResponsibilityId() {
        return customerContactResponsibilityId;
    }


    /**
     * Sets the customerContactResponsibilityId value for this CustomerContactResponsibility.
     * 
     * @param customerContactResponsibilityId
     */
    public void setCustomerContactResponsibilityId(java.lang.String customerContactResponsibilityId) {
        this.customerContactResponsibilityId = customerContactResponsibilityId;
    }


    /**
     * Gets the responsibilityType value for this CustomerContactResponsibility.
     * 
     * @return responsibilityType
     */
    public java.lang.String getResponsibilityType() {
        return responsibilityType;
    }


    /**
     * Sets the responsibilityType value for this CustomerContactResponsibility.
     * 
     * @param responsibilityType
     */
    public void setResponsibilityType(java.lang.String responsibilityType) {
        this.responsibilityType = responsibilityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerContactResponsibility)) return false;
        CustomerContactResponsibility other = (CustomerContactResponsibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerContactResponsibilityId==null && other.getCustomerContactResponsibilityId()==null) || 
             (this.customerContactResponsibilityId!=null &&
              this.customerContactResponsibilityId.equals(other.getCustomerContactResponsibilityId()))) &&
            ((this.responsibilityType==null && other.getResponsibilityType()==null) || 
             (this.responsibilityType!=null &&
              this.responsibilityType.equals(other.getResponsibilityType())));
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
        if (getCustomerContactResponsibilityId() != null) {
            _hashCode += getCustomerContactResponsibilityId().hashCode();
        }
        if (getResponsibilityType() != null) {
            _hashCode += getResponsibilityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerContactResponsibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContactResponsibilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibilityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ResponsibilityType"));
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
