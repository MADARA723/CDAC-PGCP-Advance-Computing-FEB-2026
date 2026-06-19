using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Hello World Example
            System.Console.WriteLine("Hello Asit");

            // 1. for Loop Example
            for (int i = 0; i < 5; i++)
            {
                System.Console.WriteLine(i);
            }

            System.Console.WriteLine("-------------------");

            //While Loop Example
            int x = 1;
            while (x <= 6)
            {
                System.Console.WriteLine(x);
                x++;
            }

            System.Console.WriteLine("-------------------");

            // 3. Do-While and Switch Case Example
            int ch;
            do
            {
                System.Console.WriteLine("Enter a number (1, 2, or 3 to exit):");

                // Read input inside the loop so it can change
                ch = Convert.ToInt32(Console.ReadLine());
                System.Console.WriteLine("You entered: " + ch);

                switch (ch)
                {
                    case 1:
                        System.Console.WriteLine("First Case");
                        break;
                    case 2:
                        System.Console.WriteLine("Second Case");
                        break;
                    case 3:
                        System.Console.WriteLine("Exiting program...");
                        break;
                    default:
                        System.Console.WriteLine("Invalid choice. Try again.");
                        break;
                }

                System.Console.WriteLine("-------------------");

            } while (ch != 3); // Loop ends when user enters 3

            if (ch == 3)
            {
                System.Console.WriteLine("Program has exited.");
            }
            else
            {
                System.Console.WriteLine("Program is still running.");
            }

            for (int i = 0; i < 5; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    System.Console.Write("*");
                }
                System.Console.WriteLine("\n");
            }
        }
    }
}
