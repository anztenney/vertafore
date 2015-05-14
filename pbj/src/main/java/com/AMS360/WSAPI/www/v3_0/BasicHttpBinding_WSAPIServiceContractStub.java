/**
 * BasicHttpBinding_WSAPIServiceContractStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AMS360.WSAPI.www.v3_0;

public class BasicHttpBinding_WSAPIServiceContractStub extends org.apache.axis.client.Stub implements com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[129];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileChunkBegin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkBeginRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkBeginResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkBeginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileChunkSend");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkSendRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkSendResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkSendResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FileChunkEnd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkEndRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkEndResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkEndResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AMS360AgencyUrlGet");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AMS360UrlResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "AMS360AgencyUrlGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LoginRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.LoginRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logout");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValueListGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ValueListGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ValueListGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ValueListGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeGetListByLastNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByLastNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByLastNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListByLastNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeGetListByType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByTypeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByTypeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListByTypeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmployeeGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDivisionGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDivisionGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDivisionGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDivisionGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLBranchGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLBranchGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLBranchGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLBranchGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLBranchGetListByGLDivisionCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByGLDivisionCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByGLDivisionCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListByGLDivisionCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDepartmentGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDepartmentGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDepartmentGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDepartmentGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLDepartmentGetListByGLBranchCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByGLBranchCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByGLBranchCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListByGLBranchCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLGroupGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLGroupGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLGroupGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLGroupGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GLGroupGetListByGLDepartmentCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByGLDepartmentCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByGLDepartmentCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListByGLDepartmentCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrokerGetListByLastNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetListByLastNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrokerGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrokerGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrokerGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetByShortName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByShortNameRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByShortNameResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetByShortNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetListByParentCompanyCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByParentCompanyCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByParentCompanyCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByParentCompanyCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetListByType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByTypeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByTypeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByTypeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CompanyGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerGetById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerGetByNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByNumberRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByNumberResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetByNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerGetListByNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetListByNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetListByNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetListByNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContactGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContactGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContactDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContactUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContactInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerProfileAnswerGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerProfileAnswerGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerProfileAnswerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerProfileAnswerDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerServicePersonnelGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerServicePersonnelGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerServicePersonnelModifyList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelModifyListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelModifyListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlanTypeGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlanTypeGetListByCompanyCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListByCompanyCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListByCompanyCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetListByCompanyCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlanTypeGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("S1099GetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099GetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "S1099GetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyServicePersonnelGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyServicePersonnelGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyServicePersonnelModifyList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelModifyListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelModifyListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGetListByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByCustomerIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGetListByCustomerNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerNumberRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerNumberResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByCustomerNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGetListByPolicyNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByPolicyNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGetListByPolicyNumberAndDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberAndDateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberAndDateResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByPolicyNumberAndDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyCorrect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyCorrectRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyCorrectRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyRenew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRenewRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRenewResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyRenewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyTransactionPremiumGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyTransactionPremiumUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyTransactionPremiumDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyTransactionPremiumInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyTransactionPremiumGetListForPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetListForPolicyRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetListForPolicyResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumGetListForPolicyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyGetRemark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRemarkRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRemarkResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetRemarkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyInsertRemark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRemarkRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRemarkResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyInsertRemarkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyDeleteRemark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyDeleteRemarkRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRemarkRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyUpdateRemark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyUpdateRemarkRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyUpdateRemarkRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyContactGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyContactGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyContactInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyContactUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PolicyContactDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorGetListByIsCompany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByIsCompanyRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByIsCompanyResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListByIsCompanyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorGetListByLastNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByLastNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByLastNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListByLastNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorInvoiceGetById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorInvoiceGetByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VendorInvoiceGetListByVendor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetListByVendorRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetListByVendorResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorInvoiceGetListByVendorResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BankGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BankGetListByAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByAccountTypeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByAccountTypeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListByAccountTypeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BankGetListByBankNamePrefix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListByBankNamePrefixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BankGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClaimGetById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetByIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetByIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClaimGetListByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByCustomerIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByCustomerIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetListByCustomerIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClaimGetListByPolicyId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByPolicyIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByPolicyIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetListByPolicyIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgencyInfoGet");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AgencyInfoGetResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "AgencyInfoGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonalNoteGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonalNoteGetListAll");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetListAllResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonalNoteInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonalNoteGetNoteTextById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/Message", "StreamBody"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetNoteTextByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PersonalNoteUpdateNoteText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerNoteInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNoteInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNoteInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerNoteUpdateNoteText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerNoteGetNoteTextById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/Message", "StreamBody"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteGetNoteTextByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonNoteInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNoteInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNoteInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonNoteUpdateNoteText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonNoteGetNoteTextById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextGetRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/Message", "StreamBody"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteGetNoteTextByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LineOfBusinessGetByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetByCodeRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetByCodeResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetByCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LineOfBusinessGetList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LineOfBusinessGetAllList");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListAllResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetAllListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSuspenseInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSuspenseUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSuspenseDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSuspenseGetBySuspenseId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetBySuspenseIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetBySuspenseIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseGetBySuspenseIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerSuspenseGetListByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetListByCustomerIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetListByCustomerIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseGetListByCustomerIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonSuspenseInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonSuspenseUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseUpdateRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseUpdateRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonSuspenseDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseDeleteRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseDeleteRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonSuspenseGetBySuspenseId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetBySuspenseIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetBySuspenseIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseGetBySuspenseIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonSuspenseGetListByEntityId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetListByEntityIdRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetListByEntityIdResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseGetListByEntityIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerActivityInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivityInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivityInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerActivityInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CommonActivityInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonActivityInsertRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonActivityInsertResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonActivityInsertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchByPhoneNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchByPhoneNumberRequest"), com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchByPhoneNumberResponse"));
        oper.setReturnClass(com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "SearchByPhoneNumberResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"),
                      "com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault",
                      new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault"), 
                      true
                     ));
        _operations[128] = oper;

    }

    public BasicHttpBinding_WSAPIServiceContractStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_WSAPIServiceContractStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_WSAPIServiceContractStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "MemoryStream");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.System_IO.MemoryStream.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.IO", "Stream");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.System_IO.Stream.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System", "MarshalByRefObject");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.System.MarshalByRefObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Duration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/Message", "StreamBody");
            cachedSerQNames.add(qName);
            cls = byte[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Activity");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AgencyInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AgencyInfoGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AllowedValue");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.AllowedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AMS360UrlResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfAllowedValue");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.AllowedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AllowedValue");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "AllowedValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfBankInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfBrokerInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfBusinessUnit");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfClaimContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContact");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfClaimContactInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfClaimInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCommonSuspenseInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCompanyInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerContactResponsibility");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerProfileAnswer");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerServicePersonnel");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfCustomerSuspenseInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfDoc360Document");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfEmployeeInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfGLBranch");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranch");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfGLDepartment");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfGLDivision");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivision");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivision");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfGLGroup");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroup");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfLineOfBusinessInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPersonalNote");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNote");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNote");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPlanType");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContact");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyLineOfBusiness");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyPersonnel");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyTransaction");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransaction");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransaction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfPolicyTransactionPremium");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfS1099CategoryInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfS1099TypeInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfSearchResultInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.SearchResultInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchResultInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchResultInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfVendorInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfVendorInvoiceInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceInfo");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ArrayOfWSAPIBusinessFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFaultDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFaultDetail");
            qName2 = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFaultDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Bank");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Bank.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByAccountTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByAccountTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankGetListByBankNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BankInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Broker");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Broker.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerGetListByLastNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BrokerInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BrokerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "BusinessUnit");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.BusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Claim");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Claim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimContactInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimContactInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetByIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByCustomerIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByCustomerIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByPolicyIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimGetListByPolicyIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ClaimInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ClaimInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonActivityInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonActivityInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNote");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNoteInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonNoteInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspense");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetBySuspenseIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetBySuspenseIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetListByEntityIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseGetListByEntityIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CommonSuspenseUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Company");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Company.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByParentCompanyCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByParentCompanyCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyGetListByTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CompanyInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CompanyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Customer");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivity");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivityInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerActivityInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactResponsibility");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactResponsibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerContactUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetByNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNote");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNoteInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerNoteInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswer");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerProfileAnswerUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnel");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerServicePersonnelModifyListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelModifyListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspense");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetBySuspenseIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetBySuspenseIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetListByCustomerIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseGetListByCustomerIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerSuspenseUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "CustomerUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.CustomerUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Doc360Document");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Doc360Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Employee");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Employee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByLastNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByLastNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeGetListByTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "EmployeeWithBusinessUnits");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeWithBusinessUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunk");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkBeginRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkBeginResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkEndRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkEndResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkSendRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "FileChunkSendResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranch");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByGLDivisionCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByGLDivisionCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLBranchGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartment");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByGLBranchCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByGLBranchCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDepartmentGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivision");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLDivisionGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroup");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByShortNameRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetByShortNameResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByGLDepartmentCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByGLDepartmentCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "GLGroupGetListByNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusiness");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusiness.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LineOfBusinessInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "LoginRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.LoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "NoteTextUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNote");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PersonalNoteInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanType");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListByCompanyCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PlanTypeGetListByCompanyCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Policy");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Policy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContact");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyContactUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyCorrectRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyCorrectRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyDeleteRemarkRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRemarkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByCustomerNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberAndDateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberAndDateResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetListByPolicyNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRemarkRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRemarkResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRemarkRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRemarkResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyLineOfBusiness");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyLineOfBusiness.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyPersonnel");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyPersonnel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRemark");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRemark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRenewRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyRenewResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelGetListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelGetListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyServicePersonnelModifyListRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelModifyListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransaction");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremium");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremium.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetListForPolicyRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetListForPolicyResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyTransactionPremiumUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "PolicyUpdateRemarkRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.PolicyUpdateRemarkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099CategoryInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.S1099CategoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099GetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "S1099TypeInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.S1099TypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchByPhoneNumberRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchByPhoneNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "SearchResultInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.SearchResultInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ValueListGetRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "ValueListGetResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "Vendor");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.Vendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetByCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListAllResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByIsCompanyRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByIsCompanyResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByLastNamePrefixRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorGetListByLastNamePrefixResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoice");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetListByVendorRequest");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceGetListByVendorResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "VendorInvoiceInfo");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFault");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIBusinessFaultDetail");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFaultDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPIGeneralFault");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0/DataContract", "WSAPISecurityFault");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonActivityInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonActivityInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonActivityInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonActivityInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteGetNoteTextById");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteGetNoteTextById.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteGetNoteTextByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteGetNoteTextByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteUpdateNoteText");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteUpdateNoteText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonNoteUpdateNoteTextResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonNoteUpdateNoteTextResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseDelete");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseDeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseDeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseGetBySuspenseId");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseGetBySuspenseId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseGetBySuspenseIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseGetBySuspenseIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseGetListByEntityId");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseGetListByEntityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseGetListByEntityIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseGetListByEntityIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseUpdate");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CommonSuspenseUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CommonSuspenseUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerActivityInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerActivityInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerActivityInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerActivityInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteGetNoteTextById");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteGetNoteTextById.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteGetNoteTextByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteGetNoteTextByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteUpdateNoteText");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteUpdateNoteText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerNoteUpdateNoteTextResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerNoteUpdateNoteTextResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseDelete");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseDelete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseDeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseDeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseGetBySuspenseId");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseGetBySuspenseId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseGetBySuspenseIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseGetBySuspenseIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseGetListByCustomerId");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseGetListByCustomerId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseGetListByCustomerIdResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseGetListByCustomerIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseInsert");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseInsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseUpdate");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">CustomerSuspenseUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.CustomerSuspenseUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetAllList");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetAllList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetAllListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetAllListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetByCode");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetByCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetList");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">LineOfBusinessGetListResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.LineOfBusinessGetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">PersonalNoteUpdateNoteTextResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.PersonalNoteUpdateNoteTextResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">SearchByPhoneNumber");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.SearchByPhoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", ">SearchByPhoneNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.SearchByPhoneNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "WSAPISession");
            cachedSerQNames.add(qName);
            cls = com.AMS360.WSAPI.www.v3_0.WSAPISession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse fileChunkBegin(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/FileChunkBegin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkBegin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse fileChunkSend(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/FileChunkSend");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkSend"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse fileChunkEnd(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/FileChunkEnd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "FileChunkEnd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse AMS360AgencyUrlGet() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/AMS360AgencyUrlGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "AMS360AgencyUrlGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void login(com.AMS360.WSAPI.www.v3_0.DataContract.LoginRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/Login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/Logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "Logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse valueListGet(com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/ValueListGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ValueListGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse employeeInsert(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void employeeUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse employeeGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse employeeGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse employeeGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeGetListByLastNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListByLastNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse employeeGetListByType(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeGetListByType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListByType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse employeeGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/EmployeeGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "EmployeeGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse GLDivisionGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDivisionGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse GLDivisionGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDivisionGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse GLDivisionGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDivisionGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse GLDivisionGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDivisionGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDivisionGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse GLBranchGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLBranchGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse GLBranchGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLBranchGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse GLBranchGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLBranchGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse GLBranchGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLBranchGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse GLBranchGetListByGLDivisionCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLBranchGetListByGLDivisionCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLBranchGetListByGLDivisionCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse GLDepartmentGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDepartmentGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse GLDepartmentGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDepartmentGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse GLDepartmentGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDepartmentGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse GLDepartmentGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDepartmentGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse GLDepartmentGetListByGLBranchCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLDepartmentGetListByGLBranchCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLDepartmentGetListByGLBranchCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse GLGroupGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLGroupGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse GLGroupGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLGroupGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse GLGroupGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLGroupGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse GLGroupGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLGroupGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse GLGroupGetListByGLDepartmentCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/GLGroupGetListByGLDepartmentCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "GLGroupGetListByGLDepartmentCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse brokerGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BrokerGetListByLastNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetListByLastNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse brokerGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BrokerGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse brokerGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BrokerGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse brokerGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BrokerGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BrokerGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse companyGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse companyGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetByShortName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetByShortName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse companyGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse companyGetListByParentCompanyCode(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetListByParentCompanyCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByParentCompanyCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse companyGetListByType(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetListByType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListByType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse companyGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CompanyGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CompanyGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse customerGetById(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerGetById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse customerGetByNumber(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerGetByNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetByNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse customerInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse customerGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerGetListByNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerGetListByNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse customerContactGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerContactGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse customerContactGet(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerContactGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerContactDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerContactDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerContactUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerContactUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse customerContactInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerContactInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerContactInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse customerProfileAnswerGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerProfileAnswerGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse customerProfileAnswerGet(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerProfileAnswerGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerProfileAnswerUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerProfileAnswerUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerProfileAnswerDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerProfileAnswerDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerProfileAnswerDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse customerServicePersonnelGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerServicePersonnelGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerServicePersonnelGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerServicePersonnelModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelModifyListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerServicePersonnelModifyList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerServicePersonnelModifyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse planTypeGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PlanTypeGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse planTypeGetListByCompanyCode(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PlanTypeGetListByCompanyCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetListByCompanyCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse planTypeGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PlanTypeGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PlanTypeGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse s1099GetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/S1099GetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "S1099GetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse policyServicePersonnelGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyServicePersonnelGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyServicePersonnelGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyServicePersonnelModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelModifyListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyServicePersonnelModifyList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyServicePersonnelModifyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse policyGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse policyGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGetListByCustomerId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse policyGetListByCustomerNumber(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGetListByCustomerNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByCustomerNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse policyGetListByPolicyNumber(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGetListByPolicyNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByPolicyNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse policyGetListByPolicyNumberAndDate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGetListByPolicyNumberAndDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetListByPolicyNumberAndDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyCorrect(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyCorrectRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyCorrect");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyCorrect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse policyInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse policyRenew(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyRenew");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyRenew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse policyTransactionPremiumGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyTransactionPremiumGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyTransactionPremiumUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyTransactionPremiumUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyTransactionPremiumDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyTransactionPremiumDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse policyTransactionPremiumInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyTransactionPremiumInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse policyTransactionPremiumGetListForPolicy(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyTransactionPremiumGetListForPolicy");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyTransactionPremiumGetListForPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse policyGetRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyGetRemark");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyGetRemark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse policyInsertRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyInsertRemark");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyInsertRemark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyDeleteRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyDeleteRemark");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyDeleteRemark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyUpdateRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyUpdateRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyUpdateRemark");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyUpdateRemark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse policyContactGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyContactGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse policyContactGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyContactGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse policyContactInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyContactInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyContactUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyContactUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void policyContactDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PolicyContactDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PolicyContactDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse vendorGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse vendorGetListByIsCompany(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorGetListByIsCompany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListByIsCompany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse vendorGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorGetListByLastNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListByLastNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse vendorGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse vendorInvoiceGetById(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorInvoiceGetById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorInvoiceGetById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse vendorInvoiceGetListByVendor(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/VendorInvoiceGetListByVendor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "VendorInvoiceGetListByVendor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse bankGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BankGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse bankGetListByAccountType(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BankGetListByAccountType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListByAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse bankGetListByBankNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BankGetListByBankNamePrefix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListByBankNamePrefix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse bankGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/BankGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "BankGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse claimGetById(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/ClaimGetById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse claimGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/ClaimGetListByCustomerId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetListByCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse claimGetListByPolicyId(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/ClaimGetListByPolicyId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "ClaimGetListByPolicyId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse agencyInfoGet() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/AgencyInfoGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "AgencyInfoGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse personalNoteGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PersonalNoteGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse personalNoteGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PersonalNoteGetListAll");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetListAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse personalNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PersonalNoteInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] personalNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PersonalNoteGetNoteTextById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteGetNoteTextById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void personalNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/PersonalNoteUpdateNoteText");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "PersonalNoteUpdateNoteText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse customerNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerNoteInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerNoteUpdateNoteText");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteUpdateNoteText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] customerNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerNoteGetNoteTextById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerNoteGetNoteTextById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse commonNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonNoteInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void commonNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonNoteUpdateNoteText");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteUpdateNoteText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] commonNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonNoteGetNoteTextById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonNoteGetNoteTextById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse lineOfBusinessGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/LineOfBusinessGetByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse lineOfBusinessGetList(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/LineOfBusinessGetList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse lineOfBusinessGetAllList() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/LineOfBusinessGetAllList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "LineOfBusinessGetAllList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse customerSuspenseInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerSuspenseInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerSuspenseUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerSuspenseUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customerSuspenseDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerSuspenseDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse customerSuspenseGetBySuspenseId(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerSuspenseGetBySuspenseId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseGetBySuspenseId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse customerSuspenseGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerSuspenseGetListByCustomerId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerSuspenseGetListByCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse commonSuspenseInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonSuspenseInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void commonSuspenseUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonSuspenseUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void commonSuspenseDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonSuspenseDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse commonSuspenseGetBySuspenseId(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonSuspenseGetBySuspenseId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseGetBySuspenseId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse commonSuspenseGetListByEntityId(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonSuspenseGetListByEntityId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonSuspenseGetListByEntityId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse customerActivityInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CustomerActivityInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CustomerActivityInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse commonActivityInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/CommonActivityInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "CommonActivityInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse searchByPhoneNumber(com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.WSAPI.AMS360.com/v3.0/WSAPIServiceContract/SearchByPhoneNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.WSAPI.AMS360.com/v3.0", "SearchByPhoneNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) {
              throw (com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
