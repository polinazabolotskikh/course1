package pr10;

import java.io.*;

public class Files {

public void find(){
    /*System.out.println("Первое задание");
    enterStr("files/jack.txt");
    System.out.println();

    System.out.println("Второе задание");
    writeStr("Hello, friend!","files/jack.txt");
    enterStr("files/jack.txt");
    System.out.println();*/

    /*System.out.println("Третье задание");
    enterStr("files/jack.txt");
    System.out.println();
    enterStr("files/jack1.txt");
    System.out.println("Новый файл: ");
    unitedFiles("files/jack.txt","files/jack1.txt");
    enterStr("files/unit.txt");*/

    System.out.println();
    System.out.println("Четвертое задание");
    change$("files/jack1.txt");
    enterStr("files/change.txt");
}

public void enterStr(String s){
    try {
        BufferedReader reader = new BufferedReader(new FileReader(s));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public void writeStr(String str,String s){
    try {
        FileWriter writer = new FileWriter(s, true);

        writer.write(str);
        writer.write("\n");

        writer.close();


    } catch (IOException e) {
        System.out.println("Возникла ошибка во время записи, проверьте данные.");
    }
}
public void unitedFiles(String s1, String s2){
    try {
        File file1 = new File(s1);
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        String file1Content = "";
        String line = reader1.readLine();
        while (line != null) {
            file1Content += line + "\n";
            line = reader1.readLine();
        }
        reader1.close();

        // Чтение содержимого второго файла
        File file2 = new File(s2);
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        String file2Content = "";
        line = reader2.readLine();
        while (line != null) {
            file2Content += line + "\n";
            line = reader2.readLine();
        }
        reader2.close();

        writeStr(file1Content,"files/unit.txt");
        writeStr(file2Content,"files/unit.txt");

        System.out.println("Файлы успешно объединены.");
    } catch (IOException e) {
        System.out.println("Ошибка при объединении файлов: " + e.getMessage());
    }
}
    public void change$(String str) {
        try {
            File file1 = new File(str);
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            String file1Content = "";
            String line = reader1.readLine();
            while (line != null) {
                file1Content += line + "\n";
                line = reader1.readLine();
            }
            reader1.close();
            String l=file1Content.replaceAll("[^a-zA-Z0-9]","\\$");
            writeStr(l,"files/change.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
