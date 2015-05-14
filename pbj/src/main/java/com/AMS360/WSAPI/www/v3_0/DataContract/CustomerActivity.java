/**
 * CustomerActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerActivity  implements java.io.Serializable {
    private java.util.Calendar activityDate;

    private org.apache.axis.types.Duration activityTime;

    private java.lang.String claimId;

    private java.lang.String companyCode;

    private java.lang.String description;

    private java.lang.String customerId;

    private java.lang.String activityAction;

    private java.lang.String employeeCode;

    private java.util.Calendar transactionEffectiveDate;

    private java.lang.String policyId;

    private java.lang.String activityId;

    private com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document[] attachments;

    public CustomerActivity() {
    }

    public CustomerActivity(
           java.util.Calendar activityDate,
           org.apache.axis.types.Duration activityTime,
           java.lang.String claimId,
           java.lang.String companyCode,
           java.lang.String description,
           java.lang.String customerId,
           java.lang.String activityAction,
           java.lang.String employeeCode,
           java.util.Calendar transactionEffectiveDate,
           java.lang.String policyId,
           java.lang.String activityId,
           com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document[] attachments) {
           this.activityDate = activityDate;
           this.activityTime = activityTime;
           this.claimId = claimId;
           this.companyCode = companyCode;
           this.description = description;
           this.customerId = customerId;
           this.activityAction = activityAction;
           this.employeeCode = employeeCode;
           this.transactionEffectiveDate = transactionEffectiveDate;
           this.policyId = policyId;
           this.activityId = activityId;
           this.attachments = attachments;
    }


    /**
     * Gets the activityDate value for this CustomerActivity.
     * 
     * @return activityDate
     */
    public java.util.Calendar getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this CustomerActivity.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Calendar activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the activityTime value for this CustomerActivity.
     * 
     * @return activityTime
     */
    public org.apache.axis.types.Duration getActivityTime() {
        return activityTime;
    }


    /**
     * Sets the activityTime value for this CustomerActivity.
     * 
     * @param activityTime
     */
    public void setActivityTime(org.apache.axis.types.Duration activityTime) {
        this.activityTime = activityTime;
    }


    /**
     * Gets the claimId value for this CustomerActivity.
     * 
     * @return claimId
     */
    public java.lang.String getClaimId() {
        return claimId;
    }


    /**
     * Sets the claimId value for this CustomerActivity.
     * 
     * @param claimId
     */
    public void setClaimId(java.lang.String claimId) {
        this.claimId = claimId;
    }


    /**
     * Gets the companyCode value for this CustomerActivity.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CustomerActivity.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the description value for this CustomerActivity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomerActivity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the customerId value for this CustomerActivity.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerActivity.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the activityAction value for this CustomerActivity.
     * 
     * @return activityAction
     */
    public java.lang.String getActivityAction() {
        return activityAction;
    }


    /**
     * Sets the activityAction value for this CustomerActivity.
     * 
     * @param activityAction
     */
    public void setActivityAction(java.lang.String activityAction) {
        this.activityAction = activityAction;
    }


    /**
     * Gets the employeeCode value for this CustomerActivity.
     * 
     * @return employeeCode
     */
    public java.lang.String getEmployeeCode() {
        return employeeCode;
    }


    /**
     * Sets the employeeCode value for this CustomerActivity.
     * 
     * @param employeeCode
     */
    public void setEmployeeCode(java.lang.String employeeCode) {
        this.employeeCode = employeeCode;
    }


    /**
     * Gets the transactionEffectiveDate value for this CustomerActivity.
     * 
     * @return transactionEffectiveDate
     */
    public java.util.Calendar getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }


    /**
     * Sets the transactionEffectiveDate value for this CustomerActivity.
     * 
     * @param transactionEffectiveDate
     */
    public void setTransactionEffectiveDate(java.util.Calendar transactionEffectiveDate) {
        this.transactionEffectiveDate = transactionEffectiveDate;
    }


    /**
     * Gets the policyId value for this CustomerActivity.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this CustomerActivity.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the activityId value for this CustomerActivity.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this CustomerActivity.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the attachments value for this CustomerActivity.
     * 
     * @return attachments
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this CustomerActivity.
     * 
     * @param attachments
     */
    public void setAttachments(com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document[] attachments) {
        this.attachments = attachments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerActivity)) return false;
        CustomerActivity other = (CustomerActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.activityTime==null && other.getActivityTime()==null) || 
             (this.activityTime!=null &&
              this.activityTime.equals(other.getActivityTime()))) &&
            ((this.claimId==null && other.getClaimId()==null) || 
             (this.claimId!=null &&
              this.claimId.equals(other.getClaimId()))) &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.activityAction==null && other.getActivityAction()==null) || 
             (this.activityAction!=null &&
              this.activityAction.equals(other.getActivityAction()))) &&
            ((this.employeeCode==null && other.getEmployeeCode()==null) || 
             (this.employeeCode!=null &&
              this.employeeCode.equals(other.getEmployeeCode()))) &&
            ((this.transactionEffectiveDate==null && other.getTransactionEffectiveDate()==null) || 
             (this.transactionEffectiveDate!=null &&
              this.transactionEffectiveDate.equals(other.getTransactionEffectiveDate()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments())));
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
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getActivityTime() != null) {
            _hashCode += getActivityTime().hashCode();
        }
        if (getClaimId() != null) {
            _hashCode += getClaimId().hashCode();
        }
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getActivityAction() != null) {
            _hashCode += getActivityAction().hashCode();
        }
        if (getEmployeeCode() != null) {
            _hashCode += getEmployeeCode().hashCode();
        }
        if (getTransactionEffectiveDate() != null) {
            _hashCode += getTransactionEffectiveDate().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyCode"));
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
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document"));
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
