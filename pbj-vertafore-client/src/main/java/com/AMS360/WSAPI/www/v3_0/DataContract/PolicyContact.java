/**
 * PolicyContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyContact  implements java.io.Serializable {
    private java.lang.String policyId;

    private java.lang.String lineOfBusinessId;

    private java.lang.String policyContactId;

    private java.util.Calendar effectiveDate;

    private java.lang.String status;

    private java.lang.String attachId;

    private java.lang.Short attachType;

    private java.lang.String name;

    private java.lang.String responsibility;

    private java.lang.String description;

    private java.lang.String areaCode;

    private java.lang.String phone;

    private java.lang.String ext;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zipCode;

    private java.lang.String county;

    private java.lang.String refNo;

    private java.lang.String title;

    private java.lang.String formalSalutation;

    private java.lang.String informalSalutation;

    private java.lang.String residenceAreaCode;

    private java.lang.String residencePhone;

    private java.lang.String residenceExt;

    private java.lang.String faxAreaCode;

    private java.lang.String faxPhone;

    private java.lang.String faxExt;

    private java.lang.String mobileAreaCode;

    private java.lang.String mobilePhone;

    private java.lang.String mobileExt;

    private java.lang.String pagerAreaCode;

    private java.lang.String pagerPhone;

    private java.lang.String pagerExt;

    private java.lang.String EMail;

    public PolicyContact() {
    }

    public PolicyContact(
           java.lang.String policyId,
           java.lang.String lineOfBusinessId,
           java.lang.String policyContactId,
           java.util.Calendar effectiveDate,
           java.lang.String status,
           java.lang.String attachId,
           java.lang.Short attachType,
           java.lang.String name,
           java.lang.String responsibility,
           java.lang.String description,
           java.lang.String areaCode,
           java.lang.String phone,
           java.lang.String ext,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipCode,
           java.lang.String county,
           java.lang.String refNo,
           java.lang.String title,
           java.lang.String formalSalutation,
           java.lang.String informalSalutation,
           java.lang.String residenceAreaCode,
           java.lang.String residencePhone,
           java.lang.String residenceExt,
           java.lang.String faxAreaCode,
           java.lang.String faxPhone,
           java.lang.String faxExt,
           java.lang.String mobileAreaCode,
           java.lang.String mobilePhone,
           java.lang.String mobileExt,
           java.lang.String pagerAreaCode,
           java.lang.String pagerPhone,
           java.lang.String pagerExt,
           java.lang.String EMail) {
           this.policyId = policyId;
           this.lineOfBusinessId = lineOfBusinessId;
           this.policyContactId = policyContactId;
           this.effectiveDate = effectiveDate;
           this.status = status;
           this.attachId = attachId;
           this.attachType = attachType;
           this.name = name;
           this.responsibility = responsibility;
           this.description = description;
           this.areaCode = areaCode;
           this.phone = phone;
           this.ext = ext;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
           this.county = county;
           this.refNo = refNo;
           this.title = title;
           this.formalSalutation = formalSalutation;
           this.informalSalutation = informalSalutation;
           this.residenceAreaCode = residenceAreaCode;
           this.residencePhone = residencePhone;
           this.residenceExt = residenceExt;
           this.faxAreaCode = faxAreaCode;
           this.faxPhone = faxPhone;
           this.faxExt = faxExt;
           this.mobileAreaCode = mobileAreaCode;
           this.mobilePhone = mobilePhone;
           this.mobileExt = mobileExt;
           this.pagerAreaCode = pagerAreaCode;
           this.pagerPhone = pagerPhone;
           this.pagerExt = pagerExt;
           this.EMail = EMail;
    }


    /**
     * Gets the policyId value for this PolicyContact.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyContact.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the lineOfBusinessId value for this PolicyContact.
     * 
     * @return lineOfBusinessId
     */
    public java.lang.String getLineOfBusinessId() {
        return lineOfBusinessId;
    }


    /**
     * Sets the lineOfBusinessId value for this PolicyContact.
     * 
     * @param lineOfBusinessId
     */
    public void setLineOfBusinessId(java.lang.String lineOfBusinessId) {
        this.lineOfBusinessId = lineOfBusinessId;
    }


    /**
     * Gets the policyContactId value for this PolicyContact.
     * 
     * @return policyContactId
     */
    public java.lang.String getPolicyContactId() {
        return policyContactId;
    }


    /**
     * Sets the policyContactId value for this PolicyContact.
     * 
     * @param policyContactId
     */
    public void setPolicyContactId(java.lang.String policyContactId) {
        this.policyContactId = policyContactId;
    }


    /**
     * Gets the effectiveDate value for this PolicyContact.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this PolicyContact.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the status value for this PolicyContact.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PolicyContact.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the attachId value for this PolicyContact.
     * 
     * @return attachId
     */
    public java.lang.String getAttachId() {
        return attachId;
    }


    /**
     * Sets the attachId value for this PolicyContact.
     * 
     * @param attachId
     */
    public void setAttachId(java.lang.String attachId) {
        this.attachId = attachId;
    }


    /**
     * Gets the attachType value for this PolicyContact.
     * 
     * @return attachType
     */
    public java.lang.Short getAttachType() {
        return attachType;
    }


    /**
     * Sets the attachType value for this PolicyContact.
     * 
     * @param attachType
     */
    public void setAttachType(java.lang.Short attachType) {
        this.attachType = attachType;
    }


    /**
     * Gets the name value for this PolicyContact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PolicyContact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the responsibility value for this PolicyContact.
     * 
     * @return responsibility
     */
    public java.lang.String getResponsibility() {
        return responsibility;
    }


    /**
     * Sets the responsibility value for this PolicyContact.
     * 
     * @param responsibility
     */
    public void setResponsibility(java.lang.String responsibility) {
        this.responsibility = responsibility;
    }


    /**
     * Gets the description value for this PolicyContact.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PolicyContact.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the areaCode value for this PolicyContact.
     * 
     * @return areaCode
     */
    public java.lang.String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this PolicyContact.
     * 
     * @param areaCode
     */
    public void setAreaCode(java.lang.String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the phone value for this PolicyContact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PolicyContact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the ext value for this PolicyContact.
     * 
     * @return ext
     */
    public java.lang.String getExt() {
        return ext;
    }


    /**
     * Sets the ext value for this PolicyContact.
     * 
     * @param ext
     */
    public void setExt(java.lang.String ext) {
        this.ext = ext;
    }


    /**
     * Gets the address1 value for this PolicyContact.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this PolicyContact.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this PolicyContact.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this PolicyContact.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this PolicyContact.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PolicyContact.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this PolicyContact.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this PolicyContact.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipCode value for this PolicyContact.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this PolicyContact.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the county value for this PolicyContact.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this PolicyContact.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the refNo value for this PolicyContact.
     * 
     * @return refNo
     */
    public java.lang.String getRefNo() {
        return refNo;
    }


    /**
     * Sets the refNo value for this PolicyContact.
     * 
     * @param refNo
     */
    public void setRefNo(java.lang.String refNo) {
        this.refNo = refNo;
    }


    /**
     * Gets the title value for this PolicyContact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PolicyContact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the formalSalutation value for this PolicyContact.
     * 
     * @return formalSalutation
     */
    public java.lang.String getFormalSalutation() {
        return formalSalutation;
    }


    /**
     * Sets the formalSalutation value for this PolicyContact.
     * 
     * @param formalSalutation
     */
    public void setFormalSalutation(java.lang.String formalSalutation) {
        this.formalSalutation = formalSalutation;
    }


    /**
     * Gets the informalSalutation value for this PolicyContact.
     * 
     * @return informalSalutation
     */
    public java.lang.String getInformalSalutation() {
        return informalSalutation;
    }


    /**
     * Sets the informalSalutation value for this PolicyContact.
     * 
     * @param informalSalutation
     */
    public void setInformalSalutation(java.lang.String informalSalutation) {
        this.informalSalutation = informalSalutation;
    }


    /**
     * Gets the residenceAreaCode value for this PolicyContact.
     * 
     * @return residenceAreaCode
     */
    public java.lang.String getResidenceAreaCode() {
        return residenceAreaCode;
    }


    /**
     * Sets the residenceAreaCode value for this PolicyContact.
     * 
     * @param residenceAreaCode
     */
    public void setResidenceAreaCode(java.lang.String residenceAreaCode) {
        this.residenceAreaCode = residenceAreaCode;
    }


    /**
     * Gets the residencePhone value for this PolicyContact.
     * 
     * @return residencePhone
     */
    public java.lang.String getResidencePhone() {
        return residencePhone;
    }


    /**
     * Sets the residencePhone value for this PolicyContact.
     * 
     * @param residencePhone
     */
    public void setResidencePhone(java.lang.String residencePhone) {
        this.residencePhone = residencePhone;
    }


    /**
     * Gets the residenceExt value for this PolicyContact.
     * 
     * @return residenceExt
     */
    public java.lang.String getResidenceExt() {
        return residenceExt;
    }


    /**
     * Sets the residenceExt value for this PolicyContact.
     * 
     * @param residenceExt
     */
    public void setResidenceExt(java.lang.String residenceExt) {
        this.residenceExt = residenceExt;
    }


    /**
     * Gets the faxAreaCode value for this PolicyContact.
     * 
     * @return faxAreaCode
     */
    public java.lang.String getFaxAreaCode() {
        return faxAreaCode;
    }


    /**
     * Sets the faxAreaCode value for this PolicyContact.
     * 
     * @param faxAreaCode
     */
    public void setFaxAreaCode(java.lang.String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }


    /**
     * Gets the faxPhone value for this PolicyContact.
     * 
     * @return faxPhone
     */
    public java.lang.String getFaxPhone() {
        return faxPhone;
    }


    /**
     * Sets the faxPhone value for this PolicyContact.
     * 
     * @param faxPhone
     */
    public void setFaxPhone(java.lang.String faxPhone) {
        this.faxPhone = faxPhone;
    }


    /**
     * Gets the faxExt value for this PolicyContact.
     * 
     * @return faxExt
     */
    public java.lang.String getFaxExt() {
        return faxExt;
    }


    /**
     * Sets the faxExt value for this PolicyContact.
     * 
     * @param faxExt
     */
    public void setFaxExt(java.lang.String faxExt) {
        this.faxExt = faxExt;
    }


    /**
     * Gets the mobileAreaCode value for this PolicyContact.
     * 
     * @return mobileAreaCode
     */
    public java.lang.String getMobileAreaCode() {
        return mobileAreaCode;
    }


    /**
     * Sets the mobileAreaCode value for this PolicyContact.
     * 
     * @param mobileAreaCode
     */
    public void setMobileAreaCode(java.lang.String mobileAreaCode) {
        this.mobileAreaCode = mobileAreaCode;
    }


    /**
     * Gets the mobilePhone value for this PolicyContact.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this PolicyContact.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the mobileExt value for this PolicyContact.
     * 
     * @return mobileExt
     */
    public java.lang.String getMobileExt() {
        return mobileExt;
    }


    /**
     * Sets the mobileExt value for this PolicyContact.
     * 
     * @param mobileExt
     */
    public void setMobileExt(java.lang.String mobileExt) {
        this.mobileExt = mobileExt;
    }


    /**
     * Gets the pagerAreaCode value for this PolicyContact.
     * 
     * @return pagerAreaCode
     */
    public java.lang.String getPagerAreaCode() {
        return pagerAreaCode;
    }


    /**
     * Sets the pagerAreaCode value for this PolicyContact.
     * 
     * @param pagerAreaCode
     */
    public void setPagerAreaCode(java.lang.String pagerAreaCode) {
        this.pagerAreaCode = pagerAreaCode;
    }


    /**
     * Gets the pagerPhone value for this PolicyContact.
     * 
     * @return pagerPhone
     */
    public java.lang.String getPagerPhone() {
        return pagerPhone;
    }


    /**
     * Sets the pagerPhone value for this PolicyContact.
     * 
     * @param pagerPhone
     */
    public void setPagerPhone(java.lang.String pagerPhone) {
        this.pagerPhone = pagerPhone;
    }


    /**
     * Gets the pagerExt value for this PolicyContact.
     * 
     * @return pagerExt
     */
    public java.lang.String getPagerExt() {
        return pagerExt;
    }


    /**
     * Sets the pagerExt value for this PolicyContact.
     * 
     * @param pagerExt
     */
    public void setPagerExt(java.lang.String pagerExt) {
        this.pagerExt = pagerExt;
    }


    /**
     * Gets the EMail value for this PolicyContact.
     * 
     * @return EMail
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this PolicyContact.
     * 
     * @param EMail
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyContact)) return false;
        PolicyContact other = (PolicyContact) obj;
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
            ((this.lineOfBusinessId==null && other.getLineOfBusinessId()==null) || 
             (this.lineOfBusinessId!=null &&
              this.lineOfBusinessId.equals(other.getLineOfBusinessId()))) &&
            ((this.policyContactId==null && other.getPolicyContactId()==null) || 
             (this.policyContactId!=null &&
              this.policyContactId.equals(other.getPolicyContactId()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.attachId==null && other.getAttachId()==null) || 
             (this.attachId!=null &&
              this.attachId.equals(other.getAttachId()))) &&
            ((this.attachType==null && other.getAttachType()==null) || 
             (this.attachType!=null &&
              this.attachType.equals(other.getAttachType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.responsibility==null && other.getResponsibility()==null) || 
             (this.responsibility!=null &&
              this.responsibility.equals(other.getResponsibility()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.ext==null && other.getExt()==null) || 
             (this.ext!=null &&
              this.ext.equals(other.getExt()))) &&
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
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.refNo==null && other.getRefNo()==null) || 
             (this.refNo!=null &&
              this.refNo.equals(other.getRefNo()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.formalSalutation==null && other.getFormalSalutation()==null) || 
             (this.formalSalutation!=null &&
              this.formalSalutation.equals(other.getFormalSalutation()))) &&
            ((this.informalSalutation==null && other.getInformalSalutation()==null) || 
             (this.informalSalutation!=null &&
              this.informalSalutation.equals(other.getInformalSalutation()))) &&
            ((this.residenceAreaCode==null && other.getResidenceAreaCode()==null) || 
             (this.residenceAreaCode!=null &&
              this.residenceAreaCode.equals(other.getResidenceAreaCode()))) &&
            ((this.residencePhone==null && other.getResidencePhone()==null) || 
             (this.residencePhone!=null &&
              this.residencePhone.equals(other.getResidencePhone()))) &&
            ((this.residenceExt==null && other.getResidenceExt()==null) || 
             (this.residenceExt!=null &&
              this.residenceExt.equals(other.getResidenceExt()))) &&
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
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail())));
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
        if (getLineOfBusinessId() != null) {
            _hashCode += getLineOfBusinessId().hashCode();
        }
        if (getPolicyContactId() != null) {
            _hashCode += getPolicyContactId().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAttachId() != null) {
            _hashCode += getAttachId().hashCode();
        }
        if (getAttachType() != null) {
            _hashCode += getAttachType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getResponsibility() != null) {
            _hashCode += getResponsibility().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getExt() != null) {
            _hashCode += getExt().hashCode();
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
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getRefNo() != null) {
            _hashCode += getRefNo().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFormalSalutation() != null) {
            _hashCode += getFormalSalutation().hashCode();
        }
        if (getInformalSalutation() != null) {
            _hashCode += getInformalSalutation().hashCode();
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
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AttachId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AttachType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Responsibility"));
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
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Ext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ZipCode"));
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
        elemField.setFieldName("refNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "RefNo"));
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
        elemField.setFieldName("EMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EMail"));
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
