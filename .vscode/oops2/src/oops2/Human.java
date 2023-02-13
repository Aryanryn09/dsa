package oops2;

import java.util.Arrays;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;//object independent

    static void message(){
        System.out.println("good evening ladies and gentleman");
//Arrays.toString(new int[]{});
    }

    public Human (int age ,int salary ,String name,boolean married){
this.name=name;
this.age=age;
this.married=married;
this.salary=salary;

Human.population+=1;
//this.population+=1;

        this.message();
        Human.message();


    }

}
