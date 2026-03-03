#include<iostream>
using namespace std;
class Employee
{
   int id,sal;
   public:
   void accept()
   {
       cout<<" enter the value of id and salary "<<endl;
       cin>>id>>sal;
   }
   void display()const
   {
       cout<<" id of the employee is"<<id<< " and the salary of the employee is"<<sal<<endl;

   }
   int setId(int i)
   {
    id=i;
   }
   void setSal(int s)
   {
    sal=s;
   }
   
    int getId()const
    {
        return id;
    }
    int getSal()const
    {
        return sal;
    }
}; 
int main()
    {
        Employee e1;
        cout<<" enter the details of employee "<<endl;
        e1.display();
        e1.setId(14);
        e1.setSal(5000);
        return 0;

        
        
    }
