import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P10_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linesCount = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= linesCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
