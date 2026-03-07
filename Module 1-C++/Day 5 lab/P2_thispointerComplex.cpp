/*
 This pointer is used to retrieve objects address. 
 In c to find out variable address,we use & symbol.in
  c++,to know current object address, this pointer is used.
  every non static member function of c++ is having one hidden parameter called as this.
   static members function never contains this.
   
   It is a constant pointer. The type of this pointer for the object Complex c1 will  be
Complex * const this; //it is a constant pointer to Complex object.
   */
#include<iostream>
using namespace std;
class Complex
{
    int real,img;//instance variable
    public:
    Complex(int real,int img)//local variable}
    {
        this->real=real;/* this pointer is used to differenciate 
        between local variable and instance variable 
        when they have same name*/
        this->img=img;
    }
    void display()
    {
        cout<<this->real<<"+"<<this->img<<"i"<<endl;

    }
};
int main()
{
    Complex c1(1,2);
    c1.display();

}