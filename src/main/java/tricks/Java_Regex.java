package tricks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex {

        public static void main(String[] args) {
            String regex = "[a-z]@.";
            Pattern p = Pattern.compile(regex);
            String str = "abc@yahoo.com,123@cnn.com";
            Matcher m = p.matcher(str);

            if (m.find()) {
                String foundStr = str.substring(m.start(), m.end());
                System.out.println("Found string  is:" + foundStr);
                System.out.println("Matched  Text:" + m.group() + ", Start:" + m.start() + ", " + "End:" + m.end());
            }

        }

    }
