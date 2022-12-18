import java.time.LocalTime;

public class HumiditySensor extends Sensor{
    public HumiditySensor(int id, String name) {
        super(id, name);
    }

    @Override
    public void measure() {
        double minutes = LocalTime.now().getMinute();
        double hours = LocalTime.now().getHour();

        super.measurements.addValue(minutes + hours);
    }
}
