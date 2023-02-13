package clonning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr = new int[5];


    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[]{3, 4, 5, 6, 7};

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;

        this.arr = new int[]{3, 4, 5, 6, 7};

    }


    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Human twin = (Human) super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
