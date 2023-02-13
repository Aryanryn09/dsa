public class setbits {

    public static void main(String[] args) {
        int a=253;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(setbit(a));
    }
static int setbit(int a){

        int count =0;
        while(a>0){
 count ++;

// a-=(a&-a);//or  you can also do it as \
            a=a&(a-1);
        }
        return count;
}
}
