using System.Security.Cryptography.X509Certificates;

namespace _05Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            while(true)
            {
                Console.WriteLine("Enter your Database choice : 1. MySql,2. Oracle,3. SqlServer ");
                int dbchoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                IDatabase dbObj=factory.GetSomeDatabase(dbchoice);
                if(dbObj==null)
                {
                    Console.WriteLine("Enter the Database Choice: !.MySql, 2.Oracle,3.SqlServe");
                    int opChoice=Convert.ToInt32(Console.ReadLine());
                    switch(opChoice)
                    {
                        case 1:
                            dbObj.Insert();
                            break;
                        case 2:
                            dbObj.Update();
                            break;
                        case 3:
                            dbObj.Delete();
                            break;
                        default:
                            Console.WriteLine("Invalid Operation Choice");
                            break;

                    }

                }

                Console.WriteLine("Do you want to continue ? (Y/N)");
                string ynchoice=Console.ReadLine().ToLower();

                if(ynchoice=="n")
                {
                                       break;
                }


            }


        }
        public interface IDatabase
        {
            void Insert();
            void Update();
            void Delete();
        }
        public class DataBaseFactory
        {
            public  IDatabase GetSomeDatabase(int dbChoice)
            {
                IDatabase obj = null;
                switch (dbChoice)
                {
                    case 1:
                        obj= new MySqlServer();
                        break;
                    case 2:
                        obj= new OracleServer();
                        break;
                    case 3:
                        obj= new SqlServerServer();
                        break;
                    default:
                        obj = null;
                        break;
                        
                }
                return obj; 
            }
        }
        // S.O.L.I.D Principles
        // Rule : Single Responsibility Principle (SRP)
        public class MySqlServer:IDatabase
        {
            public  void Insert()
            {
                Console.WriteLine("MySql Insert Operation");
            }
            public void Update()
            {
                Console.WriteLine("MySql Update Operation");
            }
            public void Delete()
            {
                Console.WriteLine("Delete operation of MySql");
            }

        }
        public class OracleServer:IDatabase
        {
            public void Insert()
            {
                Console.WriteLine("Insert operation of Oracle");

            }
            public void Update()
            {
                Console.WriteLine("Update opeartion of oracle");
            }
            public void Delete()
            {
                Console.WriteLine("Delete operation of Oracle");
            }
        }
        public class SqlServerServer:IDatabase
        {
            public void Insert()
            {
                Console.WriteLine("Insert operation of SqlServer");
            }
            public void Update()
            {
                Console.WriteLine("Update operation of SqlServer");
            }
            public void Delete()
            {
                Console.WriteLine("Delete operation of SqlServer");
            }
        }

    }
}
