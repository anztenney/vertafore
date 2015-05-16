using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Data;
using WSAPIReferenceLibrary.WSAPIService;

namespace WPFClientApp.Converters
{
    public class DisplayNameConverter : IValueConverter
    {
        #region IValueConverter Members

        public object Convert(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            if (value is EmployeeInfo || value is Employee)
                return string.Format("{0},{1}", ((EmployeeInfo)value).LastName, ((EmployeeInfo)value).FirstName);
            if (value is CustomerInfo || value is Customer)
            {
                if (!string.IsNullOrEmpty(((CustomerInfo)value).LastName))
                    return string.Format("{0},{1}", ((CustomerInfo)value).LastName, ((CustomerInfo)value).FirstName);
                else
                    return ((CustomerInfo)value).FirmName;
            }
            if (value is VendorInfo || value is Vendor)
                return string.Format("{0},{1}", ((VendorInfo)value).LastName, ((VendorInfo)value).FirstName);
            if (value is Broker || value is BrokerInfo)
                return string.Format("{0},{1}", ((BrokerInfo)value).LastName, ((BrokerInfo)value).FirstName);
            return string.Empty;
        }

        public object ConvertBack(object value, Type targetType, object parameter, System.Globalization.CultureInfo culture)
        {
            throw new NotImplementedException();
        }

        #endregion
    }
}
