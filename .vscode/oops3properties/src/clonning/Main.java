package clonning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aryan = new Human(34, "aryan");
//        Human kunal = new Human(aryan);
        Human twin = (Human) aryan.clone();
        System.out.println(twin.age + "" + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(aryan.arr));

    }
}
