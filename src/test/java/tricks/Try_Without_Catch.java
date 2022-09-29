package tricks;


public class Try_Without_Catch {
    static int c = 0;
    public static void main(String[] args) {
        Try_Without_Catch();
        try {
            int a = 10, b = 20;
            c = (a + b) / c;

            System.out.println(c);
            System.out.println("Print after exception");
        } finally {
            System.out.println("Found an exception:");
        }

    }

     public static void Try_Without_Catch (){
        c = 0;
        System.out.println("This is base constructor");
    }
}
