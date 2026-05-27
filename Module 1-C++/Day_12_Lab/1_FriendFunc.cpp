#include<iostream>
using namespace std;

// FLOW: Program demonstrates friend function accessing private class data.
// 1. Class A declared with private data and friend function xyz.
// 2. geta() reads input into private 'a'.
// 3. main creates object, inputs value, calls friend xyz to access/print private data.


class A
{
    // STEP 1: Private data member 'a' - normally inaccessible outside class
    int a;

    public:
    // STEP 1 cont: Public getter geta() & friend declaration for xyz (grants access to private members)
    int geta();
    friend void xyz(A&);


};
int A::geta()
{
    // STEP 2: Prompt and read value into private 'a' using 'this' pointer
    cout<<"Enter the value"<<endl;
    cin>>this->a;
}
// STEP 3: Friend function xyz - bypasses access restrictions to directly access/print private 'a' from passed object
void xyz(A& a10bj)
{
    cout<<"Friend function is accessing  private class data "<<a10bj.a<<endl;
}

int main()
{
    // STEP 4: Execution flow - Create class A object
    A a1obj;
    // STEP 5: Call public member function to input data
    a1obj.geta();
    // STEP 6: Call friend function (non-member) to access private data directly
    xyz(a1obj);
    // END: Friend function prints the private value, demonstrating access privilege.
}

