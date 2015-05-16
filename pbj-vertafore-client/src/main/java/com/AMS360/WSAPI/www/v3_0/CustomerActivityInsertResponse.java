/**
 * CustomerActivityInsertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class CustomerActivityInsertResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse customerActivityInsertResult;

    public CustomerActivityInsertResponse() {
    }

    public CustomerActivityInsertResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse customerActivityInsertResult) {
           this.customerActivityInsertResult = customerActivityInsertResult;
    }


    /**
     * Gets the customerActivityInsertResult value for this CustomerActivityInsertResponse.
     * 
     * @return customerActivityInsertResult
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse getCustomerActivityInsertResult() {
        return customerActivityInsertResult;
    }


    /**
     * Sets the customerActivityInsertResult value for this CustomerActivityInsertResponse.
     * 
     * @param customerActivityInsertResult
     */
    public void setCustomerActivityInsertResult(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse customerActivityInsertResult) {
        this.customerActivityInsertResult = customerActivityInsertResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerActivityInsertResponse)) return false;
        CustomerActivityInsertResponse other = (CustomerActivityInsertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerActivityInsertResult==null && other.getCustomerActivityInsertResult()==null) || 
             (this.customerActivityInsertResult!=null &&
              this.customerActivityInsertResult.equals(other.getCustomerActivityInsertResult())));
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
        if (getCustomerActivityInsertResult() != null) {
            _hashCode += getCustomerActivityInsertResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerActivityInsertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerActivityInsertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerActivityInsertResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerActivityInsertResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivityInsertResponse"));
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
