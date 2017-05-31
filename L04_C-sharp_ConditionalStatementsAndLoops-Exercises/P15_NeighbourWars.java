import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P15_NeighbourWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peshosRoundhouseKickDamage = Integer.parseInt(scan.nextLine());
        int goshosThunderousFistDamage = Integer.parseInt(scan.nextLine());
        
        int peshosHealth = 100;
        int goshosHealth = 100;
        boolean isPeshoAlive = true;
        boolean isGoshoAlive = true;
        
        int roundsCount = 0;
        
        while (isPeshoAlive && isGoshoAlive) {
            roundsCount++;
            
            if (roundsCount % 2 == 1) {// Pesho attacks
                goshosHealth -= peshosRoundhouseKickDamage;
                if (goshosHealth <= 0) {
                    isGoshoAlive = false;
                    continue;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", goshosHealth);
            }
            else {
                peshosHealth -= goshosThunderousFistDamage;
                if (peshosHealth <= 0) {
                    isPeshoAlive = false;
                    continue;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", peshosHealth);
            }
            
            if (roundsCount % 3 == 0) {
                peshosHealth += 10;
                goshosHealth += 10;
            }
        }
        
        if (isPeshoAlive) {
            System.out.printf("Pesho won in %dth round.%n", roundsCount);
        }
        else {
            System.out.printf("Gosho won in %dth round.", roundsCount);
        }
    }
}
