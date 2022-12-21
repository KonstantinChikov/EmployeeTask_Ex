public abstract class Furniture extends Product{

    private String material;
    private String madeIn;

    public Furniture(String material, String madeIn, String name, double price, int quantity){
        super(name, price, quantity);
        this.material = material;
        this.madeIn = madeIn;
    }

    public String getCarModel(){return this.material;}
    public String getPartNumber(){return this.madeIn;}

}
