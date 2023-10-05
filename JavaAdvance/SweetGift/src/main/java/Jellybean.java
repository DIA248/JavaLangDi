public class Jellybean implements Sweets {

    String name;
    int weight;
    int price;
    String uniqueParameter;

    public Jellybean(String name, int weight, int price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

}