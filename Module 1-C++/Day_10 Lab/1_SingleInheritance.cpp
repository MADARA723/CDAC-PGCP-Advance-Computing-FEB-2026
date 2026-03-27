#include<iostream>
using namespace std;

class A
{
	int a;
	public:
	A();
	void display();

};
A::A()
{
	cout<<"In Default of A"<<endl;

	a=10;
}
void A::display()
{
	cout<<"In display of A"<<endl;
	cout<<a<<endl;
}
class B:public A
{
	int b;
	public:
	B();
	void display();
};
B::B()
{
	cout<<"In default of B"<<endl;
	 b=20;
}
void B::display()
{
	cout<<"In display of B"<<endl;
	A::display();
	cout<<"display of A Called in Void B display()"<<endl;
	cout<<b<<endl;
}
int main()
{
	B bobj;
	/*
	1: when obj of B is created which is derived 
	class of A so, 
	default constructor A is initialized first which a=10 initialzed,
	In Default of A
	implicit base constructor call
	2: after that default constructor of B is initialized which constains b=20
	In default of B
	*/

	bobj.display();
	/*
	3. when obj of class B with display() is called then obj of b is displayed which also 
	contains the display of Class of A and print of variable b.
	         In Display of B
	
	4.Display of class A is called from derived class B 
	which contains print a value variable a:-
	         In Display of A
			 10
		DISPLAY OF CLASS A IS OVERRIDDEN BY DISPLAY OF CLASS B		 
	5.After display of class A comes back display of derived class B 		 
	which also contains cout statement with cout b initialization
	         display of A Called in Void B display()
	         20		 
	*/
}