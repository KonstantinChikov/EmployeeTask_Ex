//класът наследява Product и имплементира Comparable interface-a
public class TV extends Product implements Comparable<TV> {

    private int size;

    public TV(String name, double price, int size) {
        super(name, price); //извиква се конструктора на класа родител (в случая Product)
        this.size = size;
    }
    public int getSize() {return this.size;}
    public void setSize(int size) {this.size = size;}
    public double getPrice() {return super.getPrice();}

    //имплементира се метода isLarge() от Product (който там е абстрактен)
    @Override
    public boolean isLarge() {
        return this.size > 42;
    }
    //препокриване на toString()
    @Override
    public String toString() {
        return "Name: " + super.getName() +
                ", Price: " + super.getPrice() +
                ", Size: " + size;

    }
    //имплементация на метода compareTo от interface-a Comparable
    //връща 1, ако (в случая) цената на обекта, който вика метода е по-голяма от цената на обекта, който сме дали като аргумент
    //връща -1, ако цената на извикващия обект е по-малка от аргумента
    //връща 0, ако двете цени са равни
    @Override
    public int compareTo(TV o) {
        if (this.getPrice() > o.getPrice()) {
            return 1;
        } else if (this.getPrice() < o.getPrice()) {
            return -1;
        }
        return 0;
    }

}
