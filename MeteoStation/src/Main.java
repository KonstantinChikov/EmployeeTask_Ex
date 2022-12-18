import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        TemperatureSensor temperatureSensor = new TemperatureSensor(1, "DS18B20_1");
        HumiditySensor humiditySensor = new HumiditySensor(2, "HR202L");
        AtmosphericPressureSensor atmosphericPressureSensor = new AtmosphericPressureSensor(3, "BME280");

        MeteoStation station = new MeteoStation("Meteo1");
        try {
            station.addSensor(temperatureSensor);
            station.addSensor(humiditySensor);
            station.addSensor(atmosphericPressureSensor);

            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                station.measureValues();
            }

            System.out.println("Max value of sensor with id 1: " + station.getMaxValueBySensorId(1));

            station.sortValuesOfSensor(2);

            station.printToFile("values.txt");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
