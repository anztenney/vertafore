using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region S1099
        public static List<S1099CategoryInfo> GetAllS1099Categories()
        {
            S1099GetListResponse response = WSHelper.Client.S1099GetListAll(WSHelper.CurrentCredentials);
            return (from r in response.S1099CategoryInfoList
                    orderby r.S1099Category ascending
                    select r).ToList();
        }

        #endregion
    }
}
