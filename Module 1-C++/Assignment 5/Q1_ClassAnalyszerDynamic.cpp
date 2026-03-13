// Q.1. Create a class Analyzer that stores numbers dynamically. 
 
// Requirements: 
// Accept number of elements N. Dynamically allocate array. Accept numbers.  
// Find and print: 
// Maximum number Minimum number Average value

#include<iostream>
using namespace std;

class CAnalyzer
{
    int n;
    int *arr;

public:

    CAnalyzer()
    {
        cout<<"Enter number of elements: ";
        cin>>n;

        arr = new int[n];

        cout<<"Enter elements:\n";
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
    }

    void analyze()
    {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];

            sum += arr[i];
        }

        float avg = (float)sum / n;

        cout<<"\nMaximum = "<<max<<endl;
        cout<<"Minimum = "<<min<<endl;
        cout<<"Average = "<<avg<<endl;
    }

    ~CAnalyzer()
    {
        delete[] arr;
    }
};

int main()
{
    CAnalyzer obj;
    obj.analyze();

    return 0;
}