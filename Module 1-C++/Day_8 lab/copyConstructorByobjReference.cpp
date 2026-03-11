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
    Sample(Sample& new_obj1)
    {
        new_obj1.id=this->id;
        cout<<"Copy constructor is called"<<endl;
}

};
int main()
{
    Sample obj1(100);
    obj1.display();
    //classname newobj(oldobj)
    Sample obj2(obj1);
    obj2.display();
    
}