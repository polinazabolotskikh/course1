package pr2;

public class Human {
    public String name;
    public String surname;
    public int age;
    public int height;

    public Human(){
        System.out.println("Создали человека");
    }
    public Human(String name, String surname, int age, int height){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.height=height;
        System.out.println("Создали человека и прописали параметры");
    }

}
