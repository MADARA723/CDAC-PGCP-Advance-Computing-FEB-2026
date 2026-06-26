using System.Net.Sockets;

namespace _38Demo_CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region Nullable Types
            // When same entity present in different "physical file locations" ,
            // compiler will not allow you to write such code because of logical grouping under same namespace.
            //We have to declare such entities partial to
            //avoide this error and compile code to generate single MSIL/ single application output.
            // CMath cmath = new CMath();
            //cmath.Add(2, 3);
            //cmath.Sub(14, 5);

            ////int x = 10;
            ////Nullable Opeartor:?
            ////int? x = null;
            //Nullable<int> x = null;
            //Nullable<double> salary = null;
            //double? sal = null;
            //string? str = Console.ReadLine();

            //if(salary.HasValue)
            //{
            //    Console.WriteLine($"Salary={salary.Value}");
            //}
            //else
            //{
            //    Console.WriteLine("Salary yet to be Initialized..still null value");
            //}

            #endregion
            #region Object Initializer

            //Person p1 = new Person();
            //Person p2 = new Person(12, "Peter");
            //Person p3 = new Person("Ron", "Pune", 20);

            //Person p1 = new Person();
            //Person p2 = new Person() { Id = 2, PName = "Ron", City = "Pune", PAge = 23 };
            //Console.WriteLine(p2.PName);

            //Console.WriteLine("Enter age");
            //int ag = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Id");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Name");
            //string? nm = Console.ReadLine();
            //Console.WriteLine("Enter City");
            //string? city = Console.ReadLine();


            //////compiler generates overloaded contructor syntaxs at the backend/ in MSIL for you.
            /////based on how you have created object and at the same time,
            /////how you have initialized properties in {} syntax :
            /////on same declaration line..

            //Person p4 = new Person() { PAge = ag, Id = id, City = city, PName = nm };
            //Console.WriteLine($"Id: {p4.Id}, Name: {p4.PName}, Age: {p4.PAge}, City:{p4.City}");


            int[] arr = new int[] { 1, 2, 3, 4, 5 };
            List<int> lstArr = new List<int>();

            //Person p1 = new Person() { Id = 1, PName = "Tim", City = "Pune" };
            //Person p1 = new Person() { Id = 2, PName = "Ron", City = "Patna" };
            //List<Person> lst = new List<Person>() { p1, p2, p3 };


            //List <Person> lst = new List<Person>() {
            //new Person() { Id = 1, PName = "Tim", City = "Pune" },
            //new Person() { Id = 2, PName = "Ron", City = "Patna" },
            //new Person() { Id = 3, PName = "Bob", City = "Borivali" }
            //};
            //lst.Add(new Person() { Id = 1, PName = "Tim", City = "Pune" });

            #endregion

            #region Auto-Properties
            //List<Emp> emplst = new List<Emp>()
            //{
            //    new Emp(){Id=1,Address="Bhopal",Name="Bob"},
            //    new Emp(){Id=2,Address="Pune",Name="Asit"},
            //    new Emp(){Id=3,Address="NAgpur",Name="Shashi"}
            //};

            //foreach(Emp emp in emplst)
            //{
            //    Console.WriteLine($"Id:{emp.Id},Name:{emp.Name},Address :{emp.Address}");

            //} 
            #endregion

            #region Implicit Type : a class without name
            //// Compiler generates class for you 
            ///along with private member and getter and setter 
            ///and parameterized consructor.
            //// If sequence of parameters changes in contructor,
            ///compiler creates new class for this new 
            ///combination

            //var e1 = new Emp() { Id = 1, Name = "Ronan",Address="Rome" };
            //Console.WriteLine(e1.GetType().ToString());
            //var v1 = new {Id=1,Name="Ronin",Address="ZipreNagar" };
            //Console.WriteLine(v1.GetType().ToString());
            //Console.WriteLine(v1.Address);

            //var v2 = new { Id = 2, Name = "ChamanChurnya", Address = "ChomyaNAgar" };
            //  Console.WriteLine(v2.Address);
            //var v3 = new { Id = 3, Name = "ChaddiWalaChintya", Address = "ShikreNager" };
            //Console.WriteLine(v3.Address); 
            #endregion


        }
               public class Emp
        {
            // In this property, compiler will be generating a
            // private member at the backend using its own naming algorithm
            // and along with this , it will also generate getter and
            // setter methods for us.
            // we can see this member name using ildasm command
            // You will use this feature , when we have to write temporary Holder
            // classes to hold collection of Database records.

            public int Id { get; set; }
            public string Name { get; set; }

            public string Address { get; set; }
        }

        public class Person
        {
            private int _Id;
            private string? _PName;
            private int _PAge;
            private string? _City;

            public string? City
            {
                get { return _City; }
                set { _City = value; }
            }


            public int PAge
            {
                get { return _PAge; }
                set { _PAge = value; }
            }


            public string? PName
            {
                get { return _PName; }
                set { _PName = value; }
            }


            public int Id
            {
                get { return _Id; }
                set { _Id = value; }
            }

            #region ctor overloading
            public Person()
            {

            }
            public Person(int id, string nm)
            {
                _Id = id;
                _PName = nm;
            }
            public Person(string nm, string city, int ag)
            {
                _PName = nm;
                _PAge = ag;
                _City = city;
            }
            public Person(string nm, int ag)
            {
                _PName = nm;
                _PAge = ag;
            }
            #endregion

        }
        public partial class CMath
        {
            // private Nullable<int> _Number;
            private int? _Number;

            // public Nullable<int> Number{}
            public int? Number
            {
                get { return _Number; }
                set { _Number = value; }
            }

            //Ajay
            public void Add(int x, int y)
            {
                Console.WriteLine($"Add = {x + y}");
            }
            public void Sub(int x,int y)
            {
                Console.WriteLine($"Sub = {x - y}");

            }
        }
    }
}
