package secao13.MetodosAbstratos.entities;

public class Circle extends Shape {
    
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }    

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
