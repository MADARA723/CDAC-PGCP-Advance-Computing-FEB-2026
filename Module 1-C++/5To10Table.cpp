/*WAP to print 5 -10 table 
5*1=5
5*10=50
USed Nested for Loop*/

#include<iostream>
using namespace std;

int main()
{
    int i,j;
    for(i=5;i<=10;i++)
    {
        for(j=1;j<=10;j++)
        {
            cout<<i<<"*"<<j<<"="<<i*j<<endl;
        }
        cout<<"---------------------------------"<<endl;
    }
}