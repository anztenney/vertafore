/**
 * GLDepartmentGetListByNamePrefixResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class GLDepartmentGetListByNamePrefixResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment[] GLDepartmentList;

    public GLDepartmentGetListByNamePrefixResponse() {
    }

    public GLDepartmentGetListByNamePrefixResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment[] GLDepartmentList) {
           this.GLDepartmentList = GLDepartmentList;
    }


    /**
     * Gets the GLDepartmentList value for this GLDepartmentGetListByNamePrefixResponse.
     * 
     * @return GLDepartmentList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment[] getGLDepartmentList() {
        return GLDepartmentList;
    }


    /**
     * Sets the GLDepartmentList value for this GLDepartmentGetListByNamePrefixResponse.
     * 
     * @param GLDepartmentList
     */
    public void setGLDepartmentList(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment[] GLDepartmentList) {
        this.GLDepartmentList = GLDepartmentList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLDepartmentGetListByNamePrefixResponse)) return false;
        GLDepartmentGetListByNamePrefixResponse other = (GLDepartmentGetListByNamePrefixResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLDepartmentList==null && other.getGLDepartmentList()==null) || 
             (this.GLDepartmentList!=null &&
              java.util.Arrays.equals(this.GLDepartmentList, other.getGLDepartmentList())));
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
        if (getGLDepartmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGLDepartmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGLDepartmentList(), i);
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
        new org.apache.axis.description.TypeDesc(GLDepartmentGetListByNamePrefixResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByNamePrefixResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDepartmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment"));
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
