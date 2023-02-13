import java.util.ArrayList;

public class findingtarget {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7};
        System.out.println(find(arr,4,0));
        System.out.println(findindex(arr,4,0));
    }
    static boolean find(int []arr,int target,int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index]==target||find(arr,target,index+1);
    }
    static int findindex(int []arr,int target ,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {//        System.out.println(findallindex(arr,));

            return findindex(arr,target,index);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void  findallindex(int []arr,int target ,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
list.add(index);
        }

    findallindex(arr,target,index +1);
//  return -1;
    }
}
