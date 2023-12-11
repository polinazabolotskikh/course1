package pr1;

import java.util.Scanner;

public class Ex1 {
    String text1="Я";
    String text2="хорошо";
    String text3="знаю";
    String text4="Java.";
    double l1=46;
    double l2=10;
    double l3=3;
    double n=(l1+l2)*(l2/l3);

    double m=29*4*(-15);
    double number = 10500;
    double result1=((number/10)+(number%10))/10;

    double a=3.6;
    double b=4.1;
    double c=5.9;
    double result2=a*b*c;

    Scanner scanner = new Scanner(System.in);

    public void enter(){

        System.out.println("Первое задание:");
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        System.out.println("Второе задние:");
        System.out.println(n+", "+m);

        System.out.println("Третье задание:");
        System.out.println(result1);

        System.out.println("Четвертое задание:");
        System.out.println(result2);

        System.out.println("Пятое задание:");
        System.out.println("Введите три целых числа:");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        System.out.println(x+"\n"+y+"\n"+z);
        if (y%2==0){
            System.out.println("y - Четное");
        }
        else {
            System.out.println("y - Нечетное");
        }
        if (y%2==0 && y>100){
            System.out.println("Выход за пределы диапазона");
        }
    }
}
