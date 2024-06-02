package BehavioralPatterns.Strategy;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Account account = new Account("Can", 5000);

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 200);

        cart.addItem(item1);
        cart.addItem(item2);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. EFT");
            System.out.println("4. Cash");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    cart.pay(new CreditCard(account));
                    break;
                case 2:
                    cart.pay(new PayPal(account));
                    break;
                case 3:
                    cart.pay(new EFT(account));
                    break;
                case 4:
                    cart.pay(new Cash(500));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
