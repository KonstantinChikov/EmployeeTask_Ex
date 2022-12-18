import java.time.LocalTime;

public class AtmosphericPressureSensor extends Sensor{
    public AtmosphericPressureSensor(int id, String name) {
        super(id, name);
    }

    @Override
    public void measure() {
        double seconds = LocalTime.now().getSecond();

        super.measurements.addValue(seconds * 30);

    }
}
