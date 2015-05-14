/**
 * CustomerContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerContact  implements java.io.Serializable {
    private java.lang.String customerId;

    private java.lang.String customerContactId;

    private java.lang.String contactName;

    private java.lang.String title;

    private java.lang.Boolean isOfficer;

    private java.lang.Boolean isDirector;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private java.lang.String county;

    private java.lang.String residenceAreaCode;

    private java.lang.String residencePhone;

    private java.lang.String residenceExt;

    private java.lang.String businessAreaCode;

    private java.lang.String businessPhone;

    private java.lang.String businessExt;

    private java.lang.String faxAreaCode;

    private java.lang.String faxPhone;

    private java.lang.String faxExt;

    private java.lang.String mobileAreaCode;

    private java.lang.String mobilePhone;

    private java.lang.String mobileExt;

    private java.lang.String pagerAreaCode;

    private java.lang.String pagerPhone;

    private java.lang.String pagerExt;

    private java.lang.String emailAddress;

    private java.lang.String formalSalutation;

    private java.lang.String informalSalutation;

    private java.lang.Short sortOrder;

    private java.lang.Boolean customerCenterDisplay;

    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility[] customerContactResponsibilityList;

    public CustomerContact() {
    }

    public CustomerContact(
           java.lang.String customerId,
           java.lang.String customerContactId,
           java.lang.String contactName,
           java.lang.String title,
           java.lang.Boolean isOfficer,
           java.lang.Boolean isDirector,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           java.lang.String county,
           java.lang.String residenceAreaCode,
           java.lang.String residencePhone,
           java.lang.String residenceExt,
           java.lang.String businessAreaCode,
           java.lang.String businessPhone,
           java.lang.String businessExt,
           java.lang.String faxAreaCode,
           java.lang.String faxPhone,
           java.lang.String faxExt,
           java.lang.String mobileAreaCode,
           java.lang.String mobilePhone,
           java.lang.String mobileExt,
           java.lang.String pagerAreaCode,
           java.lang.String pagerPhone,
           java.lang.String pagerExt,
           java.lang.String emailAddress,
           java.lang.String formalSalutation,
           java.lang.String informalSalutation,
           java.lang.Short sortOrder,
           java.lang.Boolean customerCenterDisplay,
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility[] customerContactResponsibilityList) {
           this.customerId = customerId;
           this.customerContactId = customerContactId;
           this.contactName = contactName;
           this.title = title;
           this.isOfficer = isOfficer;
           this.isDirector = isDirector;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.county = county;
           this.residenceAreaCode = residenceAreaCode;
           this.residencePhone = residencePhone;
           this.residenceExt = residenceExt;
           this.businessAreaCode = businessAreaCode;
           this.businessPhone = businessPhone;
           this.businessExt = businessExt;
           this.faxAreaCode = faxAreaCode;
           this.faxPhone = faxPhone;
           this.faxExt = faxExt;
           this.mobileAreaCode = mobileAreaCode;
           this.mobilePhone = mobilePhone;
           this.mobileExt = mobileExt;
           this.pagerAreaCode = pagerAreaCode;
           this.pagerPhone = pagerPhone;
           this.pagerExt = pagerExt;
           this.emailAddress = emailAddress;
           this.formalSalutation = formalSalutation;
           this.informalSalutation = informalSalutation;
           this.sortOrder = sortOrder;
           this.customerCenterDisplay = customerCenterDisplay;
           this.customerContactResponsibilityList = customerContactResponsibilityList;
    }


    /**
     * Gets the customerId value for this CustomerContact.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerContact.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerContactId value for this CustomerContact.
     * 
     * @return customerContactId
     */
    public java.lang.String getCustomerContactId() {
        return customerContactId;
    }


    /**
     * Sets the customerContactId value for this CustomerContact.
     * 
     * @param customerContactId
     */
    public void setCustomerContactId(java.lang.String customerContactId) {
        this.customerContactId = customerContactId;
    }


    /**
     * Gets the contactName value for this CustomerContact.
     * 
     * @return contactName
     */
    public java.lang.String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this CustomerContact.
     * 
     * @param contactName
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the title value for this CustomerContact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CustomerContact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the isOfficer value for this CustomerContact.
     * 
     * @return isOfficer
     */
    public java.lang.Boolean getIsOfficer() {
        return isOfficer;
    }


    /**
     * Sets the isOfficer value for this CustomerContact.
     * 
     * @param isOfficer
     */
    public void setIsOfficer(java.lang.Boolean isOfficer) {
        this.isOfficer = isOfficer;
    }


    /**
     * Gets the isDirector value for this CustomerContact.
     * 
     * @return isDirector
     */
    public java.lang.Boolean getIsDirector() {
        return isDirector;
    }


    /**
     * Sets the isDirector value for this CustomerContact.
     * 
     * @param isDirector
     */
    public void setIsDirector(java.lang.Boolean isDirector) {
        this.isDirector = isDirector;
    }


    /**
     * Gets the address1 value for this CustomerContact.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this CustomerContact.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this CustomerContact.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this CustomerContact.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this CustomerContact.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this CustomerContact.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this CustomerContact.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this CustomerContact.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this CustomerContact.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this CustomerContact.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the county value for this CustomerContact.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this CustomerContact.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the residenceAreaCode value for this CustomerContact.
     * 
     * @return residenceAreaCode
     */
    public java.lang.String getResidenceAreaCode() {
        return residenceAreaCode;
    }


    /**
     * Sets the residenceAreaCode value for this CustomerContact.
     * 
     * @param residenceAreaCode
     */
    public void setResidenceAreaCode(java.lang.String residenceAreaCode) {
        this.residenceAreaCode = residenceAreaCode;
    }


    /**
     * Gets the residencePhone value for this CustomerContact.
     * 
     * @return residencePhone
     */
    public java.lang.String getResidencePhone() {
        return residencePhone;
    }


    /**
     * Sets the residencePhone value for this CustomerContact.
     * 
     * @param residencePhone
     */
    public void setResidencePhone(java.lang.String residencePhone) {
        this.residencePhone = residencePhone;
    }


    /**
     * Gets the residenceExt value for this CustomerContact.
     * 
     * @return residenceExt
     */
    public java.lang.String getResidenceExt() {
        return residenceExt;
    }


    /**
     * Sets the residenceExt value for this CustomerContact.
     * 
     * @param residenceExt
     */
    public void setResidenceExt(java.lang.String residenceExt) {
        this.residenceExt = residenceExt;
    }


    /**
     * Gets the businessAreaCode value for this CustomerContact.
     * 
     * @return businessAreaCode
     */
    public java.lang.String getBusinessAreaCode() {
        return businessAreaCode;
    }


    /**
     * Sets the businessAreaCode value for this CustomerContact.
     * 
     * @param businessAreaCode
     */
    public void setBusinessAreaCode(java.lang.String businessAreaCode) {
        this.businessAreaCode = businessAreaCode;
    }


    /**
     * Gets the businessPhone value for this CustomerContact.
     * 
     * @return businessPhone
     */
    public java.lang.String getBusinessPhone() {
        return businessPhone;
    }


    /**
     * Sets the businessPhone value for this CustomerContact.
     * 
     * @param businessPhone
     */
    public void setBusinessPhone(java.lang.String businessPhone) {
        this.businessPhone = businessPhone;
    }


    /**
     * Gets the businessExt value for this CustomerContact.
     * 
     * @return businessExt
     */
    public java.lang.String getBusinessExt() {
        return businessExt;
    }


    /**
     * Sets the businessExt value for this CustomerContact.
     * 
     * @param businessExt
     */
    public void setBusinessExt(java.lang.String businessExt) {
        this.businessExt = businessExt;
    }


    /**
     * Gets the faxAreaCode value for this CustomerContact.
     * 
     * @return faxAreaCode
     */
    public java.lang.String getFaxAreaCode() {
        return faxAreaCode;
    }


    /**
     * Sets the faxAreaCode value for this CustomerContact.
     * 
     * @param faxAreaCode
     */
    public void setFaxAreaCode(java.lang.String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }


    /**
     * Gets the faxPhone value for this CustomerContact.
     * 
     * @return faxPhone
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this CustomerContact.
     * 
     * @param faxPhone
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the faxExt value for this CustomerContact.
     * 
     * @return faxExt
     */
    public java.lang.String getFaxExt() {
        return faxExt;
    }


    /**
     * Sets the faxExt value for this CustomerContact.
     * 
     * @param faxExt
     */
    public void setFaxExt(java.lang.String faxExt) {
        this.faxExt = faxExt;
    }


    /**
     * Gets the mobileAreaCode value for this CustomerContact.
     * 
     * @return mobileAreaCode
     */
    public java.lang.String getMobileAreaCode() {
        return mobileAreaCode;
    }


    /**
     * Sets the mobileAreaCode value for this CustomerContact.
     * 
     * @param mobileAreaCode
     */
    public void setMobileAreaCode(java.lang.String mobileAreaCode) {
        this.mobileAreaCode = mobileAreaCode;
    }


    /**
     * Gets the mobilePhone value for this CustomerContact.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this CustomerContact.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the mobileExt value for this CustomerContact.
     * 
     * @return mobileExt
     */
    public java.lang.String getMobileExt() {
        return mobileExt;
    }


    /**
     * Sets the mobileExt value for this CustomerContact.
     * 
     * @param mobileExt
     */
    public void setMobileExt(java.lang.String mobileExt) {
        this.mobileExt = mobileExt;
    }


    /**
     * Gets the pagerAreaCode value for this CustomerContact.
     * 
     * @return pagerAreaCode
     */
    public java.lang.String getPagerAreaCode() {
        return pagerAreaCode;
    }


    /**
     * Sets the pagerAreaCode value for this CustomerContact.
     * 
     * @param pagerAreaCode
     */
    public void setPagerAreaCode(java.lang.String pagerAreaCode) {
        this.pagerAreaCode = pagerAreaCode;
    }


    /**
     * Gets the pagerPhone value for this CustomerContact.
     * 
     * @return pagerPhone
     */
    public java.lang.String getPagerPhone() {
        return pagerPhone;
    }


    /**
     * Sets the pagerPhone value for this CustomerContact.
     * 
     * @param pagerPhone
     */
    public void setPagerPhone(java.lang.String pagerPhone) {
        this.pagerPhone = pagerPhone;
    }


    /**
     * Gets the pagerExt value for this CustomerContact.
     * 
     * @return pagerExt
     */
    public java.lang.String getPagerExt() {
        return pagerExt;
    }


    /**
     * Sets the pagerExt value for this CustomerContact.
     * 
     * @param pagerExt
     */
    public void setPagerExt(java.lang.String pagerExt) {
        this.pagerExt = pagerExt;
    }


    /**
     * Gets the emailAddress value for this CustomerContact.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this CustomerContact.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the formalSalutation value for this CustomerContact.
     * 
     * @return formalSalutation
     */
    public java.lang.String getFormalSalutation() {
        return formalSalutation;
    }


    /**
     * Sets the formalSalutation value for this CustomerContact.
     * 
     * @param formalSalutation
     */
    public void setFormalSalutation(java.lang.String formalSalutation) {
        this.formalSalutation = formalSalutation;
    }


    /**
     * Gets the informalSalutation value for this CustomerContact.
     * 
     * @return informalSalutation
     */
    public java.lang.String getInformalSalutation() {
        return informalSalutation;
    }


    /**
     * Sets the informalSalutation value for this CustomerContact.
     * 
     * @param informalSalutation
     */
    public void setInformalSalutation(java.lang.String informalSalutation) {
        this.informalSalutation = informalSalutation;
    }


    /**
     * Gets the sortOrder value for this CustomerContact.
     * 
     * @return sortOrder
     */
    public java.lang.Short getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this CustomerContact.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Short sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the customerCenterDisplay value for this CustomerContact.
     * 
     * @return customerCenterDisplay
     */
    public java.lang.Boolean getCustomerCenterDisplay() {
        return customerCenterDisplay;
    }


    /**
     * Sets the customerCenterDisplay value for this CustomerContact.
     * 
     * @param customerCenterDisplay
     */
    public void setCustomerCenterDisplay(java.lang.Boolean customerCenterDisplay) {
        this.customerCenterDisplay = customerCenterDisplay;
    }


    /**
     * Gets the customerContactResponsibilityList value for this CustomerContact.
     * 
     * @return customerContactResponsibilityList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility[] getCustomerContactResponsibilityList() {
        return customerContactResponsibilityList;
    }


    /**
     * Sets the customerContactResponsibilityList value for this CustomerContact.
     * 
     * @param customerContactResponsibilityList
     */
    public void setCustomerContactResponsibilityList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility[] customerContactResponsibilityList) {
        this.customerContactResponsibilityList = customerContactResponsibilityList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerContact)) return false;
        CustomerContact other = (CustomerContact) obj;
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
            ((this.customerContactId==null && other.getCustomerContactId()==null) || 
             (this.customerContactId!=null &&
              this.customerContactId.equals(other.getCustomerContactId()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.isOfficer==null && other.getIsOfficer()==null) || 
             (this.isOfficer!=null &&
              this.isOfficer.equals(other.getIsOfficer()))) &&
            ((this.isDirector==null && other.getIsDirector()==null) || 
             (this.isDirector!=null &&
              this.isDirector.equals(other.getIsDirector()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.residenceAreaCode==null && other.getResidenceAreaCode()==null) || 
             (this.residenceAreaCode!=null &&
              this.residenceAreaCode.equals(other.getResidenceAreaCode()))) &&
            ((this.residencePhone==null && other.getResidencePhone()==null) || 
             (this.residencePhone!=null &&
              this.residencePhone.equals(other.getResidencePhone()))) &&
            ((this.residenceExt==null && other.getResidenceExt()==null) || 
             (this.residenceExt!=null &&
              this.residenceExt.equals(other.getResidenceExt()))) &&
            ((this.businessAreaCode==null && other.getBusinessAreaCode()==null) || 
             (this.businessAreaCode!=null &&
              this.businessAreaCode.equals(other.getBusinessAreaCode()))) &&
            ((this.businessPhone==null && other.getBusinessPhone()==null) || 
             (this.businessPhone!=null &&
              this.businessPhone.equals(other.getBusinessPhone()))) &&
            ((this.businessExt==null && other.getBusinessExt()==null) || 
             (this.businessExt!=null &&
              this.businessExt.equals(other.getBusinessExt()))) &&
            ((this.faxAreaCode==null && other.getFaxAreaCode()==null) || 
             (this.faxAreaCode!=null &&
              this.faxAreaCode.equals(other.getFaxAreaCode()))) &&
            ((this.faxPhone==null && other.getFaxPhone()==null) || 
             (this.faxPhone!=null &&
              this.faxPhone.equals(other.getFaxPhone()))) &&
            ((this.faxExt==null && other.getFaxExt()==null) || 
             (this.faxExt!=null &&
              this.faxExt.equals(other.getFaxExt()))) &&
            ((this.mobileAreaCode==null && other.getMobileAreaCode()==null) || 
             (this.mobileAreaCode!=null &&
              this.mobileAreaCode.equals(other.getMobileAreaCode()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.mobileExt==null && other.getMobileExt()==null) || 
             (this.mobileExt!=null &&
              this.mobileExt.equals(other.getMobileExt()))) &&
            ((this.pagerAreaCode==null && other.getPagerAreaCode()==null) || 
             (this.pagerAreaCode!=null &&
              this.pagerAreaCode.equals(other.getPagerAreaCode()))) &&
            ((this.pagerPhone==null && other.getPagerPhone()==null) || 
             (this.pagerPhone!=null &&
              this.pagerPhone.equals(other.getPagerPhone()))) &&
            ((this.pagerExt==null && other.getPagerExt()==null) || 
             (this.pagerExt!=null &&
              this.pagerExt.equals(other.getPagerExt()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.formalSalutation==null && other.getFormalSalutation()==null) || 
             (this.formalSalutation!=null &&
              this.formalSalutation.equals(other.getFormalSalutation()))) &&
            ((this.informalSalutation==null && other.getInformalSalutation()==null) || 
             (this.informalSalutation!=null &&
              this.informalSalutation.equals(other.getInformalSalutation()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.customerCenterDisplay==null && other.getCustomerCenterDisplay()==null) || 
             (this.customerCenterDisplay!=null &&
              this.customerCenterDisplay.equals(other.getCustomerCenterDisplay()))) &&
            ((this.customerContactResponsibilityList==null && other.getCustomerContactResponsibilityList()==null) || 
             (this.customerContactResponsibilityList!=null &&
              java.util.Arrays.equals(this.customerContactResponsibilityList, other.getCustomerContactResponsibilityList())));
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
        if (getCustomerContactId() != null) {
            _hashCode += getCustomerContactId().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getIsOfficer() != null) {
            _hashCode += getIsOfficer().hashCode();
        }
        if (getIsDirector() != null) {
            _hashCode += getIsDirector().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getResidenceAreaCode() != null) {
            _hashCode += getResidenceAreaCode().hashCode();
        }
        if (getResidencePhone() != null) {
            _hashCode += getResidencePhone().hashCode();
        }
        if (getResidenceExt() != null) {
            _hashCode += getResidenceExt().hashCode();
        }
        if (getBusinessAreaCode() != null) {
            _hashCode += getBusinessAreaCode().hashCode();
        }
        if (getBusinessPhone() != null) {
            _hashCode += getBusinessPhone().hashCode();
        }
        if (getBusinessExt() != null) {
            _hashCode += getBusinessExt().hashCode();
        }
        if (getFaxAreaCode() != null) {
            _hashCode += getFaxAreaCode().hashCode();
        }
        if (getFaxPhone() != null) {
            _hashCode += getFaxPhone().hashCode();
        }
        if (getFaxExt() != null) {
            _hashCode += getFaxExt().hashCode();
        }
        if (getMobileAreaCode() != null) {
            _hashCode += getMobileAreaCode().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getMobileExt() != null) {
            _hashCode += getMobileExt().hashCode();
        }
        if (getPagerAreaCode() != null) {
            _hashCode += getPagerAreaCode().hashCode();
        }
        if (getPagerPhone() != null) {
            _hashCode += getPagerPhone().hashCode();
        }
        if (getPagerExt() != null) {
            _hashCode += getPagerExt().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFormalSalutation() != null) {
            _hashCode += getFormalSalutation().hashCode();
        }
        if (getInformalSalutation() != null) {
            _hashCode += getInformalSalutation().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getCustomerCenterDisplay() != null) {
            _hashCode += getCustomerCenterDisplay().hashCode();
        }
        if (getCustomerContactResponsibilityList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerContactResponsibilityList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerContactResponsibilityList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOfficer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsOfficer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDirector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsDirector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Address2"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Zip"));
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
        elemField.setFieldName("residenceAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ResidenceAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residencePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ResidencePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ResidenceExt"));
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
        elemField.setFieldName("businessPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessExt"));
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
        elemField.setFieldName("faxPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FaxPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FaxExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MobileAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "MobileExt"));
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
        elemField.setFieldName("pagerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PagerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagerExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PagerExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmailAddress"));
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
        elemField.setFieldName("informalSalutation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InformalSalutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCenterDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerCenterDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContactResponsibilityList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibilityList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility"));
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
