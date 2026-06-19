using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //int x = 1;
            int y = 2;
            Int32 x = 10;
            Type x_type=x.GetType();
            Console.WriteLine(x_type.ToString());

            Console.WriteLine(x+"  "+x_type.ToString());

            String num = "Cord Cambridge";
            Console.WriteLine(num.ToString());

            short num1 = 10;
            long num3 = 34;

            double doub = 2;

            bool isActive = true;




        }
    }
}
