import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P01_Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
