/**
 * PolicyGetListByPolicyNumberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyGetListByPolicyNumberRequest  implements java.io.Serializable {
    private java.lang.String policyNumber;

    private java.util.Calendar policyEffectiveDate;

    private java.util.Calendar policyExpirationDate;

    private java.lang.Boolean includeMultiEntity;

    private java.lang.Boolean includeAccountingSubType;

    private java.lang.Boolean includeSubmissionSubType;

    private java.lang.Boolean includePolicySubType;

    public PolicyGetListByPolicyNumberRequest() {
    }

    public PolicyGetListByPolicyNumberRequest(
           java.lang.String policyNumber,
           java.util.Calendar policyEffectiveDate,
           java.util.Calendar policyExpirationDate,
           java.lang.Boolean includeMultiEntity,
           java.lang.Boolean includeAccountingSubType,
           java.lang.Boolean includeSubmissionSubType,
           java.lang.Boolean includePolicySubType) {
           this.policyNumber = policyNumber;
           this.policyEffectiveDate = policyEffectiveDate;
           this.policyExpirationDate = policyExpirationDate;
           this.includeMultiEntity = includeMultiEntity;
           this.includeAccountingSubType = includeAccountingSubType;
           this.includeSubmissionSubType = includeSubmissionSubType;
           this.includePolicySubType = includePolicySubType;
    }


    /**
     * Gets the policyNumber value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the policyEffectiveDate value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return policyEffectiveDate
     */
    public java.util.Calendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }


    /**
     * Sets the policyEffectiveDate value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param policyEffectiveDate
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }


    /**
     * Gets the policyExpirationDate value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return policyExpirationDate
     */
    public java.util.Calendar getPolicyExpirationDate() {
        return policyExpirationDate;
    }


    /**
     * Sets the policyExpirationDate value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param policyExpirationDate
     */
    public void setPolicyExpirationDate(java.util.Calendar policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }


    /**
     * Gets the includeMultiEntity value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return includeMultiEntity
     */
    public java.lang.Boolean getIncludeMultiEntity() {
        return includeMultiEntity;
    }


    /**
     * Sets the includeMultiEntity value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param includeMultiEntity
     */
    public void setIncludeMultiEntity(java.lang.Boolean includeMultiEntity) {
        this.includeMultiEntity = includeMultiEntity;
    }


    /**
     * Gets the includeAccountingSubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return includeAccountingSubType
     */
    public java.lang.Boolean getIncludeAccountingSubType() {
        return includeAccountingSubType;
    }


    /**
     * Sets the includeAccountingSubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param includeAccountingSubType
     */
    public void setIncludeAccountingSubType(java.lang.Boolean includeAccountingSubType) {
        this.includeAccountingSubType = includeAccountingSubType;
    }


    /**
     * Gets the includeSubmissionSubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return includeSubmissionSubType
     */
    public java.lang.Boolean getIncludeSubmissionSubType() {
        return includeSubmissionSubType;
    }


    /**
     * Sets the includeSubmissionSubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param includeSubmissionSubType
     */
    public void setIncludeSubmissionSubType(java.lang.Boolean includeSubmissionSubType) {
        this.includeSubmissionSubType = includeSubmissionSubType;
    }


    /**
     * Gets the includePolicySubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @return includePolicySubType
     */
    public java.lang.Boolean getIncludePolicySubType() {
        return includePolicySubType;
    }


    /**
     * Sets the includePolicySubType value for this PolicyGetListByPolicyNumberRequest.
     * 
     * @param includePolicySubType
     */
    public void setIncludePolicySubType(java.lang.Boolean includePolicySubType) {
        this.includePolicySubType = includePolicySubType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyGetListByPolicyNumberRequest)) return false;
        PolicyGetListByPolicyNumberRequest other = (PolicyGetListByPolicyNumberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.policyEffectiveDate==null && other.getPolicyEffectiveDate()==null) || 
             (this.policyEffectiveDate!=null &&
              this.policyEffectiveDate.equals(other.getPolicyEffectiveDate()))) &&
            ((this.policyExpirationDate==null && other.getPolicyExpirationDate()==null) || 
             (this.policyExpirationDate!=null &&
              this.policyExpirationDate.equals(other.getPolicyExpirationDate()))) &&
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
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getPolicyEffectiveDate() != null) {
            _hashCode += getPolicyEffectiveDate().hashCode();
        }
        if (getPolicyExpirationDate() != null) {
            _hashCode += getPolicyExpirationDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(PolicyGetListByPolicyNumberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
