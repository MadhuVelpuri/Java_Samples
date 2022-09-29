package tricks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class HashMap_Compare {


    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1, "Madhu");
        map1.put(2, "Babu");
        map1.put(3, "Velpuri");
        map1.put(4, "Sahasra");

        Map<Integer, String> map2 = new HashMap<>();

        map2.put(11, "Madhu1");
        map2.put(22, "Babu1");
        map2.put(3, "Velpuri");
        map2.put(4, "Sahasra1");


        Map<Integer, String> common = new HashMap<>();


        for(int key : map1.keySet()){

            if(map2.get(key) !=null)
            {
                if(map1.get(key).equals(map2.get(key)))
                    common.put(key, map1.get(key));
            }
        }

        System.out.println(Arrays.asList(common));


    }
}
