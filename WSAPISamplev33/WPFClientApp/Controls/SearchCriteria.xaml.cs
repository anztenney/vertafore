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
using System.ServiceModel;
using WSAPIReferenceLibrary.Helpers;
using WSAPIReferenceLibrary.WSAPIService;

namespace WPFClientApp.Controls
{
    /// <summary>
    /// Interaction logic for SearchCriteria.xaml
    /// </summary>
    public partial class SearchCriteria : UserControl
    {
        public event EventHandler ItemSelectedStarting;
        public event EventHandler<ItemSelectedEventArg> ItemSelectedCompleted;


        public EntityTypes CurrentSearchType
        {
            get;
            set;
        }

        public SearchCriteria()
        {
            InitializeComponent();
        }


        public void SetState(EntityTypes mode)
        {
            this.CurrentSearchType = mode;
            SetUIState();
        }

        private string SearchValue
        {
            get
            {
                if (chkEmptyNull.IsChecked.HasValue && chkEmptyNull.IsChecked == true)
                    return null;
                else
                    return txtSearchValue.Text;

            }
            set
            {
                if (chkEmptyNull.IsChecked.HasValue && chkEmptyNull.IsChecked == false)
                {
                    txtSearchValue.Text = value;
                }
            }
        }

        #region Object Specific Searches
        private void ExecuteEmployeeSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("EmployeeItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Employee result = WSHelper.GetEmployeeByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Employee, Result = result, Message = "By Code" });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                List<EmployeeInfo> results = WSHelper.GetEmployeebyLastName(SearchValue);
                this.ViewData.ItemsSource = (from r in results
                                             orderby r.LastName ascending
                                             select r);
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                Employee response = WSHelper.GetEmployeeByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Employee, Result = response, Message = "By Short Name" });
                }
            }

            if (rbNoFilter.IsChecked.Value == true)
            {

                this.ViewData.ItemsSource = (from r in WSHelper.GetAllEmployees()
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new EmployeeInfo(), "All Selected");
            }
        }

        private void ExecuteCustomerSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("EmployeeItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Customer customer = WSHelper.GetCustomerById(new Guid(SearchValue));
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Customer, Result = customer });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                Customer customer = WSHelper.GetCustomerByNumber(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Customer, Result = customer });
                }
            }

            if (rbNoFilter.IsChecked.Value == true)
            {
                string customerType = string.Empty;
                string namePrefix = string.Empty;
                bool isBrokerCustomer = false;

                if (string.IsNullOrEmpty(SearchValue))
                    namePrefix = null;
                else
                    namePrefix = SearchValue;

                isBrokerCustomer = false;

                if (string.IsNullOrEmpty(customerType))
                    customerType = null;
                if (rbCustTypeC.IsChecked.Value == true)
                    customerType = "C";
                if (rbCustTypeP.IsChecked.Value == true)
                    customerType = "P";
                if (rbCustTypeS.IsChecked.Value == true)
                    customerType = "S";

                this.ViewData.ItemsSource = (from r in WSHelper.GetCustomerList(customerType, namePrefix, isBrokerCustomer)
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new CustomerInfo(), "All Selected");
            }
        }

        private void ExecuteBankSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("BankItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Bank result = WSHelper.GetBankByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Bank, Result = result, Message = "Search by Code" });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetBanksByNamePrefix(SearchValue)
                                             orderby r.BankName ascending
                                             select r);

                //CallHandlerWithType(new BankInfo(), String.Format("{0} {1}", SearchValue, "Search by Name"));
            }

            if (rbNoFilter.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllBanks()
                                             orderby r.BankName ascending
                                             select r);
                CallHandlerWithType(new BankInfo(), "All Selected");
            }
        }

        private void ExecuteBrokerSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("EmployeeItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Broker broker = WSHelper.GetBrokerByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Broker, Result = broker, Message = "By Code" });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetBrokerListByLastName(SearchValue)
                                             orderby r.LastName ascending
                                             select r);
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                Broker broker = WSHelper.GetBrokerByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Broker, Result = broker, Message = "By Short Name" });
                }
            }

            if (rbNoFilter.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllBrokers()
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new BrokerInfo(), "All Selected");
            }
        }

        private void ExecuteVendorSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("EmployeeItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Vendor vendor = WSHelper.GetVendorByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Vendor, Result = vendor, Message = "By Code" });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetVendorListByLastName(SearchValue)
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new BrokerInfo(), "By Name");
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetVendorListByIsCompany(Convert.ToBoolean(SearchValue))
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new BrokerInfo(), "By Short Name");
            }

            if (rbNoFilter.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllVendors()
                                             orderby r.LastName ascending
                                             select r);
                CallHandlerWithType(new BrokerInfo(), "All Selected");
            }
        }

        private void ExecuteCompanySearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("CompanyItemTemplate") as DataTemplate;

            if (rbByCode.IsChecked.Value == true)
            {
                Company company = WSHelper.GetCompanyByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Company, Result = company, Message = "By code" });
                }
            }

            if (rbByName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetCompanyListByName(SearchValue)
                                             orderby r.Name ascending
                                             select r);
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                Company company = WSHelper.GetCompanyByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Company, Result = company, Message = "By Short Name" });
                }
            }

            if (rbNoFilter.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllCompanies()
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new CompanyInfo(), "All Selected");
            }
        }

        private void ExecuteBusinessUnitsSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("CompanyItemTemplate") as DataTemplate;

            if (rbDivisionByCode.IsChecked.Value == true)
            {
                GLDivision division = WSHelper.GetDivisionByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = division, Message = "By Code" });
                }
            }

            if (rbDivisionByShortName.IsChecked.Value == true)
            {
                GLDivision division = WSHelper.GetDivisionByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = division, Message = "By Short Name" });
                }
            }

            if (rbDivisionByLastName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetDivisionListByName(SearchValue)
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLDivision(), "By Last Name");
            }

            if (rbDivisionAll.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllDivisions()
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLDivision(), "All Selected");
            }

            if (rbBranchByCode.IsChecked.Value == true)
            {
                GLBranch branch = WSHelper.GetBranchByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = branch, Message = "By Code" });
                }
            }

            if (rbBranchByShortName.IsChecked.Value == true)
            {
                GLBranch branch = WSHelper.GetBranchByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = branch, Message = "By Short Name" });
                }
            }

            if (rbBranchByLastName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetBranchesListByName(SearchValue)
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLBranch(), "By Last Name");
            }

            if (rbBranchAll.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllBranches()
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLBranch(), "All Selected");
            }

            if (rbDeptByCode.IsChecked.Value == true)
            {
                GLDepartment department = WSHelper.GetDepartmentByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = department, Message = "By Code" });
                }
            }

            if (rbDeptByShortName.IsChecked.Value == true)
            {
                GLDepartment department = WSHelper.GetDepartmentByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = department, Message = "By Short Name" });
                }
            }

            if (rbDeptByLastName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetDepartmentListByName(SearchValue)
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLDepartment(), "By Last Name");
            }

            if (rbDeptAll.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllDepartments()
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLDepartment(), "All Selected");
            }

            if (rbGroupByCode.IsChecked.Value == true)
            {
                GLGroup group = WSHelper.GetGroupByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = group, Message = "By Code" });
                }
            }

            if (rbGroupByShortName.IsChecked.Value == true)
            {
                GLGroup group = WSHelper.GetGroupByShortName(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = group, Message = "By Short Name" });
                }
            }

            if (rbGroupByLastName.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetGroupListByName(SearchValue)
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLGroup(), "All Selected");
            }

            if (rbGroupAll.IsChecked.Value == true)
            {
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllGroups()
                                             orderby r.Name ascending
                                             select r);
                CallHandlerWithType(new GLGroup(), "All Selected");
            }

        }

        private void ExecuteUserNoteSearch()
        {
            this.ViewData.ItemTemplate = this.FindResource("UserNoteItemTemplate") as DataTemplate;
            if (dpDateFrom.SelectedDate.HasValue || dpDateTo.SelectedDate.HasValue || dpPurgeDateFrom.SelectedDate.HasValue || dpPurgeDateTo.SelectedDate.HasValue || chkOnlyAttachments.IsChecked == true)
            {
                bool isChecked = false;
                if (chkOnlyAttachments.IsChecked == true)
                    isChecked = true;

                this.ViewData.ItemsSource = (from r in WSHelper.GetAllUserNotesWithParameters(dpDateFrom.SelectedDate, dpDateTo.SelectedDate, isChecked, dpPurgeDateFrom.SelectedDate, dpPurgeDateTo.SelectedDate)
                                             orderby r.NoteDate ascending
                                             select r);
                CallHandlerWithType(new PersonalNote(), "Filtered List");
            }
            else
            { 
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllUserNotes()
                                             orderby r.NoteDate ascending
                                             select r);
                CallHandlerWithType(new PersonalNote(), "All Selected");
            }

        }

        private void ExecuteLineOfBusinessSearch()
        {

            if (chkEmptyNull.IsChecked.Value == true && cmbTypeOfBusiness.SelectedIndex == 0 && cmbIncomeGroup.SelectedIndex == 0) 
            {
                cmbTypeOfBusiness.SelectedIndex = 0;
                cmbIncomeGroup.SelectedIndex = 0;

                this.ViewData.ItemTemplate = this.FindResource("LineOfBusinessItemTemplate") as DataTemplate;
                this.ViewData.ItemsSource = (from r in WSHelper.GetAllLineOfBusiness()
                                             orderby r.Description ascending
                                             select r);
                CallHandlerWithType(new LineOfBusinessInfo(), "All Selected");
                return;
            }


            if (chkEmptyNull.IsChecked.Value == true)
            {
                cmbTypeOfBusiness.SelectedIndex = 0;
                cmbIncomeGroup.SelectedIndex = 0;

                LineOfBusiness lob = WSHelper.GetLineOfBusinessByCode(null);
                this.ViewData.ItemsSource = (from r in WSHelper.GetLineOfBusinessByCriteria(Convert.ToInt16(cmbTypeOfBusiness.Text), Convert.ToString(cmbIncomeGroup.Text))
                                             orderby r.Description ascending
                                             select r);
                return;
            }

     
            if (txtSearchValue.Text.Length > 0)
            {
                cmbTypeOfBusiness.SelectedIndex = 0;
                cmbIncomeGroup.SelectedIndex = 0;

                LineOfBusiness lob = WSHelper.GetLineOfBusinessByCode(SearchValue);
                if (ItemSelectedCompleted != null)
                {
                    this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.LineOfBusiness, Result = lob, Message = "By Code" });
                }
            }
            else
            {
                this.ViewData.ItemTemplate = this.FindResource("LineOfBusinessItemTemplate") as DataTemplate;
                short? typeofBusiness = null;
                string incomegroup = null;
                if (!string.IsNullOrEmpty(cmbTypeOfBusiness.SelectedValue.ToString()))
                {
                    typeofBusiness = Convert.ToInt16(cmbTypeOfBusiness.SelectedValue.ToString());
                }

                if (!string.IsNullOrEmpty(cmbIncomeGroup.SelectedValue.ToString()))
                {
                    incomegroup = cmbIncomeGroup.SelectedValue.ToString();
                }

                    this.ViewData.ItemsSource = (from r in WSHelper.GetLineOfBusinessByCriteria(typeofBusiness,incomegroup)
                                                 orderby r.Description ascending
                                                 select r);
                    CallHandlerWithType(new LineOfBusinessInfo(), "All Selected");
                
            }

        }
        #endregion

        #region Event Handlers
        private void ViewData_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (e.AddedItems.Count > 0)
            {
                if (e.AddedItems[0] is PersonalNote)
                    CallHandlerWithType(e.AddedItems[0] as PersonalNote, "Item Selected");
                if (e.AddedItems[0] is LineOfBusinessInfo)
                    CallHandlerWithType(e.AddedItems[0] as LineOfBusinessInfo, "Item Selected");
                if (e.AddedItems[0] is BankInfo)
                    CallHandlerWithType(e.AddedItems[0] as BankInfo, "Item Selected");
                if (e.AddedItems[0] is BrokerInfo)
                    CallHandlerWithType(e.AddedItems[0] as BrokerInfo, "Item Selected");
                if (e.AddedItems[0] is GLDivision)
                    CallHandlerWithType(e.AddedItems[0] as GLDivision, "Item Selected");
                if (e.AddedItems[0] is GLBranch)
                    CallHandlerWithType(e.AddedItems[0] as GLBranch, "Item Selected");
                if (e.AddedItems[0] is GLDepartment)
                    CallHandlerWithType(e.AddedItems[0] as GLDepartment, "Item Selected");
                if (e.AddedItems[0] is GLGroup)
                    CallHandlerWithType(e.AddedItems[0] as GLGroup, "Item Selected");
                if (e.AddedItems[0] is CompanyInfo)
                    CallHandlerWithType(e.AddedItems[0] as CompanyInfo, "Item Selected");
                if (e.AddedItems[0] is CustomerInfo)
                    CallHandlerWithType(e.AddedItems[0] as CustomerInfo, "Item Selected");
                if (e.AddedItems[0] is EmployeeInfo)
                    CallHandlerWithType(e.AddedItems[0] as EmployeeInfo, "Item Selected");
                if (e.AddedItems[0] is VendorInfo)
                    CallHandlerWithType(e.AddedItems[0] as VendorInfo, "Item Selected");
            }
        }

        private void SearchButton_Click(object sender, RoutedEventArgs e)
        {
            if (ItemSelectedStarting != null)
            {
                this.ItemSelectedStarting(this, new EventArgs());
            }

            try
            {
                switch (this.CurrentSearchType)
                {
                    case EntityTypes.Customer:
                        ExecuteCustomerSearch();
                        break;
                    case EntityTypes.Bank:
                        ExecuteBankSearch();
                        break;
                    case EntityTypes.Broker:
                        ExecuteBrokerSearch();
                        break;
                    case EntityTypes.Vendor:
                        ExecuteVendorSearch();
                        break;
                    case EntityTypes.Company:
                        ExecuteCompanySearch();
                        break;
                    case EntityTypes.BusinessUnits:
                        ExecuteBusinessUnitsSearch();
                        break;
                    case EntityTypes.UserNote:
                        ExecuteUserNoteSearch();
                        break;
                    case EntityTypes.LineOfBusiness:
                        ExecuteLineOfBusinessSearch();
                        break;
                    default:
                        ExecuteEmployeeSearch();
                        break;
                }
            }
            catch (FaultException<WSAPIBusinessFault> ex)
            {
                MessageBox.Show(ex.Detail.Message);
            }
            catch (FaultException<WSAPISecurityFault> securityFault)
            {
                MessageBox.Show(securityFault.Detail.Message);
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
            CurrentSearchType = EntityTypes.Employee;
            SetUIState();
        }

        private void rbByName_Click(object sender, RoutedEventArgs e)
        {
            if (ItemSelectedStarting != null)
            {
                this.ItemSelectedStarting(this, new EventArgs());
            }
        }

        private void rbByCode_Click(object sender, RoutedEventArgs e)
        {
            if (ItemSelectedStarting != null)
            {
                this.ItemSelectedStarting(this, new EventArgs());
            }
        }

        private void rbByShortName_Click(object sender, RoutedEventArgs e)
        {
            if (ItemSelectedStarting != null)
            {
                this.ItemSelectedStarting(this, new EventArgs());
            }
        }

        private void rbNoFilter_Click(object sender, RoutedEventArgs e)
        {
            if (ItemSelectedStarting != null)
            {
                this.ItemSelectedStarting(this, new EventArgs());
            }
        }

        #endregion

        #region UI Helpers

        private void SetUIState()
        {
            CustomerTypesContainer.Visibility = Visibility.Collapsed;
            SearchTypesContainer.Visibility = Visibility.Visible;
            BusinessUnitsContainer.Visibility = Visibility.Collapsed;
            rbByShortName.Visibility = Visibility.Visible;
            rbByCode.Visibility = Visibility.Visible;
            rbByName.Visibility = Visibility.Visible;
            rbNoFilter.Visibility = Visibility.Visible;
            UserNoteContainer.Visibility = Visibility.Collapsed;
            LineOfBusinessContainer.Visibility = Visibility.Collapsed;

            ViewData.ItemsSource = null;


            switch (this.CurrentSearchType)
            {
                case EntityTypes.Customer:
                    NameHeader.Text = "Customer Search";
                    CustomerTypesContainer.Visibility = Visibility.Visible;
                    rbByShortName.Visibility = Visibility.Collapsed;
                    this.CurrentSearchType = EntityTypes.Customer;
                    rbByCode.Content = "Find By Id";
                    rbByName.Content = "Find By Number";
                    rbNoFilter.Content = "Find By Last Name";
                    break;
                case EntityTypes.Bank:
                    NameHeader.Text = "Bank Search";
                    rbByShortName.Visibility = Visibility.Collapsed;
                    this.CurrentSearchType = EntityTypes.Bank;
                    rbByCode.Content = "Find By Bank Code";
                    rbByName.Content = "Find By Bank Name";
                    rbNoFilter.Content = "No Filter";
                    break;
                case EntityTypes.Broker:
                    NameHeader.Text = "Broker Search";
                    this.CurrentSearchType = EntityTypes.Broker;
                    rbByCode.Content = "Find By Broker Code";
                    rbByName.Content = "Find By Broker Last Name Prefix";
                    rbByShortName.Content = "Find By Broker Short Name";
                    rbNoFilter.Content = "No Filter";
                    break;
                case EntityTypes.Vendor:
                    NameHeader.Text = "Vendor Search";
                    this.CurrentSearchType = EntityTypes.Vendor;
                    rbByCode.Content = "Find By Vendor Code";
                    rbByName.Content = "Find By Last Name Prefix";
                    rbByShortName.Content = "Find By IsCompany";
                    rbNoFilter.Content = "No Filter";
                    break;
                case EntityTypes.Company:
                    NameHeader.Text = "Company Search";
                    this.CurrentSearchType = EntityTypes.Company;
                    rbByCode.Content = "Find By Company Code";
                    rbByName.Content = "Find By Company Name Prefix";
                    rbByShortName.Content = "Find By Company Short Name";
                    rbNoFilter.Content = "No Filter";
                    break;
                case EntityTypes.BusinessUnits:
                    NameHeader.Text = "Business Units Search";
                    SearchTypesContainer.Visibility = Visibility.Collapsed;
                    BusinessUnitsContainer.Visibility = Visibility.Visible;
                    break;
                case EntityTypes.UserNote:
                    NameHeader.Text = "UserNote Search";
                    this.CurrentSearchType = EntityTypes.UserNote;
                    rbByCode.Visibility = System.Windows.Visibility.Collapsed;
                    rbByName.Visibility = System.Windows.Visibility.Collapsed;
                    rbByShortName.Visibility = System.Windows.Visibility.Collapsed;
                    rbNoFilter.Visibility = System.Windows.Visibility.Collapsed;
                    rbNoFilter.Content = "No Filter";
                    UserNoteContainer.Visibility = System.Windows.Visibility.Visible;
                    break;
                case EntityTypes.LineOfBusiness:
                    NameHeader.Text = "LineOfBusiness Search";
                    this.CurrentSearchType = EntityTypes.LineOfBusiness;
                    rbByCode.Visibility = System.Windows.Visibility.Collapsed;
                    rbByName.Visibility = System.Windows.Visibility.Collapsed;
                    rbByShortName.Visibility = System.Windows.Visibility.Collapsed;
                    rbNoFilter.Visibility = System.Windows.Visibility.Collapsed;
                    rbNoFilter.Content = "No Filter";
                    LineOfBusinessContainer.Visibility = System.Windows.Visibility.Visible;
                    FillDropdowns_LineOfBusiness();
                    break;
                default:
                    NameHeader.Text = "Employee Search";
                    this.CurrentSearchType = EntityTypes.Employee;
                    rbByCode.Content = "Find By Employee Code";
                    rbByName.Content = "Find By Employee Last Name Prefix";
                    rbByShortName.Content = "Find By Employee Short Name";
                    rbNoFilter.Content = "No Filter";
                    break;
            }
        }

       public void FillDropdowns_LineOfBusiness()
        {
            List<DataItem> items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from v in WSHelper.GetValueList("TypeOfBusiness")
                            select new DataItem()
                            {
                                Name = v.Description,
                                Value = v.Code
                            }).ToList());
            cmbTypeOfBusiness.ItemsSource = items;

            items = new List<DataItem>()
            {
                new DataItem(){ Name = "-[No items was Selected ]-", Value = string.Empty },
                new DataItem(){ Name="Financial Services Premium", Value="FS"},
                new DataItem(){ Name="Life and Health Premium", Value="LH"},
                new DataItem(){ Name="Other Premium", Value="OP"},
                new DataItem(){ Name="Property and Casualty Premium", Value="PC"}
            };
            cmbIncomeGroup.ItemsSource = items;
            cmbTypeOfBusiness.SelectedIndex = 0;
            cmbIncomeGroup.SelectedIndex = 0;

        }

        #endregion
        #region Overloaded Helpers
        private void CallHandlerWithType(EmployeeInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.EmployeeCode;
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Employee, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(CustomerInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.CustomerId.ToString();
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                SearchValue = result.CustomerNumber.ToString();
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Customer, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(BankInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.BankCode;
            }

            if (rbByName.IsChecked.Value == true)
            {
                SearchValue = result.BankName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Bank, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(BrokerInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.BrokerCode;
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Broker, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(VendorInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.VendorCode;
            }

            if (rbByName.IsChecked.Value == true)
            {
                SearchValue = result.LastName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Vendor, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(CompanyInfo result, string message)
        {
            if (rbByCode.IsChecked.Value == true)
            {
                SearchValue = result.CompanyCode;
            }

            if (rbByShortName.IsChecked.Value == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.Company, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(GLDivision result, string message)
        {
            if (rbDivisionByCode.IsChecked.HasValue == true)
            {
                SearchValue = result.GLDivisionCode;
            }

            if (rbDivisionByShortName.IsChecked.HasValue == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(GLBranch result, string message)
        {
            if (rbBranchByCode.IsChecked.HasValue == true)
            {
                SearchValue = result.GLBranchCode;
            }

            if (rbBranchByShortName.IsChecked.HasValue == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(GLDepartment result, string message)
        {
            if (rbDeptByCode.IsChecked.HasValue == true)
            {
                SearchValue = result.GLDepartmentCode;
            }

            if (rbDeptByShortName.IsChecked.HasValue == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(GLGroup result, string message)
        {
            if (rbGroupByCode.IsChecked.HasValue == true)
            {
                SearchValue = result.GLGroupCode;
            }

            if (rbGroupByShortName.IsChecked.HasValue == true)
            {
                SearchValue = result.ShortName;
            }

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.BusinessUnits, Result = result, Message = message });
            }
        }

        private void CallHandlerWithType(PersonalNote result, string message)
        {

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.UserNote, Result = result, Message = message });
            }
        }
        private void CallHandlerWithType(LineOfBusinessInfo result, string message)
        {
            if (txtSearchValue.Text.Length > 0)
            {
               // SearchValue = result.LineOfBusinessCode;
            }

            //if (rbGroupByShortName.IsChecked.HasValue == true)
            //{
            //    SearchValue = result.TypeOfBusinessCode;
            //}

            //if (rb rb.IsChecked.HasValue == true)
            //{
            //    SearchValue = result.TypeOfBusinessCode;
            //}

            if (ItemSelectedCompleted != null)
            {
                this.ItemSelectedCompleted(this, new ItemSelectedEventArg() { EntityType = EntityTypes.LineOfBusiness, Result = result, Message = message });
            }


        }


 

        #endregion

        private void chkEmptyNull_Checked(object sender, RoutedEventArgs e)
        {
            txtSearchValue.Text = null;
            txtSearchValue.IsEnabled = false;
            txtSearchValue.Visibility = Visibility.Collapsed;
        }

        private void chkEmptyNull_Click(object sender, RoutedEventArgs e)
        {
            if (chkEmptyNull.IsChecked.HasValue && chkEmptyNull.IsChecked == false)
            {
                txtSearchValue.Text = string.Empty;
                txtSearchValue.IsEnabled = true;
                txtSearchValue.Visibility = Visibility.Visible;
            }
        }
        private void txtSearchValue_LostKeyboardFocus(object sender, KeyboardFocusChangedEventArgs e)
        {
            SearchButton_Click(this, new RoutedEventArgs());
        }

        private void txtSearchValue_KeyDown(object sender, KeyEventArgs e)
        {
        }

    }
}
