import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P03_MilesToKilometers {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String scanNextLine = new Scanner(System.in).nextLine();
    
        double distanceInMiles = Double.parseDouble(scanNextLine);
        final double kilometersPerMile = 1.60934;
        double distanceInKilometers = distanceInMiles * kilometersPerMile;
    
        System.out.printf("%.2f", distanceInKilometers);
    }
}
