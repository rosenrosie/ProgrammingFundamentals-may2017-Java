import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P11_5DifferentNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        
        if (number2 - number1 < 5){
            System.out.println("No");
        }
        else {
            for (int i = number1; i <= number2 - 4; i++) {
                for (int j = i+1; j <= number2 - 3; j++) {
                    for (int k = j+1; k <= number2 - 2; k++) {
                        for (int l = k+1; l <= number2 - 1; l++) {
                            for (int m = l + 1; m <= number2; m++) {
                                System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
