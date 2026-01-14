/*

Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.

*/

package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Heights:");


        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
            System.out.println(vect[i]);
        }
        double avg = sum / n;

        System.out.println("Average: " + avg);

        sc.close();
    }
}
