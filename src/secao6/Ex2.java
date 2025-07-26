//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

package secao6;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y;

        do {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > 0) {
                if (y > 0) {
                    System.err.println("Primeiro");
                } else if (y < 0) {
                    System.out.println("Quarto");
                } else {
                    return;
                }
            } else if (x < 0) {
                if (y > 0) {
                    System.err.println("Segundo");
                } else if (y < 0) {
                    System.out.println("Terceiro");
                } else {
                    return;
                }
            } else {
                return;
            }
        } while ( x != 0 && y != 0);

        sc.close();
    }
    
}
