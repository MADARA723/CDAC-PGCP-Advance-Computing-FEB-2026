#include<iostream>
using namespace std;

class Complex
{
    int real,imaginary;
    public:
    void accept()
    {
        cout<<"Enter real and imaginary part of complex number"<<endl;
        cin>>real>>imaginary;
    }
    void display()
    {
        cout<<"Complex number is "<<real<<"+"<<imaginary<<"i"<<endl;
    }
    void setReal(int r)
    {
        real = r;
    }
    int getReal()
    {
        return real;
    }
};
int main()
{
    Complex c1;
    c1.accept();
    c1.display();
    c1.setReal(10);
    cout<<"Real part is: "<<c1.getReal()<<endl;
    int r = c1.getReal();
    cout<<"Real part is: "<<r<<endl;

    return 0;
}