import java.util.Scanner;

/**
 * Created by todor on 26.05.2017 г..
 */
public class P12_NumberChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try
        {
            Double.parseDouble(scan.nextLine());
            System.out.println("It is a number.");
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Invalid input!");
        }
    }
}
