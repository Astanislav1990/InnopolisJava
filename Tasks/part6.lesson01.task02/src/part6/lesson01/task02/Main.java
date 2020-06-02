package part6.lesson01.task02;

import java.util.Random;

/**
 * Задание 2. Создать генератор текстовых файлов, работающий по следующим правилам:
 *
 1. Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
 2. Слово состоит из 1<=n2<=15 латинских букв
 3. Слова разделены одним пробелом
 4. Предложение начинается с заглавной буквы
 5. Предложение заканчивается (.|!|?)+" "
 6. Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений.
 В конце абзаца стоит разрыв строки и перенос каретки.
 7. Есть массив слов 1<=n4<=1000.
 Есть вероятность probability вхождения одного из слов этого массива в следующее предложение (1/probability).
 8. Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability),
 который создаст n файлов размером size в каталоге path. words - массив слов, probability - вероятность.
 */

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