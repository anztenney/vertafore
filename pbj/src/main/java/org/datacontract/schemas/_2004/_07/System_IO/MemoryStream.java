/**
 * MemoryStream.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.System_IO;

public class MemoryStream  extends org.datacontract.schemas._2004._07.System_IO.Stream  implements java.io.Serializable {
    private byte[] _buffer;

    private int _capacity;

    private boolean _expandable;

    private boolean _exposable;

    private boolean _isOpen;

    private int _length;

    private int _origin;

    private int _position;

    private boolean _writable;

    public MemoryStream() {
    }

    public MemoryStream(
           java.lang.Object __identity,
           byte[] _buffer,
           int _capacity,
           boolean _expandable,
           boolean _exposable,
           boolean _isOpen,
           int _length,
           int _origin,
           int _position,
           boolean _writable) {
        super(
            __identity);
        this._buffer = _buffer;
        this._capacity = _capacity;
        this._expandable = _expandable;
        this._exposable = _exposable;
        this._isOpen = _isOpen;
        this._length = _length;
        this._origin = _origin;
        this._position = _position;
        this._writable = _writable;
    }


    /**
     * Gets the _buffer value for this MemoryStream.
     * 
     * @return _buffer
     */
    public byte[] get_buffer() {
        return _buffer;
    }


    /**
     * Sets the _buffer value for this MemoryStream.
     * 
     * @param _buffer
     */
    public void set_buffer(byte[] _buffer) {
        this._buffer = _buffer;
    }


    /**
     * Gets the _capacity value for this MemoryStream.
     * 
     * @return _capacity
     */
    public int get_capacity() {
        return _capacity;
    }


    /**
     * Sets the _capacity value for this MemoryStream.
     * 
     * @param _capacity
     */
    public void set_capacity(int _capacity) {
        this._capacity = _capacity;
    }


    /**
     * Gets the _expandable value for this MemoryStream.
     * 
     * @return _expandable
     */
    public boolean is_expandable() {
        return _expandable;
    }


    /**
     * Sets the _expandable value for this MemoryStream.
     * 
     * @param _expandable
     */
    public void set_expandable(boolean _expandable) {
        this._expandable = _expandable;
    }


    /**
     * Gets the _exposable value for this MemoryStream.
     * 
     * @return _exposable
     */
    public boolean is_exposable() {
        return _exposable;
    }


    /**
     * Sets the _exposable value for this MemoryStream.
     * 
     * @param _exposable
     */
    public void set_exposable(boolean _exposable) {
        this._exposable = _exposable;
    }


    /**
     * Gets the _isOpen value for this MemoryStream.
     * 
     * @return _isOpen
     */
    public boolean is_isOpen() {
        return _isOpen;
    }


    /**
     * Sets the _isOpen value for this MemoryStream.
     * 
     * @param _isOpen
     */
    public void set_isOpen(boolean _isOpen) {
        this._isOpen = _isOpen;
    }


    /**
     * Gets the _length value for this MemoryStream.
     * 
     * @return _length
     */
    public int get_length() {
        return _length;
    }


    /**
     * Sets the _length value for this MemoryStream.
     * 
     * @param _length
     */
    public void set_length(int _length) {
        this._length = _length;
    }


    /**
     * Gets the _origin value for this MemoryStream.
     * 
     * @return _origin
     */
    public int get_origin() {
        return _origin;
    }


    /**
     * Sets the _origin value for this MemoryStream.
     * 
     * @param _origin
     */
    public void set_origin(int _origin) {
        this._origin = _origin;
    }


    /**
     * Gets the _position value for this MemoryStream.
     * 
     * @return _position
     */
    public int get_position() {
        return _position;
    }


    /**
     * Sets the _position value for this MemoryStream.
     * 
     * @param _position
     */
    public void set_position(int _position) {
        this._position = _position;
    }


    /**
     * Gets the _writable value for this MemoryStream.
     * 
     * @return _writable
     */
    public boolean is_writable() {
        return _writable;
    }


    /**
     * Sets the _writable value for this MemoryStream.
     * 
     * @param _writable
     */
    public void set_writable(boolean _writable) {
        this._writable = _writable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemoryStream)) return false;
        MemoryStream other = (MemoryStream) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this._buffer==null && other.get_buffer()==null) || 
             (this._buffer!=null &&
              java.util.Arrays.equals(this._buffer, other.get_buffer()))) &&
            this._capacity == other.get_capacity() &&
            this._expandable == other.is_expandable() &&
            this._exposable == other.is_exposable() &&
            this._isOpen == other.is_isOpen() &&
            this._length == other.get_length() &&
            this._origin == other.get_origin() &&
            this._position == other.get_position() &&
            this._writable == other.is_writable();
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
        if (get_buffer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_buffer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_buffer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += get_capacity();
        _hashCode += (is_expandable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (is_exposable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (is_isOpen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += get_length();
        _hashCode += get_origin();
        _hashCode += get_position();
        _hashCode += (is_writable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemoryStream.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "MemoryStream"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_buffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_buffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_expandable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_expandable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_exposable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_exposable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_isOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_isOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_writable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "_writable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
