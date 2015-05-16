/**
 * LineOfBusinessGetByCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class LineOfBusinessGetByCodeResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusiness lineOfBusiness;

    public LineOfBusinessGetByCodeResponse() {
    }

    public LineOfBusinessGetByCodeResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusiness lineOfBusiness) {
           this.lineOfBusiness = lineOfBusiness;
    }


    /**
     * Gets the lineOfBusiness value for this LineOfBusinessGetByCodeResponse.
     * 
     * @return lineOfBusiness
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusiness getLineOfBusiness() {
        return lineOfBusiness;
    }


    /**
     * Sets the lineOfBusiness value for this LineOfBusinessGetByCodeResponse.
     * 
     * @param lineOfBusiness
     */
    public void setLineOfBusiness(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusiness lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineOfBusinessGetByCodeResponse)) return false;
        LineOfBusinessGetByCodeResponse other = (LineOfBusinessGetByCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineOfBusiness==null && other.getLineOfBusiness()==null) || 
             (this.lineOfBusiness!=null &&
              this.lineOfBusiness.equals(other.getLineOfBusiness())));
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
        if (getLineOfBusiness() != null) {
            _hashCode += getLineOfBusiness().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineOfBusinessGetByCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetByCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusiness"));
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
