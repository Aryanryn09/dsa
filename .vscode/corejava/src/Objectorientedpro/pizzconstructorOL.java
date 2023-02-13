package Objectorientedpro;

import java.nio.channels.Pipe;
import java.util.Arrays;

public class pizzconstructorOL {
    public static void main(String[] args) {
        Pizza pizza=new Pizza("hard crust","olivs  with ectra tomato","mozerella");
        System.out.println(pizza.base);
        System.out.println(pizza.toppings);

        System.out.println(pizza.base);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toString());

    }
}
