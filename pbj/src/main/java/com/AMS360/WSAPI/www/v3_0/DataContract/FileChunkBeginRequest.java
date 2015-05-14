/**
 * FileChunkBeginRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class FileChunkBeginRequest  implements java.io.Serializable {
    private java.lang.Integer numberOfChunks;

    private java.lang.Integer totalBytes;

    public FileChunkBeginRequest() {
    }

    public FileChunkBeginRequest(
           java.lang.Integer numberOfChunks,
           java.lang.Integer totalBytes) {
           this.numberOfChunks = numberOfChunks;
           this.totalBytes = totalBytes;
    }


    /**
     * Gets the numberOfChunks value for this FileChunkBeginRequest.
     * 
     * @return numberOfChunks
     */
    public java.lang.Integer getNumberOfChunks() {
        return numberOfChunks;
    }


    /**
     * Sets the numberOfChunks value for this FileChunkBeginRequest.
     * 
     * @param numberOfChunks
     */
    public void setNumberOfChunks(java.lang.Integer numberOfChunks) {
        this.numberOfChunks = numberOfChunks;
    }


    /**
     * Gets the totalBytes value for this FileChunkBeginRequest.
     * 
     * @return totalBytes
     */
    public java.lang.Integer getTotalBytes() {
        return totalBytes;
    }


    /**
     * Sets the totalBytes value for this FileChunkBeginRequest.
     * 
     * @param totalBytes
     */
    public void setTotalBytes(java.lang.Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileChunkBeginRequest)) return false;
        FileChunkBeginRequest other = (FileChunkBeginRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberOfChunks==null && other.getNumberOfChunks()==null) || 
             (this.numberOfChunks!=null &&
              this.numberOfChunks.equals(other.getNumberOfChunks()))) &&
            ((this.totalBytes==null && other.getTotalBytes()==null) || 
             (this.totalBytes!=null &&
              this.totalBytes.equals(other.getTotalBytes())));
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
        if (getNumberOfChunks() != null) {
            _hashCode += getNumberOfChunks().hashCode();
        }
        if (getTotalBytes() != null) {
            _hashCode += getTotalBytes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileChunkBeginRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkBeginRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfChunks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NumberOfChunks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TotalBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
