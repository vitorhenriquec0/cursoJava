package secao8.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int num) {
        quantity = quantity + num;
    }

    public void RemoveProducts(int num) {
        if (quantity >= num) {
            quantity = quantity - num;
        } else {
            System.out.println("There are no products enough");
        }
    }
}
