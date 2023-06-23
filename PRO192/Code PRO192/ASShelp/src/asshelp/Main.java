/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asshelp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager<Product> manager = new ProductManager<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Add initial products here, if necessary
        while (!exit) {
            System.out.println("=== FPT ShopThe Product Management ===");
            System.out.println("1. Add a new product");
            System.out.println("2. Print out the list of products");
            System.out.println("3. Print a list of Smartphones in descending order of price");
            System.out.println("4. Print a list of TVs in ascending order of price");
            System.out.println("5. Print a list of Air-conditioners in descending order of price");
            System.out.println("6. Print information about products with the highest unit price for each product type");
            System.out.println("7. Update the product information based on the code");
            System.out.println("8. Delete a product based on the code");
            System.out.println("9. Print the total amount of all products");
            System.out.println("10. Exit the program");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    // Add a new product
                    // You may create separate methods for adding each type of product
                    break;
                case 2:
                    // Print out the list of products
                    manager.printProducts();
                    break;
                case 3:
                    // Print a list of Smartphones in descending order of price
                    manager.sortSmartphonesByPriceDescending();
                    break;
                case 4:
                    // Print a list of TVs in ascending order of price
                    manager.sortTVsByPriceAscending();
                    break;
                case 5:
                    // Print a list of Air-conditioners in descending order of price
                    manager.sortAirConditionersByPriceDescending();
                    break;
                case 6:
                    // Print information about products with the highest unit price for each product type
                    manager.printHighestUnitPriceProducts();
                    break;
                case 7:
                    // Update the product information based on the code
                    // Prompt the user for the product code and new information
                    // Validate the input and call manager.updateProduct()
                    break;
                case 8:
                    // Delete a product based on the code
                    // Prompt the user for the product code
                    // Validate the input and call manager.deleteProduct()
                    break;
                case 9:
                    // Print the total amount of all products
                    System.out.println("Total amount: " + manager.getTotalAmount());
                    break;
                case 10:
                    // Exit the program
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
