//Q2. Write a java program to store information of your friends
//id,name,lastname,hobbies,mobno,email,bdate,address
//note: hobbies- a friend may have multiple hobbies
//Accept all friends details and store it in an array
//And do the following.
//1. Display All Friend
//2. Search by id
//3. Search by name
//4. Display all friend with a particular hobby
//5. Exit


package Assignment2;

import java.util.Scanner;

class Friend {
    int id;
    String name, lastname, mobno, email, address, bdate;
    String[] hobbies;

    void acceptData(Scanner sc) {

        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Last Name: ");
        lastname = sc.nextLine();

        System.out.print("How many hobbies? ");
        int n = sc.nextInt();
        sc.nextLine();

        hobbies = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter hobby " + (i + 1) + ": ");
            hobbies[i] = sc.nextLine();
        }

        System.out.print("Enter Mobile No: ");
        mobno = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Birthdate: ");
        bdate = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name + " " + lastname);

        System.out.print("Hobbies: ");
        for (String h : hobbies) {
            System.out.print(h + " ");
        }

        System.out.println("\nMobile: " + mobno);
        System.out.println("Email: " + email);
        System.out.println("Birthdate: " + bdate);
        System.out.println("Address: " + address);
    }

    boolean searchById(int searchId) {
        return this.id == searchId;
    }

    boolean searchByName(String searchName) {
        return this.name.equalsIgnoreCase(searchName);
    }

    boolean hasHobby(String hobby) {
        for (String h : hobbies) {
            if (h.equalsIgnoreCase(hobby)) {
                return true;
            }
        }
        return false;
    }
}
