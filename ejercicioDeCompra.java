package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicioDeCompra {


    private static final Map<String, String> users = new HashMap<>();



        public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Shop");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 3:
                    shop(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

        private static void register (Scanner scanner){
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        users.put(username, password);
        System.out.println("Registration successful!");
    }

        private static void login (Scanner scanner){
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            shop(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

        private static void shop (Scanner scanner){
        System.out.println("1. Product 1");
        System.out.println("2. Product 2");
        System.out.println("3. Product 3");
        System.out.println("4. Product 4");
        System.out.print("Enter the product number you want to buy: ");
        int productNumber = scanner.nextInt();

        switch (productNumber) {
            case 1:
                System.out.println("You bought Product 1.");
                break;
            case 2:
                System.out.println("You bought Product 2.");
                break;
            case 3:
                System.out.println("You bought Product 3.");
                break;
            case 4:
                System.out.println("You bought Product 4.");
                break;
            default:
                System.out.println("Invalid product number. Please try again.");
        }
    }
    }


