/**
 * PolicyGetListByCustomerIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PolicyGetListByCustomerIdResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo[] policyInfoList;

    public PolicyGetListByCustomerIdResponse() {
    }

    public PolicyGetListByCustomerIdResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo[] policyInfoList) {
           this.policyInfoList = policyInfoList;
    }


    /**
     * Gets the policyInfoList value for this PolicyGetListByCustomerIdResponse.
     * 
     * @return policyInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo[] getPolicyInfoList() {
        return policyInfoList;
    }


    /**
     * Sets the policyInfoList value for this PolicyGetListByCustomerIdResponse.
     * 
     * @param policyInfoList
     */
    public void setPolicyInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo[] policyInfoList) {
        this.policyInfoList = policyInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyGetListByCustomerIdResponse)) return false;
        PolicyGetListByCustomerIdResponse other = (PolicyGetListByCustomerIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyInfoList==null && other.getPolicyInfoList()==null) || 
             (this.policyInfoList!=null &&
              java.util.Arrays.equals(this.policyInfoList, other.getPolicyInfoList())));
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
        if (getPolicyInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(PolicyGetListByCustomerIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo"));
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
