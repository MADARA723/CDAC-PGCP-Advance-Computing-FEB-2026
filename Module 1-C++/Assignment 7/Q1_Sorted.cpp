#include <iostream>
using namespace std;
class Sortarray
{
    int arr[10];

public:
    void input()
    {
        for (int i = 0; i < 10; i++)
        {
            cin >> arr[i];
        }
    }
    void sortedarray()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = i + 1; j < 10; j++)
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
        for (int i = 0; i < 10; i++)
        {
            cout << arr[i] << " ";
        }
    }
};
int main()
{
    Sortarray s;
    s.input();
    s.sortedarray();
    s.display();
}