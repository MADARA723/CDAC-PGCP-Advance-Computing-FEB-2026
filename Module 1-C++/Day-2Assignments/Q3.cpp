// Q.
// WAP to print Reverse Alphabet Pattern

// A B C D E
// A B C D
// A B C
// A B
// A
#include<iostream>
using namespace std;

int main()
{
    int i,j;
    for(i=5;i>=1;i--)
    {
        
        for(j=1;j<=i;j++)
        {
            cout<<"\t";
            cout<<(char)(j+64);

        }
        cout<<endl;
    }
}