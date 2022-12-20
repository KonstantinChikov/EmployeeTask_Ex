import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Rim extends VechiclePart implements Comparable<Rim>{

    private int size;

    public Rim(int size, String carModel, double partNumber, String name, double price, int quantity){
        super(carModel, partNumber, name, price, quantity);
        this.size = size;
    }

    public int getSize(){return this.size;}

    @Override
    public int compareTo(Rim o) {

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
