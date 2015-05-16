/**
 * PolicyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyInfo  implements java.io.Serializable {
    private java.lang.String companyType;

    private java.lang.String customerId;

    private java.lang.Boolean isMultiEntity;

    private java.util.Calendar policyEffectiveDate;

    private java.util.Calendar policyExpirationDate;

    private java.lang.String policyId;

    private java.lang.String policyNumber;

    private java.lang.String policySubType;

    private java.lang.String policyTypeOfBusiness;

    private java.lang.String policyStatus;

    private java.lang.String writingCompanyCode;

    public PolicyInfo() {
    }

    public PolicyInfo(
           java.lang.String companyType,
           java.lang.String customerId,
           java.lang.Boolean isMultiEntity,
           java.util.Calendar policyEffectiveDate,
           java.util.Calendar policyExpirationDate,
           java.lang.String policyId,
           java.lang.String policyNumber,
           java.lang.String policySubType,
           java.lang.String policyTypeOfBusiness,
           java.lang.String policyStatus,
           java.lang.String writingCompanyCode) {
           this.companyType = companyType;
           this.customerId = customerId;
           this.isMultiEntity = isMultiEntity;
           this.policyEffectiveDate = policyEffectiveDate;
           this.policyExpirationDate = policyExpirationDate;
           this.policyId = policyId;
           this.policyNumber = policyNumber;
           this.policySubType = policySubType;
           this.policyTypeOfBusiness = policyTypeOfBusiness;
           this.policyStatus = policyStatus;
           this.writingCompanyCode = writingCompanyCode;
    }


    /**
     * Gets the companyType value for this PolicyInfo.
     * 
     * @return companyType
     */
    public java.lang.String getCompanyType() {
        return companyType;
    }


    /**
     * Sets the companyType value for this PolicyInfo.
     * 
     * @param companyType
     */
    public void setCompanyType(java.lang.String companyType) {
        this.companyType = companyType;
    }


    /**
     * Gets the customerId value for this PolicyInfo.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this PolicyInfo.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the isMultiEntity value for this PolicyInfo.
     * 
     * @return isMultiEntity
     */
    public java.lang.Boolean getIsMultiEntity() {
        return isMultiEntity;
    }


    /**
     * Sets the isMultiEntity value for this PolicyInfo.
     * 
     * @param isMultiEntity
     */
    public void setIsMultiEntity(java.lang.Boolean isMultiEntity) {
        this.isMultiEntity = isMultiEntity;
    }


    /**
     * Gets the policyEffectiveDate value for this PolicyInfo.
     * 
     * @return policyEffectiveDate
     */
    public java.util.Calendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }


    /**
     * Sets the policyEffectiveDate value for this PolicyInfo.
     * 
     * @param policyEffectiveDate
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }


    /**
     * Gets the policyExpirationDate value for this PolicyInfo.
     * 
     * @return policyExpirationDate
     */
    public java.util.Calendar getPolicyExpirationDate() {
        return policyExpirationDate;
    }


    /**
     * Sets the policyExpirationDate value for this PolicyInfo.
     * 
     * @param policyExpirationDate
     */
    public void setPolicyExpirationDate(java.util.Calendar policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }


    /**
     * Gets the policyId value for this PolicyInfo.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyInfo.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the policyNumber value for this PolicyInfo.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this PolicyInfo.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the policySubType value for this PolicyInfo.
     * 
     * @return policySubType
     */
    public java.lang.String getPolicySubType() {
        return policySubType;
    }


    /**
     * Sets the policySubType value for this PolicyInfo.
     * 
     * @param policySubType
     */
    public void setPolicySubType(java.lang.String policySubType) {
        this.policySubType = policySubType;
    }


    /**
     * Gets the policyTypeOfBusiness value for this PolicyInfo.
     * 
     * @return policyTypeOfBusiness
     */
    public java.lang.String getPolicyTypeOfBusiness() {
        return policyTypeOfBusiness;
    }


    /**
     * Sets the policyTypeOfBusiness value for this PolicyInfo.
     * 
     * @param policyTypeOfBusiness
     */
    public void setPolicyTypeOfBusiness(java.lang.String policyTypeOfBusiness) {
        this.policyTypeOfBusiness = policyTypeOfBusiness;
    }


    /**
     * Gets the policyStatus value for this PolicyInfo.
     * 
     * @return policyStatus
     */
    public java.lang.String getPolicyStatus() {
        return policyStatus;
    }


    /**
     * Sets the policyStatus value for this PolicyInfo.
     * 
     * @param policyStatus
     */
    public void setPolicyStatus(java.lang.String policyStatus) {
        this.policyStatus = policyStatus;
    }


    /**
     * Gets the writingCompanyCode value for this PolicyInfo.
     * 
     * @return writingCompanyCode
     */
    public java.lang.String getWritingCompanyCode() {
        return writingCompanyCode;
    }


    /**
     * Sets the writingCompanyCode value for this PolicyInfo.
     * 
     * @param writingCompanyCode
     */
    public void setWritingCompanyCode(java.lang.String writingCompanyCode) {
        this.writingCompanyCode = writingCompanyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyInfo)) return false;
        PolicyInfo other = (PolicyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyType==null && other.getCompanyType()==null) || 
             (this.companyType!=null &&
              this.companyType.equals(other.getCompanyType()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.isMultiEntity==null && other.getIsMultiEntity()==null) || 
             (this.isMultiEntity!=null &&
              this.isMultiEntity.equals(other.getIsMultiEntity()))) &&
            ((this.policyEffectiveDate==null && other.getPolicyEffectiveDate()==null) || 
             (this.policyEffectiveDate!=null &&
              this.policyEffectiveDate.equals(other.getPolicyEffectiveDate()))) &&
            ((this.policyExpirationDate==null && other.getPolicyExpirationDate()==null) || 
             (this.policyExpirationDate!=null &&
              this.policyExpirationDate.equals(other.getPolicyExpirationDate()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.policySubType==null && other.getPolicySubType()==null) || 
             (this.policySubType!=null &&
              this.policySubType.equals(other.getPolicySubType()))) &&
            ((this.policyTypeOfBusiness==null && other.getPolicyTypeOfBusiness()==null) || 
             (this.policyTypeOfBusiness!=null &&
              this.policyTypeOfBusiness.equals(other.getPolicyTypeOfBusiness()))) &&
            ((this.policyStatus==null && other.getPolicyStatus()==null) || 
             (this.policyStatus!=null &&
              this.policyStatus.equals(other.getPolicyStatus()))) &&
            ((this.writingCompanyCode==null && other.getWritingCompanyCode()==null) || 
             (this.writingCompanyCode!=null &&
              this.writingCompanyCode.equals(other.getWritingCompanyCode())));
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
        if (getCompanyType() != null) {
            _hashCode += getCompanyType().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getIsMultiEntity() != null) {
            _hashCode += getIsMultiEntity().hashCode();
        }
        if (getPolicyEffectiveDate() != null) {
            _hashCode += getPolicyEffectiveDate().hashCode();
        }
        if (getPolicyExpirationDate() != null) {
            _hashCode += getPolicyExpirationDate().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getPolicySubType() != null) {
            _hashCode += getPolicySubType().hashCode();
        }
        if (getPolicyTypeOfBusiness() != null) {
            _hashCode += getPolicyTypeOfBusiness().hashCode();
        }
        if (getPolicyStatus() != null) {
            _hashCode += getPolicyStatus().hashCode();
        }
        if (getWritingCompanyCode() != null) {
            _hashCode += getWritingCompanyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsMultiEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policySubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicySubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTypeOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTypeOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writingCompanyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WritingCompanyCode"));
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
