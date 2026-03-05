// Q. 
// Create a class Employee:

// Data Members:
// empId
// name
// salary
// static int totalEmployees
// Global variable string companyName

// Requirements:
// Constructor should initialize values
// Each time object is created → increment totalEmployees
// Function display()
// Static function showTotalEmployees()

// Create 5 employee objects in main and display:
// All employee details
// Total employees created
// Display company name in display function
#include<iostream>
using namespace std;
string companyName="A Good Company";
class Employee
{
    int empId;
    string name;
    float salary;
    static int totalEmployees;
    public:
    Employee()
    {
        empId=0;
        name="";
        salary=0.0;
        totalEmployees++;
    }
    Employee(int e,string n,float s)
    {
        empId=e;
        name=n;
        salary=s;
        totalEmployees++;
     

    }
    static void showTotalEmployees()
    {
        cout<<"Total Employees created: "<<totalEmployees<<endl;
    }
    void display()
    {
        cout<<"Total Employees created are \n"<<totalEmployees<<endl;
        cout<<"Employee ID: \n"<<empId<<"\nName \n"<<name<<"\nSalary is \n"<<salary<<endl;
        cout<<"\nThe Company Name is\n "<<companyName;
    }
};
int Employee::totalEmployees;
int main()
{
    int e;
    string n;
    float s;
    int i=0;
   // Employee e1,e2,e3,e4,e5;
    for(i=0;i<5;i++)
    {
    cout<<"Enter Employee ID: ";
    cin>>e;
    cout<<"Enter Employee Name: ";
    cin>>n;
    cout<<"Enter Employee Salary: ";
    cin>>s;
    
    
    }
    Employee e1(e,n,s);
    e1.display();
    Employee e2(e,n,s);
    e2.display();
    Employee e3(e,n,s);
    e3.display();
    Employee e4(e,n,s);
    e4.display();
    Employee e5(e,n,s);
    e5.display();
}

