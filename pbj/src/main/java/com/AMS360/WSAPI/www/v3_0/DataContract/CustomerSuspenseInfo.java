/**
 * CustomerSuspenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerSuspenseInfo  implements java.io.Serializable {
    private java.lang.String suspenseId;

    private java.lang.String customerId;

    private java.lang.String policyId;

    private java.util.Calendar policyEffectiveDate;

    private java.lang.String companyCode;

    private java.lang.String claimId;

    private java.lang.String suspenseAction;

    private java.util.Calendar initiatedDate;

    private java.lang.String initiatedByEmployeeCode;

    private java.lang.String assignedToEmployeeCode;

    private java.util.Calendar dueDate;

    private org.apache.axis.types.UnsignedByte timesRescheduled;

    private java.lang.String description;

    private java.lang.Short priority;

    private java.lang.Boolean isCompleted;

    private java.lang.String completedBy;

    private java.util.Calendar completedDate;

    public CustomerSuspenseInfo() {
    }

    public CustomerSuspenseInfo(
           java.lang.String suspenseId,
           java.lang.String customerId,
           java.lang.String policyId,
           java.util.Calendar policyEffectiveDate,
           java.lang.String companyCode,
           java.lang.String claimId,
           java.lang.String suspenseAction,
           java.util.Calendar initiatedDate,
           java.lang.String initiatedByEmployeeCode,
           java.lang.String assignedToEmployeeCode,
           java.util.Calendar dueDate,
           org.apache.axis.types.UnsignedByte timesRescheduled,
           java.lang.String description,
           java.lang.Short priority,
           java.lang.Boolean isCompleted,
           java.lang.String completedBy,
           java.util.Calendar completedDate) {
           this.suspenseId = suspenseId;
           this.customerId = customerId;
           this.policyId = policyId;
           this.policyEffectiveDate = policyEffectiveDate;
           this.companyCode = companyCode;
           this.claimId = claimId;
           this.suspenseAction = suspenseAction;
           this.initiatedDate = initiatedDate;
           this.initiatedByEmployeeCode = initiatedByEmployeeCode;
           this.assignedToEmployeeCode = assignedToEmployeeCode;
           this.dueDate = dueDate;
           this.timesRescheduled = timesRescheduled;
           this.description = description;
           this.priority = priority;
           this.isCompleted = isCompleted;
           this.completedBy = completedBy;
           this.completedDate = completedDate;
    }


    /**
     * Gets the suspenseId value for this CustomerSuspenseInfo.
     * 
     * @return suspenseId
     */
    public java.lang.String getSuspenseId() {
        return suspenseId;
    }


    /**
     * Sets the suspenseId value for this CustomerSuspenseInfo.
     * 
     * @param suspenseId
     */
    public void setSuspenseId(java.lang.String suspenseId) {
        this.suspenseId = suspenseId;
    }


    /**
     * Gets the customerId value for this CustomerSuspenseInfo.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerSuspenseInfo.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the policyId value for this CustomerSuspenseInfo.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this CustomerSuspenseInfo.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the policyEffectiveDate value for this CustomerSuspenseInfo.
     * 
     * @return policyEffectiveDate
     */
    public java.util.Calendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }


    /**
     * Sets the policyEffectiveDate value for this CustomerSuspenseInfo.
     * 
     * @param policyEffectiveDate
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }


    /**
     * Gets the companyCode value for this CustomerSuspenseInfo.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CustomerSuspenseInfo.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the claimId value for this CustomerSuspenseInfo.
     * 
     * @return claimId
     */
    public java.lang.String getClaimId() {
        return claimId;
    }


    /**
     * Sets the claimId value for this CustomerSuspenseInfo.
     * 
     * @param claimId
     */
    public void setClaimId(java.lang.String claimId) {
        this.claimId = claimId;
    }


    /**
     * Gets the suspenseAction value for this CustomerSuspenseInfo.
     * 
     * @return suspenseAction
     */
    public java.lang.String getSuspenseAction() {
        return suspenseAction;
    }


    /**
     * Sets the suspenseAction value for this CustomerSuspenseInfo.
     * 
     * @param suspenseAction
     */
    public void setSuspenseAction(java.lang.String suspenseAction) {
        this.suspenseAction = suspenseAction;
    }


    /**
     * Gets the initiatedDate value for this CustomerSuspenseInfo.
     * 
     * @return initiatedDate
     */
    public java.util.Calendar getInitiatedDate() {
        return initiatedDate;
    }


    /**
     * Sets the initiatedDate value for this CustomerSuspenseInfo.
     * 
     * @param initiatedDate
     */
    public void setInitiatedDate(java.util.Calendar initiatedDate) {
        this.initiatedDate = initiatedDate;
    }


    /**
     * Gets the initiatedByEmployeeCode value for this CustomerSuspenseInfo.
     * 
     * @return initiatedByEmployeeCode
     */
    public java.lang.String getInitiatedByEmployeeCode() {
        return initiatedByEmployeeCode;
    }


    /**
     * Sets the initiatedByEmployeeCode value for this CustomerSuspenseInfo.
     * 
     * @param initiatedByEmployeeCode
     */
    public void setInitiatedByEmployeeCode(java.lang.String initiatedByEmployeeCode) {
        this.initiatedByEmployeeCode = initiatedByEmployeeCode;
    }


    /**
     * Gets the assignedToEmployeeCode value for this CustomerSuspenseInfo.
     * 
     * @return assignedToEmployeeCode
     */
    public java.lang.String getAssignedToEmployeeCode() {
        return assignedToEmployeeCode;
    }


    /**
     * Sets the assignedToEmployeeCode value for this CustomerSuspenseInfo.
     * 
     * @param assignedToEmployeeCode
     */
    public void setAssignedToEmployeeCode(java.lang.String assignedToEmployeeCode) {
        this.assignedToEmployeeCode = assignedToEmployeeCode;
    }


    /**
     * Gets the dueDate value for this CustomerSuspenseInfo.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CustomerSuspenseInfo.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the timesRescheduled value for this CustomerSuspenseInfo.
     * 
     * @return timesRescheduled
     */
    public org.apache.axis.types.UnsignedByte getTimesRescheduled() {
        return timesRescheduled;
    }


    /**
     * Sets the timesRescheduled value for this CustomerSuspenseInfo.
     * 
     * @param timesRescheduled
     */
    public void setTimesRescheduled(org.apache.axis.types.UnsignedByte timesRescheduled) {
        this.timesRescheduled = timesRescheduled;
    }


    /**
     * Gets the description value for this CustomerSuspenseInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomerSuspenseInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the priority value for this CustomerSuspenseInfo.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CustomerSuspenseInfo.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the isCompleted value for this CustomerSuspenseInfo.
     * 
     * @return isCompleted
     */
    public java.lang.Boolean getIsCompleted() {
        return isCompleted;
    }


    /**
     * Sets the isCompleted value for this CustomerSuspenseInfo.
     * 
     * @param isCompleted
     */
    public void setIsCompleted(java.lang.Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


    /**
     * Gets the completedBy value for this CustomerSuspenseInfo.
     * 
     * @return completedBy
     */
    public java.lang.String getCompletedBy() {
        return completedBy;
    }


    /**
     * Sets the completedBy value for this CustomerSuspenseInfo.
     * 
     * @param completedBy
     */
    public void setCompletedBy(java.lang.String completedBy) {
        this.completedBy = completedBy;
    }


    /**
     * Gets the completedDate value for this CustomerSuspenseInfo.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this CustomerSuspenseInfo.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSuspenseInfo)) return false;
        CustomerSuspenseInfo other = (CustomerSuspenseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suspenseId==null && other.getSuspenseId()==null) || 
             (this.suspenseId!=null &&
              this.suspenseId.equals(other.getSuspenseId()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.policyEffectiveDate==null && other.getPolicyEffectiveDate()==null) || 
             (this.policyEffectiveDate!=null &&
              this.policyEffectiveDate.equals(other.getPolicyEffectiveDate()))) &&
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.claimId==null && other.getClaimId()==null) || 
             (this.claimId!=null &&
              this.claimId.equals(other.getClaimId()))) &&
            ((this.suspenseAction==null && other.getSuspenseAction()==null) || 
             (this.suspenseAction!=null &&
              this.suspenseAction.equals(other.getSuspenseAction()))) &&
            ((this.initiatedDate==null && other.getInitiatedDate()==null) || 
             (this.initiatedDate!=null &&
              this.initiatedDate.equals(other.getInitiatedDate()))) &&
            ((this.initiatedByEmployeeCode==null && other.getInitiatedByEmployeeCode()==null) || 
             (this.initiatedByEmployeeCode!=null &&
              this.initiatedByEmployeeCode.equals(other.getInitiatedByEmployeeCode()))) &&
            ((this.assignedToEmployeeCode==null && other.getAssignedToEmployeeCode()==null) || 
             (this.assignedToEmployeeCode!=null &&
              this.assignedToEmployeeCode.equals(other.getAssignedToEmployeeCode()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.timesRescheduled==null && other.getTimesRescheduled()==null) || 
             (this.timesRescheduled!=null &&
              this.timesRescheduled.equals(other.getTimesRescheduled()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isCompleted==null && other.getIsCompleted()==null) || 
             (this.isCompleted!=null &&
              this.isCompleted.equals(other.getIsCompleted()))) &&
            ((this.completedBy==null && other.getCompletedBy()==null) || 
             (this.completedBy!=null &&
              this.completedBy.equals(other.getCompletedBy()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate())));
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
        if (getSuspenseId() != null) {
            _hashCode += getSuspenseId().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getPolicyEffectiveDate() != null) {
            _hashCode += getPolicyEffectiveDate().hashCode();
        }
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getClaimId() != null) {
            _hashCode += getClaimId().hashCode();
        }
        if (getSuspenseAction() != null) {
            _hashCode += getSuspenseAction().hashCode();
        }
        if (getInitiatedDate() != null) {
            _hashCode += getInitiatedDate().hashCode();
        }
        if (getInitiatedByEmployeeCode() != null) {
            _hashCode += getInitiatedByEmployeeCode().hashCode();
        }
        if (getAssignedToEmployeeCode() != null) {
            _hashCode += getAssignedToEmployeeCode().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getTimesRescheduled() != null) {
            _hashCode += getTimesRescheduled().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsCompleted() != null) {
            _hashCode += getIsCompleted().hashCode();
        }
        if (getCompletedBy() != null) {
            _hashCode += getCompletedBy().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSuspenseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
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
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InitiatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedByEmployeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InitiatedByEmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToEmployeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AssignedToEmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timesRescheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TimesRescheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompletedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
