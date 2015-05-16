/**
 * PlanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PlanType  implements java.io.Serializable {
    private java.lang.String planDescription;

    private java.lang.Boolean isInactive;

    private java.lang.String planCode;

    private java.lang.Short permanentFlag;

    public PlanType() {
    }

    public PlanType(
           java.lang.String planDescription,
           java.lang.Boolean isInactive,
           java.lang.String planCode,
           java.lang.Short permanentFlag) {
           this.planDescription = planDescription;
           this.isInactive = isInactive;
           this.planCode = planCode;
           this.permanentFlag = permanentFlag;
    }


    /**
     * Gets the planDescription value for this PlanType.
     * 
     * @return planDescription
     */
    public java.lang.String getPlanDescription() {
        return planDescription;
    }


    /**
     * Sets the planDescription value for this PlanType.
     * 
     * @param planDescription
     */
    public void setPlanDescription(java.lang.String planDescription) {
        this.planDescription = planDescription;
    }


    /**
     * Gets the isInactive value for this PlanType.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PlanType.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the planCode value for this PlanType.
     * 
     * @return planCode
     */
    public java.lang.String getPlanCode() {
        return planCode;
    }


    /**
     * Sets the planCode value for this PlanType.
     * 
     * @param planCode
     */
    public void setPlanCode(java.lang.String planCode) {
        this.planCode = planCode;
    }


    /**
     * Gets the permanentFlag value for this PlanType.
     * 
     * @return permanentFlag
     */
    public java.lang.Short getPermanentFlag() {
        return permanentFlag;
    }


    /**
     * Sets the permanentFlag value for this PlanType.
     * 
     * @param permanentFlag
     */
    public void setPermanentFlag(java.lang.Short permanentFlag) {
        this.permanentFlag = permanentFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanType)) return false;
        PlanType other = (PlanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planDescription==null && other.getPlanDescription()==null) || 
             (this.planDescription!=null &&
              this.planDescription.equals(other.getPlanDescription()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.planCode==null && other.getPlanCode()==null) || 
             (this.planCode!=null &&
              this.planCode.equals(other.getPlanCode()))) &&
            ((this.permanentFlag==null && other.getPermanentFlag()==null) || 
             (this.permanentFlag!=null &&
              this.permanentFlag.equals(other.getPermanentFlag())));
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
        if (getPlanDescription() != null) {
            _hashCode += getPlanDescription().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getPlanCode() != null) {
            _hashCode += getPlanCode().hashCode();
        }
        if (getPermanentFlag() != null) {
            _hashCode += getPermanentFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permanentFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PermanentFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
