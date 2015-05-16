using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WPFClientApp.Entities
{
    public class DataItem
    {
        public string Name { get; set; }
        public string Value { get; set; }

        public DataItem()
        { }

        public DataItem(string name, string value)
        {
            this.Name = name;
            this.Value = value;
        }
    }
}
