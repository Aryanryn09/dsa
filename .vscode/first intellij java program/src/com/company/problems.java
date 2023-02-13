package com.company;

public class problems {
    public static void main(String[] args) {
        long n =1238891738789l;
        long ans =0 ;
        while(n>0){
            long rem =n%10;

      n=n/10;
            ans=10*ans+rem;
//            if(rem ==3){
////                n=n/10;
//                count++;
//            }
        }
        System.out.println(ans);

    }
}
