import java.util.Scanner;

/**
 * Created by todor on 25.05.2017 г..
 */
public class P03_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
    
        minutes += 30;
        while (minutes >= 60)
        {
            minutes -= 60;
            hours++;
        }
    
        while (hours >= 24)
        {
            hours -= 24;
        }
    
        System.out.printf("%d:%02d", hours, minutes);
    }
}
