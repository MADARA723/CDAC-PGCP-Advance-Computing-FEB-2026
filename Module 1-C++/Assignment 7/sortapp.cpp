#include <iostream>
using namespace std;
class Sortarray
{
    int arr[5];

public:
    void input()
    {
        for (int i = 0; i < 5; i++)
        {
            cin >> arr[i];
        }
    }
    void sort()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void display()
    {
        for (int i = 0; i < 5; i++)
        {
            cout << arr[i] << " ";
        }
    }
};
int main()
{
    Sortarray b;
    b.input();
    b.sort();
    b.display();
}