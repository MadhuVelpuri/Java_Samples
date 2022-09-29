package GeeksForGeeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remove_Special_small_Numbers {

    static String res;

    public String remove_strings(String str, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.replaceAll("");

    }

    public static void main(String[] args) {

        String s = "$%AmZa9d0hu";
        Remove_Special_small_Numbers remove = new Remove_Special_small_Numbers();

        res = remove.remove_strings(s,"[A-Z]");

        res = remove.remove_strings(res,"[^a-zA-Z0-9]");

        res = remove.remove_strings(res,"[0-9]");

        System.out.println(res );
    }
}
