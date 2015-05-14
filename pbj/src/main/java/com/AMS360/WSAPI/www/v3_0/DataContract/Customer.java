/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class Customer  implements java.io.Serializable {
    private java.lang.Boolean isActive;

    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String customerNotationId;

    private java.lang.String brokerCode;

    private java.lang.String businessAreaCode;

    private java.lang.String businessExtension;

    private java.lang.String businessPhone;

    private java.lang.String inBusinessSince;

    private java.lang.String city;

    private java.lang.String county;

    private java.lang.String accountRepCode;

    private java.util.Calendar dateCustomerAdded;

    private java.lang.String customerId;

    private java.lang.Integer customerNumber;

    private java.lang.String doingBusinessAs;

    private java.util.Calendar dateOfBirth;

    private java.lang.String DUNSNumber;

    private java.lang.String email;

    private java.lang.String faxAreaCode;

    private java.lang.String faxExtension;

    private java.lang.String faxPhone;

    private java.lang.String federalTaxIdNumber;

    private java.lang.String firmName;

    private java.lang.String firstName;

    private java.lang.String formalSalutation;

    private java.lang.String GLBranchCode;

    private java.lang.String GLDepartmentCode;

    private java.lang.String GLDivisionCode;

    private java.lang.String GLGroupCode;

    private java.lang.String informalSalutation;

    private java.lang.Boolean isBenefits;

    private java.lang.Boolean isBrokersCustomer;

    private java.lang.Boolean isCommercial;

    private java.lang.Boolean isFinancial;

    private java.lang.Boolean isHealth;

    private java.lang.Boolean isLife;

    private java.lang.Boolean isNonPropertyAndCasualty;

    private java.lang.Boolean isPersonal;

    private java.lang.String lastName;

    private java.lang.String cellAreaCode;

    private java.lang.String cellExtension;

    private java.lang.String cellPhone;

    private java.lang.String maritalStatus;

    private java.lang.String middleName;

    private java.lang.String occupation;

    private java.lang.String pagerAreaCode;

    private java.lang.String pagerExtension;

    private java.lang.String pagerPhone;

    private java.lang.String accountExecCode;

    private java.lang.String homeAreaCode;

    private java.lang.String homeExtension;

    private java.lang.String homePhone;

    private java.lang.String NAICSCode;

    private java.lang.String state;

    private java.lang.String customerType;

    private java.lang.String businessEntityType;

    private java.lang.String webAddress;

    private java.lang.String zipCode;

    private java.lang.Boolean isSecured;

    public Customer() {
    }

    public Customer(
           java.lang.Boolean isActive,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String customerNotationId,
           java.lang.String brokerCode,
           java.lang.String businessAreaCode,
           java.lang.String businessExtension,
           java.lang.String businessPhone,
           java.lang.String inBusinessSince,
           java.lang.String city,
           java.lang.String county,
           java.lang.String accountRepCode,
           java.util.Calendar dateCustomerAdded,
           java.lang.String customerId,
           java.lang.Integer customerNumber,
           java.lang.String doingBusinessAs,
           java.util.Calendar dateOfBirth,
           java.lang.String DUNSNumber,
           java.lang.String email,
           java.lang.String faxAreaCode,
           java.lang.String faxExtension,
           java.lang.String faxPhone,
           java.lang.String federalTaxIdNumber,
           java.lang.String firmName,
           java.lang.String firstName,
           java.lang.String formalSalutation,
           java.lang.String GLBranchCode,
           java.lang.String GLDepartmentCode,
           java.lang.String GLDivisionCode,
           java.lang.String GLGroupCode,
           java.lang.String informalSalutation,
           java.lang.Boolean isBenefits,
           java.lang.Boolean isBrokersCustomer,
           java.lang.Boolean isCommercial,
           java.lang.Boolean isFinancial,
           java.lang.Boolean isHealth,
           java.lang.Boolean isLife,
           java.lang.Boolean isNonPropertyAndCasualty,
           java.lang.Boolean isPersonal,
           java.lang.String lastName,
           java.lang.String cellAreaCode,
           java.lang.String cellExtension,
           java.lang.String cellPhone,
           java.lang.String maritalStatus,
           java.lang.String middleName,
           java.lang.String occupation,
           java.lang.String pagerAreaCode,
           java.lang.String pagerExtension,
           java.lang.String pagerPhone,
           java.lang.String accountExecCode,
           java.lang.String homeAreaCode,
           java.lang.String homeExtension,
           java.lang.String homePhone,
           java.lang.String NAICSCode,
           java.lang.String state,
           java.lang.String customerType,
           java.lang.String businessEntityType,
           java.lang.String webAddress,
           java.lang.String zipCode,
           java.lang.Boolean isSecured) {
           this.isActive = isActive;
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.customerNotationId = customerNotationId;
           this.brokerCode = brokerCode;
           this.businessAreaCode = businessAreaCode;
           this.businessExtension = businessExtension;
           this.businessPhone = businessPhone;
           this.inBusinessSince = inBusinessSince;
           this.city = city;
           this.county = county;
           this.accountRepCode = accountRepCode;
           this.dateCustomerAdded = dateCustomerAdded;
           this.customerId = customerId;
           this.customerNumber = customerNumber;
           this.doingBusinessAs = doingBusinessAs;
           this.dateOfBirth = dateOfBirth;
           this.DUNSNumber = DUNSNumber;
           this.email = email;
           this.faxAreaCode = faxAreaCode;
           this.faxExtension = faxExtension;
           this.faxPhone = faxPhone;
           this.federalTaxIdNumber = federalTaxIdNumber;
           this.firmName = firmName;
           this.firstName = firstName;
           this.formalSalutation = formalSalutation;
           this.GLBranchCode = GLBranchCode;
           this.GLDepartmentCode = GLDepartmentCode;
           this.GLDivisionCode = GLDivisionCode;
           this.GLGroupCode = GLGroupCode;
           this.informalSalutation = informalSalutation;
           this.isBenefits = isBenefits;
           this.isBrokersCustomer = isBrokersCustomer;
           this.isCommercial = isCommercial;
           this.isFinancial = isFinancial;
           this.isHealth = isHealth;
           this.isLife = isLife;
           this.isNonPropertyAndCasualty = isNonPropertyAndCasualty;
           this.isPersonal = isPersonal;
           this.lastName = lastName;
           this.cellAreaCode = cellAreaCode;
           this.cellExtension = cellExtension;
           this.cellPhone = cellPhone;
           this.maritalStatus = maritalStatus;
           this.middleName = middleName;
           this.occupation = occupation;
           this.pagerAreaCode = pagerAreaCode;
           this.pagerExtension = pagerExtension;
           this.pagerPhone = pagerPhone;
           this.accountExecCode = accountExecCode;
           this.homeAreaCode = homeAreaCode;
           this.homeExtension = homeExtension;
           this.homePhone = homePhone;
           this.NAICSCode = NAICSCode;
           this.state = state;
           this.customerType = customerType;
           this.businessEntityType = businessEntityType;
           this.webAddress = webAddress;
           this.zipCode = zipCode;
           this.isSecured = isSecured;
    }


    /**
     * Gets the isActive value for this Customer.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this Customer.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the addressLine1 value for this Customer.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this Customer.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this Customer.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this Customer.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the customerNotationId value for this Customer.
     * 
     * @return customerNotationId
     */
    public java.lang.String getCustomerNotationId() {
        return customerNotationId;
    }


    /**
     * Sets the customerNotationId value for this Customer.
     * 
     * @param customerNotationId
     */
    public void setCustomerNotationId(java.lang.String customerNotationId) {
        this.customerNotationId = customerNotationId;
    }


    /**
     * Gets the brokerCode value for this Customer.
     * 
     * @return brokerCode
     */
    public java.lang.String getBrokerCode() {
        return brokerCode;
    }


    /**
     * Sets the brokerCode value for this Customer.
     * 
     * @param brokerCode
     */
    public void setBrokerCode(java.lang.String brokerCode) {
        this.brokerCode = brokerCode;
    }


    /**
     * Gets the businessAreaCode value for this Customer.
     * 
     * @return businessAreaCode
     */
    public java.lang.String getBusinessAreaCode() {
        return businessAreaCode;
    }


    /**
     * Sets the businessAreaCode value for this Customer.
     * 
     * @param businessAreaCode
     */
    public void setBusinessAreaCode(java.lang.String businessAreaCode) {
        this.businessAreaCode = businessAreaCode;
    }


    /**
     * Gets the businessExtension value for this Customer.
     * 
     * @return businessExtension
     */
    public java.lang.String getBusinessExtension() {
        return businessExtension;
    }


    /**
     * Sets the businessExtension value for this Customer.
     * 
     * @param businessExtension
     */
    public void setBusinessExtension(java.lang.String businessExtension) {
        this.businessExtension = businessExtension;
    }


    /**
     * Gets the businessPhone value for this Customer.
     * 
     * @return businessPhone
     */
    public java.lang.String getBusinessPhone() {
        return businessPhone;
    }


    /**
     * Sets the businessPhone value for this Customer.
     * 
     * @param businessPhone
     */
    public void setBusinessPhone(java.lang.String businessPhone) {
        this.businessPhone = businessPhone;
    }


    /**
     * Gets the inBusinessSince value for this Customer.
     * 
     * @return inBusinessSince
     */
    public java.lang.String getInBusinessSince() {
        return inBusinessSince;
    }


    /**
     * Sets the inBusinessSince value for this Customer.
     * 
     * @param inBusinessSince
     */
    public void setInBusinessSince(java.lang.String inBusinessSince) {
        this.inBusinessSince = inBusinessSince;
    }


    /**
     * Gets the city value for this Customer.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Customer.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the county value for this Customer.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this Customer.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the accountRepCode value for this Customer.
     * 
     * @return accountRepCode
     */
    public java.lang.String getAccountRepCode() {
        return accountRepCode;
    }


    /**
     * Sets the accountRepCode value for this Customer.
     * 
     * @param accountRepCode
     */
    public void setAccountRepCode(java.lang.String accountRepCode) {
        this.accountRepCode = accountRepCode;
    }


    /**
     * Gets the dateCustomerAdded value for this Customer.
     * 
     * @return dateCustomerAdded
     */
    public java.util.Calendar getDateCustomerAdded() {
        return dateCustomerAdded;
    }


    /**
     * Sets the dateCustomerAdded value for this Customer.
     * 
     * @param dateCustomerAdded
     */
    public void setDateCustomerAdded(java.util.Calendar dateCustomerAdded) {
        this.dateCustomerAdded = dateCustomerAdded;
    }


    /**
     * Gets the customerId value for this Customer.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Customer.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerNumber value for this Customer.
     * 
     * @return customerNumber
     */
    public java.lang.Integer getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this Customer.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(java.lang.Integer customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the doingBusinessAs value for this Customer.
     * 
     * @return doingBusinessAs
     */
    public java.lang.String getDoingBusinessAs() {
        return doingBusinessAs;
    }


    /**
     * Sets the doingBusinessAs value for this Customer.
     * 
     * @param doingBusinessAs
     */
    public void setDoingBusinessAs(java.lang.String doingBusinessAs) {
        this.doingBusinessAs = doingBusinessAs;
    }


    /**
     * Gets the dateOfBirth value for this Customer.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this Customer.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the DUNSNumber value for this Customer.
     * 
     * @return DUNSNumber
     */
    public java.lang.String getDUNSNumber() {
        return DUNSNumber;
    }


    /**
     * Sets the DUNSNumber value for this Customer.
     * 
     * @param DUNSNumber
     */
    public void setDUNSNumber(java.lang.String DUNSNumber) {
        this.DUNSNumber = DUNSNumber;
    }


    /**
     * Gets the email value for this Customer.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Customer.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the faxAreaCode value for this Customer.
     * 
     * @return faxAreaCode
     */
    public java.lang.String getFaxAreaCode() {
        return faxAreaCode;
    }


    /**
     * Sets the faxAreaCode value for this Customer.
     * 
     * @param faxAreaCode
     */
    public void setFaxAreaCode(java.lang.String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }


    /**
     * Gets the faxExtension value for this Customer.
     * 
     * @return faxExtension
     */
    public java.lang.String getFaxExtension() {
        return faxExtension;
    }


    /**
     * Sets the faxExtension value for this Customer.
     * 
     * @param faxExtension
     */
    public void setFaxExtension(java.lang.String faxExtension) {
        this.faxExtension = faxExtension;
    }


    /**
     * Gets the faxPhone value for this Customer.
     * 
     * @return faxPhone
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this Customer.
     * 
     * @param faxPhone
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the federalTaxIdNumber value for this Customer.
     * 
     * @return federalTaxIdNumber
     */
    public java.lang.String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }


    /**
     * Sets the federalTaxIdNumber value for this Customer.
     * 
     * @param federalTaxIdNumber
     */
    public void setFederalTaxIdNumber(java.lang.String federalTaxIdNumber) {
        this.federalTaxIdNumber = federalTaxIdNumber;
    }


    /**
     * Gets the firmName value for this Customer.
     * 
     * @return firmName
     */
    public java.lang.String getFirmName() {
        return firmName;
    }


    /**
     * Sets the firmName value for this Customer.
     * 
     * @param firmName
     */
    public void setFirmName(java.lang.String firmName) {
        this.firmName = firmName;
    }


    /**
     * Gets the firstName value for this Customer.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Customer.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the formalSalutation value for this Customer.
     * 
     * @return formalSalutation
     */
    public java.lang.String getFormalSalutation() {
        return formalSalutation;
    }


    /**
     * Sets the formalSalutation value for this Customer.
     * 
     * @param formalSalutation
     */
    public void setFormalSalutation(java.lang.String formalSalutation) {
        this.formalSalutation = formalSalutation;
    }


    /**
     * Gets the GLBranchCode value for this Customer.
     * 
     * @return GLBranchCode
     */
    public java.lang.String getGLBranchCode() {
        return GLBranchCode;
    }


    /**
     * Sets the GLBranchCode value for this Customer.
     * 
     * @param GLBranchCode
     */
    public void setGLBranchCode(java.lang.String GLBranchCode) {
        this.GLBranchCode = GLBranchCode;
    }


    /**
     * Gets the GLDepartmentCode value for this Customer.
     * 
     * @return GLDepartmentCode
     */
    public java.lang.String getGLDepartmentCode() {
        return GLDepartmentCode;
    }


    /**
     * Sets the GLDepartmentCode value for this Customer.
     * 
     * @param GLDepartmentCode
     */
    public void setGLDepartmentCode(java.lang.String GLDepartmentCode) {
        this.GLDepartmentCode = GLDepartmentCode;
    }


    /**
     * Gets the GLDivisionCode value for this Customer.
     * 
     * @return GLDivisionCode
     */
    public java.lang.String getGLDivisionCode() {
        return GLDivisionCode;
    }


    /**
     * Sets the GLDivisionCode value for this Customer.
     * 
     * @param GLDivisionCode
     */
    public void setGLDivisionCode(java.lang.String GLDivisionCode) {
        this.GLDivisionCode = GLDivisionCode;
    }


    /**
     * Gets the GLGroupCode value for this Customer.
     * 
     * @return GLGroupCode
     */
    public java.lang.String getGLGroupCode() {
        return GLGroupCode;
    }


    /**
     * Sets the GLGroupCode value for this Customer.
     * 
     * @param GLGroupCode
     */
    public void setGLGroupCode(java.lang.String GLGroupCode) {
        this.GLGroupCode = GLGroupCode;
    }


    /**
     * Gets the informalSalutation value for this Customer.
     * 
     * @return informalSalutation
     */
    public java.lang.String getInformalSalutation() {
        return informalSalutation;
    }


    /**
     * Sets the informalSalutation value for this Customer.
     * 
     * @param informalSalutation
     */
    public void setInformalSalutation(java.lang.String informalSalutation) {
        this.informalSalutation = informalSalutation;
    }


    /**
     * Gets the isBenefits value for this Customer.
     * 
     * @return isBenefits
     */
    public java.lang.Boolean getIsBenefits() {
        return isBenefits;
    }


    /**
     * Sets the isBenefits value for this Customer.
     * 
     * @param isBenefits
     */
    public void setIsBenefits(java.lang.Boolean isBenefits) {
        this.isBenefits = isBenefits;
    }


    /**
     * Gets the isBrokersCustomer value for this Customer.
     * 
     * @return isBrokersCustomer
     */
    public java.lang.Boolean getIsBrokersCustomer() {
        return isBrokersCustomer;
    }


    /**
     * Sets the isBrokersCustomer value for this Customer.
     * 
     * @param isBrokersCustomer
     */
    public void setIsBrokersCustomer(java.lang.Boolean isBrokersCustomer) {
        this.isBrokersCustomer = isBrokersCustomer;
    }


    /**
     * Gets the isCommercial value for this Customer.
     * 
     * @return isCommercial
     */
    public java.lang.Boolean getIsCommercial() {
        return isCommercial;
    }


    /**
     * Sets the isCommercial value for this Customer.
     * 
     * @param isCommercial
     */
    public void setIsCommercial(java.lang.Boolean isCommercial) {
        this.isCommercial = isCommercial;
    }


    /**
     * Gets the isFinancial value for this Customer.
     * 
     * @return isFinancial
     */
    public java.lang.Boolean getIsFinancial() {
        return isFinancial;
    }


    /**
     * Sets the isFinancial value for this Customer.
     * 
     * @param isFinancial
     */
    public void setIsFinancial(java.lang.Boolean isFinancial) {
        this.isFinancial = isFinancial;
    }


    /**
     * Gets the isHealth value for this Customer.
     * 
     * @return isHealth
     */
    public java.lang.Boolean getIsHealth() {
        return isHealth;
    }


    /**
     * Sets the isHealth value for this Customer.
     * 
     * @param isHealth
     */
    public void setIsHealth(java.lang.Boolean isHealth) {
        this.isHealth = isHealth;
    }


    /**
     * Gets the isLife value for this Customer.
     * 
     * @return isLife
     */
    public java.lang.Boolean getIsLife() {
        return isLife;
    }


    /**
     * Sets the isLife value for this Customer.
     * 
     * @param isLife
     */
    public void setIsLife(java.lang.Boolean isLife) {
        this.isLife = isLife;
    }


    /**
     * Gets the isNonPropertyAndCasualty value for this Customer.
     * 
     * @return isNonPropertyAndCasualty
     */
    public java.lang.Boolean getIsNonPropertyAndCasualty() {
        return isNonPropertyAndCasualty;
    }


    /**
     * Sets the isNonPropertyAndCasualty value for this Customer.
     * 
     * @param isNonPropertyAndCasualty
     */
    public void setIsNonPropertyAndCasualty(java.lang.Boolean isNonPropertyAndCasualty) {
        this.isNonPropertyAndCasualty = isNonPropertyAndCasualty;
    }


    /**
     * Gets the isPersonal value for this Customer.
     * 
     * @return isPersonal
     */
    public java.lang.Boolean getIsPersonal() {
        return isPersonal;
    }


    /**
     * Sets the isPersonal value for this Customer.
     * 
     * @param isPersonal
     */
    public void setIsPersonal(java.lang.Boolean isPersonal) {
        this.isPersonal = isPersonal;
    }


    /**
     * Gets the lastName value for this Customer.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Customer.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the cellAreaCode value for this Customer.
     * 
     * @return cellAreaCode
     */
    public java.lang.String getCellAreaCode() {
        return cellAreaCode;
    }


    /**
     * Sets the cellAreaCode value for this Customer.
     * 
     * @param cellAreaCode
     */
    public void setCellAreaCode(java.lang.String cellAreaCode) {
        this.cellAreaCode = cellAreaCode;
    }


    /**
     * Gets the cellExtension value for this Customer.
     * 
     * @return cellExtension
     */
    public java.lang.String getCellExtension() {
        return cellExtension;
    }


    /**
     * Sets the cellExtension value for this Customer.
     * 
     * @param cellExtension
     */
    public void setCellExtension(java.lang.String cellExtension) {
        this.cellExtension = cellExtension;
    }


    /**
     * Gets the cellPhone value for this Customer.
     * 
     * @return cellPhone
     */
    public java.lang.String getCellPhone() {
        return cellPhone;
    }


    /**
     * Sets the cellPhone value for this Customer.
     * 
     * @param cellPhone
     */
    public void setCellPhone(java.lang.String cellPhone) {
        this.cellPhone = cellPhone;
    }


    /**
     * Gets the maritalStatus value for this Customer.
     * 
     * @return maritalStatus
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Customer.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the middleName value for this Customer.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Customer.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the occupation value for this Customer.
     * 
     * @return occupation
     */
    public java.lang.String getOccupation() {
        return occupation;
    }


    /**
     * Sets the occupation value for this Customer.
     * 
     * @param occupation
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }


    /**
     * Gets the pagerAreaCode value for this Customer.
     * 
     * @return pagerAreaCode
     */
    public java.lang.String getPagerAreaCode() {
        return pagerAreaCode;
    }


    /**
     * Sets the pagerAreaCode value for this Customer.
     * 
     * @param pagerAreaCode
     */
    public void setPagerAreaCode(java.lang.String pagerAreaCode) {
        this.pagerAreaCode = pagerAreaCode;
    }


    /**
     * Gets the pagerExtension value for this Customer.
     * 
     * @return pagerExtension
     */
    public java.lang.String getPagerExtension() {
        return pagerExtension;
    }


    /**
     * Sets the pagerExtension value for this Customer.
     * 
     * @param pagerExtension
     */
    public void setPagerExtension(java.lang.String pagerExtension) {
        this.pagerExtension = pagerExtension;
    }


    /**
     * Gets the pagerPhone value for this Customer.
     * 
     * @return pagerPhone
     */
    public java.lang.String getPagerPhone() {
        return pagerPhone;
    }


    /**
     * Sets the pagerPhone value for this Customer.
     * 
     * @param pagerPhone
     */
    public void setPagerPhone(java.lang.String pagerPhone) {
        this.pagerPhone = pagerPhone;
    }


    /**
     * Gets the accountExecCode value for this Customer.
     * 
     * @return accountExecCode
     */
    public java.lang.String getAccountExecCode() {
        return accountExecCode;
    }


    /**
     * Sets the accountExecCode value for this Customer.
     * 
     * @param accountExecCode
     */
    public void setAccountExecCode(java.lang.String accountExecCode) {
        this.accountExecCode = accountExecCode;
    }


    /**
     * Gets the homeAreaCode value for this Customer.
     * 
     * @return homeAreaCode
     */
    public java.lang.String getHomeAreaCode() {
        return homeAreaCode;
    }


    /**
     * Sets the homeAreaCode value for this Customer.
     * 
     * @param homeAreaCode
     */
    public void setHomeAreaCode(java.lang.String homeAreaCode) {
        this.homeAreaCode = homeAreaCode;
    }


    /**
     * Gets the homeExtension value for this Customer.
     * 
     * @return homeExtension
     */
    public java.lang.String getHomeExtension() {
        return homeExtension;
    }


    /**
     * Sets the homeExtension value for this Customer.
     * 
     * @param homeExtension
     */
    public void setHomeExtension(java.lang.String homeExtension) {
        this.homeExtension = homeExtension;
    }


    /**
     * Gets the homePhone value for this Customer.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Customer.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the NAICSCode value for this Customer.
     * 
     * @return NAICSCode
     */
    public java.lang.String getNAICSCode() {
        return NAICSCode;
    }


    /**
     * Sets the NAICSCode value for this Customer.
     * 
     * @param NAICSCode
     */
    public void setNAICSCode(java.lang.String NAICSCode) {
        this.NAICSCode = NAICSCode;
    }


    /**
     * Gets the state value for this Customer.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Customer.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the customerType value for this Customer.
     * 
     * @return customerType
     */
    public java.lang.String getCustomerType() {
        return customerType;
    }


    /**
     * Sets the customerType value for this Customer.
     * 
     * @param customerType
     */
    public void setCustomerType(java.lang.String customerType) {
        this.customerType = customerType;
    }


    /**
     * Gets the businessEntityType value for this Customer.
     * 
     * @return businessEntityType
     */
    public java.lang.String getBusinessEntityType() {
        return businessEntityType;
    }


    /**
     * Sets the businessEntityType value for this Customer.
     * 
     * @param businessEntityType
     */
    public void setBusinessEntityType(java.lang.String businessEntityType) {
        this.businessEntityType = businessEntityType;
    }


    /**
     * Gets the webAddress value for this Customer.
     * 
     * @return webAddress
     */
    public java.lang.String getWebAddress() {
        return webAddress;
    }


    /**
     * Sets the webAddress value for this Customer.
     * 
     * @param webAddress
     */
    public void setWebAddress(java.lang.String webAddress) {
        this.webAddress = webAddress;
    }


    /**
     * Gets the zipCode value for this Customer.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Customer.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the isSecured value for this Customer.
     * 
     * @return isSecured
     */
    public java.lang.Boolean getIsSecured() {
        return isSecured;
    }


    /**
     * Sets the isSecured value for this Customer.
     * 
     * @param isSecured
     */
    public void setIsSecured(java.lang.Boolean isSecured) {
        this.isSecured = isSecured;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.customerNotationId==null && other.getCustomerNotationId()==null) || 
             (this.customerNotationId!=null &&
              this.customerNotationId.equals(other.getCustomerNotationId()))) &&
            ((this.brokerCode==null && other.getBrokerCode()==null) || 
             (this.brokerCode!=null &&
              this.brokerCode.equals(other.getBrokerCode()))) &&
            ((this.businessAreaCode==null && other.getBusinessAreaCode()==null) || 
             (this.businessAreaCode!=null &&
              this.businessAreaCode.equals(other.getBusinessAreaCode()))) &&
            ((this.businessExtension==null && other.getBusinessExtension()==null) || 
             (this.businessExtension!=null &&
              this.businessExtension.equals(other.getBusinessExtension()))) &&
            ((this.businessPhone==null && other.getBusinessPhone()==null) || 
             (this.businessPhone!=null &&
              this.businessPhone.equals(other.getBusinessPhone()))) &&
            ((this.inBusinessSince==null && other.getInBusinessSince()==null) || 
             (this.inBusinessSince!=null &&
              this.inBusinessSince.equals(other.getInBusinessSince()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.accountRepCode==null && other.getAccountRepCode()==null) || 
             (this.accountRepCode!=null &&
              this.accountRepCode.equals(other.getAccountRepCode()))) &&
            ((this.dateCustomerAdded==null && other.getDateCustomerAdded()==null) || 
             (this.dateCustomerAdded!=null &&
              this.dateCustomerAdded.equals(other.getDateCustomerAdded()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.doingBusinessAs==null && other.getDoingBusinessAs()==null) || 
             (this.doingBusinessAs!=null &&
              this.doingBusinessAs.equals(other.getDoingBusinessAs()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.DUNSNumber==null && other.getDUNSNumber()==null) || 
             (this.DUNSNumber!=null &&
              this.DUNSNumber.equals(other.getDUNSNumber()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.faxAreaCode==null && other.getFaxAreaCode()==null) || 
             (this.faxAreaCode!=null &&
              this.faxAreaCode.equals(other.getFaxAreaCode()))) &&
            ((this.faxExtension==null && other.getFaxExtension()==null) || 
             (this.faxExtension!=null &&
              this.faxExtension.equals(other.getFaxExtension()))) &&
            ((this.faxPhone==null && other.getFaxPhone()==null) || 
             (this.faxPhone!=null &&
              this.faxPhone.equals(other.getFaxPhone()))) &&
            ((this.federalTaxIdNumber==null && other.getFederalTaxIdNumber()==null) || 
             (this.federalTaxIdNumber!=null &&
              this.federalTaxIdNumber.equals(other.getFederalTaxIdNumber()))) &&
            ((this.firmName==null && other.getFirmName()==null) || 
             (this.firmName!=null &&
              this.firmName.equals(other.getFirmName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.formalSalutation==null && other.getFormalSalutation()==null) || 
             (this.formalSalutation!=null &&
              this.formalSalutation.equals(other.getFormalSalutation()))) &&
            ((this.GLBranchCode==null && other.getGLBranchCode()==null) || 
             (this.GLBranchCode!=null &&
              this.GLBranchCode.equals(other.getGLBranchCode()))) &&
            ((this.GLDepartmentCode==null && other.getGLDepartmentCode()==null) || 
             (this.GLDepartmentCode!=null &&
              this.GLDepartmentCode.equals(other.getGLDepartmentCode()))) &&
            ((this.GLDivisionCode==null && other.getGLDivisionCode()==null) || 
             (this.GLDivisionCode!=null &&
              this.GLDivisionCode.equals(other.getGLDivisionCode()))) &&
            ((this.GLGroupCode==null && other.getGLGroupCode()==null) || 
             (this.GLGroupCode!=null &&
              this.GLGroupCode.equals(other.getGLGroupCode()))) &&
            ((this.informalSalutation==null && other.getInformalSalutation()==null) || 
             (this.informalSalutation!=null &&
              this.informalSalutation.equals(other.getInformalSalutation()))) &&
            ((this.isBenefits==null && other.getIsBenefits()==null) || 
             (this.isBenefits!=null &&
              this.isBenefits.equals(other.getIsBenefits()))) &&
            ((this.isBrokersCustomer==null && other.getIsBrokersCustomer()==null) || 
             (this.isBrokersCustomer!=null &&
              this.isBrokersCustomer.equals(other.getIsBrokersCustomer()))) &&
            ((this.isCommercial==null && other.getIsCommercial()==null) || 
             (this.isCommercial!=null &&
              this.isCommercial.equals(other.getIsCommercial()))) &&
            ((this.isFinancial==null && other.getIsFinancial()==null) || 
             (this.isFinancial!=null &&
              this.isFinancial.equals(other.getIsFinancial()))) &&
            ((this.isHealth==null && other.getIsHealth()==null) || 
             (this.isHealth!=null &&
              this.isHealth.equals(other.getIsHealth()))) &&
            ((this.isLife==null && other.getIsLife()==null) || 
             (this.isLife!=null &&
              this.isLife.equals(other.getIsLife()))) &&
            ((this.isNonPropertyAndCasualty==null && other.getIsNonPropertyAndCasualty()==null) || 
             (this.isNonPropertyAndCasualty!=null &&
              this.isNonPropertyAndCasualty.equals(other.getIsNonPropertyAndCasualty()))) &&
            ((this.isPersonal==null && other.getIsPersonal()==null) || 
             (this.isPersonal!=null &&
              this.isPersonal.equals(other.getIsPersonal()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.cellAreaCode==null && other.getCellAreaCode()==null) || 
             (this.cellAreaCode!=null &&
              this.cellAreaCode.equals(other.getCellAreaCode()))) &&
            ((this.cellExtension==null && other.getCellExtension()==null) || 
             (this.cellExtension!=null &&
              this.cellExtension.equals(other.getCellExtension()))) &&
            ((this.cellPhone==null && other.getCellPhone()==null) || 
             (this.cellPhone!=null &&
              this.cellPhone.equals(other.getCellPhone()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.occupation==null && other.getOccupation()==null) || 
             (this.occupation!=null &&
              this.occupation.equals(other.getOccupation()))) &&
            ((this.pagerAreaCode==null && other.getPagerAreaCode()==null) || 
             (this.pagerAreaCode!=null &&
              this.pagerAreaCode.equals(other.getPagerAreaCode()))) &&
            ((this.pagerExtension==null && other.getPagerExtension()==null) || 
             (this.pagerExtension!=null &&
              this.pagerExtension.equals(other.getPagerExtension()))) &&
            ((this.pagerPhone==null && other.getPagerPhone()==null) || 
             (this.pagerPhone!=null &&
              this.pagerPhone.equals(other.getPagerPhone()))) &&
            ((this.accountExecCode==null && other.getAccountExecCode()==null) || 
             (this.accountExecCode!=null &&
              this.accountExecCode.equals(other.getAccountExecCode()))) &&
            ((this.homeAreaCode==null && other.getHomeAreaCode()==null) || 
             (this.homeAreaCode!=null &&
              this.homeAreaCode.equals(other.getHomeAreaCode()))) &&
            ((this.homeExtension==null && other.getHomeExtension()==null) || 
             (this.homeExtension!=null &&
              this.homeExtension.equals(other.getHomeExtension()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.NAICSCode==null && other.getNAICSCode()==null) || 
             (this.NAICSCode!=null &&
              this.NAICSCode.equals(other.getNAICSCode()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.customerType==null && other.getCustomerType()==null) || 
             (this.customerType!=null &&
              this.customerType.equals(other.getCustomerType()))) &&
            ((this.businessEntityType==null && other.getBusinessEntityType()==null) || 
             (this.businessEntityType!=null &&
              this.businessEntityType.equals(other.getBusinessEntityType()))) &&
            ((this.webAddress==null && other.getWebAddress()==null) || 
             (this.webAddress!=null &&
              this.webAddress.equals(other.getWebAddress()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.isSecured==null && other.getIsSecured()==null) || 
             (this.isSecured!=null &&
              this.isSecured.equals(other.getIsSecured())));
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
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getCustomerNotationId() != null) {
            _hashCode += getCustomerNotationId().hashCode();
        }
        if (getBrokerCode() != null) {
            _hashCode += getBrokerCode().hashCode();
        }
        if (getBusinessAreaCode() != null) {
            _hashCode += getBusinessAreaCode().hashCode();
        }
        if (getBusinessExtension() != null) {
            _hashCode += getBusinessExtension().hashCode();
        }
        if (getBusinessPhone() != null) {
            _hashCode += getBusinessPhone().hashCode();
        }
        if (getInBusinessSince() != null) {
            _hashCode += getInBusinessSince().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getAccountRepCode() != null) {
            _hashCode += getAccountRepCode().hashCode();
        }
        if (getDateCustomerAdded() != null) {
            _hashCode += getDateCustomerAdded().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getDoingBusinessAs() != null) {
            _hashCode += getDoingBusinessAs().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDUNSNumber() != null) {
            _hashCode += getDUNSNumber().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFaxAreaCode() != null) {
            _hashCode += getFaxAreaCode().hashCode();
        }
        if (getFaxExtension() != null) {
            _hashCode += getFaxExtension().hashCode();
        }
        if (getFaxPhone() != null) {
            _hashCode += getFaxPhone().hashCode();
        }
        if (getFederalTaxIdNumber() != null) {
            _hashCode += getFederalTaxIdNumber().hashCode();
        }
        if (getFirmName() != null) {
            _hashCode += getFirmName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFormalSalutation() != null) {
            _hashCode += getFormalSalutation().hashCode();
        }
        if (getGLBranchCode() != null) {
            _hashCode += getGLBranchCode().hashCode();
        }
        if (getGLDepartmentCode() != null) {
            _hashCode += getGLDepartmentCode().hashCode();
        }
        if (getGLDivisionCode() != null) {
            _hashCode += getGLDivisionCode().hashCode();
        }
        if (getGLGroupCode() != null) {
            _hashCode += getGLGroupCode().hashCode();
        }
        if (getInformalSalutation() != null) {
            _hashCode += getInformalSalutation().hashCode();
        }
        if (getIsBenefits() != null) {
            _hashCode += getIsBenefits().hashCode();
        }
        if (getIsBrokersCustomer() != null) {
            _hashCode += getIsBrokersCustomer().hashCode();
        }
        if (getIsCommercial() != null) {
            _hashCode += getIsCommercial().hashCode();
        }
        if (getIsFinancial() != null) {
            _hashCode += getIsFinancial().hashCode();
        }
        if (getIsHealth() != null) {
            _hashCode += getIsHealth().hashCode();
        }
        if (getIsLife() != null) {
            _hashCode += getIsLife().hashCode();
        }
        if (getIsNonPropertyAndCasualty() != null) {
            _hashCode += getIsNonPropertyAndCasualty().hashCode();
        }
        if (getIsPersonal() != null) {
            _hashCode += getIsPersonal().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getCellAreaCode() != null) {
            _hashCode += getCellAreaCode().hashCode();
        }
        if (getCellExtension() != null) {
            _hashCode += getCellExtension().hashCode();
        }
        if (getCellPhone() != null) {
            _hashCode += getCellPhone().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOccupation() != null) {
            _hashCode += getOccupation().hashCode();
        }
        if (getPagerAreaCode() != null) {
            _hashCode += getPagerAreaCode().hashCode();
        }
        if (getPagerExtension() != null) {
            _hashCode += getPagerExtension().hashCode();
        }
        if (getPagerPhone() != null) {
            _hashCode += getPagerPhone().hashCode();
        }
        if (getAccountExecCode() != null) {
            _hashCode += getAccountExecCode().hashCode();
        }
        if (getHomeAreaCode() != null) {
            _hashCode += getHomeAreaCode().hashCode();
        }
        if (getHomeExtension() != null) {
            _hashCode += getHomeExtension().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getNAICSCode() != null) {
            _hashCode += getNAICSCode().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCustomerType() != null) {
            _hashCode += getCustomerType().hashCode();
        }
        if (getBusinessEntityType() != null) {
            _hashCode += getBusinessEntityType().hashCode();
        }
        if (getWebAddress() != null) {
            _hashCode += getWebAddress().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getIsSecured() != null) {
            _hashCode += getIsSecured().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNotationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNotationId"));
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
        elemField.setFieldName("businessAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inBusinessSince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InBusinessSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "County"));
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
        elemField.setFieldName("dateCustomerAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DateCustomerAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doingBusinessAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DoingBusinessAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNSNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DUNSNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FaxAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FaxExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FaxPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federalTaxIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FederalTaxIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FirmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formalSalutation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FormalSalutation"));
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
        elemField.setFieldName("GLDepartmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentCode"));
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
        elemField.setFieldName("GLGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informalSalutation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InformalSalutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBenefits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsBenefits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBrokersCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsBrokersCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsCommercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFinancial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsFinancial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHealth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsHealth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLife");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsLife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonPropertyAndCasualty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsNonPropertyAndCasualty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPersonal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsPersonal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CellAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CellExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Occupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PagerAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PagerExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PagerPhone"));
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
        elemField.setFieldName("homeAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "HomeAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "HomeExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAICSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NAICSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessEntityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessEntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WebAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSecured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsSecured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
