package tricks;

public class PrimeOrNot {

    public static void main(String[] a){
        long start = System.currentTimeMillis();
        boolean isprime = PrimeOrNot.isPrime(7);
        System.out.println(isprime);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken : "+ (end-start)+" ms");

    }


    public static boolean isPrime(int n){

        int count = 1;
        for (int j=2;j<=Math.sqrt(n);j++){
            if (n%j==0)
                count++;
        }

        if (count == 2)
            return true;
            else
                return false;
    }
}
