package diceroller;
import java.util.Random;
public class Diceroll {

    Random random;
    int number=0;
    Diceroll(){
       random= new Random();
        roll();
    }
   void  roll(){
        number = random.nextInt(6)+1;
       System.out.println(number);

    }
}
