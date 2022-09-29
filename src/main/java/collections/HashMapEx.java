package collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapEx {

    public static void main(String a[]) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "ONE");
        hmap.put(1, "One");
        hmap.put(2, "Two");
        hmap.put(3, "Three");
        hmap.put(4, "Four");
        hmap.put(3, "THREE");

        //index starts from 1 and stores unique key values and sort them.
        // duplicate key value will override the old key value.

        System.out.println(hmap.size());
        // Using Map.Entry interface
        for (Map.Entry m : hmap.entrySet()) {
            System.out.println(m.getKey() + "\t" + m.getValue());
        }

    }
}
