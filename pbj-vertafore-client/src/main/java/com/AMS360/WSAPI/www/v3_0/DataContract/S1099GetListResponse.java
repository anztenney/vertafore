/**
 * S1099GetListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class S1099GetListResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo[] s1099CategoryInfoList;

    public S1099GetListResponse() {
    }

    public S1099GetListResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo[] s1099CategoryInfoList) {
           this.s1099CategoryInfoList = s1099CategoryInfoList;
    }


    /**
     * Gets the s1099CategoryInfoList value for this S1099GetListResponse.
     * 
     * @return s1099CategoryInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo[] getS1099CategoryInfoList() {
        return s1099CategoryInfoList;
    }


    /**
     * Sets the s1099CategoryInfoList value for this S1099GetListResponse.
     * 
     * @param s1099CategoryInfoList
     */
    public void setS1099CategoryInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo[] s1099CategoryInfoList) {
        this.s1099CategoryInfoList = s1099CategoryInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof S1099GetListResponse)) return false;
        S1099GetListResponse other = (S1099GetListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.s1099CategoryInfoList==null && other.getS1099CategoryInfoList()==null) || 
             (this.s1099CategoryInfoList!=null &&
              java.util.Arrays.equals(this.s1099CategoryInfoList, other.getS1099CategoryInfoList())));
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
        if (getS1099CategoryInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getS1099CategoryInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getS1099CategoryInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(S1099GetListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099GetListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099CategoryInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo"));
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
