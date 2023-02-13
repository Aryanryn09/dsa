package com.inheritance;

public class objectprint extends Object {
    int num;

    public objectprint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        objectprint obj = new objectprint(54);
        System.out.println(obj);

    }

    @Override
    public String toString() {
        return "objectprint{" +
                "num=" + num +
                '}';
    }
}
