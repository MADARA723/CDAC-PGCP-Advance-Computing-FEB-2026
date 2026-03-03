#include<iostream>
using namespace std;

int main()
{
    int n=1;
    static int s=1;

    
   for(int i=1;i<=10;i++)
   {
    for( int j = 1; j <=i ; ++j)
    {
        s=s+s;
       cout<<"1"<<s<<n<<s<<"1"<<endl; /* code */
    }
    cout<<" \n"<<endl;
   }
}