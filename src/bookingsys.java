import java.util.Scanner;

public class bookingsys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] table_num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("1. show ticket\n2. exist system");
        System.out.println("Choose option :");
        int opt_num = scanner.nextInt();
        switch (opt_num) {
            case 1:
                showTicket(table_num);
                while (isFree(table_num)) {
                    System.out.println();
                    System.out.println("Select Ticket Number");
                    String tnum = scanner.next();
                    book(table_num,tnum);
                }
                System.out.println();
                System.out.println("Sorry!, All tickets are already booked!");
                break;
            case 2:
                return;
        }
    }

    private static void showTicket(String[] table_num) {
        System.out.println("Welcome to System");
        for (int i = 0; i < table_num.length; i++) {
            if (i == 5) {
                System.out.println();
            }
            System.out.print(table_num[i] + " ");
        }
    }

    private static void book(String[] table_num, String tnum) {
        for (int i = 0; i < table_num.length; i++) {
           String c=String.valueOf(i);
            int a=Integer.parseInt(tnum);
            int b=a-1;
            String d=String.valueOf(b);
            if (c.equals(d)) {

                if (table_num[b].contains("B")){
                    System.out.println("already booked"+tnum);
                }else {
                    table_num[i] = "B";
                }



            }
            System.out.print(table_num[i] + " ");
        }

    }


    private static boolean isFree(String[] table_num) {
        for (int i = 0; i < table_num.length; i++) {
            if (!table_num[i].equals("B")) {
                return true;
            }
        }
        return false;
    }}

