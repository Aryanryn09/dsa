package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(23);
        list2.add(2435);
        list2.add(55);
        list2.add(3);
        System.out.println(list2);
        System.out.println(list + "" + list2);
        List<Integer> vector = new Vector<>();
        vector.add(23);
        System.out.println(vector);

    }
}
