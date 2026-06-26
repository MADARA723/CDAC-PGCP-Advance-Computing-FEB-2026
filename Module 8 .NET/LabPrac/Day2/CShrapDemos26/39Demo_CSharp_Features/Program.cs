using System.Collections;

namespace _39Demo_CSharp_Features
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Iterator custom Collection
            ////int[] arr = { 1, 2, 3, 4, 5 };
            ////ArrayList aeelst = new ArrayList() { "mon", "Tue" };

            //CustomCollection myCollectionObj = new CustomCollection();
            //myCollectionObj.Add("Mon");
            //myCollectionObj.Add("tue");

            //foreach (string day in myCollectionObj)
            //{
            //    Console.WriteLine(day);

            //} 
            #endregion
            #region Action Delegate 

            // Demo demo = new Demo();
            // Action action = new Action(demo.Show);
            //// action();

            // Action action1=delegate ()
            // {
            //     Console.WriteLine("Anonymous Method Action Delegate");
            // };
            // // action1();
            // Action action2 = () => Console.WriteLine("Lamda  Action Delegate");

            // //action2();

            #endregion

            #region Func<> delegate

            //int no = 5;

            //Func<int> doubleFunc = () => no * 2;
            ////Console.WriteLine(doubleFunc());
            //Func<string, string> func2 = (name) => $"Hello,{name}";
            //Console.WriteLine("enter the Name");
            //string? nm = Console.ReadLine();
            //Console.WriteLine(func2(nm));

            #endregion

            List<Emp> emps = new List<Emp>()
            {
                new Emp(){Id=1,Name="Ganesh",Address="Pune"},
                new Emp(){Id=2,Name="Nanesh",Address="Kune"},
                new Emp(){Id=3,Name="Chanesh",Address="Chune"}

            };

            Console.WriteLine("Enter city initials: ");
            string? letter = Console.ReadLine().ToLower();

            //Predicate<Emp> predicate = e => e.Address.StartsWith(letter);

            Predicate<Emp> predicate2 = e => e.Address.Contains(letter);

            var filtereddata = emps.FilteredEmpData(predicate2);

            foreach (var emp in filtereddata)
            {
                emp.DisplayEmpData();

            }
        }


        public class CustomCollection : IEnumerable
        {
            private List<string> days = new List<string>();
            public List<string> Days
            {
                get { return days; }
            }
            public void Add(string day)
            {
                days.Add(day);
            }

            public IEnumerator GetEnumerator()
            {
                for (int i = 0; i < days.Count; i++)
                {
                    yield return days[i];

                }
            }
        }
        public class Demo
        {
            public void Show()
            {
                Console.WriteLine("Show method is invoked from demp class");
                    
            }
        }
    }
        public class Emp
        {
            public int Id { get; set; }
            public string Name { get; set; }
            public string Address { get; set; }

            public void DisplayEmpData()
            {
                Console.WriteLine($"ID:{Id} Name:{Name} Address:{Address}");

            }
        }
        public static class MyClass
        {
            public static List<Emp> FilteredEmpData(this List<Emp> emps,Predicate<Emp> predicate)
            {
                List<Emp> filteredEmpList = new List<Emp>();
                foreach (Emp emp in emps)
                {
                    //if (emp.Address.StartsWith(startLetter))
                    //if (emp.Address.Contains("p"))
                    if (predicate(emp))
                    {
                        filteredEmpList.Add(emp);
                    }

                }
                return filteredEmpList;
            }
        }


}
