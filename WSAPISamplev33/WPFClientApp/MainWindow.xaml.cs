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
using WPFClientApp.Extensions;
using WPFClientApp.Controls;
using WSAPIReferenceLibrary.Helpers;
using WSAPIReferenceLibrary.WSAPIService;
using System.Windows.Threading;
using System.Threading;

namespace WPFClientApp
{
    /// <summary>
    /// Interaction logic for Window1.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        protected WSAPISession currentSession;

        private object SelectedObject
        {
            get;
            set;
        }

        public MainWindow()
        {
            InitializeComponent();
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            if (!this.IsLoggedIn())
            {
                SetInitialUIState();
            }
            else
            {
                SetLogInUIState();
            }
        }

        private void mnuFileExit_Click(object sender, RoutedEventArgs e)
        {
            Application.Current.Shutdown();
        }

        private void ucLogin_LoginClickedEvent(object sender, LoginEventArg e)
        {
            try
            {
                WSHelper.SetClientUrl(e.Account.Url);
                WSHelper.Login(e.Account.AgencyName, e.Account.UserName, e.Account.Password, e.Account.EmployeeCode);

                lblStatusLabel.Content = "Login successful!!!";
                SetLogInUIState();
            }
            catch (System.ServiceModel.FaultException<WSAPISecurityFault> fault)
            {
                MessageBox.Show(fault.Detail.Message);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
            }
        }

        private void SetInitialUIState()
        {
            this.mnuAccountLogout.IsEnabled = false;
            this.mnuActions.IsEnabled = false;
            this.ucLogin.Visibility = Visibility.Visible;
            this.SearchCriteria.Visibility = Visibility.Hidden;
            //this.ViewData.Visibility = Visibility.Hidden;
        }

        private void SetLogInUIState()
        {
            this.mnuActions.IsEnabled = true;
            this.mnuAccountLogout.IsEnabled = true;
            this.mnuAccountLogin.IsEnabled = false;
            this.ucLogin.Visibility = Visibility.Collapsed;
            this.SearchCriteria.Visibility = Visibility.Visible;
            //this.ViewData.Visibility = Visibility.Visible;
        }

        private void mnuAccountLogout_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                WSHelper.Logout();

                lblStatusLabel.Content = "Logout successful!!!";
                SetInitialUIState();
            }
            catch (System.ServiceModel.FaultException<WSAPISecurityFault> fault)
            {
                MessageBox.Show(fault.Detail.Message);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void mnuAccountLogin_Click(object sender, RoutedEventArgs e)
        {

        }

        private void mnuEmployeeFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Employee);
        }

        private void mnuCustomerFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Customer);
        }

        private void HideEditControls()
        {
            this.ViewSingleItem.Visibility = Visibility.Collapsed;
            this.EditCustomer.Visibility = Visibility.Collapsed;
            this.EditEmployee.Visibility = Visibility.Collapsed;
        }

        private void mnuBrokerFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Broker);
        }

        private void mnuBankFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Bank);
        }

        private void ViewSingleItem_EditClickCompleted(object sender, EventArgs e)
        {
            if (SelectedObject is Employee)
            {
                EditEmployee.IsNew = false;
                EditEmployee.DataContext = SelectedObject;
                EditEmployee.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }
            else if (SelectedObject is Customer)
            {
                EditCustomer.IsNew = false;
                EditCustomer.DataContext = SelectedObject;
                EditCustomer.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }
        }

        private void EditEmployee_CloseClicked(object sender, EventArgs e)
        {
            EditEmployee.Visibility = Visibility.Collapsed;
            ViewSingleItem.Visibility = Visibility.Visible;
        }

        private void EditCustomer_CloseClicked(object sender, EventArgs e)
        {
            EditCustomer.Visibility = Visibility.Collapsed;
            ViewSingleItem.Visibility = Visibility.Visible;
        }

        private void mnuPolicyFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Policy);
        }

        private void mnuVendorFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Vendor);
        }

        private void mnuCompanyFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.Company);
        }

        private void mnuBusinessUnitsFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.BusinessUnits);
        }

        private void mnuPlanTypeFind_Click(object sender, RoutedEventArgs e)
        {

        }

        private void mnuS1099Find_Click(object sender, RoutedEventArgs e)
        {

        }
                


        private void ViewSingleItem_NewClickCompleted(object sender, EventArgs e)
        {
            if (SelectedObject is Employee || SelectedObject is EmployeeInfo)
            {
                EditEmployee.IsNew = true;
                EditEmployee.DataContext = new Employee();
                EditEmployee.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }
            else if (SelectedObject is Customer || SelectedObject is CustomerInfo)
            {
                EditCustomer.IsNew = true;
                EditCustomer.DataContext = new Customer();
                EditCustomer.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }

        }

        private void ViewSingleItem_CopyClickCompleted(object sender, EventArgs e)
        {
            if (SelectedObject is Employee)
            {
                Employee employee = (SelectedObject as Employee);
                employee.EmployeeCode = string.Empty;
                EditEmployee.IsNew = true;
                EditEmployee.DataContext = employee;
                EditEmployee.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }
            else if (SelectedObject is Customer)
            {
                Customer customer = (SelectedObject as Customer);
                customer.CustomerId = Guid.Empty;
                customer.CustomerNumber = 0;
                EditCustomer.IsNew = true;
                EditCustomer.DataContext = customer;
                EditCustomer.Visibility = Visibility.Visible;
                ViewSingleItem.Visibility = Visibility.Collapsed;
            }
        }
        
        private void SearchCriteria_ItemSelectedCompleted(object sender, ItemSelectedEventArg e)
        {
            this.ViewSingleItem.HideEdit();
            this.EditEmployee.Visibility = Visibility.Collapsed;
            this.EditCustomer.Visibility = Visibility.Collapsed;
            this.ViewSingleItem.DataContext = e.Result;
            this.SelectedObject = e.Result;
            lblStatusLabel.Content = string.Format("{0} - {1}", Enum.GetName(typeof(EntityTypes), e.EntityType), e.Message);
            ViewSingleItem.Visibility = Visibility.Visible;
            if (e.Result is Employee || e.Result is Customer)
                this.ViewSingleItem.ShowEdit();
            if (e.Result is EmployeeInfo || e.Result is CustomerInfo)
                this.ViewSingleItem.ShowNew();
        }

        private void SearchCriteria_ItemSelectedStarting(object sender, EventArgs e)
        {
            this.EditEmployee.Visibility = Visibility.Collapsed;
            this.EditCustomer.Visibility = Visibility.Collapsed;
            lblStatusLabel.Content = "Starting to Search";
            this.ViewSingleItem.DataContext = null;
            this.ViewSingleItem.HideEdit();
        }

        private void mnuUserNotesFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.UserNote);
        }
        private void mnuLineOfBusinessFind_Click(object sender, RoutedEventArgs e)
        {
            HideEditControls();
            this.SearchCriteria.SetState(EntityTypes.LineOfBusiness);
        }

    }
}
