import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P09_CountTheIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            try {
                Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
