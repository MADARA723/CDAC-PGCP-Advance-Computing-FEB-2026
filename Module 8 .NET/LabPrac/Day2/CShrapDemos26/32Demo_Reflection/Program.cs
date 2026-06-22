using System.Reflection;

namespace _32Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string assemblyPath = @"C:\UNIVERSE\HalfTime\CDAC PGCP AC 2026\Module 8 .NET\LabPrac\Day2\CShrapDemos26\31MyMathLib\bin\Debug\net8.0\31MyMathLib.dll";

            Assembly asm = Assembly.LoadFile(assemblyPath);

            Type[] allTypes = asm.GetTypes();

            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i];

                // CMath cmathObj = new CMath();
                // obhect dynamicallyCreatedObject = cmathObj;

                object dynamicallyCreatedObject = asm.CreateInstance(type.FullName);//Factory Method

                MethodInfo[] allMethod = type.GetMethods(BindingFlags.Public|BindingFlags.Instance|BindingFlags.DeclaredOnly);

                for (int j = 0; j < allMethod.Length; j++)
                {
                    MethodInfo method = allMethod[j];


                    ParameterInfo[] allParameters = method.GetParameters();
                    object[] methodArguments = new object[allParameters.Length];
                    for (int k = 0; k < allParameters.Length; k++)
                    {
                        ParameterInfo currentparameter = allParameters[k];

                        Console.WriteLine("Enter value fro parameter {currentParameter.Name}: ");
                        string input=Console.ReadLine();
                        object? value = Convert.ChangeType(input,currentparameter.ParameterType);
                        methodArguments[k]= value;

                    }

                    //object? result = dynamicallyCreatedObject.Add(10,20);
                    object? result = type.InvokeMember(method.Name,BindingFlags.InvokeMethod,null,dynamicallyCreatedObject,methodArguments);
                    Console.WriteLine($"{method.Name}={result}");

                }

            }
        }
    }
}
