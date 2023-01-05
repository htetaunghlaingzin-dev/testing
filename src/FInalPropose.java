import java.util.Scanner;

public class FInalPropose implements inter {
    private static final String VALID_IDENTIFIER_PATTERN
            = "[a-z]";
    public static String fp(){
        System.out.print("Do you have a boyfriend?\n" +
                "Please enter y or no \n" +
                "y for yes n for no:");
        String ans=new Scanner(System.in).nextLine();
        if (ans.matches(VALID_IDENTIFIER_PATTERN)){
            if (ans.equals("y")){
                System.out.println("Thanks for giving your time on me");
            } else if (ans.equals("n")) {
                    GetAns.ans();
            }else {
                System.out.println("Please enter y or n only");
                fp();
            }
        }else{
            System.out.println("Please enter y or n only");
            fp();
        }
        return null;
    }
}
