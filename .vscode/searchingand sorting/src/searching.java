public class searching {
    public static void main(String[] args) {
        int[] arr={34,-3,45,6,3,5,6,3,1,55,5};
        int target=6;
        linearsearch(arr,target);
        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr ,int target) {

        if (arr.length == 0) {
            //fro true or false vlaue return true and return false for th e given value


            return -1;
        }
//        for (int index = 0; index < arr.length; index++) {
//
//            if (arr[index] == target) {
//                return index;
        for(int element :arr){

            if(element==target){
                return target;
            }
            }


return -1;
    }




}
