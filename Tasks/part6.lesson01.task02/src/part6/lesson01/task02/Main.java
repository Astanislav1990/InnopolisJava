package part6.lesson01.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

       FilesUtil filesUtil  = new FilesUtil();
//        filesUtil.generateWord();

        String[] words = new String[new Random().nextInt(1000)];
        for (int i = 0; i < words.length - 1; i ++) {
            words[i] = "word" + i +" ";
        }

        String path = "C:\\Users\\localadmin\\IdeaProjects\\part6.lesson01.task02\\newfolder\\";
        filesUtil.getFiles(path, 4, 1000, words, 40);

    }
}