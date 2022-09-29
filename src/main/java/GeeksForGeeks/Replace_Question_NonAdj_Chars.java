package GeeksForGeeks;

public class Replace_Question_NonAdj_Chars {

    public static void main(String[] args) {

        System.out.println( Replace_Question_NonAdj_Chars.replceques_with_nonadj_chars("?abab?ba?"));
    }

    public static String replceques_with_nonadj_chars(String str){

        String ans = "";

        char[] arr = str.toCharArray();

        //if first character itself is ? , then will replace it with a
        //and make sure if second character is also a , then will increase the first character a -> b
        if (arr[0] == '?') {
            arr[0] = 'a';
            if (arr[0] == arr[1])
                arr[0]++;
        }

        /*

         */
        for (int j=1;j<arr.length-1;j++){
            if(arr[j] == '?') {
                arr[j] = 'a';

                if(arr[j] == arr[j-1])
                    arr[j]++;

                if (arr[j] == arr[j+1])
                    arr[j]++;

                if(arr[j] == arr[j-1])
                    arr[j]++;
            }
        }

        if(arr[arr.length-1] == '?') {
            arr[arr.length - 1] = 'a';

            if (arr[arr.length - 1] == arr[arr.length - 2])
                arr[arr.length - 1]++;
        }

        for (int i=0;i<arr.length;i++)
            ans += arr[i];

        return ans;

    }

}
