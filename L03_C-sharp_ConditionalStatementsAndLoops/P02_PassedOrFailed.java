import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P02_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        
        if (grade >= 3) {
            System.out.printf("Passed!");
        }
        else {
            System.out.printf("Failed!");
        }
    }
}
