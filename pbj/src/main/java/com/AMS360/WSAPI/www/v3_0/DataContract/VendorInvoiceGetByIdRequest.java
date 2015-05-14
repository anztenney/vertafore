/**
 * VendorInvoiceGetByIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class VendorInvoiceGetByIdRequest  implements java.io.Serializable {
    private java.lang.String vendorInvoiceId;

    public VendorInvoiceGetByIdRequest() {
    }

    public VendorInvoiceGetByIdRequest(
           java.lang.String vendorInvoiceId) {
           this.vendorInvoiceId = vendorInvoiceId;
    }


    /**
     * Gets the vendorInvoiceId value for this VendorInvoiceGetByIdRequest.
     * 
     * @return vendorInvoiceId
     */
    public java.lang.String getVendorInvoiceId() {
        return vendorInvoiceId;
    }


    /**
     * Sets the vendorInvoiceId value for this VendorInvoiceGetByIdRequest.
     * 
     * @param vendorInvoiceId
     */
    public void setVendorInvoiceId(java.lang.String vendorInvoiceId) {
        this.vendorInvoiceId = vendorInvoiceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorInvoiceGetByIdRequest)) return false;
        VendorInvoiceGetByIdRequest other = (VendorInvoiceGetByIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorInvoiceId==null && other.getVendorInvoiceId()==null) || 
             (this.vendorInvoiceId!=null &&
              this.vendorInvoiceId.equals(other.getVendorInvoiceId())));
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
        if (getVendorInvoiceId() != null) {
            _hashCode += getVendorInvoiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorInvoiceGetByIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
