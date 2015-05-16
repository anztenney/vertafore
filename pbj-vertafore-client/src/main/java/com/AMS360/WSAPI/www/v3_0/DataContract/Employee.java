/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class Employee  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String addressLine2;

    private java.lang.String businessAreaCode;

    private java.lang.String businessExtension;

    private java.lang.String businessPhone;

    private java.lang.String city;

    private java.lang.String emergencyContactAreaCode;

    private java.lang.String emergencyContactExtension;

    private java.lang.String emergencyContactPhone;

    private java.util.Calendar dateOfBirth;

    private java.lang.String doc360HotFolderLocation;

    private java.lang.String email;

    private java.lang.String emergencyContactName;

    private java.lang.String employeeCode;

    private java.lang.String employeeSupervisorCode;

    private java.lang.String faxAreaCode;

    private java.lang.String faxExtension;

    private java.lang.String faxPhone;

    private java.lang.String firstName;

    private java.lang.String fullTimeOrPartTime;

    private java.lang.String homeAreaCode;

    private java.lang.String homeExtension;

    private java.lang.String homePhone;

    private java.lang.Boolean licensedAgent;

    private java.lang.Boolean allowMemoCommissions;

    private java.lang.Boolean executive;

    private java.lang.Boolean representative;

    private java.lang.Boolean salesCenterRepresentative;

    private java.lang.String lastName;

    private java.lang.Boolean logDownloadSuspense;

    private java.lang.String middleName;

    private java.lang.String cellAreaCode;

    private java.lang.String cellExtension;

    private java.lang.String cellPhone;

    private java.lang.Long nationalProducerCode;

    private java.lang.String pagerAreaCode;

    private java.lang.String pagerExtension;

    private java.lang.String pagerPhone;

    private java.lang.Short employee1099Category;

    private java.lang.Short employee1099Type;

    private java.lang.String shortName;

    private java.lang.String state;

    private java.lang.String employeeStatus;

    private java.lang.String employeeTitle;

    private java.lang.Short timeZone;

    private java.lang.String yearEmployed;

    private java.lang.String zipCode;

    public Employee() {
    }

    public Employee(
           java.lang.String address,
           java.lang.String addressLine2,
           java.lang.String businessAreaCode,
           java.lang.String businessExtension,
           java.lang.String businessPhone,
           java.lang.String city,
           java.lang.String emergencyContactAreaCode,
           java.lang.String emergencyContactExtension,
           java.lang.String emergencyContactPhone,
           java.util.Calendar dateOfBirth,
           java.lang.String doc360HotFolderLocation,
           java.lang.String email,
           java.lang.String emergencyContactName,
           java.lang.String employeeCode,
           java.lang.String employeeSupervisorCode,
           java.lang.String faxAreaCode,
           java.lang.String faxExtension,
           java.lang.String faxPhone,
           java.lang.String firstName,
           java.lang.String fullTimeOrPartTime,
           java.lang.String homeAreaCode,
           java.lang.String homeExtension,
           java.lang.String homePhone,
           java.lang.Boolean licensedAgent,
           java.lang.Boolean allowMemoCommissions,
           java.lang.Boolean executive,
           java.lang.Boolean representative,
           java.lang.Boolean salesCenterRepresentative,
           java.lang.String lastName,
           java.lang.Boolean logDownloadSuspense,
           java.lang.String middleName,
           java.lang.String cellAreaCode,
           java.lang.String cellExtension,
           java.lang.String cellPhone,
           java.lang.Long nationalProducerCode,
           java.lang.String pagerAreaCode,
           java.lang.String pagerExtension,
           java.lang.String pagerPhone,
           java.lang.Short employee1099Category,
           java.lang.Short employee1099Type,
           java.lang.String shortName,
           java.lang.String state,
           java.lang.String employeeStatus,
           java.lang.String employeeTitle,
           java.lang.Short timeZone,
           java.lang.String yearEmployed,
           java.lang.String zipCode) {
           this.address = address;
           this.addressLine2 = addressLine2;
           this.businessAreaCode = businessAreaCode;
           this.businessExtension = businessExtension;
           this.businessPhone = businessPhone;
           this.city = city;
           this.emergencyContactAreaCode = emergencyContactAreaCode;
           this.emergencyContactExtension = emergencyContactExtension;
           this.emergencyContactPhone = emergencyContactPhone;
           this.dateOfBirth = dateOfBirth;
           this.doc360HotFolderLocation = doc360HotFolderLocation;
           this.email = email;
           this.emergencyContactName = emergencyContactName;
           this.employeeCode = employeeCode;
           this.employeeSupervisorCode = employeeSupervisorCode;
           this.faxAreaCode = faxAreaCode;
           this.faxExtension = faxExtension;
           this.faxPhone = faxPhone;
           this.firstName = firstName;
           this.fullTimeOrPartTime = fullTimeOrPartTime;
           this.homeAreaCode = homeAreaCode;
           this.homeExtension = homeExtension;
           this.homePhone = homePhone;
           this.licensedAgent = licensedAgent;
           this.allowMemoCommissions = allowMemoCommissions;
           this.executive = executive;
           this.representative = representative;
           this.salesCenterRepresentative = salesCenterRepresentative;
           this.lastName = lastName;
           this.logDownloadSuspense = logDownloadSuspense;
           this.middleName = middleName;
           this.cellAreaCode = cellAreaCode;
           this.cellExtension = cellExtension;
           this.cellPhone = cellPhone;
           this.nationalProducerCode = nationalProducerCode;
           this.pagerAreaCode = pagerAreaCode;
           this.pagerExtension = pagerExtension;
           this.pagerPhone = pagerPhone;
           this.employee1099Category = employee1099Category;
           this.employee1099Type = employee1099Type;
           this.shortName = shortName;
           this.state = state;
           this.employeeStatus = employeeStatus;
           this.employeeTitle = employeeTitle;
           this.timeZone = timeZone;
           this.yearEmployed = yearEmployed;
           this.zipCode = zipCode;
    }


    /**
     * Gets the address value for this Employee.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Employee.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the addressLine2 value for this Employee.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this Employee.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the businessAreaCode value for this Employee.
     * 
     * @return businessAreaCode
     */
    public java.lang.String getBusinessAreaCode() {
        return businessAreaCode;
    }


    /**
     * Sets the businessAreaCode value for this Employee.
     * 
     * @param businessAreaCode
     */
    public void setBusinessAreaCode(java.lang.String businessAreaCode) {
        this.businessAreaCode = businessAreaCode;
    }


    /**
     * Gets the businessExtension value for this Employee.
     * 
     * @return businessExtension
     */
    public java.lang.String getBusinessExtension() {
        return businessExtension;
    }


    /**
     * Sets the businessExtension value for this Employee.
     * 
     * @param businessExtension
     */
    public void setBusinessExtension(java.lang.String businessExtension) {
        this.businessExtension = businessExtension;
    }


    /**
     * Gets the businessPhone value for this Employee.
     * 
     * @return businessPhone
     */
    public java.lang.String getBusinessPhone() {
        return businessPhone;
    }


    /**
     * Sets the businessPhone value for this Employee.
     * 
     * @param businessPhone
     */
    public void setBusinessPhone(java.lang.String businessPhone) {
        this.businessPhone = businessPhone;
    }


    /**
     * Gets the city value for this Employee.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Employee.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the emergencyContactAreaCode value for this Employee.
     * 
     * @return emergencyContactAreaCode
     */
    public java.lang.String getEmergencyContactAreaCode() {
        return emergencyContactAreaCode;
    }


    /**
     * Sets the emergencyContactAreaCode value for this Employee.
     * 
     * @param emergencyContactAreaCode
     */
    public void setEmergencyContactAreaCode(java.lang.String emergencyContactAreaCode) {
        this.emergencyContactAreaCode = emergencyContactAreaCode;
    }


    /**
     * Gets the emergencyContactExtension value for this Employee.
     * 
     * @return emergencyContactExtension
     */
    public java.lang.String getEmergencyContactExtension() {
        return emergencyContactExtension;
    }


    /**
     * Sets the emergencyContactExtension value for this Employee.
     * 
     * @param emergencyContactExtension
     */
    public void setEmergencyContactExtension(java.lang.String emergencyContactExtension) {
        this.emergencyContactExtension = emergencyContactExtension;
    }


    /**
     * Gets the emergencyContactPhone value for this Employee.
     * 
     * @return emergencyContactPhone
     */
    public java.lang.String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }


    /**
     * Sets the emergencyContactPhone value for this Employee.
     * 
     * @param emergencyContactPhone
     */
    public void setEmergencyContactPhone(java.lang.String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }


    /**
     * Gets the dateOfBirth value for this Employee.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this Employee.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the doc360HotFolderLocation value for this Employee.
     * 
     * @return doc360HotFolderLocation
     */
    public java.lang.String getDoc360HotFolderLocation() {
        return doc360HotFolderLocation;
    }


    /**
     * Sets the doc360HotFolderLocation value for this Employee.
     * 
     * @param doc360HotFolderLocation
     */
    public void setDoc360HotFolderLocation(java.lang.String doc360HotFolderLocation) {
        this.doc360HotFolderLocation = doc360HotFolderLocation;
    }


    /**
     * Gets the email value for this Employee.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Employee.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emergencyContactName value for this Employee.
     * 
     * @return emergencyContactName
     */
    public java.lang.String getEmergencyContactName() {
        return emergencyContactName;
    }


    /**
     * Sets the emergencyContactName value for this Employee.
     * 
     * @param emergencyContactName
     */
    public void setEmergencyContactName(java.lang.String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }


    /**
     * Gets the employeeCode value for this Employee.
     * 
     * @return employeeCode
     */
    public java.lang.String getEmployeeCode() {
        return employeeCode;
    }


    /**
     * Sets the employeeCode value for this Employee.
     * 
     * @param employeeCode
     */
    public void setEmployeeCode(java.lang.String employeeCode) {
        this.employeeCode = employeeCode;
    }


    /**
     * Gets the employeeSupervisorCode value for this Employee.
     * 
     * @return employeeSupervisorCode
     */
    public java.lang.String getEmployeeSupervisorCode() {
        return employeeSupervisorCode;
    }


    /**
     * Sets the employeeSupervisorCode value for this Employee.
     * 
     * @param employeeSupervisorCode
     */
    public void setEmployeeSupervisorCode(java.lang.String employeeSupervisorCode) {
        this.employeeSupervisorCode = employeeSupervisorCode;
    }


    /**
     * Gets the faxAreaCode value for this Employee.
     * 
     * @return faxAreaCode
     */
    public java.lang.String getFaxAreaCode() {
        return faxAreaCode;
    }


    /**
     * Sets the faxAreaCode value for this Employee.
     * 
     * @param faxAreaCode
     */
    public void setFaxAreaCode(java.lang.String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }


    /**
     * Gets the faxExtension value for this Employee.
     * 
     * @return faxExtension
     */
    public java.lang.String getFaxExtension() {
        return faxExtension;
    }


    /**
     * Sets the faxExtension value for this Employee.
     * 
     * @param faxExtension
     */
    public void setFaxExtension(java.lang.String faxExtension) {
        this.faxExtension = faxExtension;
    }


    /**
     * Gets the faxPhone value for this Employee.
     * 
     * @return faxPhone
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this Employee.
     * 
     * @param faxPhone
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the firstName value for this Employee.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Employee.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fullTimeOrPartTime value for this Employee.
     * 
     * @return fullTimeOrPartTime
     */
    public java.lang.String getFullTimeOrPartTime() {
        return fullTimeOrPartTime;
    }


    /**
     * Sets the fullTimeOrPartTime value for this Employee.
     * 
     * @param fullTimeOrPartTime
     */
    public void setFullTimeOrPartTime(java.lang.String fullTimeOrPartTime) {
        this.fullTimeOrPartTime = fullTimeOrPartTime;
    }


    /**
     * Gets the homeAreaCode value for this Employee.
     * 
     * @return homeAreaCode
     */
    public java.lang.String getHomeAreaCode() {
        return homeAreaCode;
    }


    /**
     * Sets the homeAreaCode value for this Employee.
     * 
     * @param homeAreaCode
     */
    public void setHomeAreaCode(java.lang.String homeAreaCode) {
        this.homeAreaCode = homeAreaCode;
    }


    /**
     * Gets the homeExtension value for this Employee.
     * 
     * @return homeExtension
     */
    public java.lang.String getHomeExtension() {
        return homeExtension;
    }


    /**
     * Sets the homeExtension value for this Employee.
     * 
     * @param homeExtension
     */
    public void setHomeExtension(java.lang.String homeExtension) {
        this.homeExtension = homeExtension;
    }


    /**
     * Gets the homePhone value for this Employee.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Employee.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the licensedAgent value for this Employee.
     * 
     * @return licensedAgent
     */
    public java.lang.Boolean getLicensedAgent() {
        return licensedAgent;
    }


    /**
     * Sets the licensedAgent value for this Employee.
     * 
     * @param licensedAgent
     */
    public void setLicensedAgent(java.lang.Boolean licensedAgent) {
        this.licensedAgent = licensedAgent;
    }


    /**
     * Gets the allowMemoCommissions value for this Employee.
     * 
     * @return allowMemoCommissions
     */
    public java.lang.Boolean getAllowMemoCommissions() {
        return allowMemoCommissions;
    }


    /**
     * Sets the allowMemoCommissions value for this Employee.
     * 
     * @param allowMemoCommissions
     */
    public void setAllowMemoCommissions(java.lang.Boolean allowMemoCommissions) {
        this.allowMemoCommissions = allowMemoCommissions;
    }


    /**
     * Gets the executive value for this Employee.
     * 
     * @return executive
     */
    public java.lang.Boolean getExecutive() {
        return executive;
    }


    /**
     * Sets the executive value for this Employee.
     * 
     * @param executive
     */
    public void setExecutive(java.lang.Boolean executive) {
        this.executive = executive;
    }


    /**
     * Gets the representative value for this Employee.
     * 
     * @return representative
     */
    public java.lang.Boolean getRepresentative() {
        return representative;
    }


    /**
     * Sets the representative value for this Employee.
     * 
     * @param representative
     */
    public void setRepresentative(java.lang.Boolean representative) {
        this.representative = representative;
    }


    /**
     * Gets the salesCenterRepresentative value for this Employee.
     * 
     * @return salesCenterRepresentative
     */
    public java.lang.Boolean getSalesCenterRepresentative() {
        return salesCenterRepresentative;
    }


    /**
     * Sets the salesCenterRepresentative value for this Employee.
     * 
     * @param salesCenterRepresentative
     */
    public void setSalesCenterRepresentative(java.lang.Boolean salesCenterRepresentative) {
        this.salesCenterRepresentative = salesCenterRepresentative;
    }


    /**
     * Gets the lastName value for this Employee.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Employee.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the logDownloadSuspense value for this Employee.
     * 
     * @return logDownloadSuspense
     */
    public java.lang.Boolean getLogDownloadSuspense() {
        return logDownloadSuspense;
    }


    /**
     * Sets the logDownloadSuspense value for this Employee.
     * 
     * @param logDownloadSuspense
     */
    public void setLogDownloadSuspense(java.lang.Boolean logDownloadSuspense) {
        this.logDownloadSuspense = logDownloadSuspense;
    }


    /**
     * Gets the middleName value for this Employee.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this Employee.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the cellAreaCode value for this Employee.
     * 
     * @return cellAreaCode
     */
    public java.lang.String getCellAreaCode() {
        return cellAreaCode;
    }


    /**
     * Sets the cellAreaCode value for this Employee.
     * 
     * @param cellAreaCode
     */
    public void setCellAreaCode(java.lang.String cellAreaCode) {
        this.cellAreaCode = cellAreaCode;
    }


    /**
     * Gets the cellExtension value for this Employee.
     * 
     * @return cellExtension
     */
    public java.lang.String getCellExtension() {
        return cellExtension;
    }


    /**
     * Sets the cellExtension value for this Employee.
     * 
     * @param cellExtension
     */
    public void setCellExtension(java.lang.String cellExtension) {
        this.cellExtension = cellExtension;
    }


    /**
     * Gets the cellPhone value for this Employee.
     * 
     * @return cellPhone
     */
    public java.lang.String getCellPhone() {
        return cellPhone;
    }


    /**
     * Sets the cellPhone value for this Employee.
     * 
     * @param cellPhone
     */
    public void setCellPhone(java.lang.String cellPhone) {
        this.cellPhone = cellPhone;
    }


    /**
     * Gets the nationalProducerCode value for this Employee.
     * 
     * @return nationalProducerCode
     */
    public java.lang.Long getNationalProducerCode() {
        return nationalProducerCode;
    }


    /**
     * Sets the nationalProducerCode value for this Employee.
     * 
     * @param nationalProducerCode
     */
    public void setNationalProducerCode(java.lang.Long nationalProducerCode) {
        this.nationalProducerCode = nationalProducerCode;
    }


    /**
     * Gets the pagerAreaCode value for this Employee.
     * 
     * @return pagerAreaCode
     */
    public java.lang.String getPagerAreaCode() {
        return pagerAreaCode;
    }


    /**
     * Sets the pagerAreaCode value for this Employee.
     * 
     * @param pagerAreaCode
     */
    public void setPagerAreaCode(java.lang.String pagerAreaCode) {
        this.pagerAreaCode = pagerAreaCode;
    }


    /**
     * Gets the pagerExtension value for this Employee.
     * 
     * @return pagerExtension
     */
    public java.lang.String getPagerExtension() {
        return pagerExtension;
    }


    /**
     * Sets the pagerExtension value for this Employee.
     * 
     * @param pagerExtension
     */
    public void setPagerExtension(java.lang.String pagerExtension) {
        this.pagerExtension = pagerExtension;
    }


    /**
     * Gets the pagerPhone value for this Employee.
     * 
     * @return pagerPhone
     */
    public java.lang.String getPagerPhone() {
        return pagerPhone;
    }


    /**
     * Sets the pagerPhone value for this Employee.
     * 
     * @param pagerPhone
     */
    public void setPagerPhone(java.lang.String pagerPhone) {
        this.pagerPhone = pagerPhone;
    }


    /**
     * Gets the employee1099Category value for this Employee.
     * 
     * @return employee1099Category
     */
    public java.lang.Short getEmployee1099Category() {
        return employee1099Category;
    }


    /**
     * Sets the employee1099Category value for this Employee.
     * 
     * @param employee1099Category
     */
    public void setEmployee1099Category(java.lang.Short employee1099Category) {
        this.employee1099Category = employee1099Category;
    }


    /**
     * Gets the employee1099Type value for this Employee.
     * 
     * @return employee1099Type
     */
    public java.lang.Short getEmployee1099Type() {
        return employee1099Type;
    }


    /**
     * Sets the employee1099Type value for this Employee.
     * 
     * @param employee1099Type
     */
    public void setEmployee1099Type(java.lang.Short employee1099Type) {
        this.employee1099Type = employee1099Type;
    }


    /**
     * Gets the shortName value for this Employee.
     * 
     * @return shortName
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this Employee.
     * 
     * @param shortName
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the state value for this Employee.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Employee.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the employeeStatus value for this Employee.
     * 
     * @return employeeStatus
     */
    public java.lang.String getEmployeeStatus() {
        return employeeStatus;
    }


    /**
     * Sets the employeeStatus value for this Employee.
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(java.lang.String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }


    /**
     * Gets the employeeTitle value for this Employee.
     * 
     * @return employeeTitle
     */
    public java.lang.String getEmployeeTitle() {
        return employeeTitle;
    }


    /**
     * Sets the employeeTitle value for this Employee.
     * 
     * @param employeeTitle
     */
    public void setEmployeeTitle(java.lang.String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }


    /**
     * Gets the timeZone value for this Employee.
     * 
     * @return timeZone
     */
    public java.lang.Short getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this Employee.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.Short timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the yearEmployed value for this Employee.
     * 
     * @return yearEmployed
     */
    public java.lang.String getYearEmployed() {
        return yearEmployed;
    }


    /**
     * Sets the yearEmployed value for this Employee.
     * 
     * @param yearEmployed
     */
    public void setYearEmployed(java.lang.String yearEmployed) {
        this.yearEmployed = yearEmployed;
    }


    /**
     * Gets the zipCode value for this Employee.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Employee.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.businessAreaCode==null && other.getBusinessAreaCode()==null) || 
             (this.businessAreaCode!=null &&
              this.businessAreaCode.equals(other.getBusinessAreaCode()))) &&
            ((this.businessExtension==null && other.getBusinessExtension()==null) || 
             (this.businessExtension!=null &&
              this.businessExtension.equals(other.getBusinessExtension()))) &&
            ((this.businessPhone==null && other.getBusinessPhone()==null) || 
             (this.businessPhone!=null &&
              this.businessPhone.equals(other.getBusinessPhone()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.emergencyContactAreaCode==null && other.getEmergencyContactAreaCode()==null) || 
             (this.emergencyContactAreaCode!=null &&
              this.emergencyContactAreaCode.equals(other.getEmergencyContactAreaCode()))) &&
            ((this.emergencyContactExtension==null && other.getEmergencyContactExtension()==null) || 
             (this.emergencyContactExtension!=null &&
              this.emergencyContactExtension.equals(other.getEmergencyContactExtension()))) &&
            ((this.emergencyContactPhone==null && other.getEmergencyContactPhone()==null) || 
             (this.emergencyContactPhone!=null &&
              this.emergencyContactPhone.equals(other.getEmergencyContactPhone()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.doc360HotFolderLocation==null && other.getDoc360HotFolderLocation()==null) || 
             (this.doc360HotFolderLocation!=null &&
              this.doc360HotFolderLocation.equals(other.getDoc360HotFolderLocation()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emergencyContactName==null && other.getEmergencyContactName()==null) || 
             (this.emergencyContactName!=null &&
              this.emergencyContactName.equals(other.getEmergencyContactName()))) &&
            ((this.employeeCode==null && other.getEmployeeCode()==null) || 
             (this.employeeCode!=null &&
              this.employeeCode.equals(other.getEmployeeCode()))) &&
            ((this.employeeSupervisorCode==null && other.getEmployeeSupervisorCode()==null) || 
             (this.employeeSupervisorCode!=null &&
              this.employeeSupervisorCode.equals(other.getEmployeeSupervisorCode()))) &&
            ((this.faxAreaCode==null && other.getFaxAreaCode()==null) || 
             (this.faxAreaCode!=null &&
              this.faxAreaCode.equals(other.getFaxAreaCode()))) &&
            ((this.faxExtension==null && other.getFaxExtension()==null) || 
             (this.faxExtension!=null &&
              this.faxExtension.equals(other.getFaxExtension()))) &&
            ((this.faxPhone==null && other.getFaxPhone()==null) || 
             (this.faxPhone!=null &&
              this.faxPhone.equals(other.getFaxPhone()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fullTimeOrPartTime==null && other.getFullTimeOrPartTime()==null) || 
             (this.fullTimeOrPartTime!=null &&
              this.fullTimeOrPartTime.equals(other.getFullTimeOrPartTime()))) &&
            ((this.homeAreaCode==null && other.getHomeAreaCode()==null) || 
             (this.homeAreaCode!=null &&
              this.homeAreaCode.equals(other.getHomeAreaCode()))) &&
            ((this.homeExtension==null && other.getHomeExtension()==null) || 
             (this.homeExtension!=null &&
              this.homeExtension.equals(other.getHomeExtension()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.licensedAgent==null && other.getLicensedAgent()==null) || 
             (this.licensedAgent!=null &&
              this.licensedAgent.equals(other.getLicensedAgent()))) &&
            ((this.allowMemoCommissions==null && other.getAllowMemoCommissions()==null) || 
             (this.allowMemoCommissions!=null &&
              this.allowMemoCommissions.equals(other.getAllowMemoCommissions()))) &&
            ((this.executive==null && other.getExecutive()==null) || 
             (this.executive!=null &&
              this.executive.equals(other.getExecutive()))) &&
            ((this.representative==null && other.getRepresentative()==null) || 
             (this.representative!=null &&
              this.representative.equals(other.getRepresentative()))) &&
            ((this.salesCenterRepresentative==null && other.getSalesCenterRepresentative()==null) || 
             (this.salesCenterRepresentative!=null &&
              this.salesCenterRepresentative.equals(other.getSalesCenterRepresentative()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.logDownloadSuspense==null && other.getLogDownloadSuspense()==null) || 
             (this.logDownloadSuspense!=null &&
              this.logDownloadSuspense.equals(other.getLogDownloadSuspense()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.cellAreaCode==null && other.getCellAreaCode()==null) || 
             (this.cellAreaCode!=null &&
              this.cellAreaCode.equals(other.getCellAreaCode()))) &&
            ((this.cellExtension==null && other.getCellExtension()==null) || 
             (this.cellExtension!=null &&
              this.cellExtension.equals(other.getCellExtension()))) &&
            ((this.cellPhone==null && other.getCellPhone()==null) || 
             (this.cellPhone!=null &&
              this.cellPhone.equals(other.getCellPhone()))) &&
            ((this.nationalProducerCode==null && other.getNationalProducerCode()==null) || 
             (this.nationalProducerCode!=null &&
              this.nationalProducerCode.equals(other.getNationalProducerCode()))) &&
            ((this.pagerAreaCode==null && other.getPagerAreaCode()==null) || 
             (this.pagerAreaCode!=null &&
              this.pagerAreaCode.equals(other.getPagerAreaCode()))) &&
            ((this.pagerExtension==null && other.getPagerExtension()==null) || 
             (this.pagerExtension!=null &&
              this.pagerExtension.equals(other.getPagerExtension()))) &&
            ((this.pagerPhone==null && other.getPagerPhone()==null) || 
             (this.pagerPhone!=null &&
              this.pagerPhone.equals(other.getPagerPhone()))) &&
            ((this.employee1099Category==null && other.getEmployee1099Category()==null) || 
             (this.employee1099Category!=null &&
              this.employee1099Category.equals(other.getEmployee1099Category()))) &&
            ((this.employee1099Type==null && other.getEmployee1099Type()==null) || 
             (this.employee1099Type!=null &&
              this.employee1099Type.equals(other.getEmployee1099Type()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.employeeStatus==null && other.getEmployeeStatus()==null) || 
             (this.employeeStatus!=null &&
              this.employeeStatus.equals(other.getEmployeeStatus()))) &&
            ((this.employeeTitle==null && other.getEmployeeTitle()==null) || 
             (this.employeeTitle!=null &&
              this.employeeTitle.equals(other.getEmployeeTitle()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.yearEmployed==null && other.getYearEmployed()==null) || 
             (this.yearEmployed!=null &&
              this.yearEmployed.equals(other.getYearEmployed()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getEmergencyContactAreaCode() != null) {
            _hashCode += getEmergencyContactAreaCode().hashCode();
        }
        if (getEmergencyContactExtension() != null) {
            _hashCode += getEmergencyContactExtension().hashCode();
        }
        if (getEmergencyContactPhone() != null) {
            _hashCode += getEmergencyContactPhone().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDoc360HotFolderLocation() != null) {
            _hashCode += getDoc360HotFolderLocation().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmergencyContactName() != null) {
            _hashCode += getEmergencyContactName().hashCode();
        }
        if (getEmployeeCode() != null) {
            _hashCode += getEmployeeCode().hashCode();
        }
        if (getEmployeeSupervisorCode() != null) {
            _hashCode += getEmployeeSupervisorCode().hashCode();
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFullTimeOrPartTime() != null) {
            _hashCode += getFullTimeOrPartTime().hashCode();
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
        if (getLicensedAgent() != null) {
            _hashCode += getLicensedAgent().hashCode();
        }
        if (getAllowMemoCommissions() != null) {
            _hashCode += getAllowMemoCommissions().hashCode();
        }
        if (getExecutive() != null) {
            _hashCode += getExecutive().hashCode();
        }
        if (getRepresentative() != null) {
            _hashCode += getRepresentative().hashCode();
        }
        if (getSalesCenterRepresentative() != null) {
            _hashCode += getSalesCenterRepresentative().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLogDownloadSuspense() != null) {
            _hashCode += getLogDownloadSuspense().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
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
        if (getNationalProducerCode() != null) {
            _hashCode += getNationalProducerCode().hashCode();
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
        if (getEmployee1099Category() != null) {
            _hashCode += getEmployee1099Category().hashCode();
        }
        if (getEmployee1099Type() != null) {
            _hashCode += getEmployee1099Type().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getEmployeeStatus() != null) {
            _hashCode += getEmployeeStatus().hashCode();
        }
        if (getEmployeeTitle() != null) {
            _hashCode += getEmployeeTitle().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getYearEmployed() != null) {
            _hashCode += getYearEmployed().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Address"));
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
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmergencyContactAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmergencyContactExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmergencyContactPhone"));
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
        elemField.setFieldName("doc360HotFolderLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360HotFolderLocation"));
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
        elemField.setFieldName("emergencyContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmergencyContactName"));
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
        elemField.setFieldName("employeeSupervisorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeSupervisorCode"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTimeOrPartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FullTimeOrPartTime"));
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
        elemField.setFieldName("licensedAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LicensedAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMemoCommissions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AllowMemoCommissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Executive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Representative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesCenterRepresentative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SalesCenterRepresentative"));
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
        elemField.setFieldName("logDownloadSuspense");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LogDownloadSuspense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MiddleName"));
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
        elemField.setFieldName("nationalProducerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NationalProducerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("employee1099Category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Employee1099Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee1099Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Employee1099Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ShortName"));
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
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearEmployed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "YearEmployed"));
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
