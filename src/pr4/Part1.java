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
        for(int i=1; i<=100; i++){
            if (i%3==0){
                System.out.print(+i+" ");
            }}
        System.out.println();
            System.out.print("Делится на 5: ");
        for(int i=1; i<=100; i++){
            if (i%5==0){
                System.out.print(i+" ");
            }}
        System.out.println();
            System.out.print("Делится на 3 и на 5: ");
        for(int i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nТретье задание");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x=scanner.nextInt();
        System.out.println("Введите второе число:");
        int y=scanner.nextInt();
        System.out.println("Введите третье число:");
        int z=scanner.nextInt();
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
            Random random=new Random();
            for (int l=0; l<num.length; l++){
                num[l]=random.nextInt(30);
            }
            System.out.println("array = "+ Arrays.toString(num));
            for (int l=0; l<num.length; l++) {
                if (num[0]==3 || num[num.length-1]==3){
                    i=true;
                }
                else {
                    i=false;
                }
            }
            System.out.println("result = "+i);

            System.out.println("Шестое задание");
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
        else{
            System.out.println("Число слишком маленькое!");
        }


    }
}
