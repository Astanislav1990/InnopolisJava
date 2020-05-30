package part6.lesson01.task01;


import java.io.*;
import java.util.*;

public class TextReader {
    private List<String> list;
    private Set<String> listSet;


    public TextReader() {
        this.list = new ArrayList<>();
        this.listSet = new HashSet<>();

    }

    public List<String> getList() {
        return list;
    }

    public void readFile(String fileName) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            int i;
            String textWord = "";
            while ((i = bufferedInputStream.read()) != -1) {
                if ((char) i != ' '
                        && (char) i != '.'
                        && (char) i != ','
                        && (char) i != '!'
                        && (char) i != '?'
                        && (char) i != '\n'
                        && (char) i != '\r') {
                    textWord += (char) i;
                } else if
                (textWord != "") {
                    listSet.add(textWord);
                    textWord = "";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }
        list.addAll(0, listSet);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
    }
}




