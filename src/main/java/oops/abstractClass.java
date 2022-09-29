package oops;

public class abstractClass {

    public static void main(String[] args) {

        //Car c = new Car(); //abstract class cannot be initialized directly.
        Car c = new drive(); // creating an instact to the abstract class using non-abstract

        System.out.println(c.concat(" Babu"));
    }
}

abstract class Car{

    String s;
    Car(String s){  // PArameterized constructor in abstract class

        this.s = s;
    }

    abstract String concat(String a);

}

class drive extends Car{

    drive(){
        super("Madhu");
    }
    String concat(String a){  // abstract method implementation

        return this.s+a;

    }
}
