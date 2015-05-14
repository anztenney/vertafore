/**
 * CustomerContactGetListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerContactGetListResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact[] customerContactList;

    public CustomerContactGetListResponse() {
    }

    public CustomerContactGetListResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact[] customerContactList) {
           this.customerContactList = customerContactList;
    }


    /**
     * Gets the customerContactList value for this CustomerContactGetListResponse.
     * 
     * @return customerContactList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact[] getCustomerContactList() {
        return customerContactList;
    }


    /**
     * Sets the customerContactList value for this CustomerContactGetListResponse.
     * 
     * @param customerContactList
     */
    public void setCustomerContactList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact[] customerContactList) {
        this.customerContactList = customerContactList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerContactGetListResponse)) return false;
        CustomerContactGetListResponse other = (CustomerContactGetListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerContactList==null && other.getCustomerContactList()==null) || 
             (this.customerContactList!=null &&
              java.util.Arrays.equals(this.customerContactList, other.getCustomerContactList())));
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
        if (getCustomerContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerContactList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerContactGetListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact"));
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
