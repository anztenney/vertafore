/**
 * BrokerGetByShortNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BrokerGetByShortNameResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.Broker broker;

    public BrokerGetByShortNameResponse() {
    }

    public BrokerGetByShortNameResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.Broker broker) {
           this.broker = broker;
    }


    /**
     * Gets the broker value for this BrokerGetByShortNameResponse.
     * 
     * @return broker
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.Broker getBroker() {
        return broker;
    }


    /**
     * Sets the broker value for this BrokerGetByShortNameResponse.
     * 
     * @param broker
     */
    public void setBroker(com.AMS360.WSAPI.www.v3_0.DataContract.Broker broker) {
        this.broker = broker;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrokerGetByShortNameResponse)) return false;
        BrokerGetByShortNameResponse other = (BrokerGetByShortNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.broker==null && other.getBroker()==null) || 
             (this.broker!=null &&
              this.broker.equals(other.getBroker())));
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
        if (getBroker() != null) {
            _hashCode += getBroker().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrokerGetByShortNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByShortNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Broker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Broker"));
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
