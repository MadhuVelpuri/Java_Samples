package tricks;

public class StringTricks {

    int objCount;

    StringTricks()
    {
        objCount++;
    }

    public static void main(String[] args) {


        String s = "Madhu", s6 = "Madhu";
        String s1 = "Madhu";
        String ss = "Velpuri";

        String s2 = new String("Madhu");
        String s3 = new String("Madhu");
//        String s4 = s3.reverse

        System.out.println("s==s6 "+(s == s6));
        System.out.println("s==s2 "+(s == s2));
        System.out.println("s2==s3 "+(s2 == s3));

        System.out.println("s1.equals(s2) "+s1.equals(s2));
        System.out.println("s2.equals(s3) "+s2.equals(s3));
        System.out.println("s.equals(s1) "+s.equals(s1));

        System.out.println("s.charAt(0) < ss.charAt(0) "+ (s.charAt(0) < ss.charAt(0)));

        System.out.println("ss.substring(1, 3) "+ss.substring(1, 3));

    }
}