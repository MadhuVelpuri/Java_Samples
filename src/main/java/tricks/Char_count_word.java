package tricks;

import java.util.Scanner;

public class Char_count_word {

        public static void main(String a[]) {
           String name = "My Name is Madhu Babu Velpuri and i am looking for someone.";
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character : ");
           String ch = sc.nextLine();

           int char_count = name.length()-(name.replace(ch,"").length());
            System.out.println(ch+" count is : "+char_count);
            /*
             * String s = ""; System.out.println(s.length());
             */


//            SecureRandom ran = new SecureRandom();
//            int randomNumber = ran.nextInt(10000);
//
//            System.out.println(randomNumber);
        }

    }