// Q.
// Write a program to reverse the array elements.

// Example
// Input: 1 2 3 4 5
// Output: 5 4 3 2 1

#include<iostream>
using namespace std;

int main(){
    int i,n,v=0;
    cout<<"Enter the array size: "<<endl;
    cin>>n;
    int num[n];
    for(i=0;i<n;i++){
     
        cin>>num[i];
       
      }
      for(i=0;i<n;i++){
     
        cout<<num[i]<<" ";
       
      }
        cout<<endl;
        for(i=n-1;i>=0;i--)
        {
            cout<<num[i]<<" ";

        }      
    //   for (size_t i = 0; i < count; i++)
    //   {
    //     /* code */
    //   }
      

}