import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P01_Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        
        if (grade >= 3){
            System.out.printf("Passed!");
        }
    }
}
