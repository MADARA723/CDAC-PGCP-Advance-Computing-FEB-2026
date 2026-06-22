using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    public class Emp
    {
        
      

        private string _Name;
        private Designation _Designation;

        public Designation Designation
        {
            get { return _Designation; }
            set { _Designation = value; }
        }


        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        private string _Email;

        public string Email
        {
            get { return _Email; }
            set { _Email = value; }
        }

        public override string ToString()
        {
            return $"Name:{Name}|Email:{Email}|Designation:{Designation}";
        }



    }
    public enum Designation
    {
        Manager,
        Developer,
        Tester,
        Analyst,
        HR
    }
}
