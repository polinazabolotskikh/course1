package pr3;

public class Tree {
    int age;
    boolean status;
    String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean status, String name) {
        this.age = age;
        this.status = status;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        String n;
        if (status){
            n="Живое";
        }
        else {n="Мертвое";}
        return "Tree{" +
                "age=" + age +
                ", status=" + n +
                ", name='" + name + '\'' +
                '}';
    }
}
