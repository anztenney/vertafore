using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;


namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Static Constructor
        static WSHelper()
        {
        }

        public static void SetClientUrl(string url)
        {
            Client = new WSAPIServiceContractClient("BasicHttpBinding_WSAPIServiceContract", url);
        }
        #endregion

        #region Static Properties
        private static WSAPISession CurrentCredentials
        {
            get;
            set;
        }

        private static WSAPIServiceContractClient Client
        {
            get;
            set;
        }
        #endregion

        #region Authentication
        public static void Login(string agencyName, string username, string password)
        {
            Login(agencyName, username, password, string.Empty);
        }

        public static void Login(string agencyName, string username, string password, string employeeCode)
        {
            try
            {
                LoginRequest request = new LoginRequest() { AgencyNo = agencyName, LoginId = username, Password = password, EmployeeCode = employeeCode };
                CurrentCredentials = Client.Login(request);
            }
            catch
            {
                throw;
            }
        }

        public static void Logout()
        {
            try
            {
                Client.Logout(CurrentCredentials);
            }
            catch
            {
                throw;
            }
            finally
            {
                CurrentCredentials = null;
            }
        }
        #endregion

 

    }
}

