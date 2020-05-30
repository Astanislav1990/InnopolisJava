package part6.lesson01.task01;

import java.io.*;
import java.util.List;


public class TextWriter {
    List <String> list2;

    public TextWriter(List<String> list) {
        this.list2 = list;
    }

    public void writeToFile(String fileName) {
        byte[] bytes;
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            for (String str :
                    list2) {
                bytes = str.getBytes();
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.write('\n');
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ну нет же такого файла");
        } catch (IOException e) {
            System.out.println("Видимо опять что-то пошло не так");
        }
    }
}