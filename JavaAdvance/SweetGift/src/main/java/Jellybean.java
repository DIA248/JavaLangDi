public class Jellybean extends Sweets {

    private double caloricContent;


    public Jellybean(String name, double weight, double price, double caloricContent) {
        super(name, weight, price);
        this.caloricContent = caloricContent;
    }

    public Double getCaloricContent() {
        return caloricContent;
    }

    public void setCaloricContent(double caloricContent) {
        this.caloricContent = caloricContent;
    }

    @Override
    public String toString(){
        return "Желейные шарики: " + super.toString() + ", Калорийность: " + caloricContent;
    }

}