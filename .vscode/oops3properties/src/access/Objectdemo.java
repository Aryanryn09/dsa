package access;

import java.nio.charset.StandardCharsets;

public class Objectdemo {
    int num;
    float gpa;

    public Objectdemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Objectdemo obj = new Objectdemo(34, 67.44f);
        System.out.println(obj.hashCode());
        Objectdemo obj2 = new Objectdemo(34, 54.45f);
        System.out.println(obj2.hashCode());
        if (obj2 == obj) {
            System.out.println("obj 1 equals ti obj2");
        }
        if (obj2.equals(obj)) {
            System.out.println("obj 1 equals ti obj2");
        }

        System.out.println(obj2.getClass().getName().getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Objectdemo{}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Objectdemo) obj).num;

    }
}
