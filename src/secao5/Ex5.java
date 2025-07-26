//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

// 1 Cachorro-Quente R$ 4.00
// 2 X-Salada        R$ 4.00
// 3 X-Bacon         R$ 4.00
// 4 Torrada Simples R$ 4.00
// 5 Refrigerante    R$ 4.00

package secao5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha, quantidade;
        escolha = sc.nextInt();
        quantidade = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.printf("Total: R$ %.2f", (double) 4 * quantidade);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f", (double) 4.5 * quantidade);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f", (double) 5 * quantidade);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f", (double) 2 * quantidade);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f", (double) 1.5 * quantidade);
                break;
            default:
            System.out.println("Valor Inválido");
                break;
        }

        sc.close();
        
    }
    
}
