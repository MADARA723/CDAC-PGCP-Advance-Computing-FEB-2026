namespace _22Demo_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Array[]
            //int[] numbers = new int[3];
            //numbers[0]= 10;
            //numbers[1] = 20;
            //numbers[2] = 30;

            //for(int i=0;i<numbers.Length;i++)
            //{
            //    Console.WriteLine(numbers[i].ToString());
            //} 
            #endregion

            #region String[]
            //string[] days = new string[5];
            //days[0] = "Mon";
            //days[1] = "Tue";
            //days[2] = "Wed";
            //days[3] = "Thu";
            //days[4] = "Fri";

            //for (int i = 0; i < days.Length; i++)
            //{
            //    Console.WriteLine(days[i]);

            //} 
            #endregion

            
            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "Jin Sakai";
            emp1.Address = "Tsushima";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "Vegeta";
            emp2.Address = "Planet Earth";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "Madara Uchiha";
            emp3.Address = "Konoha";

            Book book1 = new Book();
            book1.BookName = "Kashi Hi Banva Banvi";
            book1.AuthorName = "Angle Pangle Prakashan";

            Book book2 = new Book();
            book2.BookName = "Dont Reason with Tiger when your Head in its Mouth";
            book2.AuthorName = " Roast Media Publisher";


            #region 
            //Emp[] emps = new Emp[3];
            //emps[0] = emp1;
            //emps[1] = emp2;
            //emps[2] = emp3;

            //for (int i = 0; i < emps.Length; i++)
            //{
            //    emps[i].GetSomeDetails();

            //}

            #endregion

            #region Boxing,Unboxing,Type Casting
            ////// value types : int, double
            ////// Reference type:  Emp, object, string 

            ////// Boxing: Converting value types to reference type
            ////// UnBoxing: Converting refernce types again back to value type
            ////// Type-casting : Converting value to value types OR Refernce to reference types.

            //object[] arr = new object[6];

            //arr[0] = 100;
            //arr[1] = "Something";
            //arr[2] = true;
            //arr[4] = emp1;
            //arr[5] = "23.34";

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    object obj = arr[i];

            //    if(obj is int)
            //    {
            //        int j = Convert.ToInt32(obj);
            //        Console.WriteLine(j);
            //    }

            //    //if (obj.GetType().ToString() == "_22Demo_Collection.Emp") 
            //    if(obj is Emp)
            //    {
            //        //Emp emp=(Emp) obj;//Type Casting
            //        Emp emp = obj as Emp;
            //        emp.GetSomeDetails();
            //    }
            //    if(obj is string)
            //    {
            //        string str = obj as string;//Type Casting
            //        Console.WriteLine(str);

            //    }
            //    if(obj is bool)
            //    {
            //        bool b = Convert.ToBoolean(obj);//Unboxing
            //        Console.WriteLine(b);

            //    }
            //    if(obj is double)

            //    {
            //        double d = Convert.ToDouble(obj);//Unboxing
            //        Console.WriteLine(d);


            //    }

            //} 
            #endregion

            #region STACK

            //Stack st = new Stack();
            //st.Push(100);
            //st.Push(200);
            //st.Push(300);

            //int length = st.Count;

            //for (int i = 0; i < length; i++)
            //{
            //    Console.WriteLine(st.Pop());
            //} 
            #endregion



            #region Queue
            //Queue queue = new Queue();
            //queue.Enqueue(100);
            //queue.Enqueue(200);
            //queue.Enqueue(300);

            //int ln = queue.Count;

            //for (int i = 0; i < ln; i++)
            //{
            //    Console.WriteLine(queue.Dequeue());
            //}

            #endregion


        }
    }
    public class Emp
    {
        private int _Id;


        private string _Name;
        private string _Address;

        public int Id
        {
            set
            {
                _Id = value;
            }
            get
            {
                return _Id;
            }
        }
        public string Name
        {
            set
            {
                _Name = value;

            }
            get
            {
                return _Name;
            }
        }
        public string Address
        {
            set
            {
                _Address = value;
            }
            get
            {
                return _Address;
            }
        }
        public void GetSomeDetails()
        {
            Console.WriteLine($"Id: { Id} Name : {Name} Address: {Address}");
        }
    }
    public class Book
    {
        private string _BookName;
        private string _AuthorName;

        public string AuthorName
        {
            get { return _AuthorName; }
            set { _AuthorName = value; }
        }
        public string BookName
        {
            get { return _BookName; }
            set {_BookName=value; }
        }
    }
}
