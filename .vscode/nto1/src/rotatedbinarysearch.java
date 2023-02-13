public class rotatedbinarysearch {
    public static void main(String[] args) {
int []arr={5,6,7,8,9,1,2,3};
        System.out.println(rotatedsearch(arr,8,0,5));

    }
    static int rotatedsearch(int []arr,int target,int s ,int e){

        if(s>e){
            return -1;
        }
        int m=s+e-s/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target && target <=arr[m]){
                return rotatedsearch(arr,target,s,m-1);
            }
            else{
                return rotatedsearch(arr,target,m+1,e);
            }

        }
        if( target>=m && target<=e){
            return rotatedsearch(arr,target,m+1,e);

        }

      return rotatedsearch(arr,target,s,m-1);

    }
}
