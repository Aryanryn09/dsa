package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//switch statements
    Scanner in =new Scanner(System.in);
//    String fruit= in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("kin gof fruits");
//            case "banana" -> System.out.println("rich in carbohydrates =");
//            case "apple" -> System.out.println("keeps the doctor away");
//            default -> System.out.println("enter a valid fruit" + "");
//        }
    int day = in.nextInt();
//    switch (day){
//        case 1 -> System.out.println("monday");
//        case 2 -> System.out.println("tuesday");
//        case 3 -> System.out.println("wednesday");
//        case 4 -> System.out.println("thursday");
//        case 5 -> System.out.println("friday");
//        case 6 -> System.out.println("saturday");
//
//
//        default -> throw new IllegalStateException("Unexpected value: " + day);
//    }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> {
                System.out.println("weekends");
                System.out.println("chill");//sexy

            }
        }

              }
    }

