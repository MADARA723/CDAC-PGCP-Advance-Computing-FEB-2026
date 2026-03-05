// Q.
// Write overloaded functions to find area of:
// -Square
// -Rectangle

// Example

// area(int side)
// area(int length, int breadth)

#include <iostream>  

using namespace std;  
 void square(int side=3);
 void rectangle(double length =2.2f, double breadth=3.3f);
 void square(int side)
{
  cout<<"Area of the Square : "<<side*side<<endl;
 } 
 void rectangle(double length,double breadth)
 {
    cout<<"Area of the Rectangle : "<<length*breadth<<endl;
 }
int main() 
{
  square();
  rectangle();
  square(5);
  rectangle(10,20);
  
    return 0;  
} 
