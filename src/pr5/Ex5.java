package pr5;

import java.util.Arrays;

public class Ex5 {

    public void enter(){
        System.out.println("Первое задание");
        String text="Суперкалифрагилистичеспиаллидощь это вымышленное слово придуманное для песни из фильма Мэри Поппинс";
        longestWord(text);

        System.out.println();
        System.out.println("Второе задание");
        StringBuilder word=new StringBuilder("Шабаш");
        palindrom(word);

        System.out.println();
        System.out.println("Третье задание");
        String n="Бяка - это слово, которое может иметь различные значения в зависимости от контекста. Например, в песне “Твоё нежное безумие” группы “Твоё нежное безумие” “бяка” описывает человека, которого никто не любит и кто вызывает отвращение1. В другом случае, “бяка” может описывать какой-то предмет или явление, которое вызывает недовольство или раздражение.";
        censored(n,"бяка","Бяка");

        System.out.println();
        System.out.println("Четвертое задание");
        String r="Люк мечтал о приключениях и о том, что его жизнь изменится. Однажды он нашёл дроид, в котором была записана просьба о помощи от принцессы Леи. Люк решил помочь ей и отправился вместе с джедаем Оби-Ваном Кеноби на спасение принцессы";
        String k="Люк";
        findSub(r,k);

        System.out.println();
        System.out.println("Пятое задание");
        String str="Sample Output: " +
                "The given string is: This is a test string " +
                "The string reversed word by word is: " +
                "sihT si a tset gnirts";
        reverseStr(str);
    }
    public void longestWord(String n){
        String[] split = n.split(" ");
        System.out.println(Arrays.toString(split));
        int max=0;
        String g="";
        for(int i=0;i<split.length;i++){
            if (split[i].length()>max){
                max=split[i].length();
                g=split[i];
            }
        }
        System.out.println("Слово: "+g+" Кол-во символов: "+max);
    }
    public void palindrom(StringBuilder word){
        String w=word.toString();
        String n=word.reverse().toString();
        System.out.println(w);
        System.out.println(n);
        if (w.equalsIgnoreCase(n)){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }
    public void censored(String n,String x, String y){
        System.out.println(n);
        String m=n.replace(x, "[вырезано цензурой]");
        m=m.replace(y, "[вырезано цензурой]");
        System.out.println(m);
    }
    public void findSub(String r, String k){
        System.out.println(r);
        System.out.println(k);
        int u=0;
        for (int i=0; i<r.length(); i++){
            if (r.contains(k)){
                u++;
                r=r.replaceFirst(k,"");
            }}
        System.out.println("Вхождений: "+u);
    }
    public void reverseStr(String str){
        str=str.replace(":","");
        StringBuilder s=new StringBuilder(str);
        StringBuilder w=new StringBuilder();
        str=s.reverse().toString();
        String[] split=str.split(" ");
        int j = split.length;
        String temp;
        for (int i = 0; i < j/2; i++) {
            temp = split[j-i-1];
            split[j-i-1] = split[i];
            split[i] = temp;
        }
        for (String i: split){
            w.append(i).append(" ");
        }
        System.out.println(w.toString());
    }
}
