public abstract class VechiclePart extends Product {

    private String carModel;
    private double partNumber;

    public VechiclePart(String carModel, double partNumber, String name, double price, int quantity){
        super(name, price, quantity);
        this.carModel = carModel;
        this.partNumber = partNumber;
    }

    public String getCarModel(){return this.carModel;}
    public double getPartNumber(){return this.partNumber;}

}
