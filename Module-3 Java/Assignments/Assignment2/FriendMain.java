package Assignment2;

import java.util.Scanner;

public class FriendMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        Friend[] f = new Friend[n];

        // Accept data
        for (int i = 0; i < n; i++) {
            f[i] = new Friend();
            System.out.println("\nEnter details of Friend " + (i + 1));
            f[i].acceptData(sc);
        }

        int choice;

        do {
            System.out.println("\n1. Display All Friends");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Hobby");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Friend fr : f) {
                        fr.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    for (Friend fr : f) {
                        if (fr.searchById(id)) {
                            fr.display();
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    for (Friend fr : f) {
                        if (fr.searchByName(name)) {
                            fr.display();
                        }
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Hobby: ");
                    String hobby = sc.nextLine();

                    for (Friend fr : f) {
                        if (fr.hasHobby(hobby)) {
                            fr.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}