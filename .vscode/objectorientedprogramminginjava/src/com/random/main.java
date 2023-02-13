package com.random;

public class main {

    public static void main(String[] args) {
        Human kunal = new Human(22, "aryan", 2000, false);
        Human rahul = new Human(34, "aryan bansod", 2309482, true);
        Human neeraj = new Human(34, "aryan bansod", 2309482, true);

        System.out.println(kunal.name);
        System.out.println(kunal.age);
        System.out.println(rahul.population);
        System.out.println(kunal.population);
        System.out.println(neeraj.population);
    }
        static void fun() {
            main obj =new main();
            obj.greeting();//object independent

    }

    void greeting(){
        System.out.println("hello world");//object dependent
    }
}
