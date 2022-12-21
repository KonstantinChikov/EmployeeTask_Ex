import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Table table1 = new Table(15, "Wood", "Sweden", "Gammalt_trä", 1500, 10);
        Table table2 = new Table(25, "Wood&Steel", "Bulgaria", "Vrachanska", 3500, 10);
        Table table3 = new Table(35, "Wood", "Germany", "Bavarian", 3650, 10);
        Table table4 = new Table(10, "PaleWood", "China", "Shi_Gin_Ping", 900, 10);


        List<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);


        Collections.sort(tables);


        for(Table table : tables) {
            table.setQuantity(10);
            System.out.println(tables.toString());
        }

        //public void printToFile(){}
        for (Table table : tables) {
            try {
                table.printToFile(table.getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
