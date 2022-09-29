package tricks;

public class FirstLetterCaps {

    public static void main(String[] args) {

        String s = "madhu";

        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
    }
}
