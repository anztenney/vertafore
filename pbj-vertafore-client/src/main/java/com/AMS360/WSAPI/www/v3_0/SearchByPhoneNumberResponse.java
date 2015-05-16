/**
 * SearchByPhoneNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class SearchByPhoneNumberResponse  implements java.io.Serializable {
    private com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse searchByPhoneNumberResult;

    public SearchByPhoneNumberResponse() {
    }

    public SearchByPhoneNumberResponse(
           com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse searchByPhoneNumberResult) {
           this.searchByPhoneNumberResult = searchByPhoneNumberResult;
    }


    /**
     * Gets the searchByPhoneNumberResult value for this SearchByPhoneNumberResponse.
     * 
     * @return searchByPhoneNumberResult
     */
    public com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse getSearchByPhoneNumberResult() {
        return searchByPhoneNumberResult;
    }


    /**
     * Sets the searchByPhoneNumberResult value for this SearchByPhoneNumberResponse.
     * 
     * @param searchByPhoneNumberResult
     */
    public void setSearchByPhoneNumberResult(com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse searchByPhoneNumberResult) {
        this.searchByPhoneNumberResult = searchByPhoneNumberResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchByPhoneNumberResponse)) return false;
        SearchByPhoneNumberResponse other = (SearchByPhoneNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchByPhoneNumberResult==null && other.getSearchByPhoneNumberResult()==null) || 
             (this.searchByPhoneNumberResult!=null &&
              this.searchByPhoneNumberResult.equals(other.getSearchByPhoneNumberResult())));
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
        if (getSearchByPhoneNumberResult() != null) {
            _hashCode += getSearchByPhoneNumberResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchByPhoneNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">SearchByPhoneNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchByPhoneNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "SearchByPhoneNumberResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchByPhoneNumberResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
