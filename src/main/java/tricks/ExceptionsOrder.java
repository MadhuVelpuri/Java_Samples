package tricks;

public class ExceptionsOrder {

    public static void main(String[] args) {

        try{
            int[]a = new int[5];
            System.out.println(a[6]);
            a[5] = 30/0;
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception: "+ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("Arrayidexexception : "+arr.getMessage());
        }
        catch(Exception e){
            System.out.println("Base Exception : "+e.getMessage());
        }
    }
}
