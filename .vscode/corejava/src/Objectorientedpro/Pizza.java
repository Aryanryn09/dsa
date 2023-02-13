package Objectorientedpro;

public class Pizza {
    static String base;
    String toppings;
    String flavour;
    String cheese;
    String ingredients;

    Pizza(String base,String toppings,String cheese){
        this.base= base;
        this.toppings= toppings;
        this.cheese= cheese;
    }
    Pizza(String base,String toppings,String cheese,String flavour,String ingredients){
        this.base= base;
        this.toppings= toppings;
        this.cheese= cheese;this.flavour= flavour;this.ingredients= ingredients;
    }
    Pizza(String base,String toppings){
        this.base= base;
        this.toppings= toppings;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings='" + toppings + '\'' +
                ", flavour='" + flavour + '\'' +
                ", cheese='" + cheese + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
