/**
 * Activity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class Activity  implements java.io.Serializable {
    private java.lang.String activityAction;

    private java.util.Calendar activityDate;

    private java.lang.String activityTypeId;

    private org.apache.axis.types.Duration activityTime;

    private java.lang.Short activityType;

    private java.lang.String description;

    private java.lang.String employeeCode;

    public Activity() {
    }

    public Activity(
           java.lang.String activityAction,
           java.util.Calendar activityDate,
           java.lang.String activityTypeId,
           org.apache.axis.types.Duration activityTime,
           java.lang.Short activityType,
           java.lang.String description,
           java.lang.String employeeCode) {
           this.activityAction = activityAction;
           this.activityDate = activityDate;
           this.activityTypeId = activityTypeId;
           this.activityTime = activityTime;
           this.activityType = activityType;
           this.description = description;
           this.employeeCode = employeeCode;
    }


    /**
     * Gets the activityAction value for this Activity.
     * 
     * @return activityAction
     */
    public java.lang.String getActivityAction() {
        return activityAction;
    }


    /**
     * Sets the activityAction value for this Activity.
     * 
     * @param activityAction
     */
    public void setActivityAction(java.lang.String activityAction) {
        this.activityAction = activityAction;
    }


    /**
     * Gets the activityDate value for this Activity.
     * 
     * @return activityDate
     */
    public java.util.Calendar getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Activity.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Calendar activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the activityTypeId value for this Activity.
     * 
     * @return activityTypeId
     */
    public java.lang.String getActivityTypeId() {
        return activityTypeId;
    }


    /**
     * Sets the activityTypeId value for this Activity.
     * 
     * @param activityTypeId
     */
    public void setActivityTypeId(java.lang.String activityTypeId) {
        this.activityTypeId = activityTypeId;
    }


    /**
     * Gets the activityTime value for this Activity.
     * 
     * @return activityTime
     */
    public org.apache.axis.types.Duration getActivityTime() {
        return activityTime;
    }


    /**
     * Sets the activityTime value for this Activity.
     * 
     * @param activityTime
     */
    public void setActivityTime(org.apache.axis.types.Duration activityTime) {
        this.activityTime = activityTime;
    }


    /**
     * Gets the activityType value for this Activity.
     * 
     * @return activityType
     */
    public java.lang.Short getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this Activity.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.Short activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the description value for this Activity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Activity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the employeeCode value for this Activity.
     * 
     * @return employeeCode
     */
    public java.lang.String getEmployeeCode() {
        return employeeCode;
    }


    /**
     * Sets the employeeCode value for this Activity.
     * 
     * @param employeeCode
     */
    public void setEmployeeCode(java.lang.String employeeCode) {
        this.employeeCode = employeeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity)) return false;
        Activity other = (Activity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityAction==null && other.getActivityAction()==null) || 
             (this.activityAction!=null &&
              this.activityAction.equals(other.getActivityAction()))) &&
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.activityTypeId==null && other.getActivityTypeId()==null) || 
             (this.activityTypeId!=null &&
              this.activityTypeId.equals(other.getActivityTypeId()))) &&
            ((this.activityTime==null && other.getActivityTime()==null) || 
             (this.activityTime!=null &&
              this.activityTime.equals(other.getActivityTime()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.employeeCode==null && other.getEmployeeCode()==null) || 
             (this.employeeCode!=null &&
              this.employeeCode.equals(other.getEmployeeCode())));
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
        if (getActivityAction() != null) {
            _hashCode += getActivityAction().hashCode();
        }
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getActivityTypeId() != null) {
            _hashCode += getActivityTypeId().hashCode();
        }
        if (getActivityTime() != null) {
            _hashCode += getActivityTime().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmployeeCode() != null) {
            _hashCode += getEmployeeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Activity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
