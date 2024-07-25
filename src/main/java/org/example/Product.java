package org.example;

public class Product {
    private double productCost;
    private int productQuantity;
    private String productName;

    // Constructor
    public Product(double productCost, int productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

    // Method to calculate and print the total cost
    public void totalCost() {
        double total = productCost * productQuantity;
        System.out.println("Total cost is " + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println(productName + " costs " + productCost + " and " + productQuantity + " units were purchased.");
    }

    public static void main(String[] args) {
        // Example usage
        Product product = new Product(4.0, 10, "Gallon of gas");
        product.printProduct();
        product.totalCost();
    }
}

