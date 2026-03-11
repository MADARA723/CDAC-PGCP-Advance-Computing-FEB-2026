#include<iostream>
using namespace std;
#include<stdlib.h>
class Test {
		int x;
		public:
		Test()
		{
			cout<<"constructor is called\n";
		}
		~Test()
		{
			cout<<"destructor is called\n";
		}
};
int main()
{
	Test * ptr=new Test();
	delete ptr;//delete will call destructor
	Test *ptr1=(Test*)malloc(sizeof(Test));
	free(ptr);//free() will not call destructor
}