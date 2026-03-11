#include<iostream>
using namespace std;
#include<string.h>

class String1
{
    int len;
    char * ptr;
    public:
    void display()
    {
        cout<<"Length of string is "<<len<<endl;
        cout<<"String is "<<ptr<<endl;
    }
    String1(char *  sptr)

    {
       len= strlen(sptr);
       ptr =new char[len+1];
       strcpy(ptr,sptr);

    }
    ~String1()
    {
        cout<<"Destructor called for string "<<ptr<<endl;
        delete []ptr;
    }
};
int main()
{
    String1 c2("Hello");
    c2.display();
}