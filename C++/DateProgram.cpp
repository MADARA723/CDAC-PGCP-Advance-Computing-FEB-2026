#include<iostream>
using namespace std;

class MyDate
{
    int day,month,year;
    public:
    void accept()
    {
    cout<<"Accept day,month and year"<<endl;
    cin>>day>>month>>year;
    }
    void display()
    {
        cout<<"date is "<<day<<"/"<<month<<"/"<<year<<endl;
    }
    void setDay(int d)
    {
        day=d;
    }
    void setMonth(int m)
    {
        month=m;
    }
    void setYear(int y)
    {
        year=y;
    }
    int getDay()
    {
        return day;
    }
    int getMonth()
    {
        return month;
    }
    int getYear()
    {
        return year;
    }

};    
int main()
{
    MyDate d1;
    cout<<"size of the obj is "<<sizeof(d1)<<endl;
    d1.accept();
    d1.display();
    d1.setDay(15);
    d1.setMonth(8);
    d1.setYear(2024); 
    d1.display();
    int d=d1.getDay();
    cout<<"day is "<<d<<endl;
    int m=d1.getMonth();
    cout<<"month is "<<m<<endl;
    int y=d1.getYear();
    cout<<"year is "<<y<<endl;
    return 0;
}
