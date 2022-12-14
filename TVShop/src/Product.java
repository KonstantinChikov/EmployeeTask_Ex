//абстрактен клас, защото не правим инстанции на него - служи само за наследяване.
public abstract class Product {

    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

    public abstract boolean isLarge(); //абстрактен метод, който да се имплементира от класовете наследници.

    //предефиниране на метода toString()
    public String toString(){
        return " Name: " + name + " , Price: " + price;
    }
}
