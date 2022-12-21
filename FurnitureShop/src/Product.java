import java.io.IOException;

public abstract class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){return this.name;}
    public double getPrice(){return this.price;}

    public int getQuantity(){return this.quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public abstract void printToFile(String fileName)
            throws IOException;

}
