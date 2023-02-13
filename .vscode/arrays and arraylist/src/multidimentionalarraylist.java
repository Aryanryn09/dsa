import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class multidimentionalarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
       //initilizations of array list
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());

        }
        //add elements to that array list
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
