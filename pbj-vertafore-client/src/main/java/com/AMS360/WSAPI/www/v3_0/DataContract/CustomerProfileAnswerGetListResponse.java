/**
 * CustomerProfileAnswerGetListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerProfileAnswerGetListResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer[] customerProfileAnswerList;

    public CustomerProfileAnswerGetListResponse() {
    }

    public CustomerProfileAnswerGetListResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer[] customerProfileAnswerList) {
           this.customerProfileAnswerList = customerProfileAnswerList;
    }


    /**
     * Gets the customerProfileAnswerList value for this CustomerProfileAnswerGetListResponse.
     * 
     * @return customerProfileAnswerList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer[] getCustomerProfileAnswerList() {
        return customerProfileAnswerList;
    }


    /**
     * Sets the customerProfileAnswerList value for this CustomerProfileAnswerGetListResponse.
     * 
     * @param customerProfileAnswerList
     */
    public void setCustomerProfileAnswerList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer[] customerProfileAnswerList) {
        this.customerProfileAnswerList = customerProfileAnswerList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerProfileAnswerGetListResponse)) return false;
        CustomerProfileAnswerGetListResponse other = (CustomerProfileAnswerGetListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerProfileAnswerList==null && other.getCustomerProfileAnswerList()==null) || 
             (this.customerProfileAnswerList!=null &&
              java.util.Arrays.equals(this.customerProfileAnswerList, other.getCustomerProfileAnswerList())));
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
        if (getCustomerProfileAnswerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerProfileAnswerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerProfileAnswerList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerProfileAnswerGetListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerProfileAnswerList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer"));
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
