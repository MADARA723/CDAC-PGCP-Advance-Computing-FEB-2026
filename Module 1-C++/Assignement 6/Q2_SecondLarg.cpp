#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "enter the num: ";
    cin >> num;

    int a[num];

    for (int i = 0; i < num; i++)
    {
        cin >> a[i];
    }

    int largest, secondlargest;

    if (a[0] > a[1])
    {
        largest = a[0];
        secondlargest = a[1];
    }
    else
    {
        largest = a[1];
        secondlargest = a[0];
    }

    for (int i = 2; i < num; i++)
    {
        if (a[i] > largest)
        {
            secondlargest = largest;
            largest = a[i];
        }
        else if (a[i] > secondlargest && a[i] != largest)
        {
            secondlargest = a[i];
        }
    }

    cout << "Second largest is: " << secondlargest;

    return 0;
}