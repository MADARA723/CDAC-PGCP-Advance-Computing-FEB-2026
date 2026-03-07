
/* This pointer is used to retrieve objects address. 
 In c to find out variable address,we use & symbol.in
  c++,to know current object address, this pointer is used.
  every non static member function of c++ is having one hidden parameter called as this.
   static members function never contains this.*/

#include<iostream>
using namespace std;
class Complex
{
  int real,img;
  public:
    Complex(int r,int i)
    {
      real=r;
      img=i;
    }
    void display()
    {
      cout<<"address inside this  is "<<this<<endl;
      cout<<this->real<<"+"<<this->img<<"i"<<endl;
    }
};
int main()
{

  Complex c1(1,2);
  cout<<"address of object c1 is "<<&c1<<endl;
  c1.display();
  
  Complex c2(3,4);
    cout<<"address of object c1 is "<<&c2<<endl;
  c2.display();
  
  
}