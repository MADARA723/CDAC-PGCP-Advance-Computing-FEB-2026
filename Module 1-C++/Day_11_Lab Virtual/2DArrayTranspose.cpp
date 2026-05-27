#include<iostream>
using namespace std;

int main()
{


int a[3][3];
int b[3][3];
cout<<"Enter the First array"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cin>>a[i][j];
        

    }
    
}

cout<<"this is Array A"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<a[i][j]<<"\t";
    }
    cout<<"\n";
}
cout<<"Transpose of 2D Matrix"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<a[j][i]<<"\t";
    }
    cout<<"\n";
}
}