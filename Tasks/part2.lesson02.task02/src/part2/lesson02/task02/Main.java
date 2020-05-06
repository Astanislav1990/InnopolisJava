package part2.lesson02.task02;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        double k = 0;
        double q = 0;
        int a = 0;
        double[] doubleArr = new double[30];


            for (int i = 0; i < doubleArr.length - 1; i++) {
                k = rnd.nextInt(100) - 50;
                doubleArr[i] = k;

                System.out.print((int) doubleArr[i] + " ");
            }
                System.out.println();

        for (int i = 0; i < doubleArr.length - 1; i++) {
            q = Math.sqrt(doubleArr[i]);
            a = (int) q;
            for (int j = i; j < doubleArr.length - 1; j++) {
                if (doubleArr[j] == a) {
                    System.out.println(a);
                }
                else if (doubleArr[j] < 0) {
                    throw new IllegalArgumentException("Negative number");
                }
            }
        }


    }
}
