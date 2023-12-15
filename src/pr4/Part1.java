package pr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part1 {
    public void enterResults(){
        System.out.println("\nПервое задание");
        for(int i=1; i<=99; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }

        System.out.println("\nВторое задание");
        System.out.print("Делится на 3: ");
        div1(3);
        System.out.println();
            System.out.print("Делится на 5: ");
        div1(5);
        System.out.println();
            System.out.print("Делится на 3 и на 5: ");
        div2(3,5);

        System.out.println("\nТретье задание");
        Scanner scanner=new Scanner(System.in);
        int x=enter();
        int y=enter();
        int z=enter();
        System.out.println("Введите первое число: "+x);
        System.out.println("Введите второе число: "+y);
        System.out.println("Введите третье число: "+z);
        boolean i;
        if (x+y==z){
            i=true;
        }
        else{
            i=false;
        }
        System.out.println("Результат: "+i);

        System.out.println("Четвертое задание");
        if(x<y && z>y){
            i=true;
        }
        else{
            i=false;
        }
        System.out.println("Результат: "+i);

        System.out.println("Пятое задание");
        System.out.println("Введите целое число от 2: ");
        int length=scanner.nextInt();
        if (length>=2){
        int[] num =new int[length];
            madeArray(num);
            System.out.println("array = "+ Arrays.toString(num));
            check3(num,i);

            System.out.println("Шестое задание");
            check1Or3(num,i);
    }
        else{
            System.out.println("Число слишком маленькое!");
        }


    }
    public void div1(int x){
        for(int i=1; i<=100; i++){
            if (i%x==0){
                System.out.print(+i+" ");
            }}
    }
    public void div2(int x, int y){
        for(int i=1; i<=100; i++){
            if (i%x==0 && i%y==0){
                System.out.print(+i+" ");
            }}
    }
    public int enter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x=scanner.nextInt();
        return x;
    }
    public void madeArray(int num[]){
        Random random=new Random();
        for (int l=0; l<num.length; l++){
            num[l]=random.nextInt(30);
        }
    }
    public void check3(int num[], boolean i){
        for (int l=0; l<num.length; l++) {
            if (num[0]==3 || num[num.length-1]==3){
                i=true;
            }
            else {
                i=false;
            }
        }
        System.out.println("result = "+i);
    }
    public void check1Or3(int num[],boolean i){
        for (int l=0; l<num.length; l++) {
            if (num[l]==3 || num[l]==1){
                i=true;
            }
            else {
                i=false;
            }
        }
        System.out.println("result = "+i);
    }
}
