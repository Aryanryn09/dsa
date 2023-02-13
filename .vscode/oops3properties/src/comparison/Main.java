package comparison;

import java.util.Arrays;

public class Main implements GenericInterface<Integer> {
    public static void main(String[] args) {
        Student kunal = new Student(45.3345f, 34);
        Student Aryan = new Student(76.45f, 34);
        Student bansod = new Student(78.45f, 34);
        Student sambhav = new Student(76.45f, 34);
        Student anshul = new Student(76.45f, 34);

        Student[] list = {kunal, Aryan, bansod, sambhav, anshul};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//        if (Aryan.compareTo(kunal) > 0) {
//            System.out.println("the abve has more marks");
//        }
//    }

//    @Override
//    public void display(Integer value) {
//
//    }
    }

    @Override
    public void display(Integer value) {

    }
}