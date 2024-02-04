package gr.aueb.cf.ch15.products.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Javabean -> Data Class
 */
public class Product implements IProduct {
    private final static List<Product> products = new ArrayList<>();

    private long id;
    private String productName;
    private String description;
    private double price;
    private int quantity;

    public Product() {
        id = 0;
        productName = "Milk";
        description = "My milk";
        price = 10;
        quantity = 1;
    }

    public Product(long id, String productName, String description, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // getters

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    // setters

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /*
     * private, protected, public, default (package - private)
     */

    /*
     * Public API
     */
    @Override
    public void insert() {
        products.add(this);
    }
}
