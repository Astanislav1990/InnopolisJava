package part3.lesson03.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MathBox<T> extends ObjectBox<Object> {
//    private List<Number> arr = new ArrayList<>();

//    public List<Number> getArr() {
//        return arr;
//    }


    public MathBox(T[] numbers) {
        super();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }
    }

    public <T extends Number> int summator() {
        int sum = 0;
        List<? extends T> list = getArr();
        for (T num : list
        ) {
            sum += num.intValue();
        }
        return sum;
    }

    public <T extends Number> void splitter(int divider) {
        int temp;
        List<? extends T> list = getArr();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i).intValue() / divider;
            arr.set(i, temp);

        }
    }


    @Override
    public String toString() {
        return "MathBox{" +
                "arr=" + arr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(arr, mathBox.arr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arr);
    }

//    public Integer delete(Integer element) {
//        if (arr.remove(element)) return element;
//        return -1;
//    }
}
