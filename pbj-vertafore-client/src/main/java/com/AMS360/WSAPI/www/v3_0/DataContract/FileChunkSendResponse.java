/**
 * FileChunkSendResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class FileChunkSendResponse  implements java.io.Serializable {
    private java.lang.String fileChunkId;

    private java.lang.Integer chunksReceived;

    public FileChunkSendResponse() {
    }

    public FileChunkSendResponse(
           java.lang.String fileChunkId,
           java.lang.Integer chunksReceived) {
           this.fileChunkId = fileChunkId;
           this.chunksReceived = chunksReceived;
    }


    /**
     * Gets the fileChunkId value for this FileChunkSendResponse.
     * 
     * @return fileChunkId
     */
    public java.lang.String getFileChunkId() {
        return fileChunkId;
    }


    /**
     * Sets the fileChunkId value for this FileChunkSendResponse.
     * 
     * @param fileChunkId
     */
    public void setFileChunkId(java.lang.String fileChunkId) {
        this.fileChunkId = fileChunkId;
    }


    /**
     * Gets the chunksReceived value for this FileChunkSendResponse.
     * 
     * @return chunksReceived
     */
    public java.lang.Integer getChunksReceived() {
        return chunksReceived;
    }


    /**
     * Sets the chunksReceived value for this FileChunkSendResponse.
     * 
     * @param chunksReceived
     */
    public void setChunksReceived(java.lang.Integer chunksReceived) {
        this.chunksReceived = chunksReceived;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileChunkSendResponse)) return false;
        FileChunkSendResponse other = (FileChunkSendResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileChunkId==null && other.getFileChunkId()==null) || 
             (this.fileChunkId!=null &&
              this.fileChunkId.equals(other.getFileChunkId()))) &&
            ((this.chunksReceived==null && other.getChunksReceived()==null) || 
             (this.chunksReceived!=null &&
              this.chunksReceived.equals(other.getChunksReceived())));
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
        if (getFileChunkId() != null) {
            _hashCode += getFileChunkId().hashCode();
        }
        if (getChunksReceived() != null) {
            _hashCode += getChunksReceived().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileChunkSendResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkSendResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileChunkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chunksReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ChunksReceived"));
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
