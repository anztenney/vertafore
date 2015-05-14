/**
 * WSAPIBusinessFaultDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class WSAPIBusinessFaultDetail  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String dataName;

    private java.lang.String entityKey;

    public WSAPIBusinessFaultDetail() {
    }

    public WSAPIBusinessFaultDetail(
           java.lang.String message,
           java.lang.String dataName,
           java.lang.String entityKey) {
           this.message = message;
           this.dataName = dataName;
           this.entityKey = entityKey;
    }


    /**
     * Gets the message value for this WSAPIBusinessFaultDetail.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this WSAPIBusinessFaultDetail.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the dataName value for this WSAPIBusinessFaultDetail.
     * 
     * @return dataName
     */
    public java.lang.String getDataName() {
        return dataName;
    }


    /**
     * Sets the dataName value for this WSAPIBusinessFaultDetail.
     * 
     * @param dataName
     */
    public void setDataName(java.lang.String dataName) {
        this.dataName = dataName;
    }


    /**
     * Gets the entityKey value for this WSAPIBusinessFaultDetail.
     * 
     * @return entityKey
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this WSAPIBusinessFaultDetail.
     * 
     * @param entityKey
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAPIBusinessFaultDetail)) return false;
        WSAPIBusinessFaultDetail other = (WSAPIBusinessFaultDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.dataName==null && other.getDataName()==null) || 
             (this.dataName!=null &&
              this.dataName.equals(other.getDataName()))) &&
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getDataName() != null) {
            _hashCode += getDataName().hashCode();
        }
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAPIBusinessFaultDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFaultDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DataName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EntityKey"));
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
