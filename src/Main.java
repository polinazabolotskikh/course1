import pr1.Ex1;
import pr2.Calculator;
import pr2.Human;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    System.out.println("Первая практика");
    Ex1 ex1 = new Ex1();
    ex1.enter();

    System.out.println("\nВторая практика");
    Calculator calculator=new Calculator();
    System.out.println("\nПервое задание:");
    calculator.enter();
    System.out.println("\nВторое задание:");
    Human h1=new Human();
    Human h2=new Human("Jack","Jhonson",12,168);
    System.out.println(h1);
    System.out.println(h2);
    h1.setName("Jhon");
    h1.setSurname("Jefferson");
    h1.setAge(15);
    h1.setHeight(178);
    System.out.println(h1);
    System.out.println(h1.getSurname());
    System.out.println(h1.getName());
    System.out.println(h1.getHeight());
    System.out.println(h1.getAge());
    }
}