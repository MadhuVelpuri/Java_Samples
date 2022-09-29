package tricks;

public class ReverseTheNumber {

    public static void main(String[] args) {

        int number = 23456;
        ReverseTheNumber rev = new ReverseTheNumber();
        int reverse = rev.reverseTheNumber(number);
        System.out.println("Reverse of "+number+ " is : "+reverse);

    }


    public int reverseTheNumber(int n){

        int temp=0, rev=0;

        while(n>0){

            temp = n%10;
            rev = rev * 10 + temp;
            n= n/10;

        }

        return rev;
    }
}
