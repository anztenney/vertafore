using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single Customer Methods
        public static Customer GetCustomerById(Guid id)
        {
            CustomerGetByIdRequest request = new CustomerGetByIdRequest();
            request.CustomerId = id;
            CustomerGetByIdResponse response = WSHelper.Client.CustomerGetById(WSHelper.CurrentCredentials, request);
            return response.Customer;
        }

        public static Customer GetCustomerByNumber(string value)
        {
            CustomerGetByNumberRequest request = new CustomerGetByNumberRequest();
            request.CustomerNumber = value;
            CustomerGetByNumberResponse response = WSHelper.Client.CustomerGetByNumber(WSHelper.CurrentCredentials, request);
            return response.Customer;
        }

        public static void UpdateCustomer(Customer objectToUpdate)
        {
            try
            {
                CustomerUpdateRequest request = new CustomerUpdateRequest();
                request.Customer = objectToUpdate;
                WSHelper.Client.CustomerUpdate(WSHelper.CurrentCredentials, request);
            }
            catch
            {
                throw;
            }
        }

        public static void InsertCustomer(Customer objectToUpdate)
        {
            try
            {
                CustomerInsertRequest request = new CustomerInsertRequest();
                request.Customer = objectToUpdate;
                WSHelper.Client.CustomerInsert(WSHelper.CurrentCredentials, request);
            }
            catch
            {
                throw;
            }
        }

        #endregion

        #region List Customer Methods
        public static List<CustomerInfo> GetCustomerList(string customerType, string namePrefix, bool isBrokerCustomer)
        {
            CustomerGetListByNamePrefixRequest request = new CustomerGetListByNamePrefixRequest();
            request.CustomerType = customerType;
            request.NamePrefix = namePrefix;
            request.IsBrokersCustomer = isBrokerCustomer;
            CustomerGetListByNamePrefixResponse response = WSHelper.Client.CustomerGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.CustomerInfoList;
        }
        #endregion

    }
}
