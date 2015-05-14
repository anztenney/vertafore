/**
 * BankGetListByBankNamePrefixRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BankGetListByBankNamePrefixRequest  implements java.io.Serializable {
    private java.lang.String bankNamePrefix;

    public BankGetListByBankNamePrefixRequest() {
    }

    public BankGetListByBankNamePrefixRequest(
           java.lang.String bankNamePrefix) {
           this.bankNamePrefix = bankNamePrefix;
    }


    /**
     * Gets the bankNamePrefix value for this BankGetListByBankNamePrefixRequest.
     * 
     * @return bankNamePrefix
     */
    public java.lang.String getBankNamePrefix() {
        return bankNamePrefix;
    }


    /**
     * Sets the bankNamePrefix value for this BankGetListByBankNamePrefixRequest.
     * 
     * @param bankNamePrefix
     */
    public void setBankNamePrefix(java.lang.String bankNamePrefix) {
        this.bankNamePrefix = bankNamePrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankGetListByBankNamePrefixRequest)) return false;
        BankGetListByBankNamePrefixRequest other = (BankGetListByBankNamePrefixRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankNamePrefix==null && other.getBankNamePrefix()==null) || 
             (this.bankNamePrefix!=null &&
              this.bankNamePrefix.equals(other.getBankNamePrefix())));
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
        if (getBankNamePrefix() != null) {
            _hashCode += getBankNamePrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankGetListByBankNamePrefixRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankNamePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankNamePrefix"));
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
