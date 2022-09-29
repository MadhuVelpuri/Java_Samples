package tricks;

public class A {
        A(){
            System.out.println("A");
        }
static {
    System.out.println("B");
        }

public void meth(){
    System.out.println("C");
        }
        }


        class B{

            public static void main(String[] args) {
                A a =new A();
                a.meth();

            }
        }