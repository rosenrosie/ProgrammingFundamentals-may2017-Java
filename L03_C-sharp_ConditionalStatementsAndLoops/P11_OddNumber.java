import java.util.Scanner;

/**
 * Created by todor on 26.05.2017 г..
 */
public class P11_OddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scan.nextLine()));
        boolean isEven = number % 2 == 0;
    
        while (isEven)
        {
            System.out.println("Please write an odd number.");
            number = Math.abs(Integer.parseInt(scan.nextLine()));
            isEven = number % 2 == 0;
        }
    
        System.out.printf("The number is: %d", number);
    }
}
