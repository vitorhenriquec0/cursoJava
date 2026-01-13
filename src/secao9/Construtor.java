package secao9;

import java.util.Locale;
import java.util.Scanner;

import secao9.entities.Product;

public class Construtor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        Product productOne = new Product(name, price);

        System.out.println("- PRODUCT -");
        System.out.printf("- Name: %s%n", productOne.name);
        System.out.printf("- Price: %.2f%n", productOne.price);
        System.out.printf("- Stock: %d%n", productOne.quantity);
        System.out.printf("- Total value: %.2f%n", productOne.price * productOne.quantity);

        System.out.println("Enter the new product quantity:");
        int enter = sc.nextInt();
        productOne.AddProducts(enter);


        System.out.println("- PRODUCT -");
        System.out.printf("- Name: %s%n", productOne.name);
        System.out.printf("- Price: %.2f%n", productOne.price);
        System.out.printf("- Stock: %d%n", productOne.quantity);
        System.out.printf("- Total value: %.2f%n", productOne.price * productOne.quantity);

        System.out.println("Enter the left product quantity:");
        int left = sc.nextInt();
        productOne.RemoveProducts(left);

        System.out.println("- PRODUCT -");
        System.out.printf("- Name: %s%n", productOne.name);
        System.out.printf("- Price: %.2f%n", productOne.price);
        System.out.printf("- Stock: %d%n", productOne.quantity);
        System.out.printf("- Total value: %.2f%n", productOne.price * productOne.quantity);
    }
}
