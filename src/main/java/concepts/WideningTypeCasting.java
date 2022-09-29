package concepts;

public class WideningTypeCasting {

    public static void main(String[] args) {

        byte b = 20;

        short s = b;

        int i = s;

        long l = i;

        float f = 45.6f;

        double d = f;

        System.out.println("Byte b : "+ b);
        System.out.println("byte to short : "+ s);
        System.out.println("short to int : "+ i);
        System.out.println("int to long : "+ l);
        System.out.println("");
        System.out.println("float value : "+ f);
        System.out.println("float to double : "+ d);

    }
}
