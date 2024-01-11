package pr10;

import java.io.*;

public class Files {
    final String jack="files/jack.txt";
    final String jack1="files/jack1.txt";
    final String unit="files/unit.txt";
    final String change="files/change.txt";
    public void find(){

    /*System.out.println("Первое задание");
    enterStr(jack);
    System.out.println();

    System.out.println("Второе задание");
    writeStr("Hello, friend!",jack);
    enterStr(jack);
    System.out.println();*/

    /*System.out.println("Третье задание");
    enterStr(jack);
    System.out.println();
    enterStr(jack1);
    System.out.println("Новый файл: ");
    unitedFiles(jack,jack1);
    enterStr(unit);*/

        System.out.println();
        System.out.println("Четвертое задание");
        change$(jack1);
        enterStr(change);
    }

    public void enterStr(String s){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(s));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void writeStr(String str, String s) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(s, true);
            writer.write(str);
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Возникла ошибка во время записи, проверьте данные.");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void unitedFiles(String s1, String s2){
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        try {
            File file1 = new File(s1);
            reader1 = new BufferedReader(new FileReader(file1));
            String file1Content = "";
            String line = reader1.readLine();
            while (line != null) {
                file1Content += line + "\n";
                line = reader1.readLine();
            }

            File file2 = new File(s2);
            reader2 = new BufferedReader(new FileReader(file2));
            String file2Content = "";
            line = reader2.readLine();
            while (line != null) {
                file2Content += line + "\n";
                line = reader2.readLine();
            }

            writeStr(file1Content,unit);
            writeStr(file2Content,unit);

            System.out.println("Файлы успешно объединены.");
        } catch (IOException e) {
            System.out.println("Ошибка при объединении файлов: " + e.getMessage());
        }finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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
            writeStr(l,change);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}