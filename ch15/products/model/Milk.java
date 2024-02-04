package gr.aueb.cf.ch15.products.model;

public class Milk extends Product implements IMilk {
    private String manufacturer;

    public Milk() {
        super();
        manufacturer = null;
    }

    public Milk(long id, String productName, String description, double price, int quantity, String manufacturer) {
        super(id, productName, description, price, quantity);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void insert() {
        super.insert();
        System.out.println("Successful insert");
    }


    @Override
    public Milk get() {
        return this;
    }
}
