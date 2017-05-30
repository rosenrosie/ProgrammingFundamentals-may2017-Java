import java.util.Scanner;

/**
 * Created by todor on 30.05.2017 г..
 */
public class P02_ChooseADrink2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String profession = scan.nextLine();
        int drinksCount = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;
        switch (profession) {
            case "Athlete": // "Water"
                totalPrice = calcTotalPrice(0.70, drinksCount);
                break;
            case "Businessman": // "Coffee"
            case "Businesswoman":
                totalPrice = calcTotalPrice(1.00, drinksCount);
                break;
            case "SoftUni Student": // "Beer"
                totalPrice = calcTotalPrice(1.70, drinksCount);
                break;
            default: // "Tea"
                totalPrice = calcTotalPrice(1.20, drinksCount);
        }
    
        System.out.printf("The %s has to pay %.2f.", profession, totalPrice);
    }
    
    static double calcTotalPrice (double itemPrice, int quantity){
        return itemPrice * quantity;
    }
}
