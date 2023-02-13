public class powofbase {
    public static void main(String[] args) {
        int pow =6;
        int base =2;

        int ans=1;
        while(pow>0){
            if((pow &1)==1){
                ans *=base;
            }
            base*=base;
            pow=pow>>1;
        }

        System.out.println(ans);
    }
}
