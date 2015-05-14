/**
 * S1099TypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class S1099TypeInfo  implements java.io.Serializable {
    private java.lang.Short s1099Type;

    private java.lang.String s1099TypeDescription;

    public S1099TypeInfo() {
    }

    public S1099TypeInfo(
           java.lang.Short s1099Type,
           java.lang.String s1099TypeDescription) {
           this.s1099Type = s1099Type;
           this.s1099TypeDescription = s1099TypeDescription;
    }


    /**
     * Gets the s1099Type value for this S1099TypeInfo.
     * 
     * @return s1099Type
     */
    public java.lang.Short getS1099Type() {
        return s1099Type;
    }


    /**
     * Sets the s1099Type value for this S1099TypeInfo.
     * 
     * @param s1099Type
     */
    public void setS1099Type(java.lang.Short s1099Type) {
        this.s1099Type = s1099Type;
    }


    /**
     * Gets the s1099TypeDescription value for this S1099TypeInfo.
     * 
     * @return s1099TypeDescription
     */
    public java.lang.String getS1099TypeDescription() {
        return s1099TypeDescription;
    }


    /**
     * Sets the s1099TypeDescription value for this S1099TypeInfo.
     * 
     * @param s1099TypeDescription
     */
    public void setS1099TypeDescription(java.lang.String s1099TypeDescription) {
        this.s1099TypeDescription = s1099TypeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof S1099TypeInfo)) return false;
        S1099TypeInfo other = (S1099TypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.s1099Type==null && other.getS1099Type()==null) || 
             (this.s1099Type!=null &&
              this.s1099Type.equals(other.getS1099Type()))) &&
            ((this.s1099TypeDescription==null && other.getS1099TypeDescription()==null) || 
             (this.s1099TypeDescription!=null &&
              this.s1099TypeDescription.equals(other.getS1099TypeDescription())));
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
        if (getS1099Type() != null) {
            _hashCode += getS1099Type().hashCode();
        }
        if (getS1099TypeDescription() != null) {
            _hashCode += getS1099TypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(S1099TypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099TypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeDescription"));
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
