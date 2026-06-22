using Microsoft.VisualBasic;

namespace _20Demo_ObserverDesignPattern
{
    public delegate void MyHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            // Coupling Publisher/ Observer with Subscriber
            Publisher publish = new Publisher();
            Subscriber subsA = new Subscriber();
            Subscriber subsB = new Subscriber();

            publish.NotifyChange += new MyHandler(subsA.SMSServices);
            publish.NotifyChange += new MyHandler(subsB.EmailService);

            WeatherStation obj = new WeatherStation();
            if(obj.Alert())
            {
                publish.RaiseNotification();
            }
            // De-coupling operator

            publish.NotifyChange -= new MyHandler(subsA.EmailService);
            publish.NotifyChange -= new MyHandler(subsB.WhatsAppServcie);
            if(obj.Alert())
            {
                publish.RaiseNotification();
            }
        }

    }
    public class WeatherStation
    {
        public bool Alert()
        {
            return true;
        }
    }
    public class Publisher //observer
    {
        public event MyHandler NotifyChange;
        public void  RaiseNotification()
        {
            NotifyChange();
        }
    }
    public class Subscriber
    {
        public void SMSServices()
        {
            Console.WriteLine("SMS sent beacuse of change in Data");

        }
        public void EmailService()
        {
            Console.WriteLine("Email sent beacuse of change in the data");
        }
        public void WhatsAppServcie()
        {
            Console.WriteLine("Whatsapp messsage sent beacuse of chnage in data");
        }
    }
}
