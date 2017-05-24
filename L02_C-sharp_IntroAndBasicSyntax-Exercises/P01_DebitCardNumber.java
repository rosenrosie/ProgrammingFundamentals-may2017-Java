import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P01_DebitCardNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());
    
        System.out.printf("%04d %04d %04d %04d", num1, num2, num3, num4);
        //System.out.println(MessageFormat.format("{0,number,0000} {1,number,0000} {2,number,0000} {3,number,0000}", num1, num2, num3, num4));
    }
}
