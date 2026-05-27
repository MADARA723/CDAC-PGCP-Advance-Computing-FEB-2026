#include <iostream>
using namespace std;

class DecimalToBinary
{
    int num;
    int binary[32];
    int i;

public:
    void input()
    {
        cout << "Decimal number : ";
        cin >> num;
    }

    void convert()
    {
        i = 0;

        while (num > 0)
        {
            binary[i] = num % 2;
            num = num / 2;
            i++;
        }
    }

    void display()
    {
        cout << "Binary = ";

        for (int j = i - 1; j >= 0; j--)
        {
            cout << binary[j];
        }
        cout << endl;
    }
};

int main()
{
    DecimalToBinary d;

    d.input();
    d.convert();
    d.display();

    return 0;
}