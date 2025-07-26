package secao5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int minutes;
        minutes = sc.nextInt();

        if (minutes <= 100) {
            System.out.printf("Valor a pagar: R$ 50.00");
        } else {
            System.out.printf("Valor a pagar: R$ %.2f", (double) 50 + (minutes - 100) * 2);
        }

        sc.close();
	}
}
