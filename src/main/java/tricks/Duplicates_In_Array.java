package tricks;

import java.util.HashMap;
import java.util.Map;

public class Duplicates_In_Array {


    public static void main(String[] args) {

        int[] arr = {12,3,4,5,12,3,7,8};

        Map<Integer, Integer> duplicates = new HashMap<>();

        for (int i=0;i<arr.length;i++){

            if (duplicates.containsKey(arr[i]))
                duplicates.put(arr[i], duplicates.get(arr[i])+1);
            else
                duplicates.put(arr[i], 1);
        }

        System.out.println("Duplicates in array are : ");
        for (int m : duplicates.keySet()){

            if(duplicates.get(m)>1)
                System.out.println(m);
        }
    }
}
