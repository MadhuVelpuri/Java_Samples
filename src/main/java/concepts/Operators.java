package concepts;

public class Operators {


    public static void main(String[] args) {

        Operators ops = new Operators();

        ops.unary_Operators();
        ops.logical_And_Bitwise_Operators();
        ops.ternary_Operators();
        ops.precedence();
    }


    public void unary_Operators(){

        int a = 10, b= 20;

        System.out.println( a++ + ++b); //   10 + 21  = 31
        System.out.println(++a + a++); //  12 + 12 = 24
        System.out.println(--a + b--); //  11 + 21 = 33

    }

    public void ternary_Operators(){
    int a = 20, b = 10, c = 30, result;

    result = ((a>b)?(a>c)?a:c:(b>c)?b:c);

        System.out.println("Max of a,b,c is : "+result);


    }

    //&& logical operator doesn't check the second condition if the first condition is false
    // & bitwise operator does check the second condition irresective of the first condition true or false
    public void logical_And_Bitwise_Operators(){
        int a = 10, b=5, c = 20;
        System.out.println(a<b&&a++<c); // first condition isn't met, so 2nd condition is not checked.
        System.out.println(a); // 10 since second condition in the above statement isn't checked.

        System.out.println(a>b||b>c);//logical || doesn't check the 2nd condition if the 1st one is true
        System.out.println(a<b|b>c); // bitwise | check the both the conditions always.

        System.out.println(a<b&a++<c); // here the 2nd condition will be checked though 1st condition is false
        System.out.println(a); // 11
    }

    public void precedence(){

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        //precedence order for arithmetic operators will be
        // ( / = * = % ) > ( + = - )
        System.out.println("a+b/d : "+ (a+b/d)); // b/d first and then add it to a => a+(b/d) // 20+(10/20 ) => 20.5 => 20
        System.out.println("a+b*d-e/f : "+ (a+b*d-e/f)); // if the precedence is same, then associative rules are followed
            // e/f => b*d => a+(b*d) => a+(b*d) - (e/f)


    }

}


