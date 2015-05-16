/**
 * LineOfBusinessGetListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class LineOfBusinessGetListResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo[] lineOfBusinessInfoList;

    public LineOfBusinessGetListResponse() {
    }

    public LineOfBusinessGetListResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo[] lineOfBusinessInfoList) {
           this.lineOfBusinessInfoList = lineOfBusinessInfoList;
    }


    /**
     * Gets the lineOfBusinessInfoList value for this LineOfBusinessGetListResponse.
     * 
     * @return lineOfBusinessInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo[] getLineOfBusinessInfoList() {
        return lineOfBusinessInfoList;
    }


    /**
     * Sets the lineOfBusinessInfoList value for this LineOfBusinessGetListResponse.
     * 
     * @param lineOfBusinessInfoList
     */
    public void setLineOfBusinessInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo[] lineOfBusinessInfoList) {
        this.lineOfBusinessInfoList = lineOfBusinessInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineOfBusinessGetListResponse)) return false;
        LineOfBusinessGetListResponse other = (LineOfBusinessGetListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineOfBusinessInfoList==null && other.getLineOfBusinessInfoList()==null) || 
             (this.lineOfBusinessInfoList!=null &&
              java.util.Arrays.equals(this.lineOfBusinessInfoList, other.getLineOfBusinessInfoList())));
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
        if (getLineOfBusinessInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineOfBusinessInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineOfBusinessInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(LineOfBusinessGetListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo"));
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
