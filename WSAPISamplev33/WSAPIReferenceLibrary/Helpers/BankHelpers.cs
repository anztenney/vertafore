using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {

        #region Single Bank Methods
        public static Bank GetBankByCode(string value)
        {
            BankGetByCodeRequest request = new BankGetByCodeRequest();
            request.BankCode = value;
            BankGetByCodeResponse response = WSHelper.Client.BankGetByCode(WSHelper.CurrentCredentials, request);
            return response.Bank;
        }

        #endregion

        #region List Bank Methods
        public static List<BankInfo> GetBanksByNamePrefix(string value)
        {
            BankGetListByBankNamePrefixRequest request = new BankGetListByBankNamePrefixRequest();
            request.BankNamePrefix = value;
            BankGetListByBankNamePrefixResponse response = WSHelper.Client.BankGetListByBankNamePrefix(WSHelper.CurrentCredentials, request);
            return response.BankInfoList;
        }

        public static List<BankInfo> GetAllBanks()
        {
            BankGetListAllResponse response = WSHelper.Client.BankGetListAll(WSHelper.CurrentCredentials);
            return response.BankInfoList;
        }

        #endregion
    }
}
