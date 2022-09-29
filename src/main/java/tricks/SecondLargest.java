package tricks;

import java.util.HashMap;

public class SecondLargest {

    int firstLarge, secLarge;
    static HashMap<Integer, Integer> uniqueArray = new HashMap<Integer, Integer>();

    public static void main(String[] args) {


        int a[] = {2,4,7,1,10,12,12,10,10,10};
        int b[] = {5,5,2,2,1,0};

        SecondLargest se = new SecondLargest();

        int seclar = se.secondLargest(a);
        System.out.println("Second largest number in Array a is : "+seclar);

        uniqueArray.clear();

        int seclar1 = se.secondLargest(b);
        System.out.println("Second largest number in Array b is : "+seclar1);

    }



    public int secondLargest(int []a){

        secLarge = 0;
        firstLarge = 0;

        for (int i = 0;i<a.length;i++)
            uniqueArray.put(a[i],i);

        for (int n:uniqueArray.keySet()){

            if(firstLarge<n){
                secLarge = firstLarge;
                firstLarge = n;
            }
            else if(secLarge<n)
                secLarge = n;
        }
        return secLarge;
    }
}
