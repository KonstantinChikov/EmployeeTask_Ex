import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Table extends Furniture implements Comparable<Table>{

    private int size;

    public Table(int size, String material, String madeIn, String name, double price, int quantity){
        super(material, madeIn, name, price, quantity);
        this.size = size;
    }

    public int getSize(){return this.size;}

    @Override
    public int compareTo(Table o) {

        if (this.size > o.size) {
            return 1;
        } else if (this.size < o.size) {
            return -1;
        }

        return 0;
    }
    @Override
    public void printToFile(String fileName) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(this.toString());
        writer.close();
    }

}
