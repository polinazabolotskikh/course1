import pr1.Ex1;
import pr2.Calculator;
import pr2.Human;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    System.out.println("Первая практика");
    Ex1 ex1 = new Ex1();
    ex1.Enter();
    System.out.println("\nВторая практика");
    Calculator calculator=new Calculator();
    System.out.println("\nПервое задание:");
    calculator.Enter();
    System.out.println("\nВторое задание:");
    Human h1=new Human();
    Human h2=new Human("Jack","Jhonson",12,168);
    }
}