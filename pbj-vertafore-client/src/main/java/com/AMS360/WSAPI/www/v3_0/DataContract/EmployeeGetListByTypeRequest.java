/**
 * EmployeeGetListByTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class EmployeeGetListByTypeRequest  implements java.io.Serializable {
    private java.lang.Boolean includeRepresentative;

    private java.lang.Boolean includeExecutive;

    private java.lang.Boolean includeSalesCenterRepresentative;

    public EmployeeGetListByTypeRequest() {
    }

    public EmployeeGetListByTypeRequest(
           java.lang.Boolean includeRepresentative,
           java.lang.Boolean includeExecutive,
           java.lang.Boolean includeSalesCenterRepresentative) {
           this.includeRepresentative = includeRepresentative;
           this.includeExecutive = includeExecutive;
           this.includeSalesCenterRepresentative = includeSalesCenterRepresentative;
    }


    /**
     * Gets the includeRepresentative value for this EmployeeGetListByTypeRequest.
     * 
     * @return includeRepresentative
     */
    public java.lang.Boolean getIncludeRepresentative() {
        return includeRepresentative;
    }


    /**
     * Sets the includeRepresentative value for this EmployeeGetListByTypeRequest.
     * 
     * @param includeRepresentative
     */
    public void setIncludeRepresentative(java.lang.Boolean includeRepresentative) {
        this.includeRepresentative = includeRepresentative;
    }


    /**
     * Gets the includeExecutive value for this EmployeeGetListByTypeRequest.
     * 
     * @return includeExecutive
     */
    public java.lang.Boolean getIncludeExecutive() {
        return includeExecutive;
    }


    /**
     * Sets the includeExecutive value for this EmployeeGetListByTypeRequest.
     * 
     * @param includeExecutive
     */
    public void setIncludeExecutive(java.lang.Boolean includeExecutive) {
        this.includeExecutive = includeExecutive;
    }


    /**
     * Gets the includeSalesCenterRepresentative value for this EmployeeGetListByTypeRequest.
     * 
     * @return includeSalesCenterRepresentative
     */
    public java.lang.Boolean getIncludeSalesCenterRepresentative() {
        return includeSalesCenterRepresentative;
    }


    /**
     * Sets the includeSalesCenterRepresentative value for this EmployeeGetListByTypeRequest.
     * 
     * @param includeSalesCenterRepresentative
     */
    public void setIncludeSalesCenterRepresentative(java.lang.Boolean includeSalesCenterRepresentative) {
        this.includeSalesCenterRepresentative = includeSalesCenterRepresentative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeGetListByTypeRequest)) return false;
        EmployeeGetListByTypeRequest other = (EmployeeGetListByTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeRepresentative==null && other.getIncludeRepresentative()==null) || 
             (this.includeRepresentative!=null &&
              this.includeRepresentative.equals(other.getIncludeRepresentative()))) &&
            ((this.includeExecutive==null && other.getIncludeExecutive()==null) || 
             (this.includeExecutive!=null &&
              this.includeExecutive.equals(other.getIncludeExecutive()))) &&
            ((this.includeSalesCenterRepresentative==null && other.getIncludeSalesCenterRepresentative()==null) || 
             (this.includeSalesCenterRepresentative!=null &&
              this.includeSalesCenterRepresentative.equals(other.getIncludeSalesCenterRepresentative())));
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
        if (getIncludeRepresentative() != null) {
            _hashCode += getIncludeRepresentative().hashCode();
        }
        if (getIncludeExecutive() != null) {
            _hashCode += getIncludeExecutive().hashCode();
        }
        if (getIncludeSalesCenterRepresentative() != null) {
            _hashCode += getIncludeSalesCenterRepresentative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeGetListByTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeRepresentative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeExecutive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeExecutive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSalesCenterRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeSalesCenterRepresentative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
