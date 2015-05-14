/**
 * VendorInvoiceGetByIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class VendorInvoiceGetByIdResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoice vendorInvoice;

    public VendorInvoiceGetByIdResponse() {
    }

    public VendorInvoiceGetByIdResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoice vendorInvoice) {
           this.vendorInvoice = vendorInvoice;
    }


    /**
     * Gets the vendorInvoice value for this VendorInvoiceGetByIdResponse.
     * 
     * @return vendorInvoice
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoice getVendorInvoice() {
        return vendorInvoice;
    }


    /**
     * Sets the vendorInvoice value for this VendorInvoiceGetByIdResponse.
     * 
     * @param vendorInvoice
     */
    public void setVendorInvoice(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoice vendorInvoice) {
        this.vendorInvoice = vendorInvoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorInvoiceGetByIdResponse)) return false;
        VendorInvoiceGetByIdResponse other = (VendorInvoiceGetByIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorInvoice==null && other.getVendorInvoice()==null) || 
             (this.vendorInvoice!=null &&
              this.vendorInvoice.equals(other.getVendorInvoice())));
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
        if (getVendorInvoice() != null) {
            _hashCode += getVendorInvoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorInvoiceGetByIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoice"));
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
