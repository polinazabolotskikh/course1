package pr2;

public class Calculator {
    public int sum(int x, int y){
        return x+y;
    }
    public double sum(double x, double y){
        return x+y;
    }
    public long sum(long x, long y){
        return x+y;
    }

    public int sub(int x, int y){
        return x-y;
    }
    public double sub(double x, double y){
        return x-y;
    }
    public long sub(long x, long y){
        return x-y;
    }

    public int mul(int x, int y){
        return x*y;
    }
    public double mul(double x, double y){
        return x*y;
    }
    public long mul(long x, long y){
        return x*y;
    }

    public int div(int x, int y){
        return (x/y)+(x%y);
    }
    public double div(double x, double y){
        return x/y;
    }
    public long div(long x, long y){
        return (x/y)+(x%y);
    }
    public void enter(){
        System.out.println("\nСложение:");
        System.out.println(sum(3.4,4.5));
        System.out.println(sum(3,4));
        System.out.println(sum(4000000000L,3000000000L));
        System.out.println("\nВычитание:");
        System.out.println(sub(3.4,4.5));
        System.out.println(sub(3,4));
        System.out.println(sub(4000000000L,3000000000L));
        System.out.println("\nУмножение:");
        System.out.println(mul(3.4,4.5));
        System.out.println(mul(3,4));
        System.out.println(mul(4000000000L,3000000000L));
        System.out.println("\nДеление:");
        System.out.println(div(3.4,4.5));
        System.out.println(div(3,4));
        System.out.println(div(4000000000L,3000000000L));

    }
}
