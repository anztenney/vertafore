/**
 * BrokerGetListByLastNamePrefixRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BrokerGetListByLastNamePrefixRequest  implements java.io.Serializable {
    private java.lang.String brokerLastNamePrefix;

    public BrokerGetListByLastNamePrefixRequest() {
    }

    public BrokerGetListByLastNamePrefixRequest(
           java.lang.String brokerLastNamePrefix) {
           this.brokerLastNamePrefix = brokerLastNamePrefix;
    }


    /**
     * Gets the brokerLastNamePrefix value for this BrokerGetListByLastNamePrefixRequest.
     * 
     * @return brokerLastNamePrefix
     */
    public java.lang.String getBrokerLastNamePrefix() {
        return brokerLastNamePrefix;
    }


    /**
     * Sets the brokerLastNamePrefix value for this BrokerGetListByLastNamePrefixRequest.
     * 
     * @param brokerLastNamePrefix
     */
    public void setBrokerLastNamePrefix(java.lang.String brokerLastNamePrefix) {
        this.brokerLastNamePrefix = brokerLastNamePrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrokerGetListByLastNamePrefixRequest)) return false;
        BrokerGetListByLastNamePrefixRequest other = (BrokerGetListByLastNamePrefixRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brokerLastNamePrefix==null && other.getBrokerLastNamePrefix()==null) || 
             (this.brokerLastNamePrefix!=null &&
              this.brokerLastNamePrefix.equals(other.getBrokerLastNamePrefix())));
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
        if (getBrokerLastNamePrefix() != null) {
            _hashCode += getBrokerLastNamePrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrokerGetListByLastNamePrefixRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokerLastNamePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerLastNamePrefix"));
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
