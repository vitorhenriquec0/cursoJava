//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package secao4;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		int hours;
		double priceForHour;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		priceForHour = sc.nextDouble();
		
		System.out.printf("NUMBER = %d", number);
		System.out.printf("SALARY = U$ %.2f", priceForHour * hours);
		
		sc.close();
		

	}

}