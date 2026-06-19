using System.Net.Http.Headers;

namespace _08Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
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
    public abstract class SepcialReport:Report
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
        public Report getSomeReport(int ch)
        {
            Report report = null;
            switch(ch)
            {
                case 1:
                    break;
                case 2:
                    break;
                 case 3:
                    break;
                    case 4:
                    break;
                    case 5:
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

}
