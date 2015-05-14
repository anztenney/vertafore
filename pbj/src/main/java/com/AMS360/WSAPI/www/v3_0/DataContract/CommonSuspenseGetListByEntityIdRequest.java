/**
 * CommonSuspenseGetListByEntityIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CommonSuspenseGetListByEntityIdRequest  implements java.io.Serializable {
    private java.lang.String entityId;

    private java.lang.Boolean isCompleted;

    private java.lang.Short entityType;

    public CommonSuspenseGetListByEntityIdRequest() {
    }

    public CommonSuspenseGetListByEntityIdRequest(
           java.lang.String entityId,
           java.lang.Boolean isCompleted,
           java.lang.Short entityType) {
           this.entityId = entityId;
           this.isCompleted = isCompleted;
           this.entityType = entityType;
    }


    /**
     * Gets the entityId value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the isCompleted value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @return isCompleted
     */
    public java.lang.Boolean getIsCompleted() {
        return isCompleted;
    }


    /**
     * Sets the isCompleted value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @param isCompleted
     */
    public void setIsCompleted(java.lang.Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


    /**
     * Gets the entityType value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @return entityType
     */
    public java.lang.Short getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this CommonSuspenseGetListByEntityIdRequest.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.Short entityType) {
        this.entityType = entityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonSuspenseGetListByEntityIdRequest)) return false;
        CommonSuspenseGetListByEntityIdRequest other = (CommonSuspenseGetListByEntityIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.isCompleted==null && other.getIsCompleted()==null) || 
             (this.isCompleted!=null &&
              this.isCompleted.equals(other.getIsCompleted()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType())));
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
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getIsCompleted() != null) {
            _hashCode += getIsCompleted().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonSuspenseGetListByEntityIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetListByEntityIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
