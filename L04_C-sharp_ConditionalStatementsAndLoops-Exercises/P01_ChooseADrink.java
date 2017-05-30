import java.util.Scanner;

/**
 * Created by todor on 30.05.2017 г..
 */
public class P01_ChooseADrink {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String profession = scan.nextLine();
        String perfectDrink = "";
        switch (profession) {
            case "Athlete":
                perfectDrink = "Water";
                break;
            case "Businessman":
            case "Businesswoman":
                perfectDrink = "Coffee";
                break;
            case "SoftUni Student":
                perfectDrink = "Beer";
                break;
            default:
                perfectDrink = "Tea";
        }
    
        System.out.println(perfectDrink);
    }
}
