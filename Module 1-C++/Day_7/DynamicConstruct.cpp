#include <iostream>
using namespace std;

class Demo
{
    int *ptr;

public:
    Demo() // Dyanamic Constructor
    {
        cout << "Dynamic Constructor is called" << endl;
        ptr = new int;
        *ptr = 10;
    }

    void display()
    {
        cout << "Value of attribute *ptr" << *ptr << endl;
    }

    ~Demo()
    {
        cout << "Destructor is called" << endl;
        delete ptr; // head section is deallocated
    }
};

int main()
{
    Demo obj1; // object create on stack
    obj1.display();
}