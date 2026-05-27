//  Q.4. Simple Calculator Using Class 
// Create a class Calculator. 
// Data Members 
//  num1 
//  num2 
// Member Functions 
//  add() 
//  subtract() 
//  multiply() 
//  divide() 
//  square() 
// Requirements 
//  Take input from user. 
//  Perform all operations using class functions.  

#include <iostream>
using namespace std;

class Calculator {
private:
    double num1, num2;
public:
void input()
{
    cout<<"Enter first number:"<<endl;
    cin>>num1;
    cout<<"enter second number:"<<endl;
    cin>>num2;
}
double add()
{
    return num1+num2;
}
double substract()
{
    return num1-num2;

}
double multiply()
{
    return num1*num2;
}
double divide()
{
    if(num2!=0)
    {
        return num1/num2;
    }
    else
    {
        cout<<"Error: cant divide with 0"<<endl;
        return 0;
    }

}
double square()
{
    return num1*num1;
}
};
int main()
{
    Calculator calc;
    calc.input();
    cout<<"Addition: "<<calc.add()<<endl;
    cout<<"substraction: "<<calc.substract()<<endl;
    cout<<"Multiply: "<<calc.multiply()<<endl;
    cout<<"Divide: "<<calc.divide()<<endl;
    cout<<"Square: "<<calc.square()<<endl;
    return 0; 
}