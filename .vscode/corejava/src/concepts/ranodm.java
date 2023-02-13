package concepts;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;
public class ranodm {
    public static void main(String[] args) {
        Random random= new Random();
        int randomno=random.nextInt();
        System.out.println(randomno);
        randomno=random.nextInt(6)+1;//this is to generate a random valure between 1-6

        System.out.println(randomno);
        double range = random.nextDouble();
        System.out.println(range);//random range between 0-1

        ArrayList<String> aot = new ArrayList<>();
        aot.add("mikasa");
        aot.add("captian levi");
        aot.add("titan");

        ArrayList<String> dn = new ArrayList<>();
        dn.add("mikasa");
        dn.add("mikasa");
        dn.add("mikasa");

        ArrayList<String> mon = new ArrayList<>();
        ArrayList<ArrayList<String>> anime = new ArrayList<>();
        anime.add(aot);anime.add(dn);anime.add(mon);
        System.out.println(anime);


    }

}
