import java.util.Scanner;

/**
 * Created by todor on 1.06.2017 г..
 */
public class P07_TrainingHallEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int itemsCount = Integer.parseInt(scan.nextLine());
        double subtotal = 0;
        for (int i = 0; i < itemsCount; i++) {
            String productName = scan.nextLine();
            double productPrice = Double.parseDouble(scan.nextLine());
            int productCount = Integer.parseInt(scan.nextLine());
            
            productName += productCount > 1 ? "s" : "";
            
            System.out.printf("Adding %d %s to cart.%n", productCount, productName);
            subtotal += (productPrice * productCount);
        }
        
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        
        System.out.println(
                budget >= subtotal ?
                        String.format("Money left: $%.2f%n", budget - subtotal) :
                        String.format("Not enough. We need $%.2f more.%n", subtotal - budget)
        );
    }
}
