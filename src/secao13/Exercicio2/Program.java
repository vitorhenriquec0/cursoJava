package secao13.Exercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import secao13.Exercicio2.entities.Product;
import secao13.Exercicio2.entities.ImportedProduct;
import secao13.Exercicio2.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("- Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
        }
            else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine(); // consume end-of-line after price
                String dateStr = sc.nextLine();
                try {
                    Date manufactureDate = sdf.parse(dateStr);
                    list.add(new UsedProduct(name, price, manufactureDate));
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Expected DD/MM/YYYY.");
                }
            }
            else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product item : list) {
            System.out.println(item.priceTag());
        }
    }
}
