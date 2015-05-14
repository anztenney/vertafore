/**
 * Doc360Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0.DataContract;

public class Doc360Document  implements java.io.Serializable {
    private java.lang.String doc360DocumentId;

    private java.lang.String description;

    private java.lang.String storageLocation;

    private java.lang.String documentType;

    private java.lang.String securityClass;

    private java.lang.String index1;

    private java.lang.String index2;

    private java.lang.String comments;

    private java.lang.String sourceFileName;

    private java.util.Calendar receivedDateTime;

    private java.util.Calendar processedDateTime;

    private java.lang.Integer totalBytes;

    public Doc360Document() {
    }

    public Doc360Document(
           java.lang.String doc360DocumentId,
           java.lang.String description,
           java.lang.String storageLocation,
           java.lang.String documentType,
           java.lang.String securityClass,
           java.lang.String index1,
           java.lang.String index2,
           java.lang.String comments,
           java.lang.String sourceFileName,
           java.util.Calendar receivedDateTime,
           java.util.Calendar processedDateTime,
           java.lang.Integer totalBytes) {
           this.doc360DocumentId = doc360DocumentId;
           this.description = description;
           this.storageLocation = storageLocation;
           this.documentType = documentType;
           this.securityClass = securityClass;
           this.index1 = index1;
           this.index2 = index2;
           this.comments = comments;
           this.sourceFileName = sourceFileName;
           this.receivedDateTime = receivedDateTime;
           this.processedDateTime = processedDateTime;
           this.totalBytes = totalBytes;
    }


    /**
     * Gets the doc360DocumentId value for this Doc360Document.
     * 
     * @return doc360DocumentId
     */
    public java.lang.String getDoc360DocumentId() {
        return doc360DocumentId;
    }


    /**
     * Sets the doc360DocumentId value for this Doc360Document.
     * 
     * @param doc360DocumentId
     */
    public void setDoc360DocumentId(java.lang.String doc360DocumentId) {
        this.doc360DocumentId = doc360DocumentId;
    }


    /**
     * Gets the description value for this Doc360Document.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Doc360Document.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the storageLocation value for this Doc360Document.
     * 
     * @return storageLocation
     */
    public java.lang.String getStorageLocation() {
        return storageLocation;
    }


    /**
     * Sets the storageLocation value for this Doc360Document.
     * 
     * @param storageLocation
     */
    public void setStorageLocation(java.lang.String storageLocation) {
        this.storageLocation = storageLocation;
    }


    /**
     * Gets the documentType value for this Doc360Document.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this Doc360Document.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the securityClass value for this Doc360Document.
     * 
     * @return securityClass
     */
    public java.lang.String getSecurityClass() {
        return securityClass;
    }


    /**
     * Sets the securityClass value for this Doc360Document.
     * 
     * @param securityClass
     */
    public void setSecurityClass(java.lang.String securityClass) {
        this.securityClass = securityClass;
    }


    /**
     * Gets the index1 value for this Doc360Document.
     * 
     * @return index1
     */
    public java.lang.String getIndex1() {
        return index1;
    }


    /**
     * Sets the index1 value for this Doc360Document.
     * 
     * @param index1
     */
    public void setIndex1(java.lang.String index1) {
        this.index1 = index1;
    }


    /**
     * Gets the index2 value for this Doc360Document.
     * 
     * @return index2
     */
    public java.lang.String getIndex2() {
        return index2;
    }


    /**
     * Sets the index2 value for this Doc360Document.
     * 
     * @param index2
     */
    public void setIndex2(java.lang.String index2) {
        this.index2 = index2;
    }


    /**
     * Gets the comments value for this Doc360Document.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Doc360Document.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the sourceFileName value for this Doc360Document.
     * 
     * @return sourceFileName
     */
    public java.lang.String getSourceFileName() {
        return sourceFileName;
    }


    /**
     * Sets the sourceFileName value for this Doc360Document.
     * 
     * @param sourceFileName
     */
    public void setSourceFileName(java.lang.String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }


    /**
     * Gets the receivedDateTime value for this Doc360Document.
     * 
     * @return receivedDateTime
     */
    public java.util.Calendar getReceivedDateTime() {
        return receivedDateTime;
    }


    /**
     * Sets the receivedDateTime value for this Doc360Document.
     * 
     * @param receivedDateTime
     */
    public void setReceivedDateTime(java.util.Calendar receivedDateTime) {
        this.receivedDateTime = receivedDateTime;
    }


    /**
     * Gets the processedDateTime value for this Doc360Document.
     * 
     * @return processedDateTime
     */
    public java.util.Calendar getProcessedDateTime() {
        return processedDateTime;
    }


    /**
     * Sets the processedDateTime value for this Doc360Document.
     * 
     * @param processedDateTime
     */
    public void setProcessedDateTime(java.util.Calendar processedDateTime) {
        this.processedDateTime = processedDateTime;
    }


    /**
     * Gets the totalBytes value for this Doc360Document.
     * 
     * @return totalBytes
     */
    public java.lang.Integer getTotalBytes() {
        return totalBytes;
    }


    /**
     * Sets the totalBytes value for this Doc360Document.
     * 
     * @param totalBytes
     */
    public void setTotalBytes(java.lang.Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Doc360Document)) return false;
        Doc360Document other = (Doc360Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doc360DocumentId==null && other.getDoc360DocumentId()==null) || 
             (this.doc360DocumentId!=null &&
              this.doc360DocumentId.equals(other.getDoc360DocumentId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.storageLocation==null && other.getStorageLocation()==null) || 
             (this.storageLocation!=null &&
              this.storageLocation.equals(other.getStorageLocation()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.securityClass==null && other.getSecurityClass()==null) || 
             (this.securityClass!=null &&
              this.securityClass.equals(other.getSecurityClass()))) &&
            ((this.index1==null && other.getIndex1()==null) || 
             (this.index1!=null &&
              this.index1.equals(other.getIndex1()))) &&
            ((this.index2==null && other.getIndex2()==null) || 
             (this.index2!=null &&
              this.index2.equals(other.getIndex2()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.sourceFileName==null && other.getSourceFileName()==null) || 
             (this.sourceFileName!=null &&
              this.sourceFileName.equals(other.getSourceFileName()))) &&
            ((this.receivedDateTime==null && other.getReceivedDateTime()==null) || 
             (this.receivedDateTime!=null &&
              this.receivedDateTime.equals(other.getReceivedDateTime()))) &&
            ((this.processedDateTime==null && other.getProcessedDateTime()==null) || 
             (this.processedDateTime!=null &&
              this.processedDateTime.equals(other.getProcessedDateTime()))) &&
            ((this.totalBytes==null && other.getTotalBytes()==null) || 
             (this.totalBytes!=null &&
              this.totalBytes.equals(other.getTotalBytes())));
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
        if (getDoc360DocumentId() != null) {
            _hashCode += getDoc360DocumentId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStorageLocation() != null) {
            _hashCode += getStorageLocation().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getSecurityClass() != null) {
            _hashCode += getSecurityClass().hashCode();
        }
        if (getIndex1() != null) {
            _hashCode += getIndex1().hashCode();
        }
        if (getIndex2() != null) {
            _hashCode += getIndex2().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getSourceFileName() != null) {
            _hashCode += getSourceFileName().hashCode();
        }
        if (getReceivedDateTime() != null) {
            _hashCode += getReceivedDateTime().hashCode();
        }
        if (getProcessedDateTime() != null) {
            _hashCode += getProcessedDateTime().hashCode();
        }
        if (getTotalBytes() != null) {
            _hashCode += getTotalBytes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Doc360Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doc360DocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360DocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("storageLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "StorageLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SecurityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Index1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Index2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SourceFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ReceivedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ProcessedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "TotalBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
