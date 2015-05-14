/**
 * PlanTypeGetListByCompanyCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class PlanTypeGetListByCompanyCodeResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.PlanType[] planTypeList;

    public PlanTypeGetListByCompanyCodeResponse() {
    }

    public PlanTypeGetListByCompanyCodeResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.PlanType[] planTypeList) {
           this.planTypeList = planTypeList;
    }


    /**
     * Gets the planTypeList value for this PlanTypeGetListByCompanyCodeResponse.
     * 
     * @return planTypeList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.PlanType[] getPlanTypeList() {
        return planTypeList;
    }


    /**
     * Sets the planTypeList value for this PlanTypeGetListByCompanyCodeResponse.
     * 
     * @param planTypeList
     */
    public void setPlanTypeList(com.AMS360.WSAPI.www.v3_0.DataContract.PlanType[] planTypeList) {
        this.planTypeList = planTypeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanTypeGetListByCompanyCodeResponse)) return false;
        PlanTypeGetListByCompanyCodeResponse other = (PlanTypeGetListByCompanyCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.planTypeList==null && other.getPlanTypeList()==null) || 
             (this.planTypeList!=null &&
              java.util.Arrays.equals(this.planTypeList, other.getPlanTypeList())));
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
        if (getPlanTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlanTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlanTypeList(), i);
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
        new org.apache.axis.description.TypeDesc(PlanTypeGetListByCompanyCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListByCompanyCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType"));
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
