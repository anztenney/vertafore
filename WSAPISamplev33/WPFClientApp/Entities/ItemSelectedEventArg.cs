using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WPFClientApp.Entities
{
    public class ItemSelectedEventArg : EventArgs
    {
        public object Result
        {
            get;
            set;
        }

        public EntityTypes EntityType
        { 
            get; 
            set; 
        }

        public string Message
        {
            get;
            set;
        }
    }
}
