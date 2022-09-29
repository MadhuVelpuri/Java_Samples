package tricks;

import java.util.ConcurrentModificationException;
import java.util.HashMap;

public class HMapException {

    public static void main(String[] args) throws ConcurrentModificationException {

        HashMap<String, Integer> list = new HashMap<String, Integer>();

        list.put("Madhu", 1);
        list.put("Vijaya", 2);
        list.put("Ammulu", 3);

        for (String key : list.keySet()) {
            list.put("sss", 4); // concurrentmodificationexception as
            System.out.println(key + " = " + list.get(key));
        }
        list.forEach((key,value)-> System.out.println(key + " "+value)); // lambda expression


    }
}
