/**
 * S1099CategoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class S1099CategoryInfo  implements java.io.Serializable {
    private java.lang.Short s1099Category;

    private java.lang.String s1099CategoryDescription;

    private com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo[] s1099Types;

    public S1099CategoryInfo() {
    }

    public S1099CategoryInfo(
           java.lang.Short s1099Category,
           java.lang.String s1099CategoryDescription,
           com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo[] s1099Types) {
           this.s1099Category = s1099Category;
           this.s1099CategoryDescription = s1099CategoryDescription;
           this.s1099Types = s1099Types;
    }


    /**
     * Gets the s1099Category value for this S1099CategoryInfo.
     * 
     * @return s1099Category
     */
    public java.lang.Short getS1099Category() {
        return s1099Category;
    }


    /**
     * Sets the s1099Category value for this S1099CategoryInfo.
     * 
     * @param s1099Category
     */
    public void setS1099Category(java.lang.Short s1099Category) {
        this.s1099Category = s1099Category;
    }


    /**
     * Gets the s1099CategoryDescription value for this S1099CategoryInfo.
     * 
     * @return s1099CategoryDescription
     */
    public java.lang.String getS1099CategoryDescription() {
        return s1099CategoryDescription;
    }


    /**
     * Sets the s1099CategoryDescription value for this S1099CategoryInfo.
     * 
     * @param s1099CategoryDescription
     */
    public void setS1099CategoryDescription(java.lang.String s1099CategoryDescription) {
        this.s1099CategoryDescription = s1099CategoryDescription;
    }


    /**
     * Gets the s1099Types value for this S1099CategoryInfo.
     * 
     * @return s1099Types
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo[] getS1099Types() {
        return s1099Types;
    }


    /**
     * Sets the s1099Types value for this S1099CategoryInfo.
     * 
     * @param s1099Types
     */
    public void setS1099Types(com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo[] s1099Types) {
        this.s1099Types = s1099Types;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof S1099CategoryInfo)) return false;
        S1099CategoryInfo other = (S1099CategoryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.s1099Category==null && other.getS1099Category()==null) || 
             (this.s1099Category!=null &&
              this.s1099Category.equals(other.getS1099Category()))) &&
            ((this.s1099CategoryDescription==null && other.getS1099CategoryDescription()==null) || 
             (this.s1099CategoryDescription!=null &&
              this.s1099CategoryDescription.equals(other.getS1099CategoryDescription()))) &&
            ((this.s1099Types==null && other.getS1099Types()==null) || 
             (this.s1099Types!=null &&
              java.util.Arrays.equals(this.s1099Types, other.getS1099Types())));
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
        if (getS1099Category() != null) {
            _hashCode += getS1099Category().hashCode();
        }
        if (getS1099CategoryDescription() != null) {
            _hashCode += getS1099CategoryDescription().hashCode();
        }
        if (getS1099Types() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getS1099Types());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getS1099Types(), i);
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
        new org.apache.axis.description.TypeDesc(S1099CategoryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099Category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099CategoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1099Types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099Types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo"));
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
