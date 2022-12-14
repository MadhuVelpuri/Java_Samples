package tricks;

import java.util.HashMap;
import java.util.Set;

public class DupWordInString {

    HashMap<String, Integer> hmap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        DupWordInString dws = new DupWordInString();
        HashMap<String, Integer> dupMap = dws.dupCount("Velpuri Madhu Babu Velpuri Sahasra");
        dws.print_Dups(dupMap);

    }

    public HashMap<String, Integer> dupCount(String str) {
        String[] str1 = str.split(" ");

        for (String s : str1) {

            if (hmap.containsKey(s))
                hmap.put(s, hmap.get(s) + 1);
            else
                hmap.put(s, 1);
        }
        return hmap;

    }

    public void print_Dups(HashMap<String, Integer> hmm) {

        Set<String> dupstrings = hmm.keySet();

        for (String DupWrd : dupstrings) {
            if (hmap.get(DupWrd) > 1) {

                System.out.println("Duplicate word is "+DupWrd ); }
        }

    }

}