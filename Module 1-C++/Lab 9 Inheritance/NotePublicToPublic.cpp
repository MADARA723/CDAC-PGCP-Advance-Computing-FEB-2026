// Note 2:
// When base class obj is created memory is allocated for base class datamembers only. Through base class obj, we can access base class members only ,we cannot access derived class members.

#include <bits/stdc++.h>
using namespace std;
// C++ program to demonstrate protected access modifier
#include <iostream>
using namespace std;
class Parent {
public:
    int id_p;
};
class Child : public Parent {
public:
    int id_c;
};
 int main()
{
    Parent obj1;
    obj1.id_c = 7;//error
    obj1.id_p = 91;
   cout << "Child id is: " << obj1.id_c << '\n';//error
    cout << "Parent id is: " << obj1.id_p << '\n';
    cout<<sizeof(obj1);
}
