using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region General Ledger Business Units

        #region Single Division Methods
        public static GLDivision GetDivisionByCode(string value)
        {
            GLDivisionGetByCodeRequest request = new GLDivisionGetByCodeRequest();
            request.GLDivisionCode = value;
            GLDivisionGetByCodeResponse response = WSHelper.Client.GLDivisionGetByCode(WSHelper.CurrentCredentials, request);
            return response.GLDivision;
        }

        public static GLDivision GetDivisionByShortName(string value)
        {
            GLDivisionGetByShortNameRequest request = new GLDivisionGetByShortNameRequest();
            request.GLDivisionShortName = value;
            GLDivisionGetByShortNameResponse response = WSHelper.Client.GLDivisionGetByShortName(WSHelper.CurrentCredentials, request);
            return response.GLDivision;
        }

        #endregion

        #region List Division Methods
        public static List<GLDivision> GetAllDivisions()
        {
            GLDivisionGetListAllResponse response = WSHelper.Client.GLDivisionGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.GLDivisionList
                    orderby r.Name ascending
                    select r).ToList();
        }

        public static List<GLDivision> GetDivisionListByName(string value)
        {
            GLDivisionGetListByNamePrefixRequest request = new GLDivisionGetListByNamePrefixRequest();
            request.GLDivisionNamePrefix = value;
            GLDivisionGetListByNamePrefixResponse response = WSHelper.Client.GLDivisionGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.GLDivisionList;
        }
        #endregion

        #region Single Branch Methods
        public static GLBranch GetBranchByCode(string value)
        {
            GLBranchGetByCodeRequest request = new GLBranchGetByCodeRequest();
            request.GLBranchCode = value;
            GLBranchGetByCodeResponse response = WSHelper.Client.GLBranchGetByCode(WSHelper.CurrentCredentials, request);
            return response.GLBranch;
        }

        public static GLBranch GetBranchByShortName(string value)
        {
            GLBranchGetByShortNameRequest request = new GLBranchGetByShortNameRequest();
            request.GLBranchShortName = value;
            GLBranchGetByShortNameResponse response = WSHelper.Client.GLBranchGetByShortName(WSHelper.CurrentCredentials, request);
            return response.GLBranch;
        }
        #endregion
        #region List Branchs Methods
        public static List<GLBranch> GetAllBranches()
        {
            GLBranchGetListAllResponse response = WSHelper.Client.GLBranchGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.GLBranchList
                    orderby r.Name ascending
                    select r).ToList();
        }

        public static List<GLBranch> GetBranchesListByName(string value)
        {
            GLBranchGetListByNamePrefixRequest request = new GLBranchGetListByNamePrefixRequest();
            request.GLBranchNamePrefix = value;
            GLBranchGetListByNamePrefixResponse response = WSHelper.Client.GLBranchGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.GLBranchList;
        }

        public static List<GLBranch> GetBranchsByGLDivisionCode(string value)
        {
            GLBranchGetListByGLDivisionCodeRequest request = new GLBranchGetListByGLDivisionCodeRequest();
            request.GLDivisionCode = value;
            GLBranchGetListByGLDivisionCodeResponse response = WSHelper.Client.GLBranchGetListByGLDivisionCode(WSHelper.CurrentCredentials, request);
            return response.GLBranchList;
        }
        #endregion
        
        #region Single Department Methods
        public static GLDepartment GetDepartmentByCode(string value)
        {
            GLDepartmentGetByCodeRequest request = new GLDepartmentGetByCodeRequest();
            request.GLDepartmentCode = value;
            GLDepartmentGetByCodeResponse response = WSHelper.Client.GLDepartmentGetByCode(WSHelper.CurrentCredentials, request);
            return response.GLDepartment;
        }

        public static GLDepartment GetDepartmentByShortName(string value)
        {
            GLDepartmentGetByShortNameRequest request = new GLDepartmentGetByShortNameRequest();
            request.GLDepartmentShortName = value;
            GLDepartmentGetByShortNameResponse response = WSHelper.Client.GLDepartmentGetByShortName(WSHelper.CurrentCredentials, request);
            return response.GLDepartment;
        }
        #endregion

        #region List Department Methods
        public static List<GLDepartment> GetAllDepartments()
        {
            GLDepartmentGetListAllResponse response = WSHelper.Client.GLDepartmentGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.GLDepartmentList
                    orderby r.Name ascending
                    select r).ToList();
        }

        public static List<GLDepartment> GetDepartmentListByName(string value)
        {
            GLDepartmentGetListByNamePrefixRequest request = new GLDepartmentGetListByNamePrefixRequest();
            request.GLDepartmentNamePrefix = value;
            GLDepartmentGetListByNamePrefixResponse response = WSHelper.Client.GLDepartmentGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.GLDepartmentList;
        }

        public static List<GLDepartment> GetDepartmentListByBranchCode(string value)
        {
            GLDepartmentGetListByGLBranchCodeRequest request = new GLDepartmentGetListByGLBranchCodeRequest();
            request.GLBranchCode = value;
            GLDepartmentGetListByGLBranchCodeResponse response = WSHelper.Client.GLDepartmentGetListByGLBranchCode(WSHelper.CurrentCredentials, request);
            return response.GLDepartmentList;
        }
        #endregion

        #region Single Group Methods
        public static GLGroup GetGroupByCode(string value)
        {
            GLGroupGetByCodeRequest request = new GLGroupGetByCodeRequest();
            request.GLGroupCode = value;
            GLGroupGetByCodeResponse response = WSHelper.Client.GLGroupGetByCode(WSHelper.CurrentCredentials, request);
            return response.GLGroup;
        }

        public static GLGroup GetGroupByShortName(string value)
        {
            GLGroupGetByShortNameRequest request = new GLGroupGetByShortNameRequest();
            request.GLGroupShortName = value;
            GLGroupGetByShortNameResponse response = WSHelper.Client.GLGroupGetByShortName(WSHelper.CurrentCredentials, request);
            return response.GLGroup;
        }
        #endregion

        #region List Group Methods
        public static List<GLGroup> GetAllGroups()
        {
            GLGroupGetListAllResponse response = WSHelper.Client.GLGroupGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.GLGroupList
                    orderby r.Name ascending
                    select r).ToList();
        }

        public static List<GLGroup> GetGroupListByName(string value)
        {
            GLGroupGetListByNamePrefixRequest request = new GLGroupGetListByNamePrefixRequest();
            request.GLGroupNamePrefix = value;
            GLGroupGetListByNamePrefixResponse response = WSHelper.Client.GLGroupGetListByNamePrefix(WSHelper.CurrentCredentials, request);
            return response.GLGroupList;
        }

        public static List<GLGroup> GetGroupListByDepartmentCode(string value)
        {
            GLGroupGetListByGLDepartmentCodeRequest request = new GLGroupGetListByGLDepartmentCodeRequest();
            request.GLDepartmentCode = value;
            GLGroupGetListByGLDepartmentCodeResponse response = WSHelper.Client.GLGroupGetListByGLDepartmentCode(WSHelper.CurrentCredentials, request);
            return response.GLGroupList;
        }
        #endregion

        #endregion

    }
}
