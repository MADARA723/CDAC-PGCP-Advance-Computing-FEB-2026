// WAP to find Factorial of a Number. Create class FindFactorial and functions to
// 1. Accept a number from user.
// 2. Calculate factorial using loop.
// 3. Display result.

#include <iostream>
using namespace std;

class FindFactorial
{
    int n;
    int fact;

public:
    void input()
    {
        cout << "Enter the n: ";
        cin >> n;
    }

    void calculate()
    {
        fact = 1;

        for (int i = 1; i <= n; i++) 
        {
            fact = fact * i;
        }
    }

    void display()
    {
        cout << "Factorial is: " << fact << endl;
    }
};

int main()
{
    FindFactorial a;
    a.input();
    a.calculate();
    a.display();
}