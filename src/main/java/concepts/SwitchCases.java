package concepts;

public class SwitchCases {

    public static void main(String[] args) {

        switch("Madhu"){

            case "M":
                System.out.println("M");

            case "MADHU":                 //case values are case-sensitive
                System.out.println("A");
//            case "MADHU":                 //Duplicate vaules are not allowed
//                System.out.println("A");
            case "Madhu1":
                System.out.println("D");
                break;
//            case  1:                           //incompatible types
//            System.out.println(1);
            default:                        //only considered when no case value is matched or no break statement is available
                System.out.println("MADHU");

        }


    }
}
