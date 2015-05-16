/**
 * PolicyServicePersonnelModifyListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyServicePersonnelModifyListRequest  implements java.io.Serializable {
    private java.lang.String policyId;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] modifyList;

    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] deleteList;

    public PolicyServicePersonnelModifyListRequest() {
    }

    public PolicyServicePersonnelModifyListRequest(
           java.lang.String policyId,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] modifyList,
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] deleteList) {
           this.policyId = policyId;
           this.modifyList = modifyList;
           this.deleteList = deleteList;
    }


    /**
     * Gets the policyId value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @return policyId
     */
    public java.lang.String getPolicyId() {
        return policyId;
    }


    /**
     * Sets the policyId value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @param policyId
     */
    public void setPolicyId(java.lang.String policyId) {
        this.policyId = policyId;
    }


    /**
     * Gets the modifyList value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @return modifyList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] getModifyList() {
        return modifyList;
    }


    /**
     * Sets the modifyList value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @param modifyList
     */
    public void setModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] modifyList) {
        this.modifyList = modifyList;
    }


    /**
     * Gets the deleteList value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @return deleteList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] getDeleteList() {
        return deleteList;
    }


    /**
     * Sets the deleteList value for this PolicyServicePersonnelModifyListRequest.
     * 
     * @param deleteList
     */
    public void setDeleteList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] deleteList) {
        this.deleteList = deleteList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyServicePersonnelModifyListRequest)) return false;
        PolicyServicePersonnelModifyListRequest other = (PolicyServicePersonnelModifyListRequest) obj;
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
        if (getPolicyId() != null) {
            _hashCode += getPolicyId().hashCode();
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
        new org.apache.axis.description.TypeDesc(PolicyServicePersonnelModifyListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelModifyListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ModifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DeleteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel"));
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
