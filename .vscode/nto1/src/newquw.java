import java.util.ArrayList;

public class newquw {
    public static void main(String[] args) {
        int []arr={1,2,44,5,57,6,89,76,7,7,4,7877,7,7,443};
        System.out.println(findallindex(arr,7,0 ,new ArrayList<>()));
        System.out.println(findallindex2(arr,7,0));
    }

    static ArrayList<Integer > findallindex(int []arr, int target , int index,ArrayList<Integer > list){
        if(index==arr.length){
            return list ;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return findallindex(arr,target,index +1,list);
    }



    //method 2


    static ArrayList<Integer > findallindex2(int []arr, int target , int index){
        ArrayList<Integer > list  =  new ArrayList<>();//creatuing new list every single time for every clall of the function
        if(index==arr.length){
            return list ;//return ing the list =
        }
        if(arr[index]==target){
            list.add(index);//adding the olist
        }

ArrayList<Integer> anothercallfromans=findallindex2(arr,target,index+1);

        list.addAll(anothercallfromans);//caliing the function again tio get the index =
        return list;

    }
}
