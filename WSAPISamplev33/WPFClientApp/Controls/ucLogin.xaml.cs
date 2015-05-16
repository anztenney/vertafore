using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using WPFClientApp.Entities;
using System.Configuration;

namespace WPFClientApp.Controls
{
    /// <summary>
    /// Interaction logic for ucLogin.xaml
    /// </summary>
    public partial class ucLogin : UserControl
    {
        public event EventHandler<LoginEventArg> LoginClickedEvent;

        public ucLogin()
        {
            InitializeComponent();            
        }

        private void btnLogin_Click(object sender, RoutedEventArgs e)
        {
            if (LoginClickedEvent != null)
            {
                LoginEventArg arg = new LoginEventArg();
                arg.Account = new LoginAccount() { 
                        AgencyName = cboAgencys.Text, 
                        UserName = txtUserName.Text, 
                        Password = txtPassword.Text, 
                        EmployeeCode = txtEmployeeCode.Text,
                        Url = txtUrl.Text
                };
                this.LoginClickedEvent(this, arg);
            }
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            try
            {
                cboAgencys.Text = ConfigurationManager.AppSettings["DefaultAgencyNumber"];
                txtUserName.Text = ConfigurationManager.AppSettings["DefaultUserName"];
                txtPassword.Text = ConfigurationManager.AppSettings["DefaultPassword"];
                txtUrl.Text = ConfigurationManager.AppSettings["DefaultUrl"];
            }
            catch { }
        }
    }
}
