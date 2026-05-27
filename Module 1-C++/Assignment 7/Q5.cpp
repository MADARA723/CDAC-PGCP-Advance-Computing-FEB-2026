#include <iostream>
#include <map>
#include <fstream>
using namespace std;

int main()
{
    map<int, string> student; // rollNo -> name
    int choice;

    do
    {
        cout << "\n1.Add 2.Display 3.Save 4.Exit\n";
        cin >> choice;

        // 1. Add Record
        if (choice == 1)
        {
            int roll;
            string name;

            cout << "Enter Roll No: ";
            cin >> roll;

            cout << "Enter Name: ";
            cin >> name;

            student[roll] = name; // store in map
        }

        // 2. Display Records
        else if (choice == 2)
        {
            for (auto i : student)
            {
                cout << i.first << " " << i.second << endl;
            }
        }

        // 3. Save to File
        else if (choice == 3)
        {
            ofstream file("student.txt");

            for (auto i : student)
            {
                file << i.first << " " << i.second << endl;
            }

            file.close();
            cout << "Saved to file!\n";
        }

    } while (choice != 4);

    return 0;
}