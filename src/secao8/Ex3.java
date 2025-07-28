package secao8;

import secao8.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name:");
        student.name = sc.nextLine();
        System.out.println("First Grade:");
        student.firstGrade = sc.nextDouble();
        System.out.println("Second Grade:");
        student.secondGrade = sc.nextDouble();
        System.out.println("Third Grade:");
        student.thirdGrade = sc.nextDouble();

        student.calculateAverage();
        System.out.println(student.toString());
        sc.close();
    }
    
}
