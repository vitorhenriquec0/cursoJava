package secao13.MetodosAbstratos.entities;

public class Rectangle extends Shape {
    
    private Double weight;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Double height, Double weight, Color color) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return weight * height;
    }
}
