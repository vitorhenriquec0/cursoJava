//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

//Fórmula da área: area = π . raio2

//Considere o valor de π = 3.14159

package secao4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double raio;
		
		raio = sc.nextDouble();
		
		System.out.printf("A = %.4f%n", pi * (raio * raio));
		
		sc.close();
		

	}

}
