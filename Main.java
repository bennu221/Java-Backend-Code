class Product {
    String productId;
    String productName;
    double price;
    int quantity;

    Product() {
        this("P000", "Unknown", 0.0, 0);
    }

    Product(String id, String name, double price, int qty) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }

    Product(String name, double price) {
        this("AUTO", name, price, 1);
    }

    void display() {
        System.out.println(productId + " " + productName + " " + price + " " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("P101", "Laptop", 50000, 2);
        Product p3 = new Product("Mouse", 799);

        p1.display();
        p2.display();
        p3.display();
    }
}