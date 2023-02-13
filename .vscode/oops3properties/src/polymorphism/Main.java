package polymorphism;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        shapes shape = new shapes();
        triangle triangle = new triangle();
        circle circle = new circle();
//        square square =new square();
        shapes square = new shapes();
        shape.area();
        circle.area();
        shape.area();
        shape.area();
        triangle.area();
        System.out.println("hey im aryan bansod");
        Box box1 = new Box(2);


    }
}
