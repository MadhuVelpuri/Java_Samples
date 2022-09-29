package tricks;

    class Base {
        int value = 0;

        Base() {
            addValue();
        }

        void addValue() {
            value += 10;
        }

        int getValue() {
            return value;
        }
    }

    class Derived extends Base {
        Derived() {
            addValue();
        }

        @Override
        void addValue() {
            value += 20;
        }
    }

class Derived1 extends Derived {
    Derived1() {
        addValue();
    }

    @Override
    void addValue() {
        value += 20;
    }
}

    public class inheritance {
        public static void main(String[] args) {
            Base b = new Base();
            Derived d = new Derived();
            Base bd = new Derived1();
            System.out.println("Base one : "+ b.getValue());
            System.out.println("Derived one : "+ d.getValue());
            System.out.println("Base-Derived one : "+ bd.getValue());
        }

    }
