package pr9;

import java.util.*;

public class Collections {

    List<Integer>arr1=new ArrayList<>();
    List<Integer>arr2=new LinkedList<>();
    Random random=new Random();
    public void enter(){
        System.out.println("Первое задание");
        getSet();
        System.out.println();
        System.out.println("Второе задание");
        set1M(arr1,arr2);
        enter100K(arr1,arr2);
    }
    public void getSet(){
        List<Integer> coll=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<10;i++){
            int k= random.nextInt(10);
            coll.add(k);
        }
        System.out.println(coll);
        for (int c:coll){
            set.add(c);
        }
        coll.clear();
        for(int c:set){
            coll.add(c);
        }
        System.out.println(coll);
    }
    public void set1M(List arr1, List arr2){
        for (int i=0;i<1000000;i++){
            int k=random.nextInt(10);
            arr1.add(k);
            arr2.add(k);
        }
        System.out.println(arr1.get(999999));
        System.out.println(arr2.get(999999));
    }

    public void enter100K(List arr1, List arr2){
        List<Integer>a1=new ArrayList<>();
        List<Integer>a2=new ArrayList<>();

      /*  long startTime1 = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            int n1 = (int)Math.floor(Math.random() * arr1.size());
            a1.add((Integer) arr1.get(n1));
        }
        long endTime1 = System.currentTimeMillis();

        long timeElapsed1 = endTime1 - startTime1;

        long startTime2 = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            int n2 = (int)Math.floor(Math.random() * arr2.size());
            a2.add((Integer) arr2.get(n2));
        }
        long endTime2 = System.currentTimeMillis();

        long timeElapsed2 = endTime2 - startTime2;
        //System.out.println(a1);
        System.out.println("1 list - "+ timeElapsed1 +" милисекунд, потому что имеет точный адрес");
        System.out.println();
        //System.out.println(a2);
        System.out.println("2 list - " + timeElapsed2 + " милисекунд, потому что ищет по ссылкам нужный элемент");
*/
    }

}