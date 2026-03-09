// Q.2. 0–1 Pattern
// 1
// 01
// 101
// 0101
// 10101

#include <iostream>
using namespace std;
int main()
{
    int i, j;
    for (i = 1; i <= 5; i++)
    {
        for (j = 1; j <= i; j++)
        {
            if ((i + j) % 2 == 0)
            {
                cout << "1\t";
            }
            else
            {
                cout << "0\t";
            }
        }
        cout << endl;
    }
}