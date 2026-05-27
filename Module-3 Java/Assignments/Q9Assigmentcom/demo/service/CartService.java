package Q9Assigmentcom.demo.service;

import Q9Assigmentcom.demo.model.Product;
import java.util.*;	
public class CartService {

    // Store carts → username → list of products
    private Map<String, List<Product>> cartMap = new HashMap<>();

    // Available products
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Shoes", 3000, 10));
        productList.add(new Product(2, "Shirt", 1500, 15));
        productList.add(new Product(3, "Bag", 2000, 8));
        productList.add(new Product(4, "Watch", 2500, 5));
        productList.add(new Product(5, "Laptop", 60000, 3));
        productList.add(new Product(6, "Phone", 20000, 6));
        productList.add(new Product(7, "Cap", 500, 20));
        productList.add(new Product(8, "Jacket", 4000, 7));
        productList.add(new Product(9, "Bottle", 300, 25));
        productList.add(new Product(10, "Socks", 200, 30));
    }

    Scanner sc = new Scanner(System.in);

    // 1. Buy Products
    public void buyProduct() {

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.println("\nAvailable Products:");

        for (Product p : productList) {
            System.out.println(p.getId() + ". " + p.getName() + " - " + p.getPrice());
        }

        System.out.print("Enter product id: ");
        int id = sc.nextInt();

        Product selected = null;

        for (Product p : productList) {
            if (p.getId() == id) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid product!");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double amount = selected.getPrice() * qty;
        System.out.println("Amount = " + amount);

        // Add to cart
        List<Product> cart = cartMap.getOrDefault(username, new ArrayList<>());

        cart.add(new Product(selected.getId(), selected.getName(), selected.getPrice(), qty));

        cartMap.put(username, cart);

        System.out.println("Product added to cart.");
    }

    // 2. Send Delivery
    public void deliverCart() {

        if (cartMap.isEmpty()) {
            System.out.println("No carts available.");
            return;
        }

        System.out.println("Available Users:");
        for (String user : cartMap.keySet()) {
            System.out.println(user);
        }

        System.out.print("Enter Username: ");
        String username = sc.next();

        List<Product> cart = cartMap.get(username);

        if (cart == null) {
            System.out.println("User not found.");
            return;
        }

        double total = 0;

        System.out.println("\n--- BILL ---");

        for (Product p : cart) {
            double amt = p.getPrice() * p.getQty();
            total += amt;
            System.out.println(p.getName() + " x " + p.getQty() + " = " + amt);
        }

        System.out.println("Total = " + total);

        System.out.print("Deliver order? (y/n): ");
        char ch = sc.next().charAt(0);

        if (ch == 'y') {
            System.out.println("Order Delivered!");
            cartMap.remove(username);
        } else {
            System.out.println("Returning to menu...");
        }
    }
}