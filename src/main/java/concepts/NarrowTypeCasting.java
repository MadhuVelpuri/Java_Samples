package concepts;

public class NarrowTypeCasting {

    public static void main(String[] args) {

        double d = 345.234;

        long l = (long)d;

        int i = (int)l;

        short s = (short)i;

        byte b = (byte)s;

        System.out.println("Double value : "+d);
        System.out.println("Doulbe to long : "+l);
        System.out.println("long to int : "+i);
        System.out.println("int to short : "+s);
        System.out.println("short to byte : "+b); //  127 -> -128 -> 256 -> (345 - 256) == 89

        double b1 = 256;
        System.out.println((byte)b1);


    }
}
