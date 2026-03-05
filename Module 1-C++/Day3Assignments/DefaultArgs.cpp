
// Q.
// Write a function to calculate the sum of two numbers using default arguments.

// Example

// add(int a=10, int b=20)

// Call function with :

// add()
// add(50)
// add(10,20)

#include <iostream>  

using namespace std;  
 void add(int a=5, int b=5);
int main() 
{
  add();
  add(10);
  add(10,20);
  
    return 0;  
} 
void add(int a,int b)
{
  cout<<a+b<<endl;//10 15 30
 } 