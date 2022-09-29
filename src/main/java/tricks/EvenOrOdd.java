package tricks;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Given number is even number : "+ isEven(num));
    }

    public static boolean isEven(int n){
        return n%2 == 0;

    }
}
