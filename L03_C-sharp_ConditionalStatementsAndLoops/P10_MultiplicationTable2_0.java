import java.util.Scanner;

/**
 * Created by todor on 26.05.2017 г..
 */
public class P10_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());
    
        do
        {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }
}
