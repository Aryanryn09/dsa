public class dicecount {
    public static void main(String[] args) {
      dice(" ",4);
    }
    static void dice(String p,int target){
        if(target ==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && target<i; i++) {
            dice(p+i,target -i);

        }
    }
}//
