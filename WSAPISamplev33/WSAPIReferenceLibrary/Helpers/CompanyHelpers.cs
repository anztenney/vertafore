using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single Company Methods
        public static Company GetCompanyByCode(string value)
        {
            CompanyGetByCodeRequest request = new CompanyGetByCodeRequest();
            request.CompanyCode = value;
            CompanyGetByCodeResponse response = WSHelper.Client.CompanyGetByCode(WSHelper.CurrentCredentials, request);
            return response.Company;
        }

        public static Company GetCompanyByShortName(string value)
        {
            CompanyGetByShortNameRequest request = new CompanyGetByShortNameRequest();
            request.CompanyShortName = value;
            CompanyGetByShortNameResponse response = WSHelper.Client.CompanyGetByShortName(WSHelper.CurrentCredentials, request);
            return response.Company;
        }
        #endregion

        #region List Company Methods
        public static List<CompanyInfo> GetCompanyListByName(string value)
        {
            CompanyGetListByNamePrefixRequest request = new CompanyGetListByNamePrefixRequest();
            request.CompanyNamePrefix = value;
            CompanyGetListByNamePrefixResponse response = WSHelper.Client.CompanyGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.CompanyInfoList;
        }

        public static List<CompanyInfo> GetAllCompanies()
        {
            CompanyGetListAllResponse response = WSHelper.Client.CompanyGetListAll(WSHelper.CurrentCredentials);
            return response.CompanyInfoList;
        }
        #endregion
    }
}
