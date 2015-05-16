using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single LineOfBusiness Methods
        public static LineOfBusiness GetLineOfBusinessByCode(string value)
        {
            LineOfBusinessGetByCodeRequest request = new LineOfBusinessGetByCodeRequest();
            request.LineOfBusinessCode = value;
            LineOfBusinessGetByCodeResponse response = WSHelper.Client.LineOfBusinessGetByCode(WSHelper.CurrentCredentials, request);
            return response.LineOfBusiness;
        }

        #endregion

        #region List LineOfBusiness Methods
        public static List<LineOfBusinessInfo> GetLineOfBusinessByCriteria(short? typeOfBusinessCode, string incomeGroup)
        {
            LineOfBusinessGetListRequest request = new LineOfBusinessGetListRequest();
            request.TypeOfBusinessCode = typeOfBusinessCode;
            request.IncomeGroup = incomeGroup;
            LineOfBusinessGetListResponse response = WSHelper.Client.LineOfBusinessGetList(WSHelper.CurrentCredentials, request);
            return response.LineOfBusinessInfoList;
        }

        public static List<LineOfBusinessInfo> GetAllLineOfBusiness()
        {
            LineOfBusinessGetListRequest request = new LineOfBusinessGetListRequest();
            request.TypeOfBusinessCode = null;
            request.IncomeGroup = null;
            LineOfBusinessGetListResponse response = WSHelper.Client.LineOfBusinessGetList(WSHelper.CurrentCredentials, request);
            return response.LineOfBusinessInfoList;
        }

        #endregion
    }
}
