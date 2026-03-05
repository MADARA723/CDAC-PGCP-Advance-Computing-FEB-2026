// Q.
// Write a program to find the sum of all elements of an array.

// Example
// Input: 1 2 3 4 5
// Output: Sum = 15
 
#include<iostream>
using namespace std;


// class Sum
// {
//     function add(){

//     }

// };

int main(){
    static int sum=0;
    
     int num[]={1,2,3,4,5};
    // int j;
    // int num[j];
    
    // cout<<"Enter the 5 numbers"<<endl;

    // for(  j=0; j<=4;j++){
     
    //     cin >> num[j];
      
    // }
    

    for(int i=0;i<5;i++)
    {
       
        sum=sum+ num[i];
         
       
    }
    cout<<"this is sum of array: "<<sum;


}
