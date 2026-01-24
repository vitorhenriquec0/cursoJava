package secao13.Exercicio1.entities;

public class OutsourcedEmployee extends Employee {
    
    private Double addicionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double addicionalCharge) {
        super(name, hours, valuePerHours);
        this.addicionalCharge = addicionalCharge;
    }

    public Double getAddicionalCharge() {
        return addicionalCharge;
    }

    public void setAddicionalCharge(Double addicionalCharge) {
        this.addicionalCharge = addicionalCharge;
    }

    @Override
    public double payments() {
        return super.payments() + addicionalCharge * 1.1;
    }
}
