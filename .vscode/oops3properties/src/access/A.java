package access;

public class A {
    int num;
    String name;
    int[] arr;


    public A(int num, String name) {
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
}
