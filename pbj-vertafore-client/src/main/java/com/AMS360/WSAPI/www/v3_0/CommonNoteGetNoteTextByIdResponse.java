/**
 * CommonNoteGetNoteTextByIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class CommonNoteGetNoteTextByIdResponse  implements java.io.Serializable {
    private byte[] commonNoteGetNoteTextByIdResult;

    public CommonNoteGetNoteTextByIdResponse() {
    }

    public CommonNoteGetNoteTextByIdResponse(
           byte[] commonNoteGetNoteTextByIdResult) {
           this.commonNoteGetNoteTextByIdResult = commonNoteGetNoteTextByIdResult;
    }


    /**
     * Gets the commonNoteGetNoteTextByIdResult value for this CommonNoteGetNoteTextByIdResponse.
     * 
     * @return commonNoteGetNoteTextByIdResult
     */
    public byte[] getCommonNoteGetNoteTextByIdResult() {
        return commonNoteGetNoteTextByIdResult;
    }


    /**
     * Sets the commonNoteGetNoteTextByIdResult value for this CommonNoteGetNoteTextByIdResponse.
     * 
     * @param commonNoteGetNoteTextByIdResult
     */
    public void setCommonNoteGetNoteTextByIdResult(byte[] commonNoteGetNoteTextByIdResult) {
        this.commonNoteGetNoteTextByIdResult = commonNoteGetNoteTextByIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonNoteGetNoteTextByIdResponse)) return false;
        CommonNoteGetNoteTextByIdResponse other = (CommonNoteGetNoteTextByIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonNoteGetNoteTextByIdResult==null && other.getCommonNoteGetNoteTextByIdResult()==null) || 
             (this.commonNoteGetNoteTextByIdResult!=null &&
              java.util.Arrays.equals(this.commonNoteGetNoteTextByIdResult, other.getCommonNoteGetNoteTextByIdResult())));
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
        if (getCommonNoteGetNoteTextByIdResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommonNoteGetNoteTextByIdResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommonNoteGetNoteTextByIdResult(), i);
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
        new org.apache.axis.description.TypeDesc(CommonNoteGetNoteTextByIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteGetNoteTextByIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonNoteGetNoteTextByIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteGetNoteTextByIdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
