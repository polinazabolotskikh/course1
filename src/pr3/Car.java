package pr3;

public class Car {
    String name;
    String color;
    double weight;

    public Car() {
        System.out.println("Пустой конструктор запущен!");
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String enterData(){
        return name+", "+weight+", "+color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
