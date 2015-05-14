/**
 * PolicyTransactionPremium.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyTransactionPremium  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.util.Calendar transactionEffectiveDate;

    private java.lang.String policyTransactionPremiumId;

    private java.lang.String lineOfBusiness;

    private java.lang.String planType;

    private java.lang.String writingCompanyCode;

    private java.lang.String description;

    private java.math.BigDecimal premium;

    private java.math.BigDecimal billiedPremium;

    private java.math.BigDecimal writtenPremium;

    private java.math.BigDecimal fullTermPremium;

    private java.lang.Boolean includePremium;

    private java.lang.String howBilled;

    private java.lang.Boolean isSuspended;

    private java.lang.String reconciled;

    public PolicyTransactionPremium() {
    }

    public PolicyTransactionPremium(
           java.lang.String policyId,
           java.util.Calendar transactionEffectiveDate,
           java.lang.String policyTransactionPremiumId,
           java.lang.String lineOfBusiness,
           java.lang.String planType,
           java.lang.String writingCompanyCode,
           java.lang.String description,
           java.math.BigDecimal premium,
           java.math.BigDecimal billiedPremium,
           java.math.BigDecimal writtenPremium,
           java.math.BigDecimal fullTermPremium,
           java.lang.Boolean includePremium,
           java.lang.String howBilled,
           java.lang.Boolean isSuspended,
           java.lang.String reconciled) {
           this.policyId = policyId;
           this.transactionEffectiveDate = transactionEffectiveDate;
           this.policyTransactionPremiumId = policyTransactionPremiumId;
           this.lineOfBusiness = lineOfBusiness;
           this.planType = planType;
           this.writingCompanyCode = writingCompanyCode;
           this.description = description;
           this.premium = premium;
           this.billiedPremium = billiedPremium;
           this.writtenPremium = writtenPremium;
           this.fullTermPremium = fullTermPremium;
           this.includePremium = includePremium;
           this.howBilled = howBilled;
           this.isSuspended = isSuspended;
           this.reconciled = reconciled;
    }


    /**
     * Gets the policyId value for this PolicyTransactionPremium.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyTransactionPremium.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the transactionEffectiveDate value for this PolicyTransactionPremium.
     * 
     * @return transactionEffectiveDate
     */
    public java.util.Calendar getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }


    /**
     * Sets the transactionEffectiveDate value for this PolicyTransactionPremium.
     * 
     * @param transactionEffectiveDate
     */
    public void setTransactionEffectiveDate(java.util.Calendar transactionEffectiveDate) {
        this.transactionEffectiveDate = transactionEffectiveDate;
    }


    /**
     * Gets the policyTransactionPremiumId value for this PolicyTransactionPremium.
     * 
     * @return policyTransactionPremiumId
     */
    public java.lang.String getPolicyTransactionPremiumId() {
        return policyTransactionPremiumId;
    }


    /**
     * Sets the policyTransactionPremiumId value for this PolicyTransactionPremium.
     * 
     * @param policyTransactionPremiumId
     */
    public void setPolicyTransactionPremiumId(java.lang.String policyTransactionPremiumId) {
        this.policyTransactionPremiumId = policyTransactionPremiumId;
    }


    /**
     * Gets the lineOfBusiness value for this PolicyTransactionPremium.
     * 
     * @return lineOfBusiness
     */
    public java.lang.String getLineOfBusiness() {
        return lineOfBusiness;
    }


    /**
     * Sets the lineOfBusiness value for this PolicyTransactionPremium.
     * 
     * @param lineOfBusiness
     */
    public void setLineOfBusiness(java.lang.String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }


    /**
     * Gets the planType value for this PolicyTransactionPremium.
     * 
     * @return planType
     */
    public java.lang.String getPlanType() {
        return planType;
    }


    /**
     * Sets the planType value for this PolicyTransactionPremium.
     * 
     * @param planType
     */
    public void setPlanType(java.lang.String planType) {
        this.planType = planType;
    }


    /**
     * Gets the writingCompanyCode value for this PolicyTransactionPremium.
     * 
     * @return writingCompanyCode
     */
    public java.lang.String getWritingCompanyCode() {
        return writingCompanyCode;
    }


    /**
     * Sets the writingCompanyCode value for this PolicyTransactionPremium.
     * 
     * @param writingCompanyCode
     */
    public void setWritingCompanyCode(java.lang.String writingCompanyCode) {
        this.writingCompanyCode = writingCompanyCode;
    }


    /**
     * Gets the description value for this PolicyTransactionPremium.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PolicyTransactionPremium.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the premium value for this PolicyTransactionPremium.
     * 
     * @return premium
     */
    public java.math.BigDecimal getPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this PolicyTransactionPremium.
     * 
     * @param premium
     */
    public void setPremium(java.math.BigDecimal premium) {
        this.premium = premium;
    }


    /**
     * Gets the billiedPremium value for this PolicyTransactionPremium.
     * 
     * @return billiedPremium
     */
    public java.math.BigDecimal getBilliedPremium() {
        return billiedPremium;
    }


    /**
     * Sets the billiedPremium value for this PolicyTransactionPremium.
     * 
     * @param billiedPremium
     */
    public void setBilliedPremium(java.math.BigDecimal billiedPremium) {
        this.billiedPremium = billiedPremium;
    }


    /**
     * Gets the writtenPremium value for this PolicyTransactionPremium.
     * 
     * @return writtenPremium
     */
    public java.math.BigDecimal getWrittenPremium() {
        return writtenPremium;
    }


    /**
     * Sets the writtenPremium value for this PolicyTransactionPremium.
     * 
     * @param writtenPremium
     */
    public void setWrittenPremium(java.math.BigDecimal writtenPremium) {
        this.writtenPremium = writtenPremium;
    }


    /**
     * Gets the fullTermPremium value for this PolicyTransactionPremium.
     * 
     * @return fullTermPremium
     */
    public java.math.BigDecimal getFullTermPremium() {
        return fullTermPremium;
    }


    /**
     * Sets the fullTermPremium value for this PolicyTransactionPremium.
     * 
     * @param fullTermPremium
     */
    public void setFullTermPremium(java.math.BigDecimal fullTermPremium) {
        this.fullTermPremium = fullTermPremium;
    }


    /**
     * Gets the includePremium value for this PolicyTransactionPremium.
     * 
     * @return includePremium
     */
    public java.lang.Boolean getIncludePremium() {
        return includePremium;
    }


    /**
     * Sets the includePremium value for this PolicyTransactionPremium.
     * 
     * @param includePremium
     */
    public void setIncludePremium(java.lang.Boolean includePremium) {
        this.includePremium = includePremium;
    }


    /**
     * Gets the howBilled value for this PolicyTransactionPremium.
     * 
     * @return howBilled
     */
    public java.lang.String getHowBilled() {
        return howBilled;
    }


    /**
     * Sets the howBilled value for this PolicyTransactionPremium.
     * 
     * @param howBilled
     */
    public void setHowBilled(java.lang.String howBilled) {
        this.howBilled = howBilled;
    }


    /**
     * Gets the isSuspended value for this PolicyTransactionPremium.
     * 
     * @return isSuspended
     */
    public java.lang.Boolean getIsSuspended() {
        return isSuspended;
    }


    /**
     * Sets the isSuspended value for this PolicyTransactionPremium.
     * 
     * @param isSuspended
     */
    public void setIsSuspended(java.lang.Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }


    /**
     * Gets the reconciled value for this PolicyTransactionPremium.
     * 
     * @return reconciled
     */
    public java.lang.String getReconciled() {
        return reconciled;
    }


    /**
     * Sets the reconciled value for this PolicyTransactionPremium.
     * 
     * @param reconciled
     */
    public void setReconciled(java.lang.String reconciled) {
        this.reconciled = reconciled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTransactionPremium)) return false;
        PolicyTransactionPremium other = (PolicyTransactionPremium) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.transactionEffectiveDate==null && other.getTransactionEffectiveDate()==null) || 
             (this.transactionEffectiveDate!=null &&
              this.transactionEffectiveDate.equals(other.getTransactionEffectiveDate()))) &&
            ((this.policyTransactionPremiumId==null && other.getPolicyTransactionPremiumId()==null) || 
             (this.policyTransactionPremiumId!=null &&
              this.policyTransactionPremiumId.equals(other.getPolicyTransactionPremiumId()))) &&
            ((this.lineOfBusiness==null && other.getLineOfBusiness()==null) || 
             (this.lineOfBusiness!=null &&
              this.lineOfBusiness.equals(other.getLineOfBusiness()))) &&
            ((this.planType==null && other.getPlanType()==null) || 
             (this.planType!=null &&
              this.planType.equals(other.getPlanType()))) &&
            ((this.writingCompanyCode==null && other.getWritingCompanyCode()==null) || 
             (this.writingCompanyCode!=null &&
              this.writingCompanyCode.equals(other.getWritingCompanyCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.premium==null && other.getPremium()==null) || 
             (this.premium!=null &&
              this.premium.equals(other.getPremium()))) &&
            ((this.billiedPremium==null && other.getBilliedPremium()==null) || 
             (this.billiedPremium!=null &&
              this.billiedPremium.equals(other.getBilliedPremium()))) &&
            ((this.writtenPremium==null && other.getWrittenPremium()==null) || 
             (this.writtenPremium!=null &&
              this.writtenPremium.equals(other.getWrittenPremium()))) &&
            ((this.fullTermPremium==null && other.getFullTermPremium()==null) || 
             (this.fullTermPremium!=null &&
              this.fullTermPremium.equals(other.getFullTermPremium()))) &&
            ((this.includePremium==null && other.getIncludePremium()==null) || 
             (this.includePremium!=null &&
              this.includePremium.equals(other.getIncludePremium()))) &&
            ((this.howBilled==null && other.getHowBilled()==null) || 
             (this.howBilled!=null &&
              this.howBilled.equals(other.getHowBilled()))) &&
            ((this.isSuspended==null && other.getIsSuspended()==null) || 
             (this.isSuspended!=null &&
              this.isSuspended.equals(other.getIsSuspended()))) &&
            ((this.reconciled==null && other.getReconciled()==null) || 
             (this.reconciled!=null &&
              this.reconciled.equals(other.getReconciled())));
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
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getTransactionEffectiveDate() != null) {
            _hashCode += getTransactionEffectiveDate().hashCode();
        }
        if (getPolicyTransactionPremiumId() != null) {
            _hashCode += getPolicyTransactionPremiumId().hashCode();
        }
        if (getLineOfBusiness() != null) {
            _hashCode += getLineOfBusiness().hashCode();
        }
        if (getPlanType() != null) {
            _hashCode += getPlanType().hashCode();
        }
        if (getWritingCompanyCode() != null) {
            _hashCode += getWritingCompanyCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPremium() != null) {
            _hashCode += getPremium().hashCode();
        }
        if (getBilliedPremium() != null) {
            _hashCode += getBilliedPremium().hashCode();
        }
        if (getWrittenPremium() != null) {
            _hashCode += getWrittenPremium().hashCode();
        }
        if (getFullTermPremium() != null) {
            _hashCode += getFullTermPremium().hashCode();
        }
        if (getIncludePremium() != null) {
            _hashCode += getIncludePremium().hashCode();
        }
        if (getHowBilled() != null) {
            _hashCode += getHowBilled().hashCode();
        }
        if (getIsSuspended() != null) {
            _hashCode += getIsSuspended().hashCode();
        }
        if (getReconciled() != null) {
            _hashCode += getReconciled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTransactionPremium.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTransactionPremiumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Premium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billiedPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BilliedPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writtenPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WrittenPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTermPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FullTermPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includePremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludePremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("howBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "HowBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuspended");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsSuspended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Reconciled"));
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
