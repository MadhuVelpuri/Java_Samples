package tricks;

public class Constructor_match {

    static int a =0;
//    void Constructor_match(){
//
//        a = 20;
//    }
Constructor_match()
{
    a=11;
}

    Constructor_match(int x){
        a=x;
    }

    public static void main(String[] args) {
        Constructor_match cm = new Constructor_match(); // can't find the constructor suitable
        System.out.println(a);
    }
}
