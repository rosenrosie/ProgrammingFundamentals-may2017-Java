import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P06_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayOfTheWeek = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        
        if (!(0 <= age && age <= 122)) {
            System.out.println("Error!");
            return;
        }
        
        int dayIndex = dayOfTheWeek.equals("Weekday") ?
                0 :
                dayOfTheWeek.equals("Weekend") ?
                        1 :
                        2;
        int ageGroupIndex = age <= 18 ?
                0 :
                age <= 64 ?
                        1 :
                        2;
        int[][] priceTable = {
                {12, 18, 12},
                {15, 20, 15},
                {5, 12, 10}
        };
        
        System.out.println(priceTable[dayIndex][ageGroupIndex] + "$");
    }
}
