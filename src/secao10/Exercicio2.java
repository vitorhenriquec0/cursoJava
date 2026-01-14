package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");

        int n = sc.nextInt();

        double[] vect = new double[n];

        System.out.println("Digite os " + n + " elementos:");

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + " ");
            sum += vect[i];
        }

        double media = sum / vect.length;

        System.out.println();
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
