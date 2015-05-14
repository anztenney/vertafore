/**
 * PersonalNoteInsertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PersonalNoteInsertRequest  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote userNote;

    public PersonalNoteInsertRequest() {
    }

    public PersonalNoteInsertRequest(
           com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote userNote) {
           this.userNote = userNote;
    }


    /**
     * Gets the userNote value for this PersonalNoteInsertRequest.
     * 
     * @return userNote
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote getUserNote() {
        return userNote;
    }


    /**
     * Sets the userNote value for this PersonalNoteInsertRequest.
     * 
     * @param userNote
     */
    public void setUserNote(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote userNote) {
        this.userNote = userNote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalNoteInsertRequest)) return false;
        PersonalNoteInsertRequest other = (PersonalNoteInsertRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userNote==null && other.getUserNote()==null) || 
             (this.userNote!=null &&
              this.userNote.equals(other.getUserNote())));
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
        if (getUserNote() != null) {
            _hashCode += getUserNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalNoteInsertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteInsertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "UserNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNote"));
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
