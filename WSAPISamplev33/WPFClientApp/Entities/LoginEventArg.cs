using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WPFClientApp.Entities
{
    public class LoginEventArg : EventArgs
    {
        public LoginAccount Account
        {
            get;
            set;
        }
    }
}
