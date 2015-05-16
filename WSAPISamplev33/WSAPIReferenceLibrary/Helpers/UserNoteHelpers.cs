using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSAPIReferenceLibrary.WSAPIService;

namespace WSAPIReferenceLibrary.Helpers
{
    public static partial class WSHelper
    {
        #region UserNotes
        public static List<PersonalNote> GetAllUserNotes()
        {
            PersonalNoteGetListAllResponse response = WSHelper.Client.PersonalNoteGetListAll(WSHelper.CurrentCredentials);
            return (from r in response.UserNoteList
                    orderby r.NoteDate ascending
                    select r).ToList();
        }

        public static List<PersonalNote> GetAllUserNotesWithParameters(DateTime? dateFrom, DateTime? dateTo, bool includeOnlyAttachments, DateTime? purgeDateFrom, DateTime? purgeDateTo)
        {
            PersonalNoteGetListRequest request = new PersonalNoteGetListRequest();
            request.DateFrom = dateFrom;
            request.DateTo = dateTo;
            request.IncludeOnlyAttachments = includeOnlyAttachments;
            request.PurgeDateFrom = purgeDateFrom;
            request.PurgeDateTo = purgeDateTo;

            PersonalNoteGetListResponse response = WSHelper.Client.PersonalNoteGetList(WSHelper.CurrentCredentials, request);
            return (from r in response.UserNoteList
                    orderby r.NoteDate ascending
                    select r).ToList();
        }

        #endregion
    }
}
