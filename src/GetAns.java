import java.util.Scanner;

public class GetAns {
    private static final String VALID_IDENTIFIER_PATTERN
            = "[a-z]";
    public static String ans(){
        System.out.println("So can I be your boyfriend? \n" +
                "Please enter y or no \n" +
                "y for yes n for no:");
        String ans1=new Scanner(System.in).nextLine();
        if (ans1.matches(VALID_IDENTIFIER_PATTERN)){
                if (ans1.equals("y")){
                    System.out.println("I'm very happy to hear of that \uD83D\uDE01");
                } else if (ans1.equals("n")) {
                    System.out.println("ahint hint I'm crying too much/n" +
                            "But can I have a chance to get yout love\uD83D\uDE01?");
                }
                else {
                    System.out.println("Please enter y or n only");
                    ans();
                }
        }else{
            System.out.println("Please enter y or n only");
            ans();
        }
        return null;
    }
}
