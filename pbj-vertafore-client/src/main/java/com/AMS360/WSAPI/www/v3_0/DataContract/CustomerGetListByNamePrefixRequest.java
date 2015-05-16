/**
 * CustomerGetListByNamePrefixRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerGetListByNamePrefixRequest  implements java.io.Serializable {
    private java.lang.String namePrefix;

    private java.lang.String customerType;

    private java.lang.Boolean isBrokersCustomer;

    public CustomerGetListByNamePrefixRequest() {
    }

    public CustomerGetListByNamePrefixRequest(
           java.lang.String namePrefix,
           java.lang.String customerType,
           java.lang.Boolean isBrokersCustomer) {
           this.namePrefix = namePrefix;
           this.customerType = customerType;
           this.isBrokersCustomer = isBrokersCustomer;
    }


    /**
     * Gets the namePrefix value for this CustomerGetListByNamePrefixRequest.
     * 
     * @return namePrefix
     */
    public java.lang.String getNamePrefix() {
        return namePrefix;
    }


    /**
     * Sets the namePrefix value for this CustomerGetListByNamePrefixRequest.
     * 
     * @param namePrefix
     */
    public void setNamePrefix(java.lang.String namePrefix) {
        this.namePrefix = namePrefix;
    }


    /**
     * Gets the customerType value for this CustomerGetListByNamePrefixRequest.
     * 
     * @return customerType
     */
    public java.lang.String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this CustomerGetListByNamePrefixRequest.
     * 
     * @param customerType
     */
    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the isBrokersCustomer value for this CustomerGetListByNamePrefixRequest.
     * 
     * @return isBrokersCustomer
     */
    public java.lang.Boolean getIsBrokersCustomer() {
        return isBrokersCustomer;
    }


    /**
     * Sets the isBrokersCustomer value for this CustomerGetListByNamePrefixRequest.
     * 
     * @param isBrokersCustomer
     */
    public void setIsBrokersCustomer(java.lang.Boolean isBrokersCustomer) {
        this.isBrokersCustomer = isBrokersCustomer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGetListByNamePrefixRequest)) return false;
        CustomerGetListByNamePrefixRequest other = (CustomerGetListByNamePrefixRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namePrefix==null && other.getNamePrefix()==null) || 
             (this.namePrefix!=null &&
              this.namePrefix.equals(other.getNamePrefix()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.isBrokersCustomer==null && other.getIsBrokersCustomer()==null) || 
             (this.isBrokersCustomer!=null &&
              this.isBrokersCustomer.equals(other.getIsBrokersCustomer())));
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
        if (getNamePrefix() != null) {
            _hashCode += getNamePrefix().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getIsBrokersCustomer() != null) {
            _hashCode += getIsBrokersCustomer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerGetListByNamePrefixRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetListByNamePrefixRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NamePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBrokersCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsBrokersCustomer"));
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
