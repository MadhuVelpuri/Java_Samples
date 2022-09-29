package collections;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Set<String> set1 = new java.util.HashSet<>();

        set1.add("Madhu");
        set1.add("Babu");
        set1.add("Velpuri");
        set1.add("Babu");
        set1.add("Sahasra");

//Set stores unique and unordered values.

        Iterator ite = set1.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
