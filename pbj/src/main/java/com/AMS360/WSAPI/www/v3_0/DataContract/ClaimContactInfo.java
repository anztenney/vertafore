/**
 * ClaimContactInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class ClaimContactInfo  implements java.io.Serializable {
    private java.lang.String claimContactId;

    private java.lang.String nameClaimContact;

    public ClaimContactInfo() {
    }

    public ClaimContactInfo(
           java.lang.String claimContactId,
           java.lang.String nameClaimContact) {
           this.claimContactId = claimContactId;
           this.nameClaimContact = nameClaimContact;
    }


    /**
     * Gets the claimContactId value for this ClaimContactInfo.
     * 
     * @return claimContactId
     */
    public java.lang.String getClaimContactId() {
        return claimContactId;
    }


    /**
     * Sets the claimContactId value for this ClaimContactInfo.
     * 
     * @param claimContactId
     */
    public void setClaimContactId(java.lang.String claimContactId) {
        this.claimContactId = claimContactId;
    }


    /**
     * Gets the nameClaimContact value for this ClaimContactInfo.
     * 
     * @return nameClaimContact
     */
    public java.lang.String getNameClaimContact() {
        return nameClaimContact;
    }


    /**
     * Sets the nameClaimContact value for this ClaimContactInfo.
     * 
     * @param nameClaimContact
     */
    public void setNameClaimContact(java.lang.String nameClaimContact) {
        this.nameClaimContact = nameClaimContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimContactInfo)) return false;
        ClaimContactInfo other = (ClaimContactInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimContactId==null && other.getClaimContactId()==null) || 
             (this.claimContactId!=null &&
              this.claimContactId.equals(other.getClaimContactId()))) &&
            ((this.nameClaimContact==null && other.getNameClaimContact()==null) || 
             (this.nameClaimContact!=null &&
              this.nameClaimContact.equals(other.getNameClaimContact())));
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
        if (getClaimContactId() != null) {
            _hashCode += getClaimContactId().hashCode();
        }
        if (getNameClaimContact() != null) {
            _hashCode += getNameClaimContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClaimContactInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameClaimContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NameClaimContact"));
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
