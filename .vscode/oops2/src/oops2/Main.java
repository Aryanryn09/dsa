package oops2;

import java.util.MissingResourceException;

public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(23,234234,"aryan bansod ",false);
        Human arpit=new Human(23,234234,"aryan bansod ",false);

        Human aryan =new Human(23,234234,"A bansod ",false);
//        System.out.println(kunal.population);
//        System.out.println(aryan.population);
//        System.out.println(Human.population);
        System.out.println(Human.population);//correct conventionally
        System.out.println(Human.population);
        System.out.println(Human.population);


    }

    static void fun(){
        Main obj=new Main();

        obj.greeting();//you cannot use this at at this instance as this is non static
    }
 void greeting() {
     System.out.println("hello iam aryan bansod");
     fun();//you can use the static in non static at this instance
    }
    void fun2(){
        greeting();
    }

}
