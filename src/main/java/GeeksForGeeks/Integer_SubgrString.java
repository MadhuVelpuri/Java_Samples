package GeeksForGeeks;

public class Integer_SubgrString {


    /**
     * To find the position of a in b
     * @param a
     * @param b
     * @return
     */

    public static int solution(int a, int b){

        int position = String.valueOf(b).indexOf(String.valueOf(a));

        if(position > 0)

            return position;

        else return -1;
    }

    public static void main(String[] args) {

        System.out.println(Integer_SubgrString.solution(6, 1068234));
    }





}
