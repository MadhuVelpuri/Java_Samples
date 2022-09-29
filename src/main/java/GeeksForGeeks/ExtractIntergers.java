package GeeksForGeeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractIntergers {

    public static void retunrOnlyIntegers(String s){

        Pattern p = Pattern.compile("\\d");
        Matcher matcher = p.matcher(s);
        int sum = 0;
        while(matcher.find()){
            String str = matcher.group();
            System.out.print(str+" ");
            sum += Integer.parseInt(str);

        }
        System.out.println("Sum if integers in the given strins is : "+ sum);
    }

    public static void main(String[] args) {
        ExtractIntergers.retunrOnlyIntegers("5Mad4hu3");
    }
}
