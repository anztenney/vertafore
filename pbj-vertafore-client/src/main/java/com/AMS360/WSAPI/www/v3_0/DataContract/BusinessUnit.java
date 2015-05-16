/**
 * BusinessUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class BusinessUnit  implements java.io.Serializable {
    private java.lang.String GLDivisionCode;

    private java.lang.String GLBranchCode;

    private java.lang.String GLDepartmentCode;

    private java.lang.String GLGroupCode;

    public BusinessUnit() {
    }

    public BusinessUnit(
           java.lang.String GLDivisionCode,
           java.lang.String GLBranchCode,
           java.lang.String GLDepartmentCode,
           java.lang.String GLGroupCode) {
           this.GLDivisionCode = GLDivisionCode;
           this.GLBranchCode = GLBranchCode;
           this.GLDepartmentCode = GLDepartmentCode;
           this.GLGroupCode = GLGroupCode;
    }


    /**
     * Gets the GLDivisionCode value for this BusinessUnit.
     * 
     * @return GLDivisionCode
     */
    public java.lang.String getGLDivisionCode() {
        return GLDivisionCode;
    }


    /**
     * Sets the GLDivisionCode value for this BusinessUnit.
     * 
     * @param GLDivisionCode
     */
    public void setGLDivisionCode(java.lang.String GLDivisionCode) {
        this.GLDivisionCode = GLDivisionCode;
    }


    /**
     * Gets the GLBranchCode value for this BusinessUnit.
     * 
     * @return GLBranchCode
     */
    public java.lang.String getGLBranchCode() {
        return GLBranchCode;
    }


    /**
     * Sets the GLBranchCode value for this BusinessUnit.
     * 
     * @param GLBranchCode
     */
    public void setGLBranchCode(java.lang.String GLBranchCode) {
        this.GLBranchCode = GLBranchCode;
    }


    /**
     * Gets the GLDepartmentCode value for this BusinessUnit.
     * 
     * @return GLDepartmentCode
     */
    public java.lang.String getGLDepartmentCode() {
        return GLDepartmentCode;
    }


    /**
     * Sets the GLDepartmentCode value for this BusinessUnit.
     * 
     * @param GLDepartmentCode
     */
    public void setGLDepartmentCode(java.lang.String GLDepartmentCode) {
        this.GLDepartmentCode = GLDepartmentCode;
    }


    /**
     * Gets the GLGroupCode value for this BusinessUnit.
     * 
     * @return GLGroupCode
     */
    public java.lang.String getGLGroupCode() {
        return GLGroupCode;
    }


    /**
     * Sets the GLGroupCode value for this BusinessUnit.
     * 
     * @param GLGroupCode
     */
    public void setGLGroupCode(java.lang.String GLGroupCode) {
        this.GLGroupCode = GLGroupCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessUnit)) return false;
        BusinessUnit other = (BusinessUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLDivisionCode==null && other.getGLDivisionCode()==null) || 
             (this.GLDivisionCode!=null &&
              this.GLDivisionCode.equals(other.getGLDivisionCode()))) &&
            ((this.GLBranchCode==null && other.getGLBranchCode()==null) || 
             (this.GLBranchCode!=null &&
              this.GLBranchCode.equals(other.getGLBranchCode()))) &&
            ((this.GLDepartmentCode==null && other.getGLDepartmentCode()==null) || 
             (this.GLDepartmentCode!=null &&
              this.GLDepartmentCode.equals(other.getGLDepartmentCode()))) &&
            ((this.GLGroupCode==null && other.getGLGroupCode()==null) || 
             (this.GLGroupCode!=null &&
              this.GLGroupCode.equals(other.getGLGroupCode())));
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
        if (getGLDivisionCode() != null) {
            _hashCode += getGLDivisionCode().hashCode();
        }
        if (getGLBranchCode() != null) {
            _hashCode += getGLBranchCode().hashCode();
        }
        if (getGLDepartmentCode() != null) {
            _hashCode += getGLDepartmentCode().hashCode();
        }
        if (getGLGroupCode() != null) {
            _hashCode += getGLGroupCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDivisionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLBranchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDepartmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupCode"));
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
