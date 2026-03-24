// Q.5. Write a program to swap two numbers without using a third variable. 

#include<iostream>
using namespace std;

int main()
{
    int a,b;
    cout<<"Enter the Values"<<endl;
    cin>>a;
    cin>>b;

    a=a^b;
    b=a^b;
    a=a^b;

    cout<< "swapped values of a and b are \n"<<a<<endl<<b;

}