using System.Net.Http.Headers;
using System.Xml.Serialization;

namespace _08Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
           while(true)
            {
                Console.WriteLine("Enter your Report choice: 1. PDF, 2. DOCX, 3. Excel, 4. JSON, 5. XML");
                int Choice = Convert.ToInt32(Console.ReadLine());

                ReportFactory fatory = new ReportFactory();
                Report somereport = fatory.GetSomeReport(Choice);
                somereport.GenerateReport();
                Console.WriteLine("Do oyu want to continue?y/n");
                string ynChoice = Console.ReadLine();
                if(ynChoice=="n")
                {
                    break;
                }
            }
        }
    }
    //Abstract class
    //
    public abstract class Report
    {
        protected abstract void Parse();
        protected abstract void Validate();
        protected abstract void Save();

        public virtual void GenerateReport()
        {
            Parse();
            Validate();
            Save();

        }

    }
    public abstract class SpecialReport:Report
    {
        protected abstract void ReValidate();
        public override void GenerateReport()
        {

            Parse();
            Validate();
            ReValidate();
            Save();

        }
    }
    public class ReportFactory
    {
        public Report GetSomeReport(int ch)
        {
            Report report = null;
            switch(ch)
            {
                case 1:
                    report = new PDF();
                    break;
                case 2:
                    report = new DOCX();
                    break;
                case 3:
                    report = new Excel();
                    break;
                case 4:
                    report = new JSON();
                    break;
                case 5:
                    report = new XML();
                    break;
                default:
                    Console.WriteLine("Invalid Choice");
                    break;

            }
            return report;
        }
    }
    public class PDF : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("Parsing PDF Report");
        }
        protected override void Validate()
        {
            Console.WriteLine("Validateing PDF Report");
        }
        protected override void Save()
        {
            Console.WriteLine("Saving the PDF");
        }
    }
    public class DOCX : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("Parsing DOCX Report");
        }
        protected override void Validate()
        {
            Console.WriteLine("Validateing DOCX Report");
        }
        protected override void Save()
        {
            Console.WriteLine("Saving the DOCX");
        }
    }
    public class Excel : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("Parsing Excel Report");
        }
        protected override void Validate()
        {
            Console.WriteLine("Validateing Excel Report");
        }
      
        protected override void Save()
        {
            Console.WriteLine("Saving the Excel");
        }
    }
    public class JSON : SpecialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("Parsing XML Report");
        }
        protected override void Validate()
        {
            Console.WriteLine("Validateing XML Report");
        }
        protected override void ReValidate()
        {
            Console.WriteLine("Validateing XML Report");
        }
        protected override void Save()
        {
            Console.WriteLine("Saving the XML");
        }
    }
    public class XML : SpecialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("Parsing XML Report");
        }
        protected override void Validate()
        {
            Console.WriteLine("Validateing XML Report");
        }
        protected override void ReValidate()
        {
            Console.WriteLine("Validateing XML Report");
        }
        protected override void Save()
        {
            Console.WriteLine("Saving the XML");
        }
    }

}
