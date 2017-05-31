import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P13_GameOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        
        boolean itsAKindOfMagic = false;
        String lastMagic = "";
        int combinationsCount = 0;
        for (int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                combinationsCount++;
                if (i + j == magicNumber) {
                    lastMagic = String.format("Number found! %d + %d = %d", i, j, magicNumber);
                    itsAKindOfMagic = true;
                }
            }
        }
        
        if (itsAKindOfMagic) {
            System.out.println(lastMagic);
        }
        else {
            System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNumber);
        }
    }
}
