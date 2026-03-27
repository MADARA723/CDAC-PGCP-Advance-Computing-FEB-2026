/* SINGLE INHERITANCE CONCEPT EXPLAINED:
- Single Inheritance: Class B inherits from ONE base class A (publicly).
- When creating B object, BASE class A constructor runs FIRST (implicit call), THEN derived B constructor.
- B::display() OVERRIDES A::display() - calls base explicitly with A::display(), then own code.
- FLOW: main() → B(bobj) [A ctor → B ctor] → B::display() [A::display() → print b]
*/

#include<iostream>
using namespace std;

// BASE CLASS A - holds 'a', default ctor initializes a=10, display prints a
class A
{
	int a;  // private data
public:
	A();    // declare default ctor
    void display();  // declare display
 };

// A::A() DEFINITION - prints message, sets a=10
// This runs FIRST when B object created (implicit base ctor call)
A::A()
{
	cout<<"in default of A\\n";  // PROOF base ctor runs
	a=10;
}

// A::display() - prints value of 'a' (10)
void A::display()
{
	cout<<a<<endl;  // outputs: 10
}

// DERIVED CLASS B inherits PUBLICLY from A (gets A's public members)
class B:public A  // :public A = single inheritance
{
	int b;  // own data
public:
	B();       // own ctor
	void display();  // override display
};

// B::B() - prints message, sets b=20
// Runs AFTER A::A() completes
B::B()
{
	cout<<"in default of B\\n";  // PROOF derived ctor runs second
	b=20;
}

// B::display() OVERRIDE - calls base display FIRST, then prints own b
void B::display()
{
	A::display();    // explicit call to base - prints 10
	cout<<b<<endl;   // prints 20
}

int main()
{
	// Step-by-step FLOW when executed:
	// 1. main() creates B bobj
	// 2. B(bobj): FIRST calls base A::A() → "in default of A", a=10
	// 3. THEN B::B() → "in default of B", b=20
	// 4. bobj.display() calls B::display() (override)
	// 5. Inside: A::display() → prints 10
	// 6. Then prints b → 20
	// OUTPUT: in default of A\nin default of B\n10\n20
	
	B bobj;      // triggers ctors A then B
	bobj.display();  // triggers override flow
	return 0;    // end
}
