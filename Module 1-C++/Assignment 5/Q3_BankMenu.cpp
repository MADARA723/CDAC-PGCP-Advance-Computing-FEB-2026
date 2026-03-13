// Q.3. Create a menu-driven program. 
// Menu: 1.Check Balance 
// 2. Deposit Money 
// 3. Withdraw Money 
// 4. Exit 


#include<iostream>
using namespace std;

class Account1
{
    int accNo;
    float balance;
    public:
      Account1()
      {
        cout<<"Enter Account Number"<<endl;
        cin>>accNo;

        cout<<"Enter Initial Balance  of account"<<endl;
        cin>>balance;

      }
      
      void deposit()
      {
        float amt;
        cout<<"Enter the Amount to deposit in Your Account : "<<endl;
        cin>>amt;
        balance +=amt;
        cout<<"this is your current Account Balance : "<<balance;

      }
      void withdraw()
      {
        float amt;
        cout<<"Enter the Amount to withdraw in Your Account : "<<endl;
        cin>>amt;
        
        
        if(amt <= balance)
        {
            balance -= amt;
        }
        else{
            cout<<"Insufficient Balance\n";
        }
        cout<<"This is your current Account Balance : "<<balance;
      }
      void currentBalance()
    {
        cout<<"Current Balance = "<<balance<<endl;
    }


};
int main()
{
    Account1 a;
    int choice;

    do
    {
        cout<<"\n1 Deposit \n2 Withdraw \n3 Balance \n4 Exit"<<endl;
        cout<<"Enter choice : ";
        cin>>choice;
    

        switch(choice)
        {
            case 1: a.deposit();
            break;
            case 2:a.withdraw();
            break;
            case 3:a.currentBalance();
            break;
            case 4:cout<<"Thank You\n";break;
            default:"Invalid choice\n";break;

        }
    }while(choice!=4);    
    
   return 0;
}