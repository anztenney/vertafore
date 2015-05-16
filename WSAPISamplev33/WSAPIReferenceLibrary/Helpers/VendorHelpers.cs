using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single Vendor Methods
        public static Vendor GetVendorByCode(string value)
        {
            VendorGetByCodeRequest request = new VendorGetByCodeRequest();
            request.VendorCode = value;
            VendorGetByCodeResponse response = WSHelper.Client.VendorGetByCode(WSHelper.CurrentCredentials, request);
            return response.Vendor;
        }
        #endregion

        #region List Vendor Methods
        public static List<VendorInfo> GetVendorListByLastName(string value)
        {
            VendorGetListByLastNamePrefixRequest request = new VendorGetListByLastNamePrefixRequest();
            request.VendorLastNamePrefix = value;
            VendorGetListByLastNamePrefixResponse response = WSHelper.Client.VendorGetListByLastNamePrefix(WSHelper.CurrentCredentials, request);
            return response.VendorInfoList;
        }

        public static List<VendorInfo> GetVendorListByIsCompany(bool value)
        {
            VendorGetListByIsCompanyRequest request = new VendorGetListByIsCompanyRequest();
            request.IsCompany = value;
            VendorGetListByIsCompanyResponse response = WSHelper.Client.VendorGetListByIsCompany(WSHelper.CurrentCredentials, request);
            return response.VendorInfoList;
        }

        public static List<VendorInfo> GetAllVendors()
        {
            VendorGetListAllResponse response = WSHelper.Client.VendorGetListAll(WSHelper.CurrentCredentials);
            return response.VendorInfoList;
        }
        #endregion
    }
}
