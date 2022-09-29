package tricks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HMap_Printing {

    public static void main(String[] args) {

        Map<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Madhu", 1);
        hmap.put("Babu", 2);
        hmap.put("V", 3);

        //Method1
        System.out.println(Arrays.asList(hmap));
        System.out.println(hmap);

        //Method2
        for (Map.Entry m : hmap.entrySet())
            System.out.println(m.getKey() + " "+m.getValue());

        //Method3 using lambda exp

//        hmap.entrySet().forEach(entry->
//        {
//            System.out.println(entry.getKey() + " "+entry.getValue());
//        });

    }


}
