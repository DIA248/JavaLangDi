public class Lollypop extends Sweets {

    private int diameterOfLollipop;

    public Lollypop (String name, double weight, double price, int diameterOfLollipop) {
        super(name, weight, price);
        this.diameterOfLollipop = diameterOfLollipop;
    }

    public int getDiameterOfLollipop() {
        return diameterOfLollipop;
    }

    public void setDiameterOfLollipop(int diameterOfLollipop) {
        this.diameterOfLollipop = diameterOfLollipop;
    }

    @Override
    public String toString(){
        return "Леденец: " + super.toString() + ", Диаметр леденца в сантиметрах: " + diameterOfLollipop;
    }
}
