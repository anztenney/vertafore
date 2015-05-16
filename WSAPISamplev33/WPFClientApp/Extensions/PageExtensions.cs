using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Controls;
using System.Windows;
using System.Reflection;

namespace WPFClientApp.Extensions
{
    public static class PageExtensions
    {

        public static object GetCurrentEmployee(this Page page)
        {
            return Application.Current.Properties[WPFClientApp.Properties.Resources.SELECTEDEMPLOYEE];
        }

        public static void SetCurrentEmployee(this Page page, object o)
        {
            Application.Current.Properties[WPFClientApp.Properties.Resources.SELECTEDEMPLOYEE] = o;
        }

        public static object GetCurrentCustomer(this Page page)
        {
            return Application.Current.Properties[WPFClientApp.Properties.Resources.SELECTEDCUSTOMER];
        }

        public static void SetCurrentCustomer(this Page page, object o)
        {
            Application.Current.Properties[WPFClientApp.Properties.Resources.SELECTEDCUSTOMER] = o;
        }

        /// <summary>
        /// An extension method to determine if an API user is logged in.  
        /// If so, then an active ticket is available.
        /// </summary>
        /// <param name="page">Page object to act against</param>
        /// <returns></returns>
        public static bool IsLoggedIn(this Page page)
        {
            try
            {
                return !string.IsNullOrEmpty(Application.Current.Properties[WPFClientApp.Properties.Resources.ACTIVETICKETKEY].ToString());
            }
            catch
            {
                return false;
            }
        }

        /// <summary>
        /// An extension method to determine if an API user is logged in.  
        /// If so, then an active ticket is available.
        /// </summary>
        /// <param name="window">object to act against</param>
        /// <returns></returns>
        public static bool IsLoggedIn(this Window window)
        {
            try
            {
                return !string.IsNullOrEmpty(Application.Current.Properties[WPFClientApp.Properties.Resources.ACTIVETICKETKEY].ToString());
            }
            catch
            {
                return false;
            }
        }

        public static Dictionary<string, object> ConvertToDictionary(this UserControl control, object item)
        {
            Dictionary<string, object> result = new Dictionary<string, object>();
            PropertyInfo[] fields = item.GetType().GetProperties();
            foreach (PropertyInfo i in fields)
            {
                result.Add(i.Name, i.GetValue(item,null));
            }
            return result;
        }

        public static Dictionary<string, object> ConvertToDictionary(this Page control, object item)
        {
            Dictionary<string, object> result = new Dictionary<string, object>();
            PropertyInfo[] fields = item.GetType().GetProperties();
            foreach (PropertyInfo i in fields)
            {
                result.Add(i.Name, i.GetValue(item, null));
            }
            return result;
        }

    }
}
