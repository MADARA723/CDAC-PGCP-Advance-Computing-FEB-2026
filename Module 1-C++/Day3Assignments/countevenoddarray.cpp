// Q.
// Write a C++ program to count even and odd numbers in an array.

// Example
// Array: 1 2 3 4 5
// Even = 2
// Odd = 3
#include<iostream>
using namespace std;



int main(){
    
    static int countEven=0;
    static int countOdd=0;
    
     int num[]={1,2,3,4,5,6,7,8,9,10};
       
    // for(j=0;j<6;j++){
     
    //     cin>>num[j];
      
    //   }
      

    for(int i=0;i<num[i];i++)
    {
       
        if(num[i]==0)
          {
            break;
            
            
          }  
          else{
            if(num[i]%2==0)
            {
                countEven++;
            
            }
            else if(num[i]%2!=0){
                countOdd++;
            }



          }   
          
             
    }
    cout<< ""<<"Even = "<<countEven<<endl;
    cout<< ""<<"Odd = "<<countOdd<<endl;  
   


}