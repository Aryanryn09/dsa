public class scopping {
    public static void main(String[] args) {
        int a=34;
        int b =29;
        System.out.println(scope());
        {
            //block scope

        }
//scoping in for lopops

        for(int i=0;i<=9;i++){
            System.out.println(i);
        }
    }
    static int scope(){

        int nums =90;
return nums;
    }
}
