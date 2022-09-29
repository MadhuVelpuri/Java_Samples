package tricks;

import java.util.Arrays;

class Sort{

    public static void main(String args[]){
        int[] a = {10,5,8,6,7,3,1,2};
        //Sort.sort(a);

        int[] arr = Arrays.stream(a).sorted().toArray();

        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

//        for (int i=0;i<a.length;i++)
//        System.out.print(a[i]+" ");
    }


    public static int[] sort(int a[]){
        int n = a.length;
        int temp;

        for (int i=0;i<n;i++){
            for (int j=1;j<(n-i);j++){
                if (a[j-1]>a[j]){
                    temp =a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}