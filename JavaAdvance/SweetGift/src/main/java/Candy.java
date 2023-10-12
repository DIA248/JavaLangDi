public class Candy extends Sweets {


    String countryOfManufacture;

    public Candy(String name, double weight, double price, String countryOfManufacture){
        super(name, weight, price);
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    @Override
    public String toString(){
        return "Конфеты: " + super.toString() + ", Страна производства - " + countryOfManufacture;
    }

}