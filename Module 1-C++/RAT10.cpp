/*
WAP to print the following pattern:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
*/
#include<iostream>
using namespace std;
int main()
{
    int i,j;
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=i;j++)
        {
            if(j%2==0)
            {
                cout<<"0\t";
            }
            else
            {
                cout<<"1\t";
            }
        }
        cout<<endl;
    }
}