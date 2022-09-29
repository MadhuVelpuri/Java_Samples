package oops;

public class inheritance {

    public static void main(String[] args) {

        C c = new C();
        c.printC();
        c.printB();
        c.printA();



    }
}

    class A {

    void printA() {
        System.out.println("Class A");
    }
    }

    class B extends A {
        void printB() {
            System.out.println("Class B");
        }
    }

    class C extends B {
        void printC() {
            System.out.println("Class C");
        }
    }
