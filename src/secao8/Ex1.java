package secao8;

import secao8.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangleOne;
        rectangleOne = new Rectangle();

        System.out.println("Enter the rectangle height:");
        rectangleOne.height = sc.nextDouble();
        System.out.println("Enter the rectangle widht:");
        rectangleOne.widht = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangleOne.area());
        System.out.printf("PERIMETER = %.2f%n", rectangleOne.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangleOne.diagonal());

        sc.close();
    }
    
}
