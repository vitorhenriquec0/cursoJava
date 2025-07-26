//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package secao5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int firstHour, lastHour;
        firstHour = sc.nextInt();
        lastHour = sc.nextInt();

        if(lastHour > firstHour) {
            System.out.printf("O jogo durou %d horas", lastHour - firstHour);
        } else if (lastHour < firstHour) {
            System.out.printf("O jogo durou %d horas", (24 - firstHour) + lastHour);
        } else {
            System.out.println("O jogo durou 24 horas");
        }

        sc.close();
    }
    
}
