using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region Single Employee Methods
        public static Employee GetEmployeeByCode(string value)
        {
            EmployeeGetByCodeRequest request = new EmployeeGetByCodeRequest();
            request.EmployeeCode = value;
            EmployeeGetByCodeResponse response = WSHelper.Client.EmployeeGetByCode(WSHelper.CurrentCredentials, request);
            return response.Employee;
        }

        public static Employee GetEmployeeByShortName(string value)
        {
            EmployeeGetByShortNameRequest request = new EmployeeGetByShortNameRequest();
            request.EmployeeShortName = value;
            EmployeeGetByShortNameResponse response = WSHelper.Client.EmployeeGetByShortName(WSHelper.CurrentCredentials, request);
            return response.Employee;
        }

        public static List<EmployeeInfo> GetEmployeebyLastName(string value)
        {
            EmployeeGetListByLastNamePrefixRequest request = new EmployeeGetListByLastNamePrefixRequest();
            request.EmployeeLastNamePrefix = value;
            EmployeeGetListByLastNamePrefixResponse response = WSHelper.Client.EmployeeGetListByLastNamePrefix(WSHelper.CurrentCredentials, request);
            return response.EmployeeInfoList;
        }

        public static void UpdateEmployee(Employee employee)
        {
            try
            {
                EmployeeUpdateRequest request = new EmployeeUpdateRequest();
                request.Employee = employee;
                WSHelper.Client.EmployeeUpdate(WSHelper.CurrentCredentials, request);
            }
            catch
            {
                throw;
            }
        }

        public static void InsertEmployee(Employee employee)
        {
            try
            {
                EmployeeInsertRequest request = new EmployeeInsertRequest();
                request.Employee = employee;
                WSHelper.Client.EmployeeInsert(WSHelper.CurrentCredentials, request);
            }
            catch
            {
                throw;
            }
        }

        #endregion

        #region List Employee Methods
        public static List<EmployeeInfo> GetAllEmployees()
        {
            EmployeeGetListAllResponse response = WSHelper.Client.EmployeeGetListAll(WSHelper.CurrentCredentials);
            return response.EmployeeInfoList;
        }
        public static List<EmployeeInfo> GetAllRepEmployees()
        {
            EmployeeGetListByTypeRequest request = new EmployeeGetListByTypeRequest();
            request.IncludeRepresentative = true;
            request.IncludeExecutive = false;
            request.IncludeSalesCenterRepresentative = false;
            EmployeeGetListByTypeResponse response = WSHelper.Client.EmployeeGetListByType(WSHelper.CurrentCredentials, request);

            return (from r in response.EmployeeInfoList
                    orderby r.LastName ascending
                    where r.Representative = true
                    select r).ToList();
        }

        public static List<EmployeeInfo> GetAllExecEmployees()
        {
            EmployeeGetListByTypeRequest request = new EmployeeGetListByTypeRequest();
            request.IncludeRepresentative = false;
            request.IncludeExecutive = true;
            request.IncludeSalesCenterRepresentative = false;
            EmployeeGetListByTypeResponse response = WSHelper.Client.EmployeeGetListByType(WSHelper.CurrentCredentials, request);

            return (from r in response.EmployeeInfoList
                    orderby r.LastName ascending
                    where r.Executive = true
                    select r).ToList();
        }
        #endregion
    }
}
