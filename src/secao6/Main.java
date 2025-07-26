package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double celsius;
        char continuar;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            celsius = sc.nextDouble();
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", ((9 * celsius) / 5) + 32);

            System.out.println("Deseja continuar? (s/n)");
            continuar =  sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}
