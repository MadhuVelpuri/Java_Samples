package GeeksForGeeks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balanced_Paranthesis {


    static boolean balancedBrackets(String str){

        Deque<Character> deque = new ArrayDeque<Character>();

        for (int i = 0;i<str.length();i++) {

            char a = str.charAt(i);

            if (a == '(' || a == '{' || a == '{') {
                deque.push(a);
                continue;
            }

            if (deque.isEmpty())
                return false;

                char res;
                switch (a) {
                    case ')':
                        res = deque.pop();
                        if (res == '[' || res == '{')
                            return false;
                        break;
                    case ']':
                        res = deque.pop();
                        if (res == '(' || res == '{')
                            return false;
                        break;
                    case '}':
                        res = deque.pop();
                        if (res == '[' || res == '(')
                            return false;
                        break;
                }
            }
         return (deque.isEmpty());

        }

    public static void main(String[] args) {

        System.out.println(Balanced_Paranthesis.balancedBrackets("({{()}]"));

    }
}
