package tricks;

public class MethodChaining {

    int a = 0, b =0;
    MethodChaining (){

        this.a = 5;
    }

    public MethodChaining method1 (int a){
        this.a = a;
        return this;

    }


    public MethodChaining method2(int b){

        this.b = b;
        return this;
    }

        void display(){

        System.out.println(" a : "+ a + " b : "+b);

    }

    public static void main(String[] args) {

        new MethodChaining().method1(10).method2(20).display();
    }
}
