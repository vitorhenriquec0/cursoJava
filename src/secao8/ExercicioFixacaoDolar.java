package secao8;

import secao8.util.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacaoDolar {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Dolar dolar = new Dolar();

        System.out.println("What is the dollar price?");
        double dolarValue = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + dolar.convertDolarToReal(dolarValue, quantity));

        sc.close();
    }
}
