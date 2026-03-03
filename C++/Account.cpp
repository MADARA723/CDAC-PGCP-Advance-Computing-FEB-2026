#include<iostream>
using namespace std;
class Account
{
    int accno,balance;
    public:
    void accept()
    {
        cout<<" accept the vale of accno and balance "<<endl;
        cin>>accno>>balance;

    }
    void display()
    {
        cout<<" the value of accno and balance is "<<accno<<" "<<balance<<endl;
    }
    void  withDraw(int amt)
    {
        if (amt<balance)
        {
           balance=balance-amt;
        cout<<"remaining balance is "<<balance<<endl; 
        }
        
        else
        {
        cout<<" insufficient balance "<<endl;
        }
    }
};
int main()
{
    Account a;
    a.accept();
    a.display();
    a.withDraw(500);
    int amt;
    cout<<" enter the amount to withdraw "<<endl;
    cin>>amt;
    a.withDraw(amt);
    return 0;
}