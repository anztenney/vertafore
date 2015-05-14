/**
 * CustomerProfileAnswer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CustomerProfileAnswer  implements java.io.Serializable {
    private java.lang.String questionText;

    private java.lang.String answerText;

    private java.lang.Short typeOfBusiness;

    private java.lang.String answerFormat;

    private java.lang.Integer answerLength;

    private java.lang.String customerId;

    private java.lang.String questionId;

    public CustomerProfileAnswer() {
    }

    public CustomerProfileAnswer(
           java.lang.String questionText,
           java.lang.String answerText,
           java.lang.Short typeOfBusiness,
           java.lang.String answerFormat,
           java.lang.Integer answerLength,
           java.lang.String customerId,
           java.lang.String questionId) {
           this.questionText = questionText;
           this.answerText = answerText;
           this.typeOfBusiness = typeOfBusiness;
           this.answerFormat = answerFormat;
           this.answerLength = answerLength;
           this.customerId = customerId;
           this.questionId = questionId;
    }


    /**
     * Gets the questionText value for this CustomerProfileAnswer.
     * 
     * @return questionText
     */
    public java.lang.String getQuestionText() {
        return questionText;
    }


    /**
     * Sets the questionText value for this CustomerProfileAnswer.
     * 
     * @param questionText
     */
    public void setQuestionText(java.lang.String questionText) {
        this.questionText = questionText;
    }


    /**
     * Gets the answerText value for this CustomerProfileAnswer.
     * 
     * @return answerText
     */
    public java.lang.String getAnswerText() {
        return answerText;
    }


    /**
     * Sets the answerText value for this CustomerProfileAnswer.
     * 
     * @param answerText
     */
    public void setAnswerText(java.lang.String answerText) {
        this.answerText = answerText;
    }


    /**
     * Gets the typeOfBusiness value for this CustomerProfileAnswer.
     * 
     * @return typeOfBusiness
     */
    public java.lang.Short getTypeOfBusiness() {
        return typeOfBusiness;
    }


    /**
     * Sets the typeOfBusiness value for this CustomerProfileAnswer.
     * 
     * @param typeOfBusiness
     */
    public void setTypeOfBusiness(java.lang.Short typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }


    /**
     * Gets the answerFormat value for this CustomerProfileAnswer.
     * 
     * @return answerFormat
     */
    public java.lang.String getAnswerFormat() {
        return answerFormat;
    }


    /**
     * Sets the answerFormat value for this CustomerProfileAnswer.
     * 
     * @param answerFormat
     */
    public void setAnswerFormat(java.lang.String answerFormat) {
        this.answerFormat = answerFormat;
    }


    /**
     * Gets the answerLength value for this CustomerProfileAnswer.
     * 
     * @return answerLength
     */
    public java.lang.Integer getAnswerLength() {
        return answerLength;
    }


    /**
     * Sets the answerLength value for this CustomerProfileAnswer.
     * 
     * @param answerLength
     */
    public void setAnswerLength(java.lang.Integer answerLength) {
        this.answerLength = answerLength;
    }


    /**
     * Gets the customerId value for this CustomerProfileAnswer.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerProfileAnswer.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the questionId value for this CustomerProfileAnswer.
     * 
     * @return questionId
     */
    public java.lang.String getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this CustomerProfileAnswer.
     * 
     * @param questionId
     */
    public void setQuestionId(java.lang.String questionId) {
        this.questionId = questionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerProfileAnswer)) return false;
        CustomerProfileAnswer other = (CustomerProfileAnswer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionText==null && other.getQuestionText()==null) || 
             (this.questionText!=null &&
              this.questionText.equals(other.getQuestionText()))) &&
            ((this.answerText==null && other.getAnswerText()==null) || 
             (this.answerText!=null &&
              this.answerText.equals(other.getAnswerText()))) &&
            ((this.typeOfBusiness==null && other.getTypeOfBusiness()==null) || 
             (this.typeOfBusiness!=null &&
              this.typeOfBusiness.equals(other.getTypeOfBusiness()))) &&
            ((this.answerFormat==null && other.getAnswerFormat()==null) || 
             (this.answerFormat!=null &&
              this.answerFormat.equals(other.getAnswerFormat()))) &&
            ((this.answerLength==null && other.getAnswerLength()==null) || 
             (this.answerLength!=null &&
              this.answerLength.equals(other.getAnswerLength()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId())));
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
        if (getQuestionText() != null) {
            _hashCode += getQuestionText().hashCode();
        }
        if (getAnswerText() != null) {
            _hashCode += getAnswerText().hashCode();
        }
        if (getTypeOfBusiness() != null) {
            _hashCode += getTypeOfBusiness().hashCode();
        }
        if (getAnswerFormat() != null) {
            _hashCode += getAnswerFormat().hashCode();
        }
        if (getAnswerLength() != null) {
            _hashCode += getAnswerLength().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerProfileAnswer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "QuestionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AnswerText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TypeOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AnswerFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AnswerLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "QuestionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
