/**
 * PersonalNoteGetListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PersonalNoteGetListRequest  implements java.io.Serializable {
    private java.util.Calendar dateFrom;

    private java.util.Calendar dateTo;

    private java.util.Calendar purgeDateFrom;

    private java.util.Calendar purgeDateTo;

    private java.lang.Boolean includeOnlyAttachments;

    public PersonalNoteGetListRequest() {
    }

    public PersonalNoteGetListRequest(
           java.util.Calendar dateFrom,
           java.util.Calendar dateTo,
           java.util.Calendar purgeDateFrom,
           java.util.Calendar purgeDateTo,
           java.lang.Boolean includeOnlyAttachments) {
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.purgeDateFrom = purgeDateFrom;
           this.purgeDateTo = purgeDateTo;
           this.includeOnlyAttachments = includeOnlyAttachments;
    }


    /**
     * Gets the dateFrom value for this PersonalNoteGetListRequest.
     * 
     * @return dateFrom
     */
    public java.util.Calendar getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this PersonalNoteGetListRequest.
     * 
     * @param dateFrom
     */
    public void setDateFrom(java.util.Calendar dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this PersonalNoteGetListRequest.
     * 
     * @return dateTo
     */
    public java.util.Calendar getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this PersonalNoteGetListRequest.
     * 
     * @param dateTo
     */
    public void setDateTo(java.util.Calendar dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the purgeDateFrom value for this PersonalNoteGetListRequest.
     * 
     * @return purgeDateFrom
     */
    public java.util.Calendar getPurgeDateFrom() {
        return purgeDateFrom;
    }


    /**
     * Sets the purgeDateFrom value for this PersonalNoteGetListRequest.
     * 
     * @param purgeDateFrom
     */
    public void setPurgeDateFrom(java.util.Calendar purgeDateFrom) {
        this.purgeDateFrom = purgeDateFrom;
    }


    /**
     * Gets the purgeDateTo value for this PersonalNoteGetListRequest.
     * 
     * @return purgeDateTo
     */
    public java.util.Calendar getPurgeDateTo() {
        return purgeDateTo;
    }


    /**
     * Sets the purgeDateTo value for this PersonalNoteGetListRequest.
     * 
     * @param purgeDateTo
     */
    public void setPurgeDateTo(java.util.Calendar purgeDateTo) {
        this.purgeDateTo = purgeDateTo;
    }


    /**
     * Gets the includeOnlyAttachments value for this PersonalNoteGetListRequest.
     * 
     * @return includeOnlyAttachments
     */
    public java.lang.Boolean getIncludeOnlyAttachments() {
        return includeOnlyAttachments;
    }


    /**
     * Sets the includeOnlyAttachments value for this PersonalNoteGetListRequest.
     * 
     * @param includeOnlyAttachments
     */
    public void setIncludeOnlyAttachments(java.lang.Boolean includeOnlyAttachments) {
        this.includeOnlyAttachments = includeOnlyAttachments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalNoteGetListRequest)) return false;
        PersonalNoteGetListRequest other = (PersonalNoteGetListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.purgeDateFrom==null && other.getPurgeDateFrom()==null) || 
             (this.purgeDateFrom!=null &&
              this.purgeDateFrom.equals(other.getPurgeDateFrom()))) &&
            ((this.purgeDateTo==null && other.getPurgeDateTo()==null) || 
             (this.purgeDateTo!=null &&
              this.purgeDateTo.equals(other.getPurgeDateTo()))) &&
            ((this.includeOnlyAttachments==null && other.getIncludeOnlyAttachments()==null) || 
             (this.includeOnlyAttachments!=null &&
              this.includeOnlyAttachments.equals(other.getIncludeOnlyAttachments())));
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
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getPurgeDateFrom() != null) {
            _hashCode += getPurgeDateFrom().hashCode();
        }
        if (getPurgeDateTo() != null) {
            _hashCode += getPurgeDateTo().hashCode();
        }
        if (getIncludeOnlyAttachments() != null) {
            _hashCode += getIncludeOnlyAttachments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalNoteGetListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PurgeDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PurgeDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeOnlyAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncludeOnlyAttachments"));
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
