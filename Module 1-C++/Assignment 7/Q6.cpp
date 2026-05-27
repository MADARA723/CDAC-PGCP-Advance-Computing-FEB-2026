// Q.6. Create a menu driven program for Shopping Cart System. Create class Item with data
// members itemId, itemName, price. Use vector to store items.
// Menu options:
// 1. Add Item
// 2. Display Items
// 3. Calculate Total Bill
// 4. Exit
// Throw exception if price is invalid or negative value2
#include <iostream>
#include <vector>
using namespace std;

// Step 1: Create class
class Item
{
public:
    int itemId;
    string itemName;
    float price;
};

int main()
{
    vector<Item> cart; // store items
    int choice;

    do
    {
        cout << "\n1.Add 2.Display 3.Total 4.Exit\n";
        cin >> choice;

        // 1. Add Item
        if (choice == 1)
        {
            Item i;

            cout << "Enter ID: ";
            cin >> i.itemId;

            cout << "Enter Name: ";
            cin >> i.itemName;

            cout << "Enter Price: ";
            cin >> i.price;

            try
            {
                // simple exception
                if (i.price < 0)
                {
                    throw 1; // error
                }

                cart.push_back(i);
                cout << "Item Added\n";
            }
            catch (...)
            {
                cout << "Invalid Price!\n";
            }
        }

        // 2. Display
        else if (choice == 2)
        {
            for (int i = 0; i < cart.size(); i++)
            {
                cout << cart[i].itemId << " "
                     << cart[i].itemName << " "
                     << cart[i].price << endl;
            }
        }

        // 3. Total Bill
        else if (choice == 3)
        {
            float total = 0;

            for (int i = 0; i < cart.size(); i++)
            {
                total += cart[i].price;
            }

            cout << "Total = " << total << endl;
        }

    } while (choice != 4);

    return 0;
}