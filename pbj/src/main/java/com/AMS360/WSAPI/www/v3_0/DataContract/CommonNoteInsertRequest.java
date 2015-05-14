/**
 * CommonNoteInsertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CommonNoteInsertRequest  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.CommonNote commonNote;

    public CommonNoteInsertRequest() {
    }

    public CommonNoteInsertRequest(
           com.AMS360.WSAPI.www.v3_0.DataContract.CommonNote commonNote) {
           this.commonNote = commonNote;
    }


    /**
     * Gets the commonNote value for this CommonNoteInsertRequest.
     * 
     * @return commonNote
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonNote getCommonNote() {
        return commonNote;
    }


    /**
     * Sets the commonNote value for this CommonNoteInsertRequest.
     * 
     * @param commonNote
     */
    public void setCommonNote(com.AMS360.WSAPI.www.v3_0.DataContract.CommonNote commonNote) {
        this.commonNote = commonNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonNoteInsertRequest)) return false;
        CommonNoteInsertRequest other = (CommonNoteInsertRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonNote==null && other.getCommonNote()==null) || 
             (this.commonNote!=null &&
              this.commonNote.equals(other.getCommonNote())));
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
        if (getCommonNote() != null) {
            _hashCode += getCommonNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonNoteInsertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNoteInsertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNote"));
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
