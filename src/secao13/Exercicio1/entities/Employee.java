package secao13.Exercicio1.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHours;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHours) {
        this.hours = hours;
        this.name = name;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public double payments() {
        return hours * valuePerHours;
    }
}
