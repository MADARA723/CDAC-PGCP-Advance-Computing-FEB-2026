#include<iostream>
using namespace std;
class Test
{
    int a,b;
    public:
    void show(int a,int b)
    {
        this->a=a;
        (*this).b=b;//pointer dereference operator is used to access the members of current class object .
                                                       //it is value of this pointer which is used to access the members of current class object.
        cout<<"current object address is "<<this<<endl;
        a=a;
        b=b;
    }
    void display()
    {
        cout<<a<<" "<<b<<endl;
    } 
};
int main()
{
    Test t;
        t.show(10,20);
        t.display();
}