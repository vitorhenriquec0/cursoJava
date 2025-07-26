//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package secao4;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, code2;
		int num1, num2;
		double price1, price2;
		
		System.out.println("Put the product code 1, then product code 2");
		code1 = sc.nextInt();
		code2 = sc.nextInt();
		System.out.println("Write the product 1 stock value, then product 2 stock value");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Write the product 1 price, then product 2 price (00.00)");
		price1 = sc.nextDouble();
		price2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: %.2f%n", (double) num1 * price1 + num2 * price2);
		
		sc.close();
	}

}