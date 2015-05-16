/**
 * VendorInvoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class VendorInvoice  implements java.io.Serializable {
    private java.lang.String bankCode;

    private java.lang.String description;

    private java.lang.String GLDivisionCode;

    private java.util.Calendar datePosted;

    private java.lang.String status;

    private java.lang.String vendorCode;

    private java.util.Calendar vendorDueDate;

    private java.util.Calendar vendorPaidDate;

    private java.util.Calendar vendorInvoiceDate;

    private java.lang.String vendorInvoiceId;

    private java.lang.String vendorInvoiceNumber;

    private java.math.BigDecimal vendorInvoicePayAmount;

    private java.math.BigDecimal vendorInvoiceTotalAmount;

    private java.lang.String vendorInvoiceTemplateId;

    public VendorInvoice() {
    }

    public VendorInvoice(
           java.lang.String bankCode,
           java.lang.String description,
           java.lang.String GLDivisionCode,
           java.util.Calendar datePosted,
           java.lang.String status,
           java.lang.String vendorCode,
           java.util.Calendar vendorDueDate,
           java.util.Calendar vendorPaidDate,
           java.util.Calendar vendorInvoiceDate,
           java.lang.String vendorInvoiceId,
           java.lang.String vendorInvoiceNumber,
           java.math.BigDecimal vendorInvoicePayAmount,
           java.math.BigDecimal vendorInvoiceTotalAmount,
           java.lang.String vendorInvoiceTemplateId) {
           this.bankCode = bankCode;
           this.description = description;
           this.GLDivisionCode = GLDivisionCode;
           this.datePosted = datePosted;
           this.status = status;
           this.vendorCode = vendorCode;
           this.vendorDueDate = vendorDueDate;
           this.vendorPaidDate = vendorPaidDate;
           this.vendorInvoiceDate = vendorInvoiceDate;
           this.vendorInvoiceId = vendorInvoiceId;
           this.vendorInvoiceNumber = vendorInvoiceNumber;
           this.vendorInvoicePayAmount = vendorInvoicePayAmount;
           this.vendorInvoiceTotalAmount = vendorInvoiceTotalAmount;
           this.vendorInvoiceTemplateId = vendorInvoiceTemplateId;
    }


    /**
     * Gets the bankCode value for this VendorInvoice.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this VendorInvoice.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the description value for this VendorInvoice.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this VendorInvoice.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the GLDivisionCode value for this VendorInvoice.
     * 
     * @return GLDivisionCode
     */
    public java.lang.String getGLDivisionCode() {
        return GLDivisionCode;
    }


    /**
     * Sets the GLDivisionCode value for this VendorInvoice.
     * 
     * @param GLDivisionCode
     */
    public void setGLDivisionCode(java.lang.String GLDivisionCode) {
        this.GLDivisionCode = GLDivisionCode;
    }


    /**
     * Gets the datePosted value for this VendorInvoice.
     * 
     * @return datePosted
     */
    public java.util.Calendar getDatePosted() {
        return datePosted;
    }


    /**
     * Sets the datePosted value for this VendorInvoice.
     * 
     * @param datePosted
     */
    public void setDatePosted(java.util.Calendar datePosted) {
        this.datePosted = datePosted;
    }


    /**
     * Gets the status value for this VendorInvoice.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VendorInvoice.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vendorCode value for this VendorInvoice.
     * 
     * @return vendorCode
     */
    public java.lang.String getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this VendorInvoice.
     * 
     * @param vendorCode
     */
    public void setVendorCode(java.lang.String vendorCode) {
        this.vendorCode = vendorCode;
    }


    /**
     * Gets the vendorDueDate value for this VendorInvoice.
     * 
     * @return vendorDueDate
     */
    public java.util.Calendar getVendorDueDate() {
        return vendorDueDate;
    }


    /**
     * Sets the vendorDueDate value for this VendorInvoice.
     * 
     * @param vendorDueDate
     */
    public void setVendorDueDate(java.util.Calendar vendorDueDate) {
        this.vendorDueDate = vendorDueDate;
    }


    /**
     * Gets the vendorPaidDate value for this VendorInvoice.
     * 
     * @return vendorPaidDate
     */
    public java.util.Calendar getVendorPaidDate() {
        return vendorPaidDate;
    }


    /**
     * Sets the vendorPaidDate value for this VendorInvoice.
     * 
     * @param vendorPaidDate
     */
    public void setVendorPaidDate(java.util.Calendar vendorPaidDate) {
        this.vendorPaidDate = vendorPaidDate;
    }


    /**
     * Gets the vendorInvoiceDate value for this VendorInvoice.
     * 
     * @return vendorInvoiceDate
     */
    public java.util.Calendar getVendorInvoiceDate() {
        return vendorInvoiceDate;
    }


    /**
     * Sets the vendorInvoiceDate value for this VendorInvoice.
     * 
     * @param vendorInvoiceDate
     */
    public void setVendorInvoiceDate(java.util.Calendar vendorInvoiceDate) {
        this.vendorInvoiceDate = vendorInvoiceDate;
    }


    /**
     * Gets the vendorInvoiceId value for this VendorInvoice.
     * 
     * @return vendorInvoiceId
     */
    public java.lang.String getVendorInvoiceId() {
        return vendorInvoiceId;
    }


    /**
     * Sets the vendorInvoiceId value for this VendorInvoice.
     * 
     * @param vendorInvoiceId
     */
    public void setVendorInvoiceId(java.lang.String vendorInvoiceId) {
        this.vendorInvoiceId = vendorInvoiceId;
    }


    /**
     * Gets the vendorInvoiceNumber value for this VendorInvoice.
     * 
     * @return vendorInvoiceNumber
     */
    public java.lang.String getVendorInvoiceNumber() {
        return vendorInvoiceNumber;
    }


    /**
     * Sets the vendorInvoiceNumber value for this VendorInvoice.
     * 
     * @param vendorInvoiceNumber
     */
    public void setVendorInvoiceNumber(java.lang.String vendorInvoiceNumber) {
        this.vendorInvoiceNumber = vendorInvoiceNumber;
    }


    /**
     * Gets the vendorInvoicePayAmount value for this VendorInvoice.
     * 
     * @return vendorInvoicePayAmount
     */
    public java.math.BigDecimal getVendorInvoicePayAmount() {
        return vendorInvoicePayAmount;
    }


    /**
     * Sets the vendorInvoicePayAmount value for this VendorInvoice.
     * 
     * @param vendorInvoicePayAmount
     */
    public void setVendorInvoicePayAmount(java.math.BigDecimal vendorInvoicePayAmount) {
        this.vendorInvoicePayAmount = vendorInvoicePayAmount;
    }


    /**
     * Gets the vendorInvoiceTotalAmount value for this VendorInvoice.
     * 
     * @return vendorInvoiceTotalAmount
     */
    public java.math.BigDecimal getVendorInvoiceTotalAmount() {
        return vendorInvoiceTotalAmount;
    }


    /**
     * Sets the vendorInvoiceTotalAmount value for this VendorInvoice.
     * 
     * @param vendorInvoiceTotalAmount
     */
    public void setVendorInvoiceTotalAmount(java.math.BigDecimal vendorInvoiceTotalAmount) {
        this.vendorInvoiceTotalAmount = vendorInvoiceTotalAmount;
    }


    /**
     * Gets the vendorInvoiceTemplateId value for this VendorInvoice.
     * 
     * @return vendorInvoiceTemplateId
     */
    public java.lang.String getVendorInvoiceTemplateId() {
        return vendorInvoiceTemplateId;
    }


    /**
     * Sets the vendorInvoiceTemplateId value for this VendorInvoice.
     * 
     * @param vendorInvoiceTemplateId
     */
    public void setVendorInvoiceTemplateId(java.lang.String vendorInvoiceTemplateId) {
        this.vendorInvoiceTemplateId = vendorInvoiceTemplateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorInvoice)) return false;
        VendorInvoice other = (VendorInvoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.GLDivisionCode==null && other.getGLDivisionCode()==null) || 
             (this.GLDivisionCode!=null &&
              this.GLDivisionCode.equals(other.getGLDivisionCode()))) &&
            ((this.datePosted==null && other.getDatePosted()==null) || 
             (this.datePosted!=null &&
              this.datePosted.equals(other.getDatePosted()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              this.vendorCode.equals(other.getVendorCode()))) &&
            ((this.vendorDueDate==null && other.getVendorDueDate()==null) || 
             (this.vendorDueDate!=null &&
              this.vendorDueDate.equals(other.getVendorDueDate()))) &&
            ((this.vendorPaidDate==null && other.getVendorPaidDate()==null) || 
             (this.vendorPaidDate!=null &&
              this.vendorPaidDate.equals(other.getVendorPaidDate()))) &&
            ((this.vendorInvoiceDate==null && other.getVendorInvoiceDate()==null) || 
             (this.vendorInvoiceDate!=null &&
              this.vendorInvoiceDate.equals(other.getVendorInvoiceDate()))) &&
            ((this.vendorInvoiceId==null && other.getVendorInvoiceId()==null) || 
             (this.vendorInvoiceId!=null &&
              this.vendorInvoiceId.equals(other.getVendorInvoiceId()))) &&
            ((this.vendorInvoiceNumber==null && other.getVendorInvoiceNumber()==null) || 
             (this.vendorInvoiceNumber!=null &&
              this.vendorInvoiceNumber.equals(other.getVendorInvoiceNumber()))) &&
            ((this.vendorInvoicePayAmount==null && other.getVendorInvoicePayAmount()==null) || 
             (this.vendorInvoicePayAmount!=null &&
              this.vendorInvoicePayAmount.equals(other.getVendorInvoicePayAmount()))) &&
            ((this.vendorInvoiceTotalAmount==null && other.getVendorInvoiceTotalAmount()==null) || 
             (this.vendorInvoiceTotalAmount!=null &&
              this.vendorInvoiceTotalAmount.equals(other.getVendorInvoiceTotalAmount()))) &&
            ((this.vendorInvoiceTemplateId==null && other.getVendorInvoiceTemplateId()==null) || 
             (this.vendorInvoiceTemplateId!=null &&
              this.vendorInvoiceTemplateId.equals(other.getVendorInvoiceTemplateId())));
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
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGLDivisionCode() != null) {
            _hashCode += getGLDivisionCode().hashCode();
        }
        if (getDatePosted() != null) {
            _hashCode += getDatePosted().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVendorCode() != null) {
            _hashCode += getVendorCode().hashCode();
        }
        if (getVendorDueDate() != null) {
            _hashCode += getVendorDueDate().hashCode();
        }
        if (getVendorPaidDate() != null) {
            _hashCode += getVendorPaidDate().hashCode();
        }
        if (getVendorInvoiceDate() != null) {
            _hashCode += getVendorInvoiceDate().hashCode();
        }
        if (getVendorInvoiceId() != null) {
            _hashCode += getVendorInvoiceId().hashCode();
        }
        if (getVendorInvoiceNumber() != null) {
            _hashCode += getVendorInvoiceNumber().hashCode();
        }
        if (getVendorInvoicePayAmount() != null) {
            _hashCode += getVendorInvoicePayAmount().hashCode();
        }
        if (getVendorInvoiceTotalAmount() != null) {
            _hashCode += getVendorInvoiceTotalAmount().hashCode();
        }
        if (getVendorInvoiceTemplateId() != null) {
            _hashCode += getVendorInvoiceTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorInvoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankCode"));
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
        elemField.setFieldName("GLDivisionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePosted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DatePosted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPaidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorPaidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoicePayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoicePayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorInvoiceTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceTemplateId"));
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
