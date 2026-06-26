using System.Reflection;

namespace _35Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string assemblyPath = @"C:\UNIVERSE\HalfTime\CDAC PGCP AC 2026\Module 8 .NET\LabPrac\Day2\CShrapDemos26\33Demo_MyLib\bin\Debug\net8.0\33Demo_MyLib.dll";
            Assembly asm = Assembly.LoadFrom(assemblyPath);
            Type[] alltypes = asm.GetTypes();

            for (int i = 0; i < alltypes.Length; i++)
            {
                Type type = alltypes[i]; // Emp

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];

                    if (attr is CompanyInfoAttribute)
                    {
                        CompanyInfoAttribute comp = attr as CompanyInfoAttribute;

                        Console.WriteLine($"Company Name: {comp.CompanyName}, Developer Name: {comp.DeveloperName}");
                    }
                }
            }
        }
    }
}