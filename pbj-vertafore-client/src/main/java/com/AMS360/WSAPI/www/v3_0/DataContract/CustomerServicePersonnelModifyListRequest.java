/**
 * CustomerServicePersonnelModifyListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerServicePersonnelModifyListRequest  implements java.io.Serializable {
    private java.lang.String customerId;

    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] modifyList;

    private com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] deleteList;

    public CustomerServicePersonnelModifyListRequest() {
    }

    public CustomerServicePersonnelModifyListRequest(
           java.lang.String customerId,
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] modifyList,
           com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] deleteList) {
           this.customerId = customerId;
           this.modifyList = modifyList;
           this.deleteList = deleteList;
    }


    /**
     * Gets the customerId value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the modifyList value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @return modifyList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] getModifyList() {
        return modifyList;
    }


    /**
     * Sets the modifyList value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @param modifyList
     */
    public void setModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] modifyList) {
        this.modifyList = modifyList;
    }


    /**
     * Gets the deleteList value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @return deleteList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] getDeleteList() {
        return deleteList;
    }


    /**
     * Sets the deleteList value for this CustomerServicePersonnelModifyListRequest.
     * 
     * @param deleteList
     */
    public void setDeleteList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[] deleteList) {
        this.deleteList = deleteList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerServicePersonnelModifyListRequest)) return false;
        CustomerServicePersonnelModifyListRequest other = (CustomerServicePersonnelModifyListRequest) obj;
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
            ((this.modifyList==null && other.getModifyList()==null) || 
             (this.modifyList!=null &&
              java.util.Arrays.equals(this.modifyList, other.getModifyList()))) &&
            ((this.deleteList==null && other.getDeleteList()==null) || 
             (this.deleteList!=null &&
              java.util.Arrays.equals(this.deleteList, other.getDeleteList())));
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
        if (getModifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerServicePersonnelModifyListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelModifyListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ModifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DeleteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel"));
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
