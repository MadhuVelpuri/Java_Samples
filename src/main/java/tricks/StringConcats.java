package tricks;

public class StringConcats {

    public static void main(String[] args) {

        String s1 = "Madhu";
        String s2 = "Velpuri";

        System.out.println( "s1+s2 : "+(s1+s2));
        System.out.println("s1.concat(s2) : "+ s1.concat(s2));
//        System.out.println(" s1.appends(s2) : "+ s1.appends(s2)); //appends is part of StringBuffer

        StringBuffer s3 = new StringBuffer(s1);
        System.out.println("s3.append(s2) : "+ s3.append(s2));

        String newS1 = new String("VIJAYA");
        String newS2 = new String("KOTA");

        System.out.println("newS1+newS2 : "+ newS1+newS2);
        System.out.println("newS1.concat(newS2) : "+ newS1.concat(newS2));


    }
}
