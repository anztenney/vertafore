/**
 * WSAPIServiceContract_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class WSAPIServiceContract_ServiceLocator extends org.apache.axis.client.Service implements com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_Service {

    public WSAPIServiceContract_ServiceLocator() {
    }


    public WSAPIServiceContract_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSAPIServiceContract_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_WSAPIServiceContract
    private java.lang.String BasicHttpBinding_WSAPIServiceContract_address = "https://wsapi.ams360.com/v3/WSAPIService.svc";

    public java.lang.String getBasicHttpBinding_WSAPIServiceContractAddress() {
        return BasicHttpBinding_WSAPIServiceContract_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_WSAPIServiceContractWSDDServiceName = "BasicHttpBinding_WSAPIServiceContract";

    public java.lang.String getBasicHttpBinding_WSAPIServiceContractWSDDServiceName() {
        return BasicHttpBinding_WSAPIServiceContractWSDDServiceName;
    }

    public void setBasicHttpBinding_WSAPIServiceContractWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_WSAPIServiceContractWSDDServiceName = name;
    }

    public com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType getBasicHttpBinding_WSAPIServiceContract() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_WSAPIServiceContract_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_WSAPIServiceContract(endpoint);
    }

    public com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType getBasicHttpBinding_WSAPIServiceContract(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AMS360.WSAPI.www.v3_0.BasicHttpBinding_WSAPIServiceContractStub _stub = new com.AMS360.WSAPI.www.v3_0.BasicHttpBinding_WSAPIServiceContractStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_WSAPIServiceContractWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_WSAPIServiceContractEndpointAddress(java.lang.String address) {
        BasicHttpBinding_WSAPIServiceContract_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AMS360.WSAPI.www.v3_0.BasicHttpBinding_WSAPIServiceContractStub _stub = new com.AMS360.WSAPI.www.v3_0.BasicHttpBinding_WSAPIServiceContractStub(new java.net.URL(BasicHttpBinding_WSAPIServiceContract_address), this);
                _stub.setPortName(getBasicHttpBinding_WSAPIServiceContractWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_WSAPIServiceContract".equals(inputPortName)) {
            return getBasicHttpBinding_WSAPIServiceContract();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "WSAPIServiceContract");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BasicHttpBinding_WSAPIServiceContract"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_WSAPIServiceContract".equals(portName)) {
            setBasicHttpBinding_WSAPIServiceContractEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
