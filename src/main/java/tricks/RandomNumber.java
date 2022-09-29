package tricks;

import java.util.Random;

public class RandomNumber {


    public static void main(String a[]){
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        System.out.println(number);
        System.out.println(new Random().nextInt(9999));
    }

}
