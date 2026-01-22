/*
Ler os dados de um pedido com N itens (N fornecido pelo usuário).
Depois, mostrar um sumário do pedido conforme exemplo (próxima página).
Nota: o instante do pedido deve ser o instante do sistema. */

package secao12_exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import secao12_exercicio3.entities.Client;
import secao12_exercicio3.entities.Order;
import secao12_exercicio3.entities.OrderItem;
import secao12_exercicio3.entities.Product;
import secao12_exercicio3.entities_enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY):");
        String birthDateStr = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.println("Status:");
        String status = sc.nextLine();
        System.out.println("How many items to this order?");
        int n = sc.nextInt();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name:");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price:");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity:");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
