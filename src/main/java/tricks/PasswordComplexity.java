package tricks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordComplexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pwd = sc.nextLine();

        System.out.println("Is given pwd "+ pwd + " Complex : "+ isPwdComplex(pwd));
    }


    public static boolean isPwdComplex(String pwd) {


        return pwd.length() >=6 &&
                pwd.matches(".*\\d.*")&&
                pwd.matches(".*[a-z].*")&&
                pwd.matches(".*[A-Z].*")&&
                pwd.matches(".*[^a-zA-Z0-9-].*");
    }
}
