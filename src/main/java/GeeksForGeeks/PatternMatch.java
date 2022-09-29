package GeeksForGeeks;


import org.apache.xmlbeans.impl.regex.Match;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
data : "ms mx mx ms"
pattern: "abba"

data : "ma ma ma ma"
pattern : "aaaa"

data : "ms mx ms ms"
   pattern: "abba" - false
            cxcc - true

 */
public class PatternMatch {

    public boolean isPatternMatched(String str, String pattern){

           String[] arr =  str.split( " ");
        char[] chr = new char[arr.length];
        char ch;
           String temp = arr[0];
           for (int i=0;i<arr.length;i++){
               ch = pattern.charAt(0);
               if(temp.equalsIgnoreCase(arr[i])){
                   chr[i] = ch;
               }
               else {
                   chr[i] = (char) (++ch);
               }
           }
           String finalString = new String(chr);
        System.out.println("Expected : "+ pattern + " :: "+ "Actual : "+ finalString);

        return finalString.equalsIgnoreCase(pattern);
    }

    public static void main(String[] args) {
        PatternMatch PM = new PatternMatch();
        boolean result1 = PM.isPatternMatched("ms mx ms ms", "abaa");
        boolean result2 = PM.isPatternMatched("ma ma ma ma", "babb");
        boolean result3 = PM.isPatternMatched("ms mx mx ms", "cddc");
        boolean result4 = PM.isPatternMatched("fb cb fb cb", "abba");
        boolean result5 = PM.isPatternMatched("fb ig fb fb", "babb"); // it's not am exact pattern

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
