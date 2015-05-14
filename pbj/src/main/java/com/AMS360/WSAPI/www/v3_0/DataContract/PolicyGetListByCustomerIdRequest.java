/**
 * PolicyGetListByCustomerIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyGetListByCustomerIdRequest  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String[] policyStatus;

    private java.lang.Boolean includeMultiEntity;

    private java.lang.Boolean includeAccountingSubType;

    private java.lang.Boolean includeSubmissionSubType;

    private java.lang.Boolean includePolicySubType;

    public PolicyGetListByCustomerIdRequest() {
    }

    public PolicyGetListByCustomerIdRequest(
           java.lang.String customerId,
           java.lang.String[] policyStatus,
           java.lang.Boolean includeMultiEntity,
           java.lang.Boolean includeAccountingSubType,
           java.lang.Boolean includeSubmissionSubType,
           java.lang.Boolean includePolicySubType) {
           this.customerId = customerId;
           this.policyStatus = policyStatus;
           this.includeMultiEntity = includeMultiEntity;
           this.includeAccountingSubType = includeAccountingSubType;
           this.includeSubmissionSubType = includeSubmissionSubType;
           this.includePolicySubType = includePolicySubType;
    }


    /**
     * Gets the customerId value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the policyStatus value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return policyStatus
     */
    public java.lang.String[] getPolicyStatus() {
        return policyStatus;
    }


    /**
     * Sets the policyStatus value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param policyStatus
     */
    public void setPolicyStatus(java.lang.String[] policyStatus) {
        this.policyStatus = policyStatus;
    }


    /**
     * Gets the includeMultiEntity value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return includeMultiEntity
     */
    public java.lang.Boolean getIncludeMultiEntity() {
        return includeMultiEntity;
    }


    /**
     * Sets the includeMultiEntity value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param includeMultiEntity
     */
    public void setIncludeMultiEntity(java.lang.Boolean includeMultiEntity) {
        this.includeMultiEntity = includeMultiEntity;
    }


    /**
     * Gets the includeAccountingSubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return includeAccountingSubType
     */
    public java.lang.Boolean getIncludeAccountingSubType() {
        return includeAccountingSubType;
    }


    /**
     * Sets the includeAccountingSubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param includeAccountingSubType
     */
    public void setIncludeAccountingSubType(java.lang.Boolean includeAccountingSubType) {
        this.includeAccountingSubType = includeAccountingSubType;
    }


    /**
     * Gets the includeSubmissionSubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return includeSubmissionSubType
     */
    public java.lang.Boolean getIncludeSubmissionSubType() {
        return includeSubmissionSubType;
    }


    /**
     * Sets the includeSubmissionSubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param includeSubmissionSubType
     */
    public void setIncludeSubmissionSubType(java.lang.Boolean includeSubmissionSubType) {
        this.includeSubmissionSubType = includeSubmissionSubType;
    }


    /**
     * Gets the includePolicySubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @return includePolicySubType
     */
    public java.lang.Boolean getIncludePolicySubType() {
        return includePolicySubType;
    }


    /**
     * Sets the includePolicySubType value for this PolicyGetListByCustomerIdRequest.
     * 
     * @param includePolicySubType
     */
    public void setIncludePolicySubType(java.lang.Boolean includePolicySubType) {
        this.includePolicySubType = includePolicySubType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyGetListByCustomerIdRequest)) return false;
        PolicyGetListByCustomerIdRequest other = (PolicyGetListByCustomerIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.policyStatus==null && other.getPolicyStatus()==null) || 
             (this.policyStatus!=null &&
              java.util.Arrays.equals(this.policyStatus, other.getPolicyStatus()))) &&
            ((this.includeMultiEntity==null && other.getIncludeMultiEntity()==null) || 
             (this.includeMultiEntity!=null &&
              this.includeMultiEntity.equals(other.getIncludeMultiEntity()))) &&
            ((this.includeAccountingSubType==null && other.getIncludeAccountingSubType()==null) || 
             (this.includeAccountingSubType!=null &&
              this.includeAccountingSubType.equals(other.getIncludeAccountingSubType()))) &&
            ((this.includeSubmissionSubType==null && other.getIncludeSubmissionSubType()==null) || 
             (this.includeSubmissionSubType!=null &&
              this.includeSubmissionSubType.equals(other.getIncludeSubmissionSubType()))) &&
            ((this.includePolicySubType==null && other.getIncludePolicySubType()==null) || 
             (this.includePolicySubType!=null &&
              this.includePolicySubType.equals(other.getIncludePolicySubType())));
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
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getPolicyStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeMultiEntity() != null) {
            _hashCode += getIncludeMultiEntity().hashCode();
        }
        if (getIncludeAccountingSubType() != null) {
            _hashCode += getIncludeAccountingSubType().hashCode();
        }
        if (getIncludeSubmissionSubType() != null) {
            _hashCode += getIncludeSubmissionSubType().hashCode();
        }
        if (getIncludePolicySubType() != null) {
            _hashCode += getIncludePolicySubType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyGetListByCustomerIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMultiEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeMultiEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAccountingSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeAccountingSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSubmissionSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeSubmissionSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePolicySubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludePolicySubType"));
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
