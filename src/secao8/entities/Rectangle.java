package secao8.entities;

public class Rectangle {

    public double height;
    public double widht;

    public double area() {
        return height * widht;
    }

    public double perimeter() {
        return height * 2 + widht * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
    }
    
}
