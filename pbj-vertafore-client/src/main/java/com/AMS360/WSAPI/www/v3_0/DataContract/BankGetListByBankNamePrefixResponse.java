/**
 * BankGetListByBankNamePrefixResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BankGetListByBankNamePrefixResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo[] bankInfoList;

    public BankGetListByBankNamePrefixResponse() {
    }

    public BankGetListByBankNamePrefixResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo[] bankInfoList) {
           this.bankInfoList = bankInfoList;
    }


    /**
     * Gets the bankInfoList value for this BankGetListByBankNamePrefixResponse.
     * 
     * @return bankInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo[] getBankInfoList() {
        return bankInfoList;
    }


    /**
     * Sets the bankInfoList value for this BankGetListByBankNamePrefixResponse.
     * 
     * @param bankInfoList
     */
    public void setBankInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo[] bankInfoList) {
        this.bankInfoList = bankInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankGetListByBankNamePrefixResponse)) return false;
        BankGetListByBankNamePrefixResponse other = (BankGetListByBankNamePrefixResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankInfoList==null && other.getBankInfoList()==null) || 
             (this.bankInfoList!=null &&
              java.util.Arrays.equals(this.bankInfoList, other.getBankInfoList())));
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
        if (getBankInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(BankGetListByBankNamePrefixResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfo"));
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
