package secao13.Exercicio3.entities;

public class Company extends TaxPayer {
    
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(int numberOfEmployees, String name, Double annualIncome) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10) {
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
