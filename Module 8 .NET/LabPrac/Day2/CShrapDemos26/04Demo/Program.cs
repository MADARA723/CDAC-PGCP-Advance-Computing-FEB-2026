using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using static _04Demo.Employee;

namespace _04Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Person class 
            //Person person = new Person();
            //person.PId = 14;
            //person.PName = "Hugh Jackman";
            //person.PCity = "NYC";
            //person.GetPersonDetails(); 
            #endregion

            #region CMath, AdvMath : Inheritance demo
            //CMath cmath = new CMath();
            //Console.WriteLine($"Add result  = {cmath.Add(10, 20)}");
            //Console.WriteLine($"Sub result  = {cmath.Sub(100, 20)}");

            //AdvMath advmath = new AdvMath();
            //Console.WriteLine($"Add result  = {advmath.Add(10, 20)}");
            //Console.WriteLine($"Sub result  = {advmath.Sub(100, 20)}");
            //Console.WriteLine($"Add result  = {advmath.Square(5)}");
            #endregion

            //#region Virtual, Override, New Keyword, Overloadding demos 
            AdvMath advMath = new AdvMath();
            Console.WriteLine(advMath.Add(10, 20));
            Console.WriteLine(advMath.Sub(100, 20));

            advMath.Show();
            advMath.Show("Blah blah blah");
            advMath.Show("Blah blah blah", 14);

            CMath cmath = new AdvMath();
            Console.WriteLine(cmath.Add(10, 20));
            Console.WriteLine(cmath.Sub(100, 20));
            //#endregion

            Developers developers = new Developers("evoting", "IT");
        }

        class Person
        {
            //Fields
            public int Id;
            public string PName;
            public int PCity;

            //ctor
            public Person()
            {
                Console.WriteLine("Person Default Constructor");
            }

            //
            public void getPersonDetails()
            {
                Console.WriteLine("Person Details: " + Id + " " + PName + " " + PCity);
            }

        }

        public class CMath
        {
            public virtual int Add(int a, int b)
            {
                return a + b;
            }
            public int Sub(int a, int b)
            {
                return a - b;
            }
            public virtual int Mul(int a, int b)
            {
                return a * b;
            }

            public void Show()
            {
                Console.WriteLine("Show method of Cmath");

            }
            //method  Overloading with same class
            public void Show(string str)
            {
                Console.WriteLine("Show method of Cmath with string parameter: " + str);
            }
        }
        public class AdvMath : CMath
        {

            //method overloading with the access the classes 
            public void Show(string str, int id)
            {
                Console.WriteLine("Show method of AdvMath with string and int parameters: " + str + " " + id);
            }
            public override int Mul(int a, int b)
            {
                return (a * b) * 2;
            }
            public override int Add(int a, int b)
            {
                return (a + b) + 1000;
            }
            // Shadowing using new keyword :
            // this to tell compiler to remove warning of intentional hiding of inherited member from base classes/ entities 
            public new int Sub(int x, int y)
            {
                return (x - y) * 100;

            }
            public int Square(int x)
            {
                return x * x;
            }
        }
    }
}
