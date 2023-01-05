import java.util.Scanner;

public class MainPage implements inter{
    private static final String VALID_IDENTIFIER_PATTERN
            = "[A-z-\\s]+";
    static String nm;
    public static String prp(){
        System.out.print("Please Enter your name:");
        String name=new Scanner(System.in).nextLine();
        nm=name;
        if (name.matches(VALID_IDENTIFIER_PATTERN)){
            AbtChat.ai();
        }else {
            System.out.println("try again ");
            prp();
        }
        return null;
    }
}