import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P07_CakeIngredients {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ingredientCount = 0;
        boolean isBakingTime = false;
        while (!isBakingTime) {
            String ingredientName = scan.nextLine();
            if (ingredientName.equals("Bake!")) {
                isBakingTime = !isBakingTime;
            }
            else {
                System.out.printf("Adding ingredient %s.%n", ingredientName);
                ingredientCount++;
            }
        }
        System.out.printf("Preparing cake with %d ingredients.", ingredientCount);
    }
}
