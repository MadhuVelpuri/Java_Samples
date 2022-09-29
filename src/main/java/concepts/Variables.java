package concepts;

public class Variables {

    static int svar;
    int ivar;

    public static void main(String[] args) {


        System.out.println(svar);
//        System.out.println(ivar); // non-static var cannot be called in static

        Variables v = new Variables();
        System.out.println(v.ivar);
        System.out.println(v.svar); // static vars can be accessed with objects
//        System.out.println(v.instance_method()); // cannot resolve prinln(void)
        v.instance_method();
    }

    public void instance_method(){

        int i;
//        System.out.println(i); // local variable must be initialized before accessing
        i=90;
        System.out.println(i);
        svar = 11;
        ivar = 22;
        System.out.println(svar);
        System.out.println(ivar); // static can be called everywhere

    }
}
