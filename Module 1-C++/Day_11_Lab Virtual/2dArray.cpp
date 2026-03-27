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
cout<<"Enter the Second b array"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        
        cin>>b[i][j];

    }
    
}

cout<<"This is array B"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<b[i][j]<<"\t";
    }
    cout<<"\n";
}
cout<<"Multiplication of 2D array"<<endl;
for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        cout<<a[i][j]*b[i][j]<<"\t";
    }
    cout<<"\n";
}

}
