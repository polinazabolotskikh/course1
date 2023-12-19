package pr6;

public class Heir2 extends Boss2{

    @Override
    public void get() {
        super.get();
        name=scanner.next();
    }

    @Override
    public String toString() {
        return "Heir2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
