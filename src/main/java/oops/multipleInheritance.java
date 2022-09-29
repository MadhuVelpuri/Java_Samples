package oops;


class multipleInheritance implements testInterface, sampleInterface{

    @Override
    public void print1(){

        System.out.println("Print");
    }


    @Override
    public void display(){

        System.out.println("Display");
    }


    public static void main(String[] args) {

        testInterface test = new multipleInheritance();
        sampleInterface sample = new multipleInheritance();

        test.display();

        sample.print1();
    }
}
