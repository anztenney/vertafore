/**
 * EmployeeGetListByLastNamePrefixResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class EmployeeGetListByLastNamePrefixResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo[] employeeInfoList;

    public EmployeeGetListByLastNamePrefixResponse() {
    }

    public EmployeeGetListByLastNamePrefixResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo[] employeeInfoList) {
           this.employeeInfoList = employeeInfoList;
    }


    /**
     * Gets the employeeInfoList value for this EmployeeGetListByLastNamePrefixResponse.
     * 
     * @return employeeInfoList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo[] getEmployeeInfoList() {
        return employeeInfoList;
    }


    /**
     * Sets the employeeInfoList value for this EmployeeGetListByLastNamePrefixResponse.
     * 
     * @param employeeInfoList
     */
    public void setEmployeeInfoList(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo[] employeeInfoList) {
        this.employeeInfoList = employeeInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeGetListByLastNamePrefixResponse)) return false;
        EmployeeGetListByLastNamePrefixResponse other = (EmployeeGetListByLastNamePrefixResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeInfoList==null && other.getEmployeeInfoList()==null) || 
             (this.employeeInfoList!=null &&
              java.util.Arrays.equals(this.employeeInfoList, other.getEmployeeInfoList())));
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
        if (getEmployeeInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeGetListByLastNamePrefixResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByLastNamePrefixResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfo"));
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
