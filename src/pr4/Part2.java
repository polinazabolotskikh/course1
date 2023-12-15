package pr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public void enterResults(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Первое задание");
        int[] num =new int[10];
        Random random=new Random();
        for (int l=0; l<num.length; l++){
            num[l]=random.nextInt(30);
        }
        System.out.println("array = "+ Arrays.toString(num));
        for (int l=0; l<num.length; l++) {
            for(int j = 0; j < num.length - l - 1; j++) {
                if (num[j+1] < num[j]) {
                    int a = num[j + 1];
                    int b = num[j];
                    num[j] = a;
                    num[j + 1] = b;
                }
            }
        }

        System.out.println("array = "+ Arrays.toString(num));
        boolean sorted=true;
        for (int l=0; l<num.length; l++) {
            for (int j = 0; j < num.length - l - 1; j++) {
                if (num[j] > num[j+1]) {
                    sorted=false;
                    break;
                }
            }
        }
        if (sorted){
            System.out.println("OK");
        }
        else{
            System.out.println("Please, try again!");
        }

        System.out.println("Второе задание");
        System.out.println("Введите целое число: ");
        int length=scanner.nextInt();
        System.out.println("Длина массива: "+length);
        int[] arr =new int[length];
        for(int i=0;i<arr.length;i++){
            System.out.println("Введите целое число: ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Результат: "+Arrays.toString(arr));

        System.out.println("Третье задание");
        System.out.println("Array 1: "+Arrays.toString(arr));
            int a=arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=a;
        System.out.println("Array 2: "+Arrays.toString(arr));

        System.out.println("Четвертое задание");
        int[] nums =new int[10];

        for (int l=0; l<nums.length; l++){
            nums[l]=random.nextInt(30);
        }
        System.out.println("array = "+ Arrays.toString(nums));
        int c=nums[0];
        for (int l=0; l<nums.length; l++) {
            for(int j = l+1; j < nums.length; j++) {
                if (c==nums[j]){
                    c=nums[l+1];
                }
                System.out.println(c);
                break;
            }break;
        }
        //System.out.println(nums[nums.length-1]);

}}
