/**
 * Policy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class Policy  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String policyId;

    private java.lang.String policyNumber;

    private java.lang.Short typeOfBusiness;

    private java.lang.String policyType;

    private java.lang.String policyTypeOfBusiness;

    private java.lang.String writingCompanyCode;

    private java.lang.String accountExecCode;

    private java.lang.String accountRepCode;

    private java.lang.String brokerCode;

    private java.util.Calendar policyEffectiveDate;

    private java.util.Calendar policyExpirationDate;

    private java.lang.Boolean isContinuous;

    private java.lang.String policyStatus;

    private java.lang.String GLDivisionCode;

    private java.lang.String GLDepartmentCode;

    private java.lang.String GLBranchCode;

    private java.lang.String GLGroupCode;

    private java.lang.String billMethod;

    private java.lang.Boolean isNewPolicy;

    private java.math.BigDecimal fullTermPremium;

    private java.lang.Boolean isFinanced;

    private java.lang.String companyType;

    private java.lang.Boolean isMultiEntity;

    private java.lang.String policySubType;

    private java.lang.String description;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness[] lineOfBusinessList;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] personnelList;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction[] transactionList;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium[] transactionPremiumList;

    private java.lang.String policyNotationId;

    private java.lang.String priorPolicy;

    private java.lang.String priorPolicyId;

    private java.lang.String sourcePolicyId;

    private java.lang.Boolean isExcludeDelete;

    private java.lang.Long nationalProducerCode;

    private java.lang.String companyCustomerNumber;

    public Policy() {
    }

    public Policy(
           java.lang.String customerId,
           java.lang.String policyId,
           java.lang.String policyNumber,
           java.lang.Short typeOfBusiness,
           java.lang.String policyType,
           java.lang.String policyTypeOfBusiness,
           java.lang.String writingCompanyCode,
           java.lang.String accountExecCode,
           java.lang.String accountRepCode,
           java.lang.String brokerCode,
           java.util.Calendar policyEffectiveDate,
           java.util.Calendar policyExpirationDate,
           java.lang.Boolean isContinuous,
           java.lang.String policyStatus,
           java.lang.String GLDivisionCode,
           java.lang.String GLDepartmentCode,
           java.lang.String GLBranchCode,
           java.lang.String GLGroupCode,
           java.lang.String billMethod,
           java.lang.Boolean isNewPolicy,
           java.math.BigDecimal fullTermPremium,
           java.lang.Boolean isFinanced,
           java.lang.String companyType,
           java.lang.Boolean isMultiEntity,
           java.lang.String policySubType,
           java.lang.String description,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness[] lineOfBusinessList,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] personnelList,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction[] transactionList,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium[] transactionPremiumList,
           java.lang.String policyNotationId,
           java.lang.String priorPolicy,
           java.lang.String priorPolicyId,
           java.lang.String sourcePolicyId,
           java.lang.Boolean isExcludeDelete,
           java.lang.Long nationalProducerCode,
           java.lang.String companyCustomerNumber) {
           this.customerId = customerId;
           this.policyId = policyId;
           this.policyNumber = policyNumber;
           this.typeOfBusiness = typeOfBusiness;
           this.policyType = policyType;
           this.policyTypeOfBusiness = policyTypeOfBusiness;
           this.writingCompanyCode = writingCompanyCode;
           this.accountExecCode = accountExecCode;
           this.accountRepCode = accountRepCode;
           this.brokerCode = brokerCode;
           this.policyEffectiveDate = policyEffectiveDate;
           this.policyExpirationDate = policyExpirationDate;
           this.isContinuous = isContinuous;
           this.policyStatus = policyStatus;
           this.GLDivisionCode = GLDivisionCode;
           this.GLDepartmentCode = GLDepartmentCode;
           this.GLBranchCode = GLBranchCode;
           this.GLGroupCode = GLGroupCode;
           this.billMethod = billMethod;
           this.isNewPolicy = isNewPolicy;
           this.fullTermPremium = fullTermPremium;
           this.isFinanced = isFinanced;
           this.companyType = companyType;
           this.isMultiEntity = isMultiEntity;
           this.policySubType = policySubType;
           this.description = description;
           this.lineOfBusinessList = lineOfBusinessList;
           this.personnelList = personnelList;
           this.transactionList = transactionList;
           this.transactionPremiumList = transactionPremiumList;
           this.policyNotationId = policyNotationId;
           this.priorPolicy = priorPolicy;
           this.priorPolicyId = priorPolicyId;
           this.sourcePolicyId = sourcePolicyId;
           this.isExcludeDelete = isExcludeDelete;
           this.nationalProducerCode = nationalProducerCode;
           this.companyCustomerNumber = companyCustomerNumber;
    }


    /**
     * Gets the customerId value for this Policy.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Policy.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the policyId value for this Policy.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this Policy.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the policyNumber value for this Policy.
     * 
     * @return policyNumber
     */
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }


    /**
     * Sets the policyNumber value for this Policy.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }


    /**
     * Gets the typeOfBusiness value for this Policy.
     * 
     * @return typeOfBusiness
     */
    public java.lang.Short getTypeOfBusiness() {
        return typeOfBusiness;
    }


    /**
     * Sets the typeOfBusiness value for this Policy.
     * 
     * @param typeOfBusiness
     */
    public void setTypeOfBusiness(java.lang.Short typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }


    /**
     * Gets the policyType value for this Policy.
     * 
     * @return policyType
     */
    public java.lang.String getPolicyType() {
        return policyType;
    }


    /**
     * Sets the policyType value for this Policy.
     * 
     * @param policyType
     */
    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }


    /**
     * Gets the policyTypeOfBusiness value for this Policy.
     * 
     * @return policyTypeOfBusiness
     */
    public java.lang.String getPolicyTypeOfBusiness() {
        return policyTypeOfBusiness;
    }


    /**
     * Sets the policyTypeOfBusiness value for this Policy.
     * 
     * @param policyTypeOfBusiness
     */
    public void setPolicyTypeOfBusiness(java.lang.String policyTypeOfBusiness) {
        this.policyTypeOfBusiness = policyTypeOfBusiness;
    }


    /**
     * Gets the writingCompanyCode value for this Policy.
     * 
     * @return writingCompanyCode
     */
    public java.lang.String getWritingCompanyCode() {
        return writingCompanyCode;
    }


    /**
     * Sets the writingCompanyCode value for this Policy.
     * 
     * @param writingCompanyCode
     */
    public void setWritingCompanyCode(java.lang.String writingCompanyCode) {
        this.writingCompanyCode = writingCompanyCode;
    }


    /**
     * Gets the accountExecCode value for this Policy.
     * 
     * @return accountExecCode
     */
    public java.lang.String getAccountExecCode() {
        return accountExecCode;
    }


    /**
     * Sets the accountExecCode value for this Policy.
     * 
     * @param accountExecCode
     */
    public void setAccountExecCode(java.lang.String accountExecCode) {
        this.accountExecCode = accountExecCode;
    }


    /**
     * Gets the accountRepCode value for this Policy.
     * 
     * @return accountRepCode
     */
    public java.lang.String getAccountRepCode() {
        return accountRepCode;
    }


    /**
     * Sets the accountRepCode value for this Policy.
     * 
     * @param accountRepCode
     */
    public void setAccountRepCode(java.lang.String accountRepCode) {
        this.accountRepCode = accountRepCode;
    }


    /**
     * Gets the brokerCode value for this Policy.
     * 
     * @return brokerCode
     */
    public java.lang.String getBrokerCode() {
        return brokerCode;
    }


    /**
     * Sets the brokerCode value for this Policy.
     * 
     * @param brokerCode
     */
    public void setBrokerCode(java.lang.String brokerCode) {
        this.brokerCode = brokerCode;
    }


    /**
     * Gets the policyEffectiveDate value for this Policy.
     * 
     * @return policyEffectiveDate
     */
    public java.util.Calendar getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }


    /**
     * Sets the policyEffectiveDate value for this Policy.
     * 
     * @param policyEffectiveDate
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }


    /**
     * Gets the policyExpirationDate value for this Policy.
     * 
     * @return policyExpirationDate
     */
    public java.util.Calendar getPolicyExpirationDate() {
        return policyExpirationDate;
    }


    /**
     * Sets the policyExpirationDate value for this Policy.
     * 
     * @param policyExpirationDate
     */
    public void setPolicyExpirationDate(java.util.Calendar policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }


    /**
     * Gets the isContinuous value for this Policy.
     * 
     * @return isContinuous
     */
    public java.lang.Boolean getIsContinuous() {
        return isContinuous;
    }


    /**
     * Sets the isContinuous value for this Policy.
     * 
     * @param isContinuous
     */
    public void setIsContinuous(java.lang.Boolean isContinuous) {
        this.isContinuous = isContinuous;
    }


    /**
     * Gets the policyStatus value for this Policy.
     * 
     * @return policyStatus
     */
    public java.lang.String getPolicyStatus() {
        return policyStatus;
    }


    /**
     * Sets the policyStatus value for this Policy.
     * 
     * @param policyStatus
     */
    public void setPolicyStatus(java.lang.String policyStatus) {
        this.policyStatus = policyStatus;
    }


    /**
     * Gets the GLDivisionCode value for this Policy.
     * 
     * @return GLDivisionCode
     */
    public java.lang.String getGLDivisionCode() {
        return GLDivisionCode;
    }


    /**
     * Sets the GLDivisionCode value for this Policy.
     * 
     * @param GLDivisionCode
     */
    public void setGLDivisionCode(java.lang.String GLDivisionCode) {
        this.GLDivisionCode = GLDivisionCode;
    }


    /**
     * Gets the GLDepartmentCode value for this Policy.
     * 
     * @return GLDepartmentCode
     */
    public java.lang.String getGLDepartmentCode() {
        return GLDepartmentCode;
    }


    /**
     * Sets the GLDepartmentCode value for this Policy.
     * 
     * @param GLDepartmentCode
     */
    public void setGLDepartmentCode(java.lang.String GLDepartmentCode) {
        this.GLDepartmentCode = GLDepartmentCode;
    }


    /**
     * Gets the GLBranchCode value for this Policy.
     * 
     * @return GLBranchCode
     */
    public java.lang.String getGLBranchCode() {
        return GLBranchCode;
    }


    /**
     * Sets the GLBranchCode value for this Policy.
     * 
     * @param GLBranchCode
     */
    public void setGLBranchCode(java.lang.String GLBranchCode) {
        this.GLBranchCode = GLBranchCode;
    }


    /**
     * Gets the GLGroupCode value for this Policy.
     * 
     * @return GLGroupCode
     */
    public java.lang.String getGLGroupCode() {
        return GLGroupCode;
    }


    /**
     * Sets the GLGroupCode value for this Policy.
     * 
     * @param GLGroupCode
     */
    public void setGLGroupCode(java.lang.String GLGroupCode) {
        this.GLGroupCode = GLGroupCode;
    }


    /**
     * Gets the billMethod value for this Policy.
     * 
     * @return billMethod
     */
    public java.lang.String getBillMethod() {
        return billMethod;
    }


    /**
     * Sets the billMethod value for this Policy.
     * 
     * @param billMethod
     */
    public void setBillMethod(java.lang.String billMethod) {
        this.billMethod = billMethod;
    }


    /**
     * Gets the isNewPolicy value for this Policy.
     * 
     * @return isNewPolicy
     */
    public java.lang.Boolean getIsNewPolicy() {
        return isNewPolicy;
    }


    /**
     * Sets the isNewPolicy value for this Policy.
     * 
     * @param isNewPolicy
     */
    public void setIsNewPolicy(java.lang.Boolean isNewPolicy) {
        this.isNewPolicy = isNewPolicy;
    }


    /**
     * Gets the fullTermPremium value for this Policy.
     * 
     * @return fullTermPremium
     */
    public java.math.BigDecimal getFullTermPremium() {
        return fullTermPremium;
    }


    /**
     * Sets the fullTermPremium value for this Policy.
     * 
     * @param fullTermPremium
     */
    public void setFullTermPremium(java.math.BigDecimal fullTermPremium) {
        this.fullTermPremium = fullTermPremium;
    }


    /**
     * Gets the isFinanced value for this Policy.
     * 
     * @return isFinanced
     */
    public java.lang.Boolean getIsFinanced() {
        return isFinanced;
    }


    /**
     * Sets the isFinanced value for this Policy.
     * 
     * @param isFinanced
     */
    public void setIsFinanced(java.lang.Boolean isFinanced) {
        this.isFinanced = isFinanced;
    }


    /**
     * Gets the companyType value for this Policy.
     * 
     * @return companyType
     */
    public java.lang.String getCompanyType() {
        return companyType;
    }


    /**
     * Sets the companyType value for this Policy.
     * 
     * @param companyType
     */
    public void setCompanyType(java.lang.String companyType) {
        this.companyType = companyType;
    }


    /**
     * Gets the isMultiEntity value for this Policy.
     * 
     * @return isMultiEntity
     */
    public java.lang.Boolean getIsMultiEntity() {
        return isMultiEntity;
    }


    /**
     * Sets the isMultiEntity value for this Policy.
     * 
     * @param isMultiEntity
     */
    public void setIsMultiEntity(java.lang.Boolean isMultiEntity) {
        this.isMultiEntity = isMultiEntity;
    }


    /**
     * Gets the policySubType value for this Policy.
     * 
     * @return policySubType
     */
    public java.lang.String getPolicySubType() {
        return policySubType;
    }


    /**
     * Sets the policySubType value for this Policy.
     * 
     * @param policySubType
     */
    public void setPolicySubType(java.lang.String policySubType) {
        this.policySubType = policySubType;
    }


    /**
     * Gets the description value for this Policy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Policy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lineOfBusinessList value for this Policy.
     * 
     * @return lineOfBusinessList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness[] getLineOfBusinessList() {
        return lineOfBusinessList;
    }


    /**
     * Sets the lineOfBusinessList value for this Policy.
     * 
     * @param lineOfBusinessList
     */
    public void setLineOfBusinessList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness[] lineOfBusinessList) {
        this.lineOfBusinessList = lineOfBusinessList;
    }


    /**
     * Gets the personnelList value for this Policy.
     * 
     * @return personnelList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] getPersonnelList() {
        return personnelList;
    }


    /**
     * Sets the personnelList value for this Policy.
     * 
     * @param personnelList
     */
    public void setPersonnelList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] personnelList) {
        this.personnelList = personnelList;
    }


    /**
     * Gets the transactionList value for this Policy.
     * 
     * @return transactionList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction[] getTransactionList() {
        return transactionList;
    }


    /**
     * Sets the transactionList value for this Policy.
     * 
     * @param transactionList
     */
    public void setTransactionList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction[] transactionList) {
        this.transactionList = transactionList;
    }


    /**
     * Gets the transactionPremiumList value for this Policy.
     * 
     * @return transactionPremiumList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium[] getTransactionPremiumList() {
        return transactionPremiumList;
    }


    /**
     * Sets the transactionPremiumList value for this Policy.
     * 
     * @param transactionPremiumList
     */
    public void setTransactionPremiumList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium[] transactionPremiumList) {
        this.transactionPremiumList = transactionPremiumList;
    }


    /**
     * Gets the policyNotationId value for this Policy.
     * 
     * @return policyNotationId
     */
    public java.lang.String getPolicyNotationId() {
        return policyNotationId;
    }


    /**
     * Sets the policyNotationId value for this Policy.
     * 
     * @param policyNotationId
     */
    public void setPolicyNotationId(java.lang.String policyNotationId) {
        this.policyNotationId = policyNotationId;
    }


    /**
     * Gets the priorPolicy value for this Policy.
     * 
     * @return priorPolicy
     */
    public java.lang.String getPriorPolicy() {
        return priorPolicy;
    }


    /**
     * Sets the priorPolicy value for this Policy.
     * 
     * @param priorPolicy
     */
    public void setPriorPolicy(java.lang.String priorPolicy) {
        this.priorPolicy = priorPolicy;
    }


    /**
     * Gets the priorPolicyId value for this Policy.
     * 
     * @return priorPolicyId
     */
    public java.lang.String getPriorPolicyId() {
        return priorPolicyId;
    }


    /**
     * Sets the priorPolicyId value for this Policy.
     * 
     * @param priorPolicyId
     */
    public void setPriorPolicyId(java.lang.String priorPolicyId) {
        this.priorPolicyId = priorPolicyId;
    }


    /**
     * Gets the sourcePolicyId value for this Policy.
     * 
     * @return sourcePolicyId
     */
    public java.lang.String getSourcePolicyId() {
        return sourcePolicyId;
    }


    /**
     * Sets the sourcePolicyId value for this Policy.
     * 
     * @param sourcePolicyId
     */
    public void setSourcePolicyId(java.lang.String sourcePolicyId) {
        this.sourcePolicyId = sourcePolicyId;
    }


    /**
     * Gets the isExcludeDelete value for this Policy.
     * 
     * @return isExcludeDelete
     */
    public java.lang.Boolean getIsExcludeDelete() {
        return isExcludeDelete;
    }


    /**
     * Sets the isExcludeDelete value for this Policy.
     * 
     * @param isExcludeDelete
     */
    public void setIsExcludeDelete(java.lang.Boolean isExcludeDelete) {
        this.isExcludeDelete = isExcludeDelete;
    }


    /**
     * Gets the nationalProducerCode value for this Policy.
     * 
     * @return nationalProducerCode
     */
    public java.lang.Long getNationalProducerCode() {
        return nationalProducerCode;
    }


    /**
     * Sets the nationalProducerCode value for this Policy.
     * 
     * @param nationalProducerCode
     */
    public void setNationalProducerCode(java.lang.Long nationalProducerCode) {
        this.nationalProducerCode = nationalProducerCode;
    }


    /**
     * Gets the companyCustomerNumber value for this Policy.
     * 
     * @return companyCustomerNumber
     */
    public java.lang.String getCompanyCustomerNumber() {
        return companyCustomerNumber;
    }


    /**
     * Sets the companyCustomerNumber value for this Policy.
     * 
     * @param companyCustomerNumber
     */
    public void setCompanyCustomerNumber(java.lang.String companyCustomerNumber) {
        this.companyCustomerNumber = companyCustomerNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
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
            ((this.policyId==null && other.getPolicyId()==null) || 
             (this.policyId!=null &&
              this.policyId.equals(other.getPolicyId()))) &&
            ((this.policyNumber==null && other.getPolicyNumber()==null) || 
             (this.policyNumber!=null &&
              this.policyNumber.equals(other.getPolicyNumber()))) &&
            ((this.typeOfBusiness==null && other.getTypeOfBusiness()==null) || 
             (this.typeOfBusiness!=null &&
              this.typeOfBusiness.equals(other.getTypeOfBusiness()))) &&
            ((this.policyType==null && other.getPolicyType()==null) || 
             (this.policyType!=null &&
              this.policyType.equals(other.getPolicyType()))) &&
            ((this.policyTypeOfBusiness==null && other.getPolicyTypeOfBusiness()==null) || 
             (this.policyTypeOfBusiness!=null &&
              this.policyTypeOfBusiness.equals(other.getPolicyTypeOfBusiness()))) &&
            ((this.writingCompanyCode==null && other.getWritingCompanyCode()==null) || 
             (this.writingCompanyCode!=null &&
              this.writingCompanyCode.equals(other.getWritingCompanyCode()))) &&
            ((this.accountExecCode==null && other.getAccountExecCode()==null) || 
             (this.accountExecCode!=null &&
              this.accountExecCode.equals(other.getAccountExecCode()))) &&
            ((this.accountRepCode==null && other.getAccountRepCode()==null) || 
             (this.accountRepCode!=null &&
              this.accountRepCode.equals(other.getAccountRepCode()))) &&
            ((this.brokerCode==null && other.getBrokerCode()==null) || 
             (this.brokerCode!=null &&
              this.brokerCode.equals(other.getBrokerCode()))) &&
            ((this.policyEffectiveDate==null && other.getPolicyEffectiveDate()==null) || 
             (this.policyEffectiveDate!=null &&
              this.policyEffectiveDate.equals(other.getPolicyEffectiveDate()))) &&
            ((this.policyExpirationDate==null && other.getPolicyExpirationDate()==null) || 
             (this.policyExpirationDate!=null &&
              this.policyExpirationDate.equals(other.getPolicyExpirationDate()))) &&
            ((this.isContinuous==null && other.getIsContinuous()==null) || 
             (this.isContinuous!=null &&
              this.isContinuous.equals(other.getIsContinuous()))) &&
            ((this.policyStatus==null && other.getPolicyStatus()==null) || 
             (this.policyStatus!=null &&
              this.policyStatus.equals(other.getPolicyStatus()))) &&
            ((this.GLDivisionCode==null && other.getGLDivisionCode()==null) || 
             (this.GLDivisionCode!=null &&
              this.GLDivisionCode.equals(other.getGLDivisionCode()))) &&
            ((this.GLDepartmentCode==null && other.getGLDepartmentCode()==null) || 
             (this.GLDepartmentCode!=null &&
              this.GLDepartmentCode.equals(other.getGLDepartmentCode()))) &&
            ((this.GLBranchCode==null && other.getGLBranchCode()==null) || 
             (this.GLBranchCode!=null &&
              this.GLBranchCode.equals(other.getGLBranchCode()))) &&
            ((this.GLGroupCode==null && other.getGLGroupCode()==null) || 
             (this.GLGroupCode!=null &&
              this.GLGroupCode.equals(other.getGLGroupCode()))) &&
            ((this.billMethod==null && other.getBillMethod()==null) || 
             (this.billMethod!=null &&
              this.billMethod.equals(other.getBillMethod()))) &&
            ((this.isNewPolicy==null && other.getIsNewPolicy()==null) || 
             (this.isNewPolicy!=null &&
              this.isNewPolicy.equals(other.getIsNewPolicy()))) &&
            ((this.fullTermPremium==null && other.getFullTermPremium()==null) || 
             (this.fullTermPremium!=null &&
              this.fullTermPremium.equals(other.getFullTermPremium()))) &&
            ((this.isFinanced==null && other.getIsFinanced()==null) || 
             (this.isFinanced!=null &&
              this.isFinanced.equals(other.getIsFinanced()))) &&
            ((this.companyType==null && other.getCompanyType()==null) || 
             (this.companyType!=null &&
              this.companyType.equals(other.getCompanyType()))) &&
            ((this.isMultiEntity==null && other.getIsMultiEntity()==null) || 
             (this.isMultiEntity!=null &&
              this.isMultiEntity.equals(other.getIsMultiEntity()))) &&
            ((this.policySubType==null && other.getPolicySubType()==null) || 
             (this.policySubType!=null &&
              this.policySubType.equals(other.getPolicySubType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lineOfBusinessList==null && other.getLineOfBusinessList()==null) || 
             (this.lineOfBusinessList!=null &&
              java.util.Arrays.equals(this.lineOfBusinessList, other.getLineOfBusinessList()))) &&
            ((this.personnelList==null && other.getPersonnelList()==null) || 
             (this.personnelList!=null &&
              java.util.Arrays.equals(this.personnelList, other.getPersonnelList()))) &&
            ((this.transactionList==null && other.getTransactionList()==null) || 
             (this.transactionList!=null &&
              java.util.Arrays.equals(this.transactionList, other.getTransactionList()))) &&
            ((this.transactionPremiumList==null && other.getTransactionPremiumList()==null) || 
             (this.transactionPremiumList!=null &&
              java.util.Arrays.equals(this.transactionPremiumList, other.getTransactionPremiumList()))) &&
            ((this.policyNotationId==null && other.getPolicyNotationId()==null) || 
             (this.policyNotationId!=null &&
              this.policyNotationId.equals(other.getPolicyNotationId()))) &&
            ((this.priorPolicy==null && other.getPriorPolicy()==null) || 
             (this.priorPolicy!=null &&
              this.priorPolicy.equals(other.getPriorPolicy()))) &&
            ((this.priorPolicyId==null && other.getPriorPolicyId()==null) || 
             (this.priorPolicyId!=null &&
              this.priorPolicyId.equals(other.getPriorPolicyId()))) &&
            ((this.sourcePolicyId==null && other.getSourcePolicyId()==null) || 
             (this.sourcePolicyId!=null &&
              this.sourcePolicyId.equals(other.getSourcePolicyId()))) &&
            ((this.isExcludeDelete==null && other.getIsExcludeDelete()==null) || 
             (this.isExcludeDelete!=null &&
              this.isExcludeDelete.equals(other.getIsExcludeDelete()))) &&
            ((this.nationalProducerCode==null && other.getNationalProducerCode()==null) || 
             (this.nationalProducerCode!=null &&
              this.nationalProducerCode.equals(other.getNationalProducerCode()))) &&
            ((this.companyCustomerNumber==null && other.getCompanyCustomerNumber()==null) || 
             (this.companyCustomerNumber!=null &&
              this.companyCustomerNumber.equals(other.getCompanyCustomerNumber())));
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
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
        }
        if (getPolicyNumber() != null) {
            _hashCode += getPolicyNumber().hashCode();
        }
        if (getTypeOfBusiness() != null) {
            _hashCode += getTypeOfBusiness().hashCode();
        }
        if (getPolicyType() != null) {
            _hashCode += getPolicyType().hashCode();
        }
        if (getPolicyTypeOfBusiness() != null) {
            _hashCode += getPolicyTypeOfBusiness().hashCode();
        }
        if (getWritingCompanyCode() != null) {
            _hashCode += getWritingCompanyCode().hashCode();
        }
        if (getAccountExecCode() != null) {
            _hashCode += getAccountExecCode().hashCode();
        }
        if (getAccountRepCode() != null) {
            _hashCode += getAccountRepCode().hashCode();
        }
        if (getBrokerCode() != null) {
            _hashCode += getBrokerCode().hashCode();
        }
        if (getPolicyEffectiveDate() != null) {
            _hashCode += getPolicyEffectiveDate().hashCode();
        }
        if (getPolicyExpirationDate() != null) {
            _hashCode += getPolicyExpirationDate().hashCode();
        }
        if (getIsContinuous() != null) {
            _hashCode += getIsContinuous().hashCode();
        }
        if (getPolicyStatus() != null) {
            _hashCode += getPolicyStatus().hashCode();
        }
        if (getGLDivisionCode() != null) {
            _hashCode += getGLDivisionCode().hashCode();
        }
        if (getGLDepartmentCode() != null) {
            _hashCode += getGLDepartmentCode().hashCode();
        }
        if (getGLBranchCode() != null) {
            _hashCode += getGLBranchCode().hashCode();
        }
        if (getGLGroupCode() != null) {
            _hashCode += getGLGroupCode().hashCode();
        }
        if (getBillMethod() != null) {
            _hashCode += getBillMethod().hashCode();
        }
        if (getIsNewPolicy() != null) {
            _hashCode += getIsNewPolicy().hashCode();
        }
        if (getFullTermPremium() != null) {
            _hashCode += getFullTermPremium().hashCode();
        }
        if (getIsFinanced() != null) {
            _hashCode += getIsFinanced().hashCode();
        }
        if (getCompanyType() != null) {
            _hashCode += getCompanyType().hashCode();
        }
        if (getIsMultiEntity() != null) {
            _hashCode += getIsMultiEntity().hashCode();
        }
        if (getPolicySubType() != null) {
            _hashCode += getPolicySubType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLineOfBusinessList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineOfBusinessList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineOfBusinessList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonnelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonnelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonnelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionPremiumList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionPremiumList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionPremiumList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyNotationId() != null) {
            _hashCode += getPolicyNotationId().hashCode();
        }
        if (getPriorPolicy() != null) {
            _hashCode += getPriorPolicy().hashCode();
        }
        if (getPriorPolicyId() != null) {
            _hashCode += getPriorPolicyId().hashCode();
        }
        if (getSourcePolicyId() != null) {
            _hashCode += getSourcePolicyId().hashCode();
        }
        if (getIsExcludeDelete() != null) {
            _hashCode += getIsExcludeDelete().hashCode();
        }
        if (getNationalProducerCode() != null) {
            _hashCode += getNationalProducerCode().hashCode();
        }
        if (getCompanyCustomerNumber() != null) {
            _hashCode += getCompanyCustomerNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Policy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("typeOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TypeOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyType"));
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
        elemField.setFieldName("writingCompanyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WritingCompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountExecCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AccountExecCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountRepCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AccountRepCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("isContinuous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsContinuous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDivisionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLDepartmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLBranchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BillMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsNewPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTermPremium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FullTermPremium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFinanced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsFinanced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMultiEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsMultiEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnelList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonnelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransaction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransaction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionPremiumList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TransactionPremiumList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyNotationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyNotationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PriorPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorPolicyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PriorPolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePolicyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SourcePolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExcludeDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsExcludeDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalProducerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NationalProducerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCustomerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyCustomerNumber"));
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
