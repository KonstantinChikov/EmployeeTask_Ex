public abstract class Sensor {

    private int id;
    private String name;
    protected SensorValuesRepository measurements;

    public Sensor(int id, String name){
        this.id = id;
        this.name = name;
        measurements = new SensorValuesRepository();
    }

    public int getId() {return id;}
    public String getName(){return name;}
    public SensorValuesRepository getMeasurements() {
        return measurements;
    }

    public abstract void measure();

}
