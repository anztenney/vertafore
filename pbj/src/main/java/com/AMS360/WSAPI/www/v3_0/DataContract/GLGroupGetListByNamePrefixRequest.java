/**
 * GLGroupGetListByNamePrefixRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class GLGroupGetListByNamePrefixRequest  implements java.io.Serializable {
    private java.lang.String GLGroupNamePrefix;

    public GLGroupGetListByNamePrefixRequest() {
    }

    public GLGroupGetListByNamePrefixRequest(
           java.lang.String GLGroupNamePrefix) {
           this.GLGroupNamePrefix = GLGroupNamePrefix;
    }


    /**
     * Gets the GLGroupNamePrefix value for this GLGroupGetListByNamePrefixRequest.
     * 
     * @return GLGroupNamePrefix
     */
    public java.lang.String getGLGroupNamePrefix() {
        return GLGroupNamePrefix;
    }


    /**
     * Sets the GLGroupNamePrefix value for this GLGroupGetListByNamePrefixRequest.
     * 
     * @param GLGroupNamePrefix
     */
    public void setGLGroupNamePrefix(java.lang.String GLGroupNamePrefix) {
        this.GLGroupNamePrefix = GLGroupNamePrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLGroupGetListByNamePrefixRequest)) return false;
        GLGroupGetListByNamePrefixRequest other = (GLGroupGetListByNamePrefixRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLGroupNamePrefix==null && other.getGLGroupNamePrefix()==null) || 
             (this.GLGroupNamePrefix!=null &&
              this.GLGroupNamePrefix.equals(other.getGLGroupNamePrefix())));
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
        if (getGLGroupNamePrefix() != null) {
            _hashCode += getGLGroupNamePrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GLGroupGetListByNamePrefixRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByNamePrefixRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLGroupNamePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupNamePrefix"));
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
