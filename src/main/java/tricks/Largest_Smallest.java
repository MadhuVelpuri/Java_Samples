package tricks;

public class Largest_Smallest {

    static int [] a = {12,45,61,10,34,10,78,33,78};

    public static void main(String[] args) {

        Largest_Smallest.find_Large_Small(a);
    }


    public static void find_Large_Small(int[] a){

        int largest = a[0], smallest = a[0];
        for (int i=1;i<a.length;i++){

            if(a[i]>largest)
                largest = a[i];
            else if (a[i]<smallest)
                smallest = a[i];


        }

        System.out.println("Largest is : "+ largest);
        System.out.println("Smallest is : "+ smallest);
    }
}
