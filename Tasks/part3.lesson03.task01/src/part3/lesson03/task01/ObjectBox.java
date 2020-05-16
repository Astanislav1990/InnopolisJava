package part3.lesson03.task01;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox<T> {
    protected List<T> arr = new ArrayList<>();

    public List getArr() {
        return arr;
    }

    public void addObject(T o) {
        arr.add(o);
    }

    public void deleteObject(T o) {
        if (arr.remove(o)) {
            System.out.println("Объект удален");
        } else System.out.println("Объект не найден");
    }

    public void deleteObject(int i) {
        arr.remove(i);
    }

    public String dump() {
        String str = "";
        for (Object o : arr
        ) {
            str += o.toString();
            str += " ; ";
        }
        return str;


    }

}
