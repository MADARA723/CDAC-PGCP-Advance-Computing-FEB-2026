namespace _09Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IDemo obj =new MyClass();
            obj.Foo();
            //  obj.Log(); In accordance with the C# 12.0 specification, interface members can have access modifiers, including protected.
            //  However, protected members of an interface are not accessible through an instance of the interface.
            //  They can only be accessed within the implementing class or its derived classes.
            //  Therefore, you cannot call the Log() method directly on an instance of IDemo.
        }
    }
    public interface IDemo
    {
        public static int Id;
        void Foo();
        protected void Log()
        {
            Console.WriteLine("Log method from IDemo interface");
        }
    }
    public class MyClass : IDemo
    {
        public void Foo()
        {
            Console.WriteLine("Foo method from MyClass");   
        }
        public void  Log()
        {
            Console.WriteLine("Log method from MyClass");
        }
    }

}
