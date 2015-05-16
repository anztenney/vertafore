/**
 * CustomerNoteInsertResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class CustomerNoteInsertResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse customerNoteInsertResult;

    public CustomerNoteInsertResponse() {
    }

    public CustomerNoteInsertResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse customerNoteInsertResult) {
           this.customerNoteInsertResult = customerNoteInsertResult;
    }


    /**
     * Gets the customerNoteInsertResult value for this CustomerNoteInsertResponse.
     * 
     * @return customerNoteInsertResult
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse getCustomerNoteInsertResult() {
        return customerNoteInsertResult;
    }


    /**
     * Sets the customerNoteInsertResult value for this CustomerNoteInsertResponse.
     * 
     * @param customerNoteInsertResult
     */
    public void setCustomerNoteInsertResult(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse customerNoteInsertResult) {
        this.customerNoteInsertResult = customerNoteInsertResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerNoteInsertResponse)) return false;
        CustomerNoteInsertResponse other = (CustomerNoteInsertResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerNoteInsertResult==null && other.getCustomerNoteInsertResult()==null) || 
             (this.customerNoteInsertResult!=null &&
              this.customerNoteInsertResult.equals(other.getCustomerNoteInsertResult())));
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
        if (getCustomerNoteInsertResult() != null) {
            _hashCode += getCustomerNoteInsertResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerNoteInsertResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteInsertResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNoteInsertResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteInsertResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNoteInsertResponse"));
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
