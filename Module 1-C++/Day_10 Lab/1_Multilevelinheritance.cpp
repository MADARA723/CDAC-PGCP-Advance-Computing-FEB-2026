#include<iostream>
using namespace std;

class  A
{
    public:
    A()
    {
        cout<<"Base class constructor of A invoked"<<endl;
    }
    ~A()
    {
        cout<<"Base class destructor of A is invoked"<<endl;
    }

};
class B:public A
{
    public:
    B()
    {
        cout<<"Derived class constructor of B invoked"<<endl;
    }
    ~B()
    {
        cout<<"Derived class Destructor of B invoked"<<endl;
    }
};
class C:public B
{
    public:
    C()
    {
        cout<<"Derived class constructor of C invoked"<<endl;
    }
    ~C()
    {
        cout<<"Derived class destructor of C invoked"<<endl;
    }
};

int main()
{
C obj;
return 0;

}