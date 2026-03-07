#include<iostream>
using namespace std;
class Test
{
    int a,b;
    public:
    void show(){
        a=10;
        b=20;
        cout<<"current object address is "<<this<<endl;
        cout<<"a = "<<this->a<<" b = "<<this->b<<endl;
    }
    
};
int main()
{
    Test t;
    cout<<&t<<endl;
    t.show();
}