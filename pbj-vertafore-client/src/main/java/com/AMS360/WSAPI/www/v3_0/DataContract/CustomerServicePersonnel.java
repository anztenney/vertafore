/**
 * CustomerServicePersonnel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerServicePersonnel  implements java.io.Serializable {
    private java.lang.String employeeCode;

    private java.lang.String typeOfEmployee;

    private java.lang.Integer typeOfBusiness;

    private java.lang.Boolean isPrimary;

    public CustomerServicePersonnel() {
    }

    public CustomerServicePersonnel(
           java.lang.String employeeCode,
           java.lang.String typeOfEmployee,
           java.lang.Integer typeOfBusiness,
           java.lang.Boolean isPrimary) {
           this.employeeCode = employeeCode;
           this.typeOfEmployee = typeOfEmployee;
           this.typeOfBusiness = typeOfBusiness;
           this.isPrimary = isPrimary;
    }


    /**
     * Gets the employeeCode value for this CustomerServicePersonnel.
     * 
     * @return employeeCode
     */
    public java.lang.String getEmployeeCode() {
        return employeeCode;
    }


    /**
     * Sets the employeeCode value for this CustomerServicePersonnel.
     * 
     * @param employeeCode
     */
    public void setEmployeeCode(java.lang.String employeeCode) {
        this.employeeCode = employeeCode;
    }


    /**
     * Gets the typeOfEmployee value for this CustomerServicePersonnel.
     * 
     * @return typeOfEmployee
     */
    public java.lang.String getTypeOfEmployee() {
        return typeOfEmployee;
    }


    /**
     * Sets the typeOfEmployee value for this CustomerServicePersonnel.
     * 
     * @param typeOfEmployee
     */
    public void setTypeOfEmployee(java.lang.String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }


    /**
     * Gets the typeOfBusiness value for this CustomerServicePersonnel.
     * 
     * @return typeOfBusiness
     */
    public java.lang.Integer getTypeOfBusiness() {
        return typeOfBusiness;
    }


    /**
     * Sets the typeOfBusiness value for this CustomerServicePersonnel.
     * 
     * @param typeOfBusiness
     */
    public void setTypeOfBusiness(java.lang.Integer typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }


    /**
     * Gets the isPrimary value for this CustomerServicePersonnel.
     * 
     * @return isPrimary
     */
    public java.lang.Boolean getIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this CustomerServicePersonnel.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(java.lang.Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerServicePersonnel)) return false;
        CustomerServicePersonnel other = (CustomerServicePersonnel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeCode==null && other.getEmployeeCode()==null) || 
             (this.employeeCode!=null &&
              this.employeeCode.equals(other.getEmployeeCode()))) &&
            ((this.typeOfEmployee==null && other.getTypeOfEmployee()==null) || 
             (this.typeOfEmployee!=null &&
              this.typeOfEmployee.equals(other.getTypeOfEmployee()))) &&
            ((this.typeOfBusiness==null && other.getTypeOfBusiness()==null) || 
             (this.typeOfBusiness!=null &&
              this.typeOfBusiness.equals(other.getTypeOfBusiness()))) &&
            ((this.isPrimary==null && other.getIsPrimary()==null) || 
             (this.isPrimary!=null &&
              this.isPrimary.equals(other.getIsPrimary())));
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
        if (getEmployeeCode() != null) {
            _hashCode += getEmployeeCode().hashCode();
        }
        if (getTypeOfEmployee() != null) {
            _hashCode += getTypeOfEmployee().hashCode();
        }
        if (getTypeOfBusiness() != null) {
            _hashCode += getTypeOfBusiness().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerServicePersonnel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfEmployee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TypeOfEmployee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TypeOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
