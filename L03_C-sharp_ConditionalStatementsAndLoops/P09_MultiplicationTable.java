import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P09_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (byte i = 1; i <= 10; i++)
        {
            System.out.printf("%d X %d = %d%n", number, i, number * i);
        }
    }
}
