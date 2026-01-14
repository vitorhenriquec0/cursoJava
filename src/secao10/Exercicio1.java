/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 10) {
            System.out.println("O valor deve ser menor que 10. Digite novamente: ");
            n = sc.nextInt();
        }

        System.out.println("Digite " + n + " números:");

        int[] vect = new int[n];

        for (int i = 0; i< n; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
