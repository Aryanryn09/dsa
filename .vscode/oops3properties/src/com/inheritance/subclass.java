package com.inheritance;

import access.A;

public class subclass extends A {


    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        subclass obj = new subclass(23, "kunla kushwaha ");

//        int n = obj.name;
    }
}
