package oops;

public class MethodOverriding {

    public static void main(String[] args) {

//        Circle c = new Circle();

//        c.sides();

        Triangle t = new Triangle();
        t.sides();
        t = new Square();
        t.sides();
        t = new Circle();
        t.sides();



    }
}

class Triangle {

    void sides(){

        System.out.println("Triable has 3 sides");
    }
}

class Square extends Triangle {

    void sides(){

        System.out.println("Square has 4 sides");
    }
}

class Circle extends Square {

    void sides(){

        System.out.println("Circle has 0 sides");
    }
}
