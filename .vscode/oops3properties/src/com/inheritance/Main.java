package com.inheritance;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//box BOx=new box(4);
//        box BOx2=new box(2,4,5);
        box BOx3 = new box(3, 3, 4);
        System.out.println(BOx3);
//      boxweight BOx4 =new boxweight();
//
//        display();//hrer static is called at first
//
//        System.out.println(BOx.l + " " + BOx.w + " " + BOx.h);
//        System.out.println(BOx2.l + " " + BOx2.h + " " + BOx2.w);
//        System.out.println(BOx.l + " " + BOx.h + " " + BOx.w);
//        System.out.println();
//
//        //for weight of the box stored  in the variable\]
//        //we get
//
//        boxweight box4 =new boxweight();
//        boxweight box5 =new boxweight(2,3,4,5);
////                                      l,w,h,wt
//box box6= new boxweight(2,3,6,9);
//        System.out.println(box4.h+" "+box4.h);
//        System.out.println(box5.weight);
//        System.out.println();
////        System.out.println(super);
//
//        System.out.println(box5);
////super class
////         boxweight box7=new box(1,2,3);//this is the parent class\
//        //which cannot be accesed from parent class
//
//        System.out.println( " this is aryan bansod");

        boxprice box;
        box = new boxprice(5, 65, 7);
        com.inheritance.box.greeting();//i am in box class\
        box.getL();
    }


}
