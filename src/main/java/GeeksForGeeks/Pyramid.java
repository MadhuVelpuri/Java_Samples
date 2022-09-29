package GeeksForGeeks;

import java.util.Scanner;

public class Pyramid {


    /*
    6 5 4 3 2 1
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
    */

    public void pyramid1(int n) {

        int m = n;
        for ( int j = 1 ;j<=m ; j++){

            for (int i = n; i > 0; i--) {

                System.out.print(i +" ");
            }
            n -= 1;
            System.out.println( "");
        }
    }

    /*
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
     */
    public void pyramid2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = (n - i) * 2; j >= 0; j--) {

                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {

                System.out.print("* ");
            }

            System.out.println();

        }
    }
     /*

            *
          * * *
        * * * * *
      * * * * * * *

      */
     public void pyramid3(int n){

         for(int i = 0; i<n ; i++){

                for( int j = (n-i);j>=0;j--){

                    System.out.print(" ");
                }

                for (int k = 0 ;k<=i; k++){

                    System.out.print("* ");
                }

                System.out.println();

            }
    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        Pyramid p = new Pyramid();
        p.pyramid1(no);
        p.pyramid2(no);
        p.pyramid3(no);
    }

}