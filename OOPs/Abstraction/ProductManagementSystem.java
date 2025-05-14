public class ProductManagementSystem {
    public static void main(String[] args) {
        Product p = new Product("Bat", 12000, "Sports Equipement");
        p.displayDetails();
    }
}

class Product {
    String productName;
    double price;
    String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Category: " + productCategory);
    }
}