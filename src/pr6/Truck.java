package pr6;

public class Truck extends Car{
    public int quantityWheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int quantityWheels, int maxWeight) {
        super(w, m, c, s);
        this.quantityWheels = quantityWheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int q){
        quantityWheels=q;
        System.out.println(q+" wheels");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "quantityWheels=" + quantityWheels +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
