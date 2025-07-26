package secao4;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		char z;
		z = sc.next().charAt(0);
		System.out.println("Você digitou: " + z);

		sc.close();
	}

}
