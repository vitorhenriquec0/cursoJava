package secao8.entities;

import secao8.entities.Employee;;

public class Employee {

    public String name;
    public double groosSalary;
    public double tax;

    public double NetSalary() {
        return groosSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        groosSalary += groosSalary * (percentage / 100);
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", NetSalary());
    }
}
