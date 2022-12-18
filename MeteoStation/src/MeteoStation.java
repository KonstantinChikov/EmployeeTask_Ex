import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class MeteoStation {

    private HashSet<Sensor> sensors;

    private String name;

    public MeteoStation(String name) {
        this.name = name;
        sensors = new LinkedHashSet<>();
    }

    public void addSensor(Sensor sensor) throws Exception {
        if (sensors.add(sensor) == false){
            throw new Exception("Sensor already added!");
        }
    }

    public void measureValues(){
        sensors.forEach(Sensor::measure);
    }

    public Sensor getSensorById(int id) throws Exception{
        for (Sensor s :
                sensors) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new Exception("Invalid id");
    }

    public Double getMaxValueBySensorId(int id) throws Exception {
        Sensor s = getSensorById(id);
        return Collections.max(s.measurements.getAll());
    }

    public void sortValuesOfSensor(int id) throws Exception {
        Sensor s = getSensorById(id);
        Collections.sort(s.measurements.getAll());
    }

    public void printToFile(String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));

        writer.println(this.name);

        for (Sensor s :
                sensors) {
            writer.printf("%s %s \n", s.getName(), s.getMeasurements().getAll());
        }
        writer.close();
    }

}
