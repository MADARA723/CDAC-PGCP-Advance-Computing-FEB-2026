// Q.2. Count how many digits are present in the number. 
// Input: 12345        Output: Number of digits = 5

#include<iostream>
using namespace std;
int main()
{
    int num=0,temp=0;
     int count=0;
    cout<<"Enter the number : "<<endl;
    cin>>num;
    while(num!=0)
    {
        
        num=num/10;
         
         count++;
        //num=num%10;

    }
    cout<<"Number Count is : "<<count<<endl;
}

