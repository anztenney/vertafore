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
using WPFClientApp.Extensions;
using WPFClientApp.Entities;
using WSAPIReferenceLibrary.WSAPIService;
using WSAPIReferenceLibrary.Helpers;
using System.ServiceModel;

namespace WPFClientApp.Controls
{
    /// <summary>
    /// Interaction logic for ucEditEmployeeInfo.xaml
    /// </summary>
    public partial class ucEditCustomerInfo : UserControl
    {
        public event EventHandler CloseClicked;
        public bool IsNew
        {
            get;
            set;
        }

        public ucEditCustomerInfo()
        {
            InitializeComponent();
        }

        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {
        }

        private void CloseButton_Click(object sender, RoutedEventArgs e)
        {
            if (CloseClicked != null)
            {
                this.CloseClicked(this, new EventArgs());
            }
        }

        private void UpdateButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                Customer customer = this.DataContext as Customer;
                if (IsNew)
                {
                    WSHelper.InsertCustomer(customer);
                    MessageBox.Show("Customer was Inserted successfully.");
                }
                else
                {
                    WSHelper.UpdateCustomer(customer);
                    MessageBox.Show("Customer was updated successfully.");
                }
            }
            catch (FaultException<WSAPIBusinessFault> ex)
            {
                string msg = " |";
                foreach (var m in ex.Detail.FaultDetails)
                {
                    msg += m.Message + "\r\n";
                }
                MessageBox.Show("Customer not Updated: " + ex.Detail.Message + msg);
            }
            catch (FaultException<WSAPISecurityFault> securityFault)
            {
                MessageBox.Show(securityFault.Detail.Message);
            }
        }

        private void UserControl_DataContextChanged(object sender, DependencyPropertyChangedEventArgs e)
        {

            List<DataItem> items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllBranches()
                            select new DataItem()
                            {
                                Name = i.Name,
                                Value = i.GLBranchCode
                            }).ToList());
            cboBranches.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllDepartments()
                            select new DataItem()
                            {
                                Name = i.Name,
                                Value = i.GLDepartmentCode
                            }).ToList());
            cboDepartments.ItemsSource = items;


            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllDivisions()
                            select new DataItem()
                            {
                                Name = i.Name,
                                Value = i.GLDivisionCode
                            }).ToList());
            cboDivisions.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllGroups()
                            select new DataItem()
                            {
                                Name = i.Name,
                                Value = i.GLGroupCode
                            }).ToList());
            cboGroups.ItemsSource = items;


            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllBrokers()
                            select new DataItem()
                            {
                                Name = string.Format("{0},{1}", i.LastName, i.FirstName),
                                Value = i.BrokerCode
                            }).ToList());
            cboBrokers.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllRepEmployees()
                            select new DataItem()
                            {
                                Name = string.Format("{0},{1}", i.LastName, i.FirstName),
                                Value = i.EmployeeCode
                            }).ToList());
            cboAccountReps.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetAllExecEmployees()
                            select new DataItem()
                            {
                                Name = string.Format("{0},{1}", i.LastName, i.FirstName),
                                Value = i.EmployeeCode
                            }).ToList());
            cboAccountExecs.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetValueList("MaritalStatus")
                            select new DataItem()
                            {
                                Name = i.Description,
                                Value = i.Description
                            }).ToList());
            cboMaritalStatus.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from i in WSHelper.GetValueList("TypeOfEntity")
                            select new DataItem()
                            {
                                Name = i.Description,
                                Value = i.Description
                            }).ToList());
            cboBusinessEntity.ItemsSource = items;

            cboCustomerType.ItemsSource = (from i in WSHelper.GetValueList("CustomerType")
                                           select new DataItem()
                                           {
                                               Name = i.Description,
                                               Value = i.Code
                                           }).ToList();

            cboState.ItemsSource = (from i in WSHelper.GetValueList("State")
                                    select new DataItem()
                                    {
                                        Name = i.Description,
                                        Value = i.Code
                                    }).ToList();
        }

        private void cboDivisions_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (e.AddedItems.Count > 0)
            {
                if (string.IsNullOrEmpty((e.AddedItems[0] as DataItem).Value))
                {
                    cboDivisions.SelectedIndex = 0;
                    cboBranches.SelectedIndex = 0;
                    cboDepartments.SelectedIndex = 0;
                    cboGroups.SelectedIndex = 0;
                    return;
                }

                GLDivision division = WSHelper.GetDivisionByCode((e.AddedItems[0] as DataItem).Value);
                List<DataItem> branches = new List<DataItem>();
                branches.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                branches.AddRange((from b in WSHelper.GetBranchsByGLDivisionCode(division.GLDivisionCode)
                                   select new DataItem()
                                   {
                                       Name = b.Name,
                                       Value = b.GLBranchCode
                                   }).ToList());

                List<DataItem> departments = new List<DataItem>();
                departments.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                departments.AddRange((from b in WSHelper.GetDepartmentListByBranchCode(branches[0].Value)
                                      select new DataItem()
                                      {
                                          Name = b.Name,
                                          Value = b.GLDepartmentCode
                                      }).ToList());

                List<DataItem> groups = new List<DataItem>();
                groups.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                groups.AddRange((from b in WSHelper.GetGroupListByDepartmentCode(departments[0].Value)
                                 select new DataItem()
                                 {
                                     Name = b.Name,
                                     Value = b.GLGroupCode
                                 }).ToList());

                cboBranches.ItemsSource = branches;
                cboDepartments.ItemsSource = departments;
                cboGroups.ItemsSource = groups;

                if (this.Visibility == Visibility.Visible)
                {
                    cboBranches.SelectedIndex = 1;
                    cboDepartments.SelectedIndex = 1;
                    cboGroups.SelectedIndex = 1;
                }
            }

        }

        private void cboBranches_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

            if (e.AddedItems.Count > 0)
            {
                List<DataItem> departments = new List<DataItem>();
                departments.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                departments.AddRange((from b in WSHelper.GetDepartmentListByBranchCode((e.AddedItems[0] as DataItem).Value)
                                      select new DataItem()
                                      {
                                          Name = b.Name,
                                          Value = b.GLDepartmentCode
                                      }).ToList());

                List<DataItem> groups = new List<DataItem>();
                groups.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                groups.AddRange((from b in WSHelper.GetGroupListByDepartmentCode(departments[0].Value)
                                 select new DataItem()
                                 {
                                     Name = b.Name,
                                     Value = b.GLGroupCode
                                 }).ToList());

                cboDepartments.ItemsSource = departments;
                cboGroups.ItemsSource = groups;

                if (this.Visibility == Visibility.Visible)
                {
                    cboDepartments.SelectedIndex = 1;
                    cboGroups.SelectedIndex = 1;
                }
            }
        }

        private void cboDepartments_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (e.AddedItems.Count > 0)
            {
                List<DataItem> groups = new List<DataItem>();
                groups.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
                groups.AddRange((from b in WSHelper.GetGroupListByDepartmentCode((e.AddedItems[0] as DataItem).Value)
                                 select new DataItem()
                                 {
                                     Name = b.Name,
                                     Value = b.GLGroupCode
                                 }).ToList());
                cboGroups.ItemsSource = groups;

                if (this.Visibility == Visibility.Visible)
                {
                    cboGroups.SelectedIndex = 1;
                }
            }

        }

        private void cboGroups_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }
    }
}
