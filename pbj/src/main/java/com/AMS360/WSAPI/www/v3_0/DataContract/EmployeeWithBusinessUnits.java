/**
 * EmployeeWithBusinessUnits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class EmployeeWithBusinessUnits  extends com.AMS360.WSAPI.www.v3_0.DataContract.Employee  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit[] businessUnitList;

    public EmployeeWithBusinessUnits() {
    }

    public EmployeeWithBusinessUnits(
           java.lang.String address,
           java.lang.String addressLine2,
           java.lang.String businessAreaCode,
           java.lang.String businessExtension,
           java.lang.String businessPhone,
           java.lang.String city,
           java.lang.String emergencyContactAreaCode,
           java.lang.String emergencyContactExtension,
           java.lang.String emergencyContactPhone,
           java.util.Calendar dateOfBirth,
           java.lang.String doc360HotFolderLocation,
           java.lang.String email,
           java.lang.String emergencyContactName,
           java.lang.String employeeCode,
           java.lang.String employeeSupervisorCode,
           java.lang.String faxAreaCode,
           java.lang.String faxExtension,
           java.lang.String faxPhone,
           java.lang.String firstName,
           java.lang.String fullTimeOrPartTime,
           java.lang.String homeAreaCode,
           java.lang.String homeExtension,
           java.lang.String homePhone,
           java.lang.Boolean licensedAgent,
           java.lang.Boolean allowMemoCommissions,
           java.lang.Boolean executive,
           java.lang.Boolean representative,
           java.lang.Boolean salesCenterRepresentative,
           java.lang.String lastName,
           java.lang.Boolean logDownloadSuspense,
           java.lang.String middleName,
           java.lang.String cellAreaCode,
           java.lang.String cellExtension,
           java.lang.String cellPhone,
           java.lang.Long nationalProducerCode,
           java.lang.String pagerAreaCode,
           java.lang.String pagerExtension,
           java.lang.String pagerPhone,
           java.lang.Short employee1099Category,
           java.lang.Short employee1099Type,
           java.lang.String shortName,
           java.lang.String state,
           java.lang.String employeeStatus,
           java.lang.String employeeTitle,
           java.lang.Short timeZone,
           java.lang.String yearEmployed,
           java.lang.String zipCode,
           com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit[] businessUnitList) {
        super(
            address,
            addressLine2,
            businessAreaCode,
            businessExtension,
            businessPhone,
            city,
            emergencyContactAreaCode,
            emergencyContactExtension,
            emergencyContactPhone,
            dateOfBirth,
            doc360HotFolderLocation,
            email,
            emergencyContactName,
            employeeCode,
            employeeSupervisorCode,
            faxAreaCode,
            faxExtension,
            faxPhone,
            firstName,
            fullTimeOrPartTime,
            homeAreaCode,
            homeExtension,
            homePhone,
            licensedAgent,
            allowMemoCommissions,
            executive,
            representative,
            salesCenterRepresentative,
            lastName,
            logDownloadSuspense,
            middleName,
            cellAreaCode,
            cellExtension,
            cellPhone,
            nationalProducerCode,
            pagerAreaCode,
            pagerExtension,
            pagerPhone,
            employee1099Category,
            employee1099Type,
            shortName,
            state,
            employeeStatus,
            employeeTitle,
            timeZone,
            yearEmployed,
            zipCode);
        this.businessUnitList = businessUnitList;
    }


    /**
     * Gets the businessUnitList value for this EmployeeWithBusinessUnits.
     * 
     * @return businessUnitList
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit[] getBusinessUnitList() {
        return businessUnitList;
    }


    /**
     * Sets the businessUnitList value for this EmployeeWithBusinessUnits.
     * 
     * @param businessUnitList
     */
    public void setBusinessUnitList(com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit[] businessUnitList) {
        this.businessUnitList = businessUnitList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeWithBusinessUnits)) return false;
        EmployeeWithBusinessUnits other = (EmployeeWithBusinessUnits) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessUnitList==null && other.getBusinessUnitList()==null) || 
             (this.businessUnitList!=null &&
              java.util.Arrays.equals(this.businessUnitList, other.getBusinessUnitList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBusinessUnitList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessUnitList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessUnitList(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeWithBusinessUnits.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeWithBusinessUnits"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnitList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit"));
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
