package tricks;

import java.util.HashMap;
import java.util.Map;

public class Character_Count
{
    public static void main(String[] args) {
        String name = "Hello, This is Madhu, Welcome to 2020!!";
        Character_Count.char_count(name);
        multipram("M","V","S");
    }

    public static void char_count(String name)
    {
        char[] inp = name.toCharArray();
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c: inp)
        {
            if (count.containsKey(c))
                count.put(c, count.get(c)+1);
                else
                    count.put(c, 1);
        }
        System.out.print(count);
    }

    public static void multipram(String ... a){

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}