using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single Broker Methods
        public static Broker GetBrokerByCode(string value)
        {
            BrokerGetByCodeRequest request = new BrokerGetByCodeRequest();
            request.BrokerCode = value;
            BrokerGetByCodeResponse response = WSHelper.Client.BrokerGetByCode(WSHelper.CurrentCredentials, request);
            return response.Broker;
        }

        public static Broker GetBrokerByShortName(string value)
        {
            BrokerGetByShortNameRequest request = new BrokerGetByShortNameRequest();
            request.BrokerShortName = value;
            BrokerGetByShortNameResponse response = WSHelper.Client.BrokerGetByShortName(WSHelper.CurrentCredentials, request);
            return response.Broker;
        }
        #endregion

        #region List Broker Methods
        public static List<BrokerInfo> GetAllBrokers()
        {
            BrokerGetListAllResponse response = WSHelper.Client.BrokerGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.BrokerInfoList
                    orderby r.LastName ascending
                    select r).ToList();
        }

        public static List<BrokerInfo> GetBrokerListByLastName(string value)
        {
            BrokerGetListByLastNamePrefixRequest request = new BrokerGetListByLastNamePrefixRequest();
            request.BrokerLastNamePrefix = value;
            BrokerGetListByLastNamePrefixResponse response = WSHelper.Client.BrokerGetListByLastNamePrefix(WSHelper.CurrentCredentials, request);
            return response.BrokerInfoList;
        }
        #endregion


    }
}
