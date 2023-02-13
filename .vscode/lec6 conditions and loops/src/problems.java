
//to count a particular number of digit occuring inside a string of digit
public class problems {
    public static void main(String[] args) {
//        int n =1111;
//         int count =0;
//         while (n>0){
//             int rem= n%10;
//             if(rem ==3){
//                 count++;
//             }
//
//             n=n/10;//n/=10
//         }
//        System.out.println(count);
//
//    }
//}


//print the number reverse to a particuklar number

        int n =123324;
         int ans  =0;
         while (n>0){

             int rem = n%10;
             n=n/10;
             ans = ans *10+rem;

         }

        System.out.println(ans);
        }
}