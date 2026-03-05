
// Q.
// Write a C++ program to find the largest element in an array.
#include<iostream>
using namespace std;



int main(){
    static int sum=0;
    
     int num[]={34,567,343,899};
   
    int largest=num[0];

    for(int i=0;i<num[i];i++)
    {
       
        if(num[i]==0)
          {
            break;
            
            
          }  
          else{
            if(num[i]>largest)
            {
               largest=num[i];
            }



          }   
          
             
    }
    cout<< ""<<largest<<endl;     
   


}