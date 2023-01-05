import java.util.Scanner;

public class AbtChat implements inter {
    private static final String VALID_IDENTIFIER_PATTERN
            = "[a-z]";
    public static String ai(){
        String nm = MainPage.nm;
        String name[]=nm.split(" ");
        System.out.print("Hi"+name[0]+",I'm chat bot of hahz \n" +
                "Can I ask some ques?Please enter y or n : \n"+"y for yes no for no: ");
        String inp=new Scanner(System.in).nextLine();
        if (inp.matches(VALID_IDENTIFIER_PATTERN)){
            if (inp.equals("y")){
                FInalPropose.fp();
            } else if (inp.equals("n")) {
                System.out.println("Thanks for giving your time");
            }else {
                System.out.println("Please enter y or n only");
                ai();
            }
        }else {
            System.out.println("Please enter y or n only");
            ai();
        }
        return null;
    }
}
