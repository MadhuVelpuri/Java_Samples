package tricks;

import java.util.*;

public class MajorityElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY


        public static int majorityElement(final List<Integer> A) {
            Map<Integer, Integer> count = new HashMap<Integer, Integer>();
            int count1 = 0, majorelement = 0;
            for ( int i=0;i<A.size();i++){
                if(count.containsKey(A.get(i)))
                    count.put(A.get(i),count.get(A.get(i))+1);
                else
                    count.put(A.get(i),1);

            }

            for (int m : count.keySet()){

                if (count.get(m)>=(count.size()/2))
                    majorelement = m;
            }

            return majorelement;
        }


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();
        a.add(100);
        a.add(9);
        a.add(2);
        a.add(9);
        a.add(3);
        a.add(5);
        a.add(9);
        int ma = majorityElement(a);
        System.out.println("Majority element is : "+ ma);

    }
    }
