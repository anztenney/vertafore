/**
 * ClaimInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class ClaimInfo  implements java.io.Serializable {
    private java.lang.String claimId;

    private java.lang.String causeOfLoss;

    private java.lang.String claimNo;

    private java.lang.String claimStatus;

    private java.lang.String custId;

    private java.lang.String description;

    private java.lang.String lineOfBusiness;

    private java.lang.String lineOfBusinessId;

    private java.util.Calendar lossDate;

    private java.util.Calendar policyEffectiveDate;

    private java.util.Calendar policyEndorsementDate;

    private java.util.Calendar policyExpirationDate;

    private java.lang.String policyId;

    private java.lang.String policyNumber;

    private java.util.Calendar reportedDate;

    private com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo[] claimContactList;

    public ClaimInfo() {
    }

    public ClaimInfo(
           java.lang.String claimId,
           java.lang.String causeOfLoss,
           java.lang.String claimNo,
           java.lang.String claimStatus,
           java.lang.String custId,
           java.lang.String description,
           java.lang.String lineOfBusiness,
           java.lang.String lineOfBusinessId,
           java.util.Calendar lossDate,
           java.util.Calendar policyEffectiveDate,
           java.util.Calendar policyEndorsementDate,
           java.util.Calendar policyExpirationDate,
           java.lang.String policyId,
           java.lang.String policyNumber,
           java.util.Calendar reportedDate,
           com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo[] claimContactList) {
           this.claimId = claimId;
           this.causeOfLoss = causeOfLoss;
           this.claimNo = claimNo;
           this.claimStatus = claimStatus;
           this.custId = custId;
           this.description = description;
           this.lineOfBusiness = lineOfBusiness;
           this.lineOfBusinessId = lineOfBusinessId;
           this.lossDate = lossDate;
           this.policyEffectiveDate = policyEffectiveDate;
           this.policyEndorsementDate = policyEndorsementDate;
           this.policyExpirationDate = policyExpirationDate;
           this.policyId = policyId;
           this.policyNumber = policyNumber;
           this.reportedDate = reportedDate;
           this.claimContactList = claimContactList;
    }


    /**
     * Gets the claimId value for this ClaimInfo.
     * 
     * @return claimId
     */
    public java.lang.String getClaimId() {
        return claimId;
    }


    /**
     * Sets the claimId value for this ClaimInfo.
     * 
     * @param claimId
     */
    public void setClaimId(java.lang.String claimId) {
        this.claimId = claimId;
    }


    /**
     * Gets the causeOfLoss value for this ClaimInfo.
     * 
     * @return causeOfLoss
     */
    public java.lang.String getCauseOfLoss() {
        return causeOfLoss;
    }


    /**
     * Sets the causeOfLoss value for this ClaimInfo.
     * 
     * @param causeOfLoss
     */
    public void setCauseOfLoss(java.lang.String causeOfLoss) {
        this.causeOfLoss = causeOfLoss;
    }


    /**
     * Gets the claimNo value for this ClaimInfo.
     * 
     * @return claimNo
     */
    public java.lang.String getClaimNo() {
        return claimNo;
    }


    /**
     * Sets the claimNo value for this ClaimInfo.
     * 
     * @param claimNo
     */
    public void setClaimNo(java.lang.String claimNo) {
        this.claimNo = claimNo;
    }


    /**
     * Gets the claimStatus value for this ClaimInfo.
     * 
     * @return claimStatus
     */
    public java.lang.String getClaimStatus() {
        return claimStatus;
    }


    /**
     * Sets the claimStatus value for this ClaimInfo.
     * 
     * @param claimStatus
     */
    public void setClaimStatus(java.lang.String claimStatus) {
        this.claimStatus = claimStatus;
    }


    /**
     * Gets the custId value for this ClaimInfo.
     * 
     * @return custId
     */
    public java.lang.String getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this ClaimInfo.
     * 
     * @param custId
     */
    public void setCustId(java.lang.String custId) {
        this.custId = custId;
    }


    /**
     * Gets the description value for this ClaimInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ClaimInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lineOfBusiness value for this ClaimInfo.
     * 
     * @return lineOfBusiness
     */
    public java.lang.String getLineOfBusiness() {
        return lineOfBusiness;
    }


    /**
     * Sets the lineOfBusiness value for this ClaimInfo.
     * 
     * @param lineOfBusiness
     */
    public void setLineOfBusiness(java.lang.String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }


    /**
     * Gets the lineOfBusinessId value for this ClaimInfo.
     * 
     * @return lineOfBusinessId
     */
    public java.lang.String getLineOfBusinessId() {
        return lineOfBusinessId;
    }


    /**
     * Sets the lineOfBusinessId value for this ClaimInfo.
     * 
     * @param lineOfBusinessId
     */
    public void setLineOfBusinessId(java.lang.String lineOfBusinessId) {
        this.lineOfBusinessId = lineOfBusinessId;
    }


    /**
     * Gets the lossDate value for this ClaimInfo.
     * 
     * @return lossDate
     */
    public java.util.Calendar getLossDate() {
        return lossDate;
    }


    /**
     * Sets the lossDate value for this ClaimInfo.
     * 
     * @param lossDate
     */
    public void setLossDate(java.util.Calendar lossDate) {
        this.lossDate = lossDate;
    }


    /**
     * Gets the policyEffectiveDate value for this ClaimInfo.
     * 
     * @return policyEffectiveDate
     */
    public java.util.Calendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }


    /**
     * Sets the policyEffectiveDate value for this ClaimInfo.
     * 
     * @param policyEffectiveDate
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }


    /**
     * Gets the policyEndorsementDate value for this ClaimInfo.
     * 
     * @return policyEndorsementDate
     */
    public java.util.Calendar getPolicyEndorsementDate() {
        return policyEndorsementDate;
    }


    /**
     * Sets the policyEndorsementDate value for this ClaimInfo.
     * 
     * @param policyEndorsementDate
     */
    public void setPolicyEndorsementDate(java.util.Calendar policyEndorsementDate) {
        this.policyEndorsementDate = policyEndorsementDate;
    }


    /**
     * Gets the policyExpirationDate value for this ClaimInfo.
     * 
     * @return policyExpirationDate
     */
    public java.util.Calendar getPolicyExpirationDate() {
        return policyExpirationDate;
    }


    /**
     * Sets the policyExpirationDate value for this ClaimInfo.
     * 
     * @param policyExpirationDate
     */
    public void setPolicyExpirationDate(java.util.Calendar policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }


    /**
     * Gets the policyId value for this ClaimInfo.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this ClaimInfo.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the policyNumber value for this ClaimInfo.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this ClaimInfo.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the reportedDate value for this ClaimInfo.
     * 
     * @return reportedDate
     */
    public java.util.Calendar getReportedDate() {
        return reportedDate;
    }


    /**
     * Sets the reportedDate value for this ClaimInfo.
     * 
     * @param reportedDate
     */
    public void setReportedDate(java.util.Calendar reportedDate) {
        this.reportedDate = reportedDate;
    }


    /**
     * Gets the claimContactList value for this ClaimInfo.
     * 
     * @return claimContactList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo[] getClaimContactList() {
        return claimContactList;
    }


    /**
     * Sets the claimContactList value for this ClaimInfo.
     * 
     * @param claimContactList
     */
    public void setClaimContactList(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo[] claimContactList) {
        this.claimContactList = claimContactList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClaimInfo)) return false;
        ClaimInfo other = (ClaimInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimId==null && other.getClaimId()==null) || 
             (this.claimId!=null &&
              this.claimId.equals(other.getClaimId()))) &&
            ((this.causeOfLoss==null && other.getCauseOfLoss()==null) || 
             (this.causeOfLoss!=null &&
              this.causeOfLoss.equals(other.getCauseOfLoss()))) &&
            ((this.claimNo==null && other.getClaimNo()==null) || 
             (this.claimNo!=null &&
              this.claimNo.equals(other.getClaimNo()))) &&
            ((this.claimStatus==null && other.getClaimStatus()==null) || 
             (this.claimStatus!=null &&
              this.claimStatus.equals(other.getClaimStatus()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lineOfBusiness==null && other.getLineOfBusiness()==null) || 
             (this.lineOfBusiness!=null &&
              this.lineOfBusiness.equals(other.getLineOfBusiness()))) &&
            ((this.lineOfBusinessId==null && other.getLineOfBusinessId()==null) || 
             (this.lineOfBusinessId!=null &&
              this.lineOfBusinessId.equals(other.getLineOfBusinessId()))) &&
            ((this.lossDate==null && other.getLossDate()==null) || 
             (this.lossDate!=null &&
              this.lossDate.equals(other.getLossDate()))) &&
            ((this.policyEffectiveDate==null && other.getPolicyEffectiveDate()==null) || 
             (this.policyEffectiveDate!=null &&
              this.policyEffectiveDate.equals(other.getPolicyEffectiveDate()))) &&
            ((this.policyEndorsementDate==null && other.getPolicyEndorsementDate()==null) || 
             (this.policyEndorsementDate!=null &&
              this.policyEndorsementDate.equals(other.getPolicyEndorsementDate()))) &&
            ((this.policyExpirationDate==null && other.getPolicyExpirationDate()==null) || 
             (this.policyExpirationDate!=null &&
              this.policyExpirationDate.equals(other.getPolicyExpirationDate()))) &&
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.reportedDate==null && other.getReportedDate()==null) || 
             (this.reportedDate!=null &&
              this.reportedDate.equals(other.getReportedDate()))) &&
            ((this.claimContactList==null && other.getClaimContactList()==null) || 
             (this.claimContactList!=null &&
              java.util.Arrays.equals(this.claimContactList, other.getClaimContactList())));
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
        if (getClaimId() != null) {
            _hashCode += getClaimId().hashCode();
        }
        if (getCauseOfLoss() != null) {
            _hashCode += getCauseOfLoss().hashCode();
        }
        if (getClaimNo() != null) {
            _hashCode += getClaimNo().hashCode();
        }
        if (getClaimStatus() != null) {
            _hashCode += getClaimStatus().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLineOfBusiness() != null) {
            _hashCode += getLineOfBusiness().hashCode();
        }
        if (getLineOfBusinessId() != null) {
            _hashCode += getLineOfBusinessId().hashCode();
        }
        if (getLossDate() != null) {
            _hashCode += getLossDate().hashCode();
        }
        if (getPolicyEffectiveDate() != null) {
            _hashCode += getPolicyEffectiveDate().hashCode();
        }
        if (getPolicyEndorsementDate() != null) {
            _hashCode += getPolicyEndorsementDate().hashCode();
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
        if (getReportedDate() != null) {
            _hashCode += getReportedDate().hashCode();
        }
        if (getClaimContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClaimContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClaimContactList(), i);
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
        new org.apache.axis.description.TypeDesc(ClaimInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causeOfLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CauseOfLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lossDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LossDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEndorsementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyEndorsementDate"));
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
        elemField.setFieldName("reportedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ReportedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo"));
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
