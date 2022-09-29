package concepts;

public class Non_primitive_DataTypes {
    static byte a;
    static short t;
    static int val;
    static float fval;
    static double dval;
    static long lval;
    static char cval;
    public static void main(String[] args) {
        
        byte b = 23, c=127;
        System.out.println("Byte :: a default: "+ a + " b : "+b+" b++ :"+ ++b+" c++ : "+ ++c);

        short s = 2345, s1 = 32767;
        System.out.println("Short :: t default: "+ t +" s : "+s+" s1++ : "+ ++s1);

        int val1 = 345678;
        System.out.println("Integer :: val default : "+val +" val1 : "+val1);

        float f = 0.6f;
        System.out.println("Float :: fval default : "+fval +" f : "+f+" f++ : "+ ++f);

        double d = 5.35;
        System.out.println("double :: dval default : "+dval +" d : "+d+" d++ : "+ ++d);

        long l = 3345622;
        System.out.println("Long :: lval default : "+lval +" l : "+l+" l++ : "+ ++l);

        char cc = 'a';
        System.out.println("Char :: cval default : "+cval +" cc : "+cc+" cc++ : "+ ++cc);



    }
}
