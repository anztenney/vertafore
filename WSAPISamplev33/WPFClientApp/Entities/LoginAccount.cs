using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WPFClientApp.Entities
{
    public class LoginAccount
    {
        /// <summary>
        /// Gets the agency name, which is used to determine which client environment to use
        /// </summary>
        public string AgencyName
        {
            get;
            set;
        }

        /// <summary>
        /// Gets the User name of the API user
        /// </summary>
        public string UserName
        {
            get;
            set;
        }

        /// <summary>
        /// Gets the Password of the API User
        /// </summary>
        public string Password
        {
            get;
            set;
        }

        /// <summary>
        /// Gets the Employee code
        /// </summary>
        public string EmployeeCode
        {
            get;
            set;
        }

        public string Url
        {
            get;
            set;
        }

        /// <summary>
        /// Default Constructor
        /// </summary>
        public LoginAccount()
        {
        }

    }
}
