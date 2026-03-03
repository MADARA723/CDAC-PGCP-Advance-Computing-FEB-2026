#include<iostream>
using namespace std;
/*WAP to accept and print 10 students data such as roll no,date of birth and marks.
Using:- 
class and object. 
Create parameterized constructor and 
default constructor.
  */
class Student
{
    int rollNo;
    float marks;
    string dob;
    public:
      //Parameterized constructor
       Student(int r,string d,float m)
       {
        rollNo =r;
        dob =d;
        marks =m;
       }
       //Default constructor
       Student()
       {
        rollNo=0;
        dob ="01-01-2000";
        marks =0.0;

       }
       void display(){
        cout<<"Roll No: "<<rollNo<<endl;
        cout<<"Date of Birth: "<<dob<<endl;;
        cout<<"Marks: "<<marks<<endl;
       }
    };
    int main()      
    {
      int r;
      string d;
      float m;
      int studNm;
      cout<<"Enter no of students and enter";
      cin>>studNm;
      for(int i=0;i<=studNm;i++)
      {
        cout<<"Enter the Roll No: ";
        cin>>r;

        cout<<"Enter the Date of Birth: ";
        cin>>d;

        cout<<"Marks: ";
        cin>>m;
        
        Student s(r,d,m);
       s.display();

      }
      
      return 0;
    }