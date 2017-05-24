import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P05_CharacterStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String characterName = scan.nextLine();
        int characterHealth = Integer.parseInt(scan.nextLine());
        int maxHealth = Integer.parseInt(scan.nextLine());
        int characterEnergy = Integer.parseInt(scan.nextLine());
        int maxEnergy = Integer.parseInt(scan.nextLine());
    
        String healthBar = buildStatBar(characterHealth, maxHealth);
        String energyBar = buildStatBar(characterEnergy, maxEnergy);
        System.out.printf("Name: %s%n", characterName);
        System.out.printf("Health: %s%n", healthBar);
        System.out.printf("Energy: %s%n", energyBar);
    }
    
    public static String buildStatBar(int statValue, int barMaxValue)
    {
        String statBar = "|" + stringRepeater("|", statValue) + stringRepeater(".", barMaxValue - statValue) + "|";
        return statBar;
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
