package GenericCountMethodString;

import java.util.ArrayList;

public class Box<T extends Comparable<T>> {
    private ArrayList<T> arr = new ArrayList<>();

    public void add(T element) {
        this.arr.add(element);
    }

    public void  compareElements(T input) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(input) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void print () {
        arr.forEach(e -> System.out.println(e));
    }
}
