package com.company;

import java.util.Scanner;

public class factorialofanumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();             1
//        System.out
//        .println(n);
//   int i;
//    int fact =1;
//
////        while(i<=n){
//            fact=fact*i;
//            i ++;
//        }
////        System.out.println(n);
//
//    }
//}


    //FINDING AVERAGE OF  number   2
//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();
//    int avg;
//int sum =0;
//int count =1;
//    while(n>=count){
//        int x =input.nextInt();
//        sum =sum +x;
//        count ++;
//
//    }
//    avg = sum/n;
//
//    System.out.println(avg);
//

        ///3333
//    int items = input.nextInt();
//
//    int totalcost=0;
//    int count =1;
//    while(items>=count){
//        int inputitems = input.nextInt();
//        totalcost=totalcost+inputitems;
//        count++;
//        if(totalcost>=10000){
//            totalcost=totalcost-totalcost*20/100;
//        }
//        else{
//            totalcost=totalcost-totalcost*5/100;
//
//        }
//    }
//        System.out.println(totalcost);


//        System.out.println("the value of base is givenb");
//        int base=input.nextInt();
//        System.out.println("the vlaue of exponent is giver =n by");
//        int expo=input.nextInt();
//        int pow =1;
//        for(int i=0;i<expo;i++){
//            pow = pow*base;
//        }
//        System.out.println(pow);

        //finding sum of three numbers
//        int nums= input.nextInt();
//        int sum=0;
//        for(int i=0;i<nums ;i++){
//            int in=input.nextInt();
//            sum = sum+in;
//        }
//        System.out.println(sum);


        //checking if the number is a pallindrome number or not
        int num =input.nextInt();
//        System.out.println(num);
        int ans =0;
        int count =1;
        while(num>0){
            int rem=num%10;
            num = num /10;
            ans= ans *10+rem;
            count ++;

            }
        System.out.println(ans);
        if(ans == num){
            System.out.println(num+ " " +"palindrome");
        }
        System.out.println("not a pallindrome ");
    }

}