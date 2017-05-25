import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P04_MonthPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNumber = Integer.parseInt(scan.nextLine());
        if (1 <= monthNumber && monthNumber <= 12) {
            String[] month = new String[]{
                    "January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December"
            };
            System.out.println(month[monthNumber-1]);
            return;
        }
        System.out.println("Error!");
    }
}
