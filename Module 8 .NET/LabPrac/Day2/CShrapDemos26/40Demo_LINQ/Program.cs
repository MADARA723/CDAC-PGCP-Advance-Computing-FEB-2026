namespace _40Demo_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IEnumerable<Emp> emps = new List<Emp>()
            {
                new Emp(){Id=1,Name="Asit",Address="Latur"},
                new Emp(){Id=2,Name="LAsit",Address="Patur"},
                new Emp(){Id=1,Name="Pasito",Address="Katur"}
            };

            #region MyWhere with predicate
            //Predicate<Emp> predicate = e => e.Address.StartsWith("p");
            //var result = emps.MyWhere(predicate);

            // var result = emps.MyWhere(e => e.Address.Contains("P"));
            //foreach (var emp in result)
            //{
            //    emp.DisplayEmpData();

            //}

            #endregion

            #region emps.MyWhere().MySelect()
            ////var result = emps.MyWhere(e => e.Address.StartsWith("p")).MySelect();
            //var result = emps.MyWhere(e => e.Address.Contains("p")).MySelect();

            //foreach (var emp in result)
            //{
            //    emp.DisplayEmpData();
            //}
            #endregion

             
        }
    }

    public static class MyClass
    {
        public static IEnumerable<Emp> MyWhere(this IEnumerable<Emp> allemps,Func<Emp,bool> predicate)
        {
            List<Emp> FilteredEmps = new List<Emp>();
            foreach (var emp in allemps)
            {
                if(predicate(emp))
                {
                    FilteredEmps.Add(emp);
                }

            }
            return FilteredEmps;
        }
    }
    public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }

        public string Address { get; set; }
        public void DisplayEmpData()
        {
            Console.WriteLine($"Id:{Id},Name: {Name},Address; {Address}");



        }
    }
}
