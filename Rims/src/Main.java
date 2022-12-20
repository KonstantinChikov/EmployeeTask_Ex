import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                Rim rim1 = new Rim(15, "Lada-Niva", 12.2000, "1223400632", 1500, 10);
                //rim1.setQuantity(10);

                Rim rim2 = new Rim(21, "Volga", 12.3000, "843319084009", 18000, 10);
                //rim2.setQuantity(10);

                Rim rim3 = new Rim(18, "BMW M5", 12.4000, "56438584009", 20000, 10);
                //rim3.setQuantity(10);

                Rim rim4 = new Rim(14, "VW Golf", 12.5000, "93430041210", 1700, 10);
                //rim4.setQuantity(10);


                List<Rim> rims = new ArrayList<>();
                rims.add(rim1);
                rims.add(rim2);
                rims.add(rim3);
                rims.add(rim4);

                Collections.sort(rims);


                for(Rim rim : rims){
                        rim.setQuantity(10);
                }
                for(Rim rim : rims){
                        System.out.println(rims.toString());

                }

                        //public void printToFile(){}
                for (Rim rim : rims) {
                        try {
                                rim.printToFile(rim.getName());
                        } catch (IOException e) {
                                throw new RuntimeException(e);
                        }
                }


        }

}
