/**
 * GLDivisionGetByShortNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class GLDivisionGetByShortNameResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision GLDivision;

    public GLDivisionGetByShortNameResponse() {
    }

    public GLDivisionGetByShortNameResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision GLDivision) {
           this.GLDivision = GLDivision;
    }


    /**
     * Gets the GLDivision value for this GLDivisionGetByShortNameResponse.
     * 
     * @return GLDivision
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision getGLDivision() {
        return GLDivision;
    }


    /**
     * Sets the GLDivision value for this GLDivisionGetByShortNameResponse.
     * 
     * @param GLDivision
     */
    public void setGLDivision(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision GLDivision) {
        this.GLDivision = GLDivision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLDivisionGetByShortNameResponse)) return false;
        GLDivisionGetByShortNameResponse other = (GLDivisionGetByShortNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLDivision==null && other.getGLDivision()==null) || 
             (this.GLDivision!=null &&
              this.GLDivision.equals(other.getGLDivision())));
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
        if (getGLDivision() != null) {
            _hashCode += getGLDivision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GLDivisionGetByShortNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByShortNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDivision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivision"));
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
