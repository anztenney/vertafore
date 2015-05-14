/**
 * BrokerGetListByLastNamePrefixResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BrokerGetListByLastNamePrefixResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo[] brokerInfoList;

    public BrokerGetListByLastNamePrefixResponse() {
    }

    public BrokerGetListByLastNamePrefixResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo[] brokerInfoList) {
           this.brokerInfoList = brokerInfoList;
    }


    /**
     * Gets the brokerInfoList value for this BrokerGetListByLastNamePrefixResponse.
     * 
     * @return brokerInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo[] getBrokerInfoList() {
        return brokerInfoList;
    }


    /**
     * Sets the brokerInfoList value for this BrokerGetListByLastNamePrefixResponse.
     * 
     * @param brokerInfoList
     */
    public void setBrokerInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo[] brokerInfoList) {
        this.brokerInfoList = brokerInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrokerGetListByLastNamePrefixResponse)) return false;
        BrokerGetListByLastNamePrefixResponse other = (BrokerGetListByLastNamePrefixResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brokerInfoList==null && other.getBrokerInfoList()==null) || 
             (this.brokerInfoList!=null &&
              java.util.Arrays.equals(this.brokerInfoList, other.getBrokerInfoList())));
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
        if (getBrokerInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrokerInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrokerInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrokerGetListByLastNamePrefixResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokerInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfo"));
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
