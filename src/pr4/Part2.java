package pr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public void enterResults(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Первое задание");
        int[] num =new int[10];
        madeArray(num);

        System.out.println("array = "+ Arrays.toString(num));

        bubbleSort(num);

        System.out.println("array = "+ Arrays.toString(num));

        checkSort(num);

        System.out.println("Второе задание");
        System.out.println("Введите целое число: ");
        int length=scanner.nextInt();
        System.out.println("Длина массива: "+length);
        int[] arr =new int[length];
        insertElem(arr);
        System.out.println("Результат: "+Arrays.toString(arr));

        System.out.println("Третье задание");
        System.out.println("Array 1: "+Arrays.toString(arr));
        transposition(arr);
        System.out.println("Array 2: "+Arrays.toString(arr));

        System.out.println("Четвертое задание");
        int[] nums =new int[10];
        madeArray(nums);
        System.out.println("array = "+ Arrays.toString(nums));
        uniq(nums);


}

public void uniq(int nums[]){
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
}
public void transposition(int arr[]){
    int a=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=a;
}
public void insertElem(int arr[]){
        Scanner scanner=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        System.out.println("Введите целое число: ");
        arr[i]=scanner.nextInt();
    }
}
public void checkSort(int num[]){
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
}

public void madeArray(int num[]){
    Random random=new Random();
    for (int l=0; l<num.length; l++){
        num[l]=random.nextInt(30);
    }
}
public void bubbleSort(int num[]){
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
}
}
