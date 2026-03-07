#include<iostream>
using namespace std;
class Complex
{
  int real,img;//instance variable
  public:
    Complex(int real,int img)//local variable
    {
      this->real=real;
      this->img=img;
    }
  static  void display()
    {
    
      cout<<this;//error -->this pointer cant be used in static function
    }
};
int main()
{

  Complex c1(1,2);
  Complex::display();
  

  
  
}