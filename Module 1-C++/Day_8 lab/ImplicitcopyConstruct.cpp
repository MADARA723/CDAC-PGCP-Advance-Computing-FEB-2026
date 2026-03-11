#include<iostream>
using namespace std;

class Sample
{
    int id;
    public:
    Sample(int x)
    {
        cout<<"Constructor is called"<<endl;
        id=x;
    }
    void display()
    {
        cout<<endl<<"ID is : "<<id;
    }
};
int main()
{
    Sample obj1(10);
    obj1.display();
    Sample obj2(obj1);//copy constructor is called
    obj2.display();
}