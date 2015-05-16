/**
 * LineOfBusinessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class LineOfBusinessInfo  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String incomeGroup;

    private java.lang.Boolean isInactive;

    private java.lang.String lineOfBusinessCode;

    private java.lang.Short typeOfBusinessCode;

    public LineOfBusinessInfo() {
    }

    public LineOfBusinessInfo(
           java.lang.String description,
           java.lang.String incomeGroup,
           java.lang.Boolean isInactive,
           java.lang.String lineOfBusinessCode,
           java.lang.Short typeOfBusinessCode) {
           this.description = description;
           this.incomeGroup = incomeGroup;
           this.isInactive = isInactive;
           this.lineOfBusinessCode = lineOfBusinessCode;
           this.typeOfBusinessCode = typeOfBusinessCode;
    }


    /**
     * Gets the description value for this LineOfBusinessInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LineOfBusinessInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the incomeGroup value for this LineOfBusinessInfo.
     * 
     * @return incomeGroup
     */
    public java.lang.String getIncomeGroup() {
        return incomeGroup;
    }


    /**
     * Sets the incomeGroup value for this LineOfBusinessInfo.
     * 
     * @param incomeGroup
     */
    public void setIncomeGroup(java.lang.String incomeGroup) {
        this.incomeGroup = incomeGroup;
    }


    /**
     * Gets the isInactive value for this LineOfBusinessInfo.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this LineOfBusinessInfo.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the lineOfBusinessCode value for this LineOfBusinessInfo.
     * 
     * @return lineOfBusinessCode
     */
    public java.lang.String getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }


    /**
     * Sets the lineOfBusinessCode value for this LineOfBusinessInfo.
     * 
     * @param lineOfBusinessCode
     */
    public void setLineOfBusinessCode(java.lang.String lineOfBusinessCode) {
        this.lineOfBusinessCode = lineOfBusinessCode;
    }


    /**
     * Gets the typeOfBusinessCode value for this LineOfBusinessInfo.
     * 
     * @return typeOfBusinessCode
     */
    public java.lang.Short getTypeOfBusinessCode() {
        return typeOfBusinessCode;
    }


    /**
     * Sets the typeOfBusinessCode value for this LineOfBusinessInfo.
     * 
     * @param typeOfBusinessCode
     */
    public void setTypeOfBusinessCode(java.lang.Short typeOfBusinessCode) {
        this.typeOfBusinessCode = typeOfBusinessCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineOfBusinessInfo)) return false;
        LineOfBusinessInfo other = (LineOfBusinessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.incomeGroup==null && other.getIncomeGroup()==null) || 
             (this.incomeGroup!=null &&
              this.incomeGroup.equals(other.getIncomeGroup()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.lineOfBusinessCode==null && other.getLineOfBusinessCode()==null) || 
             (this.lineOfBusinessCode!=null &&
              this.lineOfBusinessCode.equals(other.getLineOfBusinessCode()))) &&
            ((this.typeOfBusinessCode==null && other.getTypeOfBusinessCode()==null) || 
             (this.typeOfBusinessCode!=null &&
              this.typeOfBusinessCode.equals(other.getTypeOfBusinessCode())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIncomeGroup() != null) {
            _hashCode += getIncomeGroup().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLineOfBusinessCode() != null) {
            _hashCode += getLineOfBusinessCode().hashCode();
        }
        if (getTypeOfBusinessCode() != null) {
            _hashCode += getTypeOfBusinessCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineOfBusinessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IncomeGroup"));
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
        elemField.setFieldName("lineOfBusinessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfBusinessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TypeOfBusinessCode"));
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
