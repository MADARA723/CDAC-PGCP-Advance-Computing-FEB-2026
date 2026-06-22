//using System.Reflection;

//namespace _32Demo_Reflection
//{
//    internal class Program
//    {
//        static void Main(string[] args)
//        {
//            string assemblyPath = @"C:\UNIVERSE\HalfTime\CDAC PGCP AC 2026\Module 8 .NET\LabPrac\Day2\CShrapDemos26\31MyMathLib\bin\Debug\net8.0\31MyMathLib.dll";

//            Assembly asm = Assembly.LoadFile(assemblyPath);

//            Type[] allTypes=asm.GetTypes();

//            for (int i = 0; i < allTypes.Length; i++)
//            {
//                Type type = allTypes[i];

//                //Console.WriteLine(type.IsPublic);
//                //Console.WriteLine(type.IsClass);

//                MethodInfo[] allMethod = type.GetMethods();

//                for (int j = 0; j < allMethod.Length; j++)
//                {
//                    MethodInfo method = allMethod[j];
//                    //Console.WriteLine(method.Name);

//                    ParameterInfo[] allParameters = method.GetParameters(); 
//                    for (int k = 0; k < allParameters.Length; k++)
//                    {
//                        ParameterInfo currentparameter = allParameters[k];
//                        // Console.WriteLine(currentparameter);

//                        Console.WriteLine(currentparameter.Name+" "+currentparameter.ParameterType.ToString());

//                    }
//                }

//            }
//        }
//    }
//}
