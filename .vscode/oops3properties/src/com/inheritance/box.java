package com.inheritance;

public class box {
    double l;
    double w;
    double h;

    box() {
        System.out.println("box parent constructor");
        this.l = -1;
        this.h = -1;

        this.w = -1;
    }

    box(double side) {//for cube
        System.out.println("box parent constructor");

        this.l = side;
        this.h = side;
        this.w = side;
    }

    box(double l, double w, double h) {//just initialising the variables

        System.out.println("box2 parent constructor");

        this.l = l;
        this.h = h;
        this.w = w;

    }

    box(box old) {//for cube

        System.out.println("box3 parent constructor");

        this.l = old.h;
        this.h = old.h;
        this.w = old.w;
    }

    static void greeting() {

        System.out.println("hry i am in box class greeting");
    }

    public static void display() {
        System.out.println("this is displayed here ");
    }

    public double getL() {
        return l;
    }

}
