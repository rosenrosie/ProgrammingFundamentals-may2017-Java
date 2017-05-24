import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P02_AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int sum = number1 + number2;
        System.out.printf("%d + %d = %d", number1, number2, sum);
    }
}
