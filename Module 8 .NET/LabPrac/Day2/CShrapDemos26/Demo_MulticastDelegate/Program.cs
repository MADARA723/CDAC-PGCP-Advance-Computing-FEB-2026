namespace Demo_MulticastDelegate
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)

        // Multi-cast Delegate Syntax

        {
            Console.WriteLine("Does Kartos kill Entire Greek Pantheon");

            bool isHere = false;

            GOWFunction obj = new GOWFunction();

            // Coupling multiple same signature methods
            // to a single delegate reference using
            // += operator.
            MyEventHandler handler= new MyEventHandler(obj.ZeusSpeech);
            //handler -= obj.ZeusSpeech;
            handler += new MyEventHandler(obj.KratosSpeech);
            //handler -= obj.KratosSpeech;
            handler += obj.Zeus2Speech;
            handler();



        }
    }

    public class GOWFunction()
    {
        public void ZeusSpeech()
        {
            Console.WriteLine("Zeus:  Welcome Kratos!!!");
        }
        public void KratosSpeech()
        {
            Console.WriteLine("Kratos:  The hands of death could not defeat me. " +
                "The Sisters of Fate could not hold me." +
                " And you will not live to see the end of this day." +
                " I WILL HAVE MY VENGEANCE!");
        }
        public void Zeus2Speech()
        {
            Console.WriteLine("Zeus:  You will never find peace, Kratos. ");
        }

    }
}
