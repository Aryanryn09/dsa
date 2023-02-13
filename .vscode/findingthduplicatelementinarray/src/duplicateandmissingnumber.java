import java.util.ArrayList;
import java.util.List;

public class duplicateandmissingnumber {
    public static void main(String[] args) {


                int[]arr={4,3,2,7,8,3,2,1};
                System.out.println(findingduplicateandmissing(arr));

            }
            static List<Integer> findingduplicateandmissing(int []arr){
                int i=0;
                while(i<arr.length) {
                    int correct=arr[i]-1;
                    if ( arr[i]!=arr[correct] ){
                        swap(arr,i,correct);

                    }else{
                        i++;
                    }
                }
                List<Integer> ans=new ArrayList<>();
                for(int index=0;index<arr.length;index++){
                    if(arr[index]!=index){
                        ans.add(arr[index]);
                    }

                }
                return ans;
            }
            static void swap(int []arr,int first,int second){
                int temp=arr[first];
                arr[first ]=arr[second];
                arr[second]=temp;
            }
        }



