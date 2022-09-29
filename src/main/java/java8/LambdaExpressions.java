package java8;

public class LambdaExpressions {

    interface Sample {

        void method();
        }

    public static void main(String[] args) {

        Sample s=()->{
            System.out.println("This is sample lambda expression");
        };

        s.method();
    }

}
