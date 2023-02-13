package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist<T> {


    private static final int default_size = 10;
    private Object[] data;
    private int size = 0;

    public customarraylist() {
        data = new Object[default_size];
    }
//https://docs.oracle.com/javase/tutorial/java/generics/genMethods.html
    //for reasure ij generics

    public static void main(String[] args) {
        customarraylist list = new customarraylist();
//        list.add(3);
//        list.add(4);
//        list.add(10);
//        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ahfdio");
        System.out.println(list2);


        //creating a llist 3
        customarraylist<Integer> list3 = new customarraylist<>();
        list3.add(23);
        System.out.println(list3);
    }

    public void add(T num) {
        if (isfull()) {
            resize();

        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;

    }

    private boolean isfull() {

        return size == data.length;
    }

    @Override
    public String toString() {
        return "customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T removed() {
        T remove = (T) (data[size--]);
        return remove;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {


        data[index] = value;
    }


}
