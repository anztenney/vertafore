/**
 * CommonSuspense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class CommonSuspense  implements java.io.Serializable {
    private java.lang.String suspenseId;

    private java.lang.String suspenseTypeId;

    private java.lang.Short suspenseType;

    private java.lang.String suspenseAction;

    private java.util.Calendar initiatedDate;

    private java.lang.String initiatedByEmployeeCode;

    private java.lang.String assignedToEmployeeCode;

    private java.util.Calendar dueDate;

    private org.apache.axis.types.UnsignedByte timesRescheduled;

    private java.lang.String description;

    private java.lang.Short priority;

    private java.lang.Boolean isCompleted;

    private java.lang.String completedBy;

    private java.util.Calendar completedDate;

    public CommonSuspense() {
    }

    public CommonSuspense(
           java.lang.String suspenseId,
           java.lang.String suspenseTypeId,
           java.lang.Short suspenseType,
           java.lang.String suspenseAction,
           java.util.Calendar initiatedDate,
           java.lang.String initiatedByEmployeeCode,
           java.lang.String assignedToEmployeeCode,
           java.util.Calendar dueDate,
           org.apache.axis.types.UnsignedByte timesRescheduled,
           java.lang.String description,
           java.lang.Short priority,
           java.lang.Boolean isCompleted,
           java.lang.String completedBy,
           java.util.Calendar completedDate) {
           this.suspenseId = suspenseId;
           this.suspenseTypeId = suspenseTypeId;
           this.suspenseType = suspenseType;
           this.suspenseAction = suspenseAction;
           this.initiatedDate = initiatedDate;
           this.initiatedByEmployeeCode = initiatedByEmployeeCode;
           this.assignedToEmployeeCode = assignedToEmployeeCode;
           this.dueDate = dueDate;
           this.timesRescheduled = timesRescheduled;
           this.description = description;
           this.priority = priority;
           this.isCompleted = isCompleted;
           this.completedBy = completedBy;
           this.completedDate = completedDate;
    }


    /**
     * Gets the suspenseId value for this CommonSuspense.
     * 
     * @return suspenseId
     */
    public java.lang.String getSuspenseId() {
        return suspenseId;
    }


    /**
     * Sets the suspenseId value for this CommonSuspense.
     * 
     * @param suspenseId
     */
    public void setSuspenseId(java.lang.String suspenseId) {
        this.suspenseId = suspenseId;
    }


    /**
     * Gets the suspenseTypeId value for this CommonSuspense.
     * 
     * @return suspenseTypeId
     */
    public java.lang.String getSuspenseTypeId() {
        return suspenseTypeId;
    }


    /**
     * Sets the suspenseTypeId value for this CommonSuspense.
     * 
     * @param suspenseTypeId
     */
    public void setSuspenseTypeId(java.lang.String suspenseTypeId) {
        this.suspenseTypeId = suspenseTypeId;
    }


    /**
     * Gets the suspenseType value for this CommonSuspense.
     * 
     * @return suspenseType
     */
    public java.lang.Short getSuspenseType() {
        return suspenseType;
    }


    /**
     * Sets the suspenseType value for this CommonSuspense.
     * 
     * @param suspenseType
     */
    public void setSuspenseType(java.lang.Short suspenseType) {
        this.suspenseType = suspenseType;
    }


    /**
     * Gets the suspenseAction value for this CommonSuspense.
     * 
     * @return suspenseAction
     */
    public java.lang.String getSuspenseAction() {
        return suspenseAction;
    }


    /**
     * Sets the suspenseAction value for this CommonSuspense.
     * 
     * @param suspenseAction
     */
    public void setSuspenseAction(java.lang.String suspenseAction) {
        this.suspenseAction = suspenseAction;
    }


    /**
     * Gets the initiatedDate value for this CommonSuspense.
     * 
     * @return initiatedDate
     */
    public java.util.Calendar getInitiatedDate() {
        return initiatedDate;
    }


    /**
     * Sets the initiatedDate value for this CommonSuspense.
     * 
     * @param initiatedDate
     */
    public void setInitiatedDate(java.util.Calendar initiatedDate) {
        this.initiatedDate = initiatedDate;
    }


    /**
     * Gets the initiatedByEmployeeCode value for this CommonSuspense.
     * 
     * @return initiatedByEmployeeCode
     */
    public java.lang.String getInitiatedByEmployeeCode() {
        return initiatedByEmployeeCode;
    }


    /**
     * Sets the initiatedByEmployeeCode value for this CommonSuspense.
     * 
     * @param initiatedByEmployeeCode
     */
    public void setInitiatedByEmployeeCode(java.lang.String initiatedByEmployeeCode) {
        this.initiatedByEmployeeCode = initiatedByEmployeeCode;
    }


    /**
     * Gets the assignedToEmployeeCode value for this CommonSuspense.
     * 
     * @return assignedToEmployeeCode
     */
    public java.lang.String getAssignedToEmployeeCode() {
        return assignedToEmployeeCode;
    }


    /**
     * Sets the assignedToEmployeeCode value for this CommonSuspense.
     * 
     * @param assignedToEmployeeCode
     */
    public void setAssignedToEmployeeCode(java.lang.String assignedToEmployeeCode) {
        this.assignedToEmployeeCode = assignedToEmployeeCode;
    }


    /**
     * Gets the dueDate value for this CommonSuspense.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CommonSuspense.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the timesRescheduled value for this CommonSuspense.
     * 
     * @return timesRescheduled
     */
    public org.apache.axis.types.UnsignedByte getTimesRescheduled() {
        return timesRescheduled;
    }


    /**
     * Sets the timesRescheduled value for this CommonSuspense.
     * 
     * @param timesRescheduled
     */
    public void setTimesRescheduled(org.apache.axis.types.UnsignedByte timesRescheduled) {
        this.timesRescheduled = timesRescheduled;
    }


    /**
     * Gets the description value for this CommonSuspense.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CommonSuspense.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the priority value for this CommonSuspense.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CommonSuspense.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the isCompleted value for this CommonSuspense.
     * 
     * @return isCompleted
     */
    public java.lang.Boolean getIsCompleted() {
        return isCompleted;
    }


    /**
     * Sets the isCompleted value for this CommonSuspense.
     * 
     * @param isCompleted
     */
    public void setIsCompleted(java.lang.Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


    /**
     * Gets the completedBy value for this CommonSuspense.
     * 
     * @return completedBy
     */
    public java.lang.String getCompletedBy() {
        return completedBy;
    }


    /**
     * Sets the completedBy value for this CommonSuspense.
     * 
     * @param completedBy
     */
    public void setCompletedBy(java.lang.String completedBy) {
        this.completedBy = completedBy;
    }


    /**
     * Gets the completedDate value for this CommonSuspense.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this CommonSuspense.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonSuspense)) return false;
        CommonSuspense other = (CommonSuspense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suspenseId==null && other.getSuspenseId()==null) || 
             (this.suspenseId!=null &&
              this.suspenseId.equals(other.getSuspenseId()))) &&
            ((this.suspenseTypeId==null && other.getSuspenseTypeId()==null) || 
             (this.suspenseTypeId!=null &&
              this.suspenseTypeId.equals(other.getSuspenseTypeId()))) &&
            ((this.suspenseType==null && other.getSuspenseType()==null) || 
             (this.suspenseType!=null &&
              this.suspenseType.equals(other.getSuspenseType()))) &&
            ((this.suspenseAction==null && other.getSuspenseAction()==null) || 
             (this.suspenseAction!=null &&
              this.suspenseAction.equals(other.getSuspenseAction()))) &&
            ((this.initiatedDate==null && other.getInitiatedDate()==null) || 
             (this.initiatedDate!=null &&
              this.initiatedDate.equals(other.getInitiatedDate()))) &&
            ((this.initiatedByEmployeeCode==null && other.getInitiatedByEmployeeCode()==null) || 
             (this.initiatedByEmployeeCode!=null &&
              this.initiatedByEmployeeCode.equals(other.getInitiatedByEmployeeCode()))) &&
            ((this.assignedToEmployeeCode==null && other.getAssignedToEmployeeCode()==null) || 
             (this.assignedToEmployeeCode!=null &&
              this.assignedToEmployeeCode.equals(other.getAssignedToEmployeeCode()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.timesRescheduled==null && other.getTimesRescheduled()==null) || 
             (this.timesRescheduled!=null &&
              this.timesRescheduled.equals(other.getTimesRescheduled()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isCompleted==null && other.getIsCompleted()==null) || 
             (this.isCompleted!=null &&
              this.isCompleted.equals(other.getIsCompleted()))) &&
            ((this.completedBy==null && other.getCompletedBy()==null) || 
             (this.completedBy!=null &&
              this.completedBy.equals(other.getCompletedBy()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate())));
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
        if (getSuspenseId() != null) {
            _hashCode += getSuspenseId().hashCode();
        }
        if (getSuspenseTypeId() != null) {
            _hashCode += getSuspenseTypeId().hashCode();
        }
        if (getSuspenseType() != null) {
            _hashCode += getSuspenseType().hashCode();
        }
        if (getSuspenseAction() != null) {
            _hashCode += getSuspenseAction().hashCode();
        }
        if (getInitiatedDate() != null) {
            _hashCode += getInitiatedDate().hashCode();
        }
        if (getInitiatedByEmployeeCode() != null) {
            _hashCode += getInitiatedByEmployeeCode().hashCode();
        }
        if (getAssignedToEmployeeCode() != null) {
            _hashCode += getAssignedToEmployeeCode().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getTimesRescheduled() != null) {
            _hashCode += getTimesRescheduled().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsCompleted() != null) {
            _hashCode += getIsCompleted().hashCode();
        }
        if (getCompletedBy() != null) {
            _hashCode += getCompletedBy().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonSuspense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspenseAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SuspenseAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InitiatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatedByEmployeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "InitiatedByEmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedToEmployeeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AssignedToEmployeeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timesRescheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TimesRescheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "IsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompletedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
