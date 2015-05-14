/**
 * PolicyServicePersonnelListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyServicePersonnelListResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] policyServicePersonnelList;

    public PolicyServicePersonnelListResponse() {
    }

    public PolicyServicePersonnelListResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] policyServicePersonnelList) {
           this.policyServicePersonnelList = policyServicePersonnelList;
    }


    /**
     * Gets the policyServicePersonnelList value for this PolicyServicePersonnelListResponse.
     * 
     * @return policyServicePersonnelList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] getPolicyServicePersonnelList() {
        return policyServicePersonnelList;
    }


    /**
     * Sets the policyServicePersonnelList value for this PolicyServicePersonnelListResponse.
     * 
     * @param policyServicePersonnelList
     */
    public void setPolicyServicePersonnelList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[] policyServicePersonnelList) {
        this.policyServicePersonnelList = policyServicePersonnelList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyServicePersonnelListResponse)) return false;
        PolicyServicePersonnelListResponse other = (PolicyServicePersonnelListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyServicePersonnelList==null && other.getPolicyServicePersonnelList()==null) || 
             (this.policyServicePersonnelList!=null &&
              java.util.Arrays.equals(this.policyServicePersonnelList, other.getPolicyServicePersonnelList())));
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
        if (getPolicyServicePersonnelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyServicePersonnelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyServicePersonnelList(), i);
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
        new org.apache.axis.description.TypeDesc(PolicyServicePersonnelListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyServicePersonnelList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelList"));
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
