/**
 * PolicyLineOfBusiness.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyLineOfBusiness  implements java.io.Serializable {
    private java.lang.String lineOfBusinessId;

    private java.lang.String policyLineOfBusiness;

    private java.lang.Short sortOrderNumber;

    public PolicyLineOfBusiness() {
    }

    public PolicyLineOfBusiness(
           java.lang.String lineOfBusinessId,
           java.lang.String policyLineOfBusiness,
           java.lang.Short sortOrderNumber) {
           this.lineOfBusinessId = lineOfBusinessId;
           this.policyLineOfBusiness = policyLineOfBusiness;
           this.sortOrderNumber = sortOrderNumber;
    }


    /**
     * Gets the lineOfBusinessId value for this PolicyLineOfBusiness.
     * 
     * @return lineOfBusinessId
     */
    public java.lang.String getLineOfBusinessId() {
        return lineOfBusinessId;
    }


    /**
     * Sets the lineOfBusinessId value for this PolicyLineOfBusiness.
     * 
     * @param lineOfBusinessId
     */
    public void setLineOfBusinessId(java.lang.String lineOfBusinessId) {
        this.lineOfBusinessId = lineOfBusinessId;
    }


    /**
     * Gets the policyLineOfBusiness value for this PolicyLineOfBusiness.
     * 
     * @return policyLineOfBusiness
     */
    public java.lang.String getPolicyLineOfBusiness() {
        return policyLineOfBusiness;
    }


    /**
     * Sets the policyLineOfBusiness value for this PolicyLineOfBusiness.
     * 
     * @param policyLineOfBusiness
     */
    public void setPolicyLineOfBusiness(java.lang.String policyLineOfBusiness) {
        this.policyLineOfBusiness = policyLineOfBusiness;
    }


    /**
     * Gets the sortOrderNumber value for this PolicyLineOfBusiness.
     * 
     * @return sortOrderNumber
     */
    public java.lang.Short getSortOrderNumber() {
        return sortOrderNumber;
    }


    /**
     * Sets the sortOrderNumber value for this PolicyLineOfBusiness.
     * 
     * @param sortOrderNumber
     */
    public void setSortOrderNumber(java.lang.Short sortOrderNumber) {
        this.sortOrderNumber = sortOrderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyLineOfBusiness)) return false;
        PolicyLineOfBusiness other = (PolicyLineOfBusiness) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineOfBusinessId==null && other.getLineOfBusinessId()==null) || 
             (this.lineOfBusinessId!=null &&
              this.lineOfBusinessId.equals(other.getLineOfBusinessId()))) &&
            ((this.policyLineOfBusiness==null && other.getPolicyLineOfBusiness()==null) || 
             (this.policyLineOfBusiness!=null &&
              this.policyLineOfBusiness.equals(other.getPolicyLineOfBusiness()))) &&
            ((this.sortOrderNumber==null && other.getSortOrderNumber()==null) || 
             (this.sortOrderNumber!=null &&
              this.sortOrderNumber.equals(other.getSortOrderNumber())));
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
        if (getLineOfBusinessId() != null) {
            _hashCode += getLineOfBusinessId().hashCode();
        }
        if (getPolicyLineOfBusiness() != null) {
            _hashCode += getPolicyLineOfBusiness().hashCode();
        }
        if (getSortOrderNumber() != null) {
            _hashCode += getSortOrderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyLineOfBusiness.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyLineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SortOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
