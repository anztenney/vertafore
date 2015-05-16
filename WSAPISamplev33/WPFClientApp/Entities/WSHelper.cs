using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WPFClientApp.WSAPIService;

namespace WPFClientApp.Entities
{
    public static class WSHelper
    {
        public static WSAPISession CurrentCredentials
        {
            get;
            private set;
        }

        public static WSAPIServiceContractClient Client
        {
            get;
            private set;
        }

        static WSHelper()
        {
            Client = new WSAPIServiceContractClient();
        }

        public static void Login(string agencyName, string username, string password)
        {
            LoginRequest request = new LoginRequest() { AgencyNo = agencyName, LoginId = username, Password = password, EmployeeCode = string.Empty };
            CurrentCredentials = Client.Login(request);
        }
    }
}

