using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04Demo
{
    public class Employee
    {
        public string Department;
        public Employee() { 
        
        
        }
        public Employee(string dept) {
            Department = dept;
        }   

        public class Developers:Employee
        {
            public string Projects;
            public Developers():base() {

            }
            public Developers(string ProjectName,string dept):base(dept)
            {
                Projects= ProjectName;
            }
        }

    }
}
