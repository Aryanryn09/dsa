import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistinjava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//list.add(78);
//        list.add(78);
//        list.add(78);
//        list.add(78);
//        list.add(78);
//        list.add(78);
        
//        list.add(78);
//        list.add(78);
//        System.out.println(list.set(0,99));//updating 0th element to 99
//        System.out.println(list.remove(0));
//        System.out.println(list.contains(78));
//        System.out.println(list);
//        System.out.println();
        Scanner input= new Scanner(System.in);
//        int number = input.nextInt();//iam aryan bansod aryan bansod
for(int i=0 ;i<=5;i++){
list.add(input.nextInt());
}
        for(int i=0 ;i<=5;i++)

            System.out.println(list.get(i));
//        System.out.println(list);
    }


}
