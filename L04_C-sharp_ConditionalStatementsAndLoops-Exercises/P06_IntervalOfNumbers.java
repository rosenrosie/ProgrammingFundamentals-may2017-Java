import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P06_IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int startNumber = Math.min(number1, number2);
        int endNumber = Math.max(number1, number2);
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }
}
