/**
 * GLDepartmentGetByShortNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class GLDepartmentGetByShortNameResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment GLDepartment;

    public GLDepartmentGetByShortNameResponse() {
    }

    public GLDepartmentGetByShortNameResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment GLDepartment) {
           this.GLDepartment = GLDepartment;
    }


    /**
     * Gets the GLDepartment value for this GLDepartmentGetByShortNameResponse.
     * 
     * @return GLDepartment
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment getGLDepartment() {
        return GLDepartment;
    }


    /**
     * Sets the GLDepartment value for this GLDepartmentGetByShortNameResponse.
     * 
     * @param GLDepartment
     */
    public void setGLDepartment(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment GLDepartment) {
        this.GLDepartment = GLDepartment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLDepartmentGetByShortNameResponse)) return false;
        GLDepartmentGetByShortNameResponse other = (GLDepartmentGetByShortNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLDepartment==null && other.getGLDepartment()==null) || 
             (this.GLDepartment!=null &&
              this.GLDepartment.equals(other.getGLDepartment())));
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
        if (getGLDepartment() != null) {
            _hashCode += getGLDepartment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GLDepartmentGetByShortNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByShortNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDepartment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment"));
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
