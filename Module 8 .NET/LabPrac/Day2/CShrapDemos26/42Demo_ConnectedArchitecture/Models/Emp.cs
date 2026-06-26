using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _42Demo_ConnectedArchitecture.Models
{
    public class Emp//POCO: Business model    

    {
        public int Id { get; set; }
        public string Name  { get; set; }

        public string Address { get; set; } 

        public void GetEmpData()
        {
            Console.WriteLine($"ID:{Id} Name:{Name} Address: {Address} ");
        }
    }
}
