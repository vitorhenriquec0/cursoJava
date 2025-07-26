// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


package secao5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();

        if(num < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("NOT NEGATIVE");
        }

        sc.close();
    }
}
