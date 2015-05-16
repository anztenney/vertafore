using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region ValueList
        public static List<AllowedValue> GetValueList(string listname)
        {
            ValueListGetRequest request = new ValueListGetRequest();
            request.ListName = listname;
            ValueListGetResponse response = WSHelper.Client.ValueListGet(WSHelper.CurrentCredentials, request);
            return response.AllowedValues;
        }
        #endregion
    }
}
