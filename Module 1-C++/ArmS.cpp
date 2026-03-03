/*
WAP to accept a no. from user and display whether the no. is armstrong no. or not. 
An armstrong no. is a no. which is equal to the sum of cubes of its digits. 
For example, 153 is an armstrong no. because 1^3 + 5^3 + 3^3 = 153.
*/
#include<iostream>
using namespace std;

int main()
{
    int num,rem,sum=0,orgnum;
    cout<<"Enter a number: ";
    cin>>num;
    orgnum=num;
    while (num!=0)
    {
        rem=num%10;
        sum=sum+rem*rem*rem;
        num=num/10;
    }
    if(sum==orgnum)
    {
        cout<<orgnum<<" is an armstrong no."<<endl;
    }
    else
    {
        cout<<orgnum<<" is not an armstrong no."<<endl;
    }
}