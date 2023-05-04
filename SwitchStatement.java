import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any no. for day: ");

        int day=sc.nextInt();

        // switch (day) {
        //     case 1:
        //         // System.out.println("Sunday");
        //         // break;
        //     case 2:
        //         // System.out.println("Monday");
        //         // break;
        //     case 3:
        //         // System.out.println("Tuesday");
        //         // break;
        //     case 4:
        //         // System.out.println("Wednesday");
        //         // break;
        //     case 5:
        //         System.out.println("WEEKDAYS");
        //         break;
        //     case 6:
        //         // System.out.println("Friday");
        //         // break;
        //     case 7:
        //         System.out.println("WEEKEND");
        //         break;
        
        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }

        switch(day)
        {
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("Invalid");
        }
        sc.close();

        
    }
    
}
