import java.time.LocalTime;

public class TemperatureSensor extends Sensor{
    public TemperatureSensor(int id, String name) {
        super(id, name);
    }

    @Override
    public void measure() {
        //adding new measured value to the repository
        //because we don't have a real temperature sensor connected
        //to the computer, we use the minutes of the current time a temperature
        //value
        super.measurements.addValue((double)LocalTime.now().getMinute());
    }
}
