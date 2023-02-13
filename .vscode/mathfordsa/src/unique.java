public class unique {
    public static void main(String[] args) {
        int []arr={2,1,3,4,2,3,4};
        System.out.println(uniquenumber( arr));
    }
static int uniquenumber(int[]arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique ^=arr[i];
        }
        
        return unique;

//    for (int n:arr) {
//     unique ^=n;
//    }
//    return  unique;
}
}

