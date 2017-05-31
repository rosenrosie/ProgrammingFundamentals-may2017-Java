import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P08_CaloriesCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ingredientsCount = Integer.parseInt(scan.nextLine());
        int calories = 0;
        for (int i = 0; i < ingredientsCount; i++) {
            String ingredientName = scan.nextLine().toLowerCase();
            switch (ingredientName){
                case "cheese":
                    calories += 500;
                    break;
                case "tomato sauce":
                    calories += 150;
                    break;
                case "salami":
                    calories += 600;
                    break;
                case "pepper":
                    calories += 50;
            }
        }
    
        System.out.println("Total calories: " + calories);
    }
}
