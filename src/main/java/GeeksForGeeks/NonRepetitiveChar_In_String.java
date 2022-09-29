package GeeksForGeeks;

public class NonRepetitiveChar_In_String {

    public String nonRepetitive_Chars_In_String(String str){

        String res = "";
        int flag = 0;

        for(int i = 0;i<str.length();i++) {

            flag = 0;

            for ( int j = 0 ; j < str.length(); j++) {

                if ((str.charAt(i) == str.charAt(j)) && (i != j))
                    flag = 1;
            }
            if(flag == 0)
            res += str.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        NonRepetitiveChar_In_String obj = new NonRepetitiveChar_In_String();
        System.out.println(obj.nonRepetitive_Chars_In_String("Vijaya Madhu Sahasra"));


    }
}
