//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

package secao4;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.printf("SOMA = %d", x + y);
		
		sc.close();

	}

}
