package tricks;

public class Varargs {

    public static void main(String[] args) {

        print_multiParams("Madhu");
        print_multiParams("Madhu", "Babu");
        print_multiParams("Madhu", "Babu", "Velpuri");
    }

    public static void print_multiParams(String...s){

        for(String str:s) {
            System.out.print(str+" ");
        }
        System.out.println(" ");
    }


}
