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
using WSAPIReferenceLibrary.Helpers;
using WSAPIReferenceLibrary.WSAPIService;
using System.ServiceModel;

namespace WPFClientApp.Controls
{
    /// <summary>
    /// Interaction logic for ucEditEmployeeInfo.xaml
    /// </summary>
    public partial class ucEditEmployeeInfo : UserControl
    {
        public event EventHandler CloseClicked;
        public bool IsNew
        {
            get;
            set;
        }

        public ucEditEmployeeInfo()
        {
            InitializeComponent();
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
                Employee employee = this.DataContext as Employee;                
                if (employee.Employee1099Category.HasValue && employee.Employee1099Category.Value == 0)
                {
                    employee.Employee1099Category = null;
                    employee.Employee1099Type = null;
                }

                if (IsNew)
                {
                    WSHelper.InsertEmployee(employee);
                    MessageBox.Show("Employee was Inserted successfully.");
                }
                else
                {
                    WSHelper.UpdateEmployee(employee);
                    MessageBox.Show("Employee was updated successfully.");
                }
            }
            catch (FaultException<WSAPIBusinessFault> ex)
            {
                string msg = " |";
                foreach (var m in ex.Detail.FaultDetails)
                {
                    msg += m.Message + "\r\n";
                }
                MessageBox.Show("Employee Validation Error: " + ex.Detail.Message + msg);
            }
            catch (FaultException<WSAPISecurityFault> securityFault)
            {
                MessageBox.Show(securityFault.Detail.Message);
            }
        }
        private void UserControl_DataContextChanged(object sender, DependencyPropertyChangedEventArgs e)
        {
            List<S1099CategoryInfo> categories = new List<S1099CategoryInfo>();
            categories.Add(new S1099CategoryInfo() { S1099Category = 0, S1099CategoryDescription = "-[No items was Selected ]-" });
            categories.AddRange(WSHelper.GetAllS1099Categories());
            cboS1099Category.ItemsSource = categories;


            cboEmployeeStatus.ItemsSource = (from v in WSHelper.GetValueList("EmployeeStatus")
                                             select new DataItem()
                                             {
                                                 Name = v.Description,
                                                 Value = v.Code
                                             }).ToList();

            List<DataItem> items = new List<DataItem>()
            {
                new DataItem(){ Name = "-[No items was Selected ]-", Value = string.Empty },
                new DataItem(){ Name="Full-Time", Value="F"},
                new DataItem(){ Name="Part-Time", Value="P"}
            };
            cboEmployeeTime.ItemsSource = items;

            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from v in WSHelper.GetValueList("TimeZone")
                            select new DataItem()
                            {
                                Name = v.Description,
                                Value = v.Code
                            }).ToList());
            cboTimeZone.ItemsSource = items;


            items = new List<DataItem>();
            items.Add(new DataItem() { Name = "-[No items was Selected ]-", Value = string.Empty });
            items.AddRange((from v in WSHelper.GetValueList("State")
                            select new DataItem()
                            {
                                Name = v.Description,
                                Value = v.Code
                            }).ToList());
            cboState.ItemsSource = items;
        }


        private void UserControl_Loaded(object sender, RoutedEventArgs e)
        {

        }

        private void cboS1099Category_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (e.AddedItems.Count > 0)
            {
                S1099CategoryInfo info = e.AddedItems[0] as S1099CategoryInfo;
                if (info.S1099Types != null && info.S1099Types.Count > 0)
                {
                    cboS1099Type.ItemsSource = info.S1099Types;
                }
                else
                {
                    cboS1099Type.ItemsSource = new List<S1099TypeInfo>()
                    {
                        new S1099TypeInfo() { S1099TypeDescription = "-[No items was Selected ]-",S1099Type = 0 }
                    };
                }
                cboS1099Type.SelectedIndex = 0;
            }
        }
    }
}
