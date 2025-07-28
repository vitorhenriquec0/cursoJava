package secao8.entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    // ComPOO2.java

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
