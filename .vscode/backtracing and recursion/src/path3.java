import java.util.ArrayList;

public class path3 {
    public static void main(String[] args) {
        System.out.println(diagonalpath("",3,3));    }
    static ArrayList<String> diagonalpath(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);

            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(c>1&&r>1){
            list.addAll(diagonalpath(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(diagonalpath(p+"H",r-1,c));
        }
        if(c>1){
            list.addAll(diagonalpath(p+"R",r,c-1));
        }
        return list;
    }
}
//aryan bansod
