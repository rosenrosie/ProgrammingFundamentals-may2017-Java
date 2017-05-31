import java.util.Scanner;

/**
 * Created by todor on 30.05.2017 г..
 */
public class P03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int personsCount = Integer.parseInt(scan.nextLine());
        String serviceRequired = scan.nextLine();
        
        if (personsCount < 0 || 122 < personsCount) {
            System.out.println("We do not have an appropriate hall.");
            return;
        }
        
        int discountPercent = 0;
        int servicePrice = 0;
        switch (serviceRequired) {
            case "Normal":
                discountPercent = 5;
                servicePrice = 500;
                break;
            case "Gold":
                discountPercent = 10;
                servicePrice = 750;
                break;
            case "Platinum":
                discountPercent = 15;
                servicePrice = 1000;
        }
        
        String hallType = "";
        double hallPrice = 0;
        double pricePerPerson = 0;
        if (personsCount <= 50) {
            hallType = "Small Hall";
            hallPrice = 2500;
            pricePerPerson = getPricePerPerson(personsCount, discountPercent, hallPrice, servicePrice);
        }
        else if (personsCount <= 100){
            hallType = "Terrace";
            hallPrice = 5000;
            pricePerPerson = getPricePerPerson(personsCount, discountPercent, hallPrice, servicePrice);
        }
        else {
            hallType = "Great Hall";
            hallPrice = 7500;
            pricePerPerson = getPricePerPerson(personsCount, discountPercent, hallPrice, servicePrice);
        }
    
        System.out.printf("We can offer you the %s%n", hallType);
        System.out.printf("The price per person is %.2f$", pricePerPerson);
    }
    
    static double getPricePerPerson (int personsCount, int discountPercent, double hallPrice, int servicePrice){
        double priceWithoutDiscount = hallPrice + servicePrice;
        return (priceWithoutDiscount - (priceWithoutDiscount * discountPercent / 100)) / personsCount;
    }
}
