package oops;

public class MethodOverloading {

    public static void main(String[] args) {

        sub2 s = new sub2();

        System.out.println("Sum of 3 params : "+s.sum(3,4,5));
        System.out.println("Sum of 2 params : "+s.sum(3,4));
        System.out.println("Sum of 3 double params : "+s.sum(3.5,4.6,5.2));
    }
}

class basic{

    int sum(int x, int y){

        return x+y;
    }
}

class sub1 extends basic {

    int sum(int x,int y, int z){

        return x+y+z;
    }
}

class sub2 extends sub1 {

    double sum(double x, double y, double z){

        return x+y+z;
    }
}
