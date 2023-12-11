package pr2;

import java.util.Scanner;

public class Calculator {
    public int Sum(int x, int y){
        return x+y;
    }
    public double Sum(double x, double y){
        return x+y;
    }
    public long Sum(long x, long y){
        return x+y;
    }

    public int Sub(int x, int y){
        return x-y;
    }
    public double Sub(double x, double y){
        return x-y;
    }
    public long Sub(long x, long y){
        return x-y;
    }

    public int Mul(int x, int y){
        return x*y;
    }
    public double Mul(double x, double y){
        return x*y;
    }
    public long Mul(long x, long y){
        return x*y;
    }

    public int Div(int x, int y){
        return x/y;
    }
    public double Div(double x, double y){
        return x/y;
    }
    public long Div(long x, long y){
        return x/y;
    }
    public void Enter(){
        System.out.println("\nСложение:");
        System.out.println(Sum(3.4,4.5));
        System.out.println(Sum(3,4));
        System.out.println(Sum(4000000000L,3000000000L));
        System.out.println("\nВычитание:");
        System.out.println(Sub(3.4,4.5));
        System.out.println(Sub(3,4));
        System.out.println(Sub(4000000000L,3000000000L));
        System.out.println("\nУмножение:");
        System.out.println(Mul(3.4,4.5));
        System.out.println(Mul(3,4));
        System.out.println(Mul(4000000000L,3000000000L));
        System.out.println("\nДеление:");
        System.out.println(Div(3.4,4.5));
        System.out.println(Div(3,4));
        System.out.println(Div(4000000000L,3000000000L));

    }
}
