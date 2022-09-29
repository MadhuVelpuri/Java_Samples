package tricks;

import java.util.concurrent.locks.ReentrantLock;

public class Reverse_EachWord {


    public String reverse_The_Strings(String str){

        String[] words = str.split(" ");
        String revsub = "";

        for (int i=0;i<words.length;i++){

            char[] arr = words[i].toCharArray();

            for (int j=arr.length-1;j>=0;j--){
             revsub = revsub+arr[j];
            }
            revsub+= " ";
        }

        return revsub;
    }

    public static void main(String[] args) {


        System.out.println("Reverse of strings in the given array are : "+
                new Reverse_EachWord().reverse_The_Strings("Kota Vijaya Laxmi"));
    }
}

