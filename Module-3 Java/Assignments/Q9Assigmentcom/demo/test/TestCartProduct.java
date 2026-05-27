package Q9Assigmentcom.demo.test;

import Q9Assigmentcom.demo.service.CartService;
import java.util.Scanner;

public class TestCartProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService service = new CartService();

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Buy Products");
            System.out.println("2. Send Delivery");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.buyProduct();
                    break;

                case 2:
                    service.deliverCart();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}