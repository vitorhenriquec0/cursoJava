package secao13.Exercicio3.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;
    
    public Individual() {
        super();
    }

    public Individual(Double healthExpenditures, String name, Double annualIncome) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double totalTax;
        if (getAnnualIncome() < 20000) {
            totalTax = getAnnualIncome() * 0.15;
        } else {
            totalTax = getAnnualIncome() * 0.25;
        }

        if (healthExpenditures > 0) totalTax -= healthExpenditures / 2;

        return totalTax;
    }


}
