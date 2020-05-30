package part6.lesson01.task01;

/**
 * Задание 1. Написать программу, читающую текстовый файл.
 1. Программа должна составлять отсортированный по алфавиту список слов,
    найденных в файле и сохранять его в файл-результат.
 2. Найденные слова не должны повторяться, регистр не должен учитываться.
 3. Одно слово в разных падежах – это разные слова.
 */

public class Main {

    public static void main(String[] args) {

        TextReader textReader = new TextReader();
        TextWriter textWriter = new TextWriter(textReader.getList());
        textReader.readFile("Input_text_file.txt");
        textWriter.writeToFile("Output_text_file.txt");

    }
}
