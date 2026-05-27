#include<iostream>
using namespace std;
class A
{
	int a;
public:
	A();
    void display();
    A(int z)
    {
    	cout<<"para constructor of A is called"<<endl;
    	a=z;
	}
 };
A::A()
{
	cout<<"in DEFAULT of A\n";
	
}
void A::display()
{
	cout<<a<<endl;
}
class B:public A
{
	int b;
public:
	B():A(100)
	{
		b=200;	
	}

void B::display()
{
	A::display();
	cout<<b<<endl;
};

int main()
{
	B bobj;
	bobj.display();
}

