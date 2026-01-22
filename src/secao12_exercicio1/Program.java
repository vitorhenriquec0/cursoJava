package secao12_exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import secao12_exercicio1.entities.Department;
import secao12_exercicio1.entities.HourContract;
import secao12_exercicio1.entities.Worker;
import secao12_exercicio1.entities_enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data:\nName: ");
        String workerName = sc.nextLine();
        System.out.print("Level (JUNIOR/MID_LEVEL/SENIOR): ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(baseSalary, new Department(departmentName), WorkerLevel.valueOf(workerLevel), workerName);

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, hours, valuePerHour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f\n", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
