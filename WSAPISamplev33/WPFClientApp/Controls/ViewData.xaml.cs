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

namespace WPFClientApp.Controls
{
    /// <summary>
    /// Interaction logic for ViewData.xaml
    /// </summary>
    public partial class ViewData : UserControl
    {
        public event EventHandler EditClickCompleted;
        public event EventHandler NewClickCompleted;
        public event EventHandler CopyClickCompleted;

        public ViewData()
        {
            InitializeComponent();
        }

        private void UserControl_DataContextChanged(object sender, DependencyPropertyChangedEventArgs e)
        {
            this.propGrid.Instance = e.NewValue;
        }

        private void EditButton_Click(object sender, RoutedEventArgs e)
        {
            if (EditClickCompleted != null)
            {
                this.EditClickCompleted(this, new EventArgs());
            }
        }

        public void HideEdit()
        {
            this.EditButton.Visibility = Visibility.Collapsed;
            this.NewButton.Visibility = Visibility.Collapsed;
            this.CopyButton.Visibility = Visibility.Collapsed;
        }

        public void ShowEdit()
        {
            this.EditButton.Visibility = Visibility.Visible;
            this.NewButton.Visibility = Visibility.Visible;
            this.CopyButton.Visibility = Visibility.Visible;
        }

        public void ShowNew()
        {
            this.NewButton.Visibility = Visibility.Visible;
        }

        private void NewButton_Click(object sender, RoutedEventArgs e)
        {
            if (NewClickCompleted != null)
                this.NewClickCompleted(this, new EventArgs());
        }

        private void CopyButton_Click(object sender, RoutedEventArgs e)
        {
            if (CopyClickCompleted != null)
                this.CopyClickCompleted(this, new EventArgs());

        }

    }
}
