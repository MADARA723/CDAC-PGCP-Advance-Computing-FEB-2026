// Q.3. Book Management System 
// Create a class Book. 
// Data Members 
//  bookId 
//  title 
//  author 
//  price 
// Member Functions 
//  input() 
//  display() 
// Requirements 
//  Create 4 book objects take input from user. 
//  Display information of all books.

#include<iostream>
using namespace std;

class Book
{
    int bookId;
    double price;
    string title,author;
    public:
       void input()
       {
        cout<<"Enter the BookId"<<endl;
        cin>>bookId;

        cout<<"Enter the title"<<endl;
        cin>>title;

        cout<<"Enter the author "<<endl;
        cin>>author;

        cout<<"Enter the price"<<endl;
        cin>>price;

       }
       void display()
       {
        cout<<"Book ID :"<<bookId<<endl;
        cout<<"Book Title :"<<title<<endl;
        cout<<"Book Author :"<<author<<endl;
        cout<<"Book Price :"<<price<<endl;
        

       }
    

};
int main()
{
    Book b1,b2,b3,b4;

    b1.input();
     b2.input();
      b3.input();
       b4.input();

       b1.display();
        b2.display();
         b3.display();
          b4.display();

}
