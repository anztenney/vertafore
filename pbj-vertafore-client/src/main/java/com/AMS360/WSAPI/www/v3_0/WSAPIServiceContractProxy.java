package com.AMS360.WSAPI.www.v3_0;

public class WSAPIServiceContractProxy implements com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType {
  private String _endpoint = null;
  private com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType wSAPIServiceContract_PortType = null;
  
  public WSAPIServiceContractProxy() {
    _initWSAPIServiceContractProxy();
  }
  
  public WSAPIServiceContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAPIServiceContractProxy();
  }
  
  private void _initWSAPIServiceContractProxy() {
    try {
      wSAPIServiceContract_PortType = (new com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_ServiceLocator()).getBasicHttpBinding_WSAPIServiceContract();
      if (wSAPIServiceContract_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAPIServiceContract_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAPIServiceContract_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAPIServiceContract_PortType != null)
      ((javax.xml.rpc.Stub)wSAPIServiceContract_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AMS360.WSAPI.www.v3_0.WSAPIServiceContract_PortType getWSAPIServiceContract_PortType() {
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType;
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginResponse fileChunkBegin(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkBeginRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.fileChunkBegin(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendResponse fileChunkSend(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkSendRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.fileChunkSend(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndResponse fileChunkEnd(com.AMS360.WSAPI.www.v3_0.DataContract.FileChunkEndRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.fileChunkEnd(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.AMS360UrlResponse AMS360AgencyUrlGet() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.AMS360AgencyUrlGet();
  }
  
  public void login(com.AMS360.WSAPI.www.v3_0.DataContract.LoginRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.login(request);
  }
  
  public void logout() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.logout();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetResponse valueListGet(com.AMS360.WSAPI.www.v3_0.DataContract.ValueListGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.valueListGet(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertResponse employeeInsert(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeInsert(request);
  }
  
  public void employeeUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.employeeUpdate(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeResponse employeeGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameResponse employeeGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixResponse employeeGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeGetListByLastNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeResponse employeeGetListByType(com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListByTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeGetListByType(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.EmployeeGetListAllResponse employeeGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.employeeGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeResponse GLDivisionGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDivisionGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameResponse GLDivisionGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDivisionGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixResponse GLDivisionGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDivisionGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDivisionGetListAllResponse GLDivisionGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDivisionGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeResponse GLBranchGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLBranchGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameResponse GLBranchGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLBranchGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixResponse GLBranchGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLBranchGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListAllResponse GLBranchGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLBranchGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeResponse GLBranchGetListByGLDivisionCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLBranchGetListByGLDivisionCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLBranchGetListByGLDivisionCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeResponse GLDepartmentGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDepartmentGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameResponse GLDepartmentGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDepartmentGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixResponse GLDepartmentGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDepartmentGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListAllResponse GLDepartmentGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDepartmentGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeResponse GLDepartmentGetListByGLBranchCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLDepartmentGetListByGLBranchCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLDepartmentGetListByGLBranchCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeResponse GLGroupGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLGroupGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameResponse GLGroupGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLGroupGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixResponse GLGroupGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLGroupGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListAllResponse GLGroupGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLGroupGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeResponse GLGroupGetListByGLDepartmentCode(com.AMS360.WSAPI.www.v3_0.DataContract.GLGroupGetListByGLDepartmentCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.GLGroupGetListByGLDepartmentCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixResponse brokerGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.brokerGetListByLastNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeResponse brokerGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.brokerGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameResponse brokerGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.brokerGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BrokerGetListAllResponse brokerGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.brokerGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeResponse companyGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameResponse companyGetByShortName(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetByShortNameRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetByShortName(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixResponse companyGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeResponse companyGetListByParentCompanyCode(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByParentCompanyCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetListByParentCompanyCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeResponse companyGetListByType(com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListByTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetListByType(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CompanyGetListAllResponse companyGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.companyGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdResponse customerGetById(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerGetById(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberResponse customerGetByNumber(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetByNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerGetByNumber(request);
  }
  
  public void customerUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerUpdate(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertResponse customerInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixResponse customerGetListByNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerGetListByNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerGetListByNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListResponse customerContactGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerContactGetList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetResponse customerContactGet(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerContactGet(request);
  }
  
  public void customerContactDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerContactDelete(request);
  }
  
  public void customerContactUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerContactUpdate(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertResponse customerContactInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerContactInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerContactInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListResponse customerProfileAnswerGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerProfileAnswerGetList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetResponse customerProfileAnswerGet(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerProfileAnswerGet(request);
  }
  
  public void customerProfileAnswerUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerProfileAnswerUpdate(request);
  }
  
  public void customerProfileAnswerDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerProfileAnswerDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerProfileAnswerDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListResponse customerServicePersonnelGetList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerServicePersonnelGetList(request);
  }
  
  public void customerServicePersonnelModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerServicePersonnelModifyListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerServicePersonnelModifyList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeResponse planTypeGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.planTypeGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeResponse planTypeGetListByCompanyCode(com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListByCompanyCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.planTypeGetListByCompanyCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PlanTypeGetListAllResponse planTypeGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.planTypeGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.S1099GetListResponse s1099GetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.s1099GetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelListResponse policyServicePersonnelGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyServicePersonnelGetList(request);
  }
  
  public void policyServicePersonnelModifyList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyServicePersonnelModifyListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyServicePersonnelModifyList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetResponse policyGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGet(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdResponse policyGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGetListByCustomerId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberResponse policyGetListByCustomerNumber(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByCustomerNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGetListByCustomerNumber(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberResponse policyGetListByPolicyNumber(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGetListByPolicyNumber(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateResponse policyGetListByPolicyNumberAndDate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetListByPolicyNumberAndDateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGetListByPolicyNumberAndDate(request);
  }
  
  public void policyCorrect(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyCorrectRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyCorrect(request);
  }
  
  public void policyDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertResponse policyInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewResponse policyRenew(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyRenewRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyRenew(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetResponse policyTransactionPremiumGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyTransactionPremiumGet(request);
  }
  
  public void policyTransactionPremiumUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyTransactionPremiumUpdate(request);
  }
  
  public void policyTransactionPremiumDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyTransactionPremiumDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertResponse policyTransactionPremiumInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyTransactionPremiumInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyResponse policyTransactionPremiumGetListForPolicy(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyTransactionPremiumGetListForPolicyRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyTransactionPremiumGetListForPolicy(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkResponse policyGetRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyGetRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyGetRemark(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkResponse policyInsertRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyInsertRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyInsertRemark(request);
  }
  
  public void policyDeleteRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyDeleteRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyDeleteRemark(request);
  }
  
  public void policyUpdateRemark(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyUpdateRemarkRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyUpdateRemark(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetResponse policyContactGet(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyContactGet(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListResponse policyContactGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyContactGetList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertResponse policyContactInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.policyContactInsert(request);
  }
  
  public void policyContactUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyContactUpdate(request);
  }
  
  public void policyContactDelete(com.AMS360.WSAPI.www.v3_0.DataContract.PolicyContactDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.policyContactDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeResponse vendorGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyResponse vendorGetListByIsCompany(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByIsCompanyRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorGetListByIsCompany(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixResponse vendorGetListByLastNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListByLastNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorGetListByLastNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorGetListAllResponse vendorGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdResponse vendorInvoiceGetById(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorInvoiceGetById(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorResponse vendorInvoiceGetListByVendor(com.AMS360.WSAPI.www.v3_0.DataContract.VendorInvoiceGetListByVendorRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.vendorInvoiceGetListByVendor(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeResponse bankGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.bankGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeResponse bankGetListByAccountType(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByAccountTypeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.bankGetListByAccountType(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixResponse bankGetListByBankNamePrefix(com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListByBankNamePrefixRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.bankGetListByBankNamePrefix(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.BankGetListAllResponse bankGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.bankGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdResponse claimGetById(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetByIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.claimGetById(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdResponse claimGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.claimGetListByCustomerId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdResponse claimGetListByPolicyId(com.AMS360.WSAPI.www.v3_0.DataContract.ClaimGetListByPolicyIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.claimGetListByPolicyId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.AgencyInfoGetResponse agencyInfoGet() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.agencyInfoGet();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListResponse personalNoteGetList(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.personalNoteGetList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteGetListAllResponse personalNoteGetListAll() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.personalNoteGetListAll();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertResponse personalNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.PersonalNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.personalNoteInsert(request);
  }
  
  public byte[] personalNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.personalNoteGetNoteTextById(request);
  }
  
  public void personalNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.personalNoteUpdateNoteText(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertResponse customerNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerNoteInsert(request);
  }
  
  public void customerNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerNoteUpdateNoteText(request);
  }
  
  public byte[] customerNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerNoteGetNoteTextById(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertResponse commonNoteInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonNoteInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonNoteInsert(request);
  }
  
  public void commonNoteUpdateNoteText(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.commonNoteUpdateNoteText(request);
  }
  
  public byte[] commonNoteGetNoteTextById(com.AMS360.WSAPI.www.v3_0.DataContract.NoteTextGetRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonNoteGetNoteTextById(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeResponse lineOfBusinessGetByCode(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetByCodeRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.lineOfBusinessGetByCode(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListResponse lineOfBusinessGetList(com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.lineOfBusinessGetList(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.LineOfBusinessGetListAllResponse lineOfBusinessGetAllList() throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.lineOfBusinessGetAllList();
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertResponse customerSuspenseInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerSuspenseInsert(request);
  }
  
  public void customerSuspenseUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerSuspenseUpdate(request);
  }
  
  public void customerSuspenseDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.customerSuspenseDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdResponse customerSuspenseGetBySuspenseId(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetBySuspenseIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerSuspenseGetBySuspenseId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdResponse customerSuspenseGetListByCustomerId(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerSuspenseGetListByCustomerIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerSuspenseGetListByCustomerId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertResponse commonSuspenseInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonSuspenseInsert(request);
  }
  
  public void commonSuspenseUpdate(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseUpdateRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.commonSuspenseUpdate(request);
  }
  
  public void commonSuspenseDelete(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseDeleteRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    wSAPIServiceContract_PortType.commonSuspenseDelete(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdResponse commonSuspenseGetBySuspenseId(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetBySuspenseIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonSuspenseGetBySuspenseId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdResponse commonSuspenseGetListByEntityId(com.AMS360.WSAPI.www.v3_0.DataContract.CommonSuspenseGetListByEntityIdRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonSuspenseGetListByEntityId(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertResponse customerActivityInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CustomerActivityInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.customerActivityInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertResponse commonActivityInsert(com.AMS360.WSAPI.www.v3_0.DataContract.CommonActivityInsertRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.commonActivityInsert(request);
  }
  
  public com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberResponse searchByPhoneNumber(com.AMS360.WSAPI.www.v3_0.DataContract.SearchByPhoneNumberRequest request) throws java.rmi.RemoteException, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPISecurityFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIBusinessFault, com.AMS360.WSAPI.www.v3_0.DataContract.WSAPIGeneralFault{
    if (wSAPIServiceContract_PortType == null)
      _initWSAPIServiceContractProxy();
    return wSAPIServiceContract_PortType.searchByPhoneNumber(request);
  }
  
  
}