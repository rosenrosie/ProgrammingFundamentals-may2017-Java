import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P04_BeverageLabels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int volume = Integer.parseInt(scan.nextLine());
        int energyPer100ml = Integer.parseInt(scan.nextLine());
        int sugarPer100ml = Integer.parseInt(scan.nextLine());
    
        BigDecimal totalEnergy = new BigDecimal(String.valueOf(energyPer100ml / 100.0 * volume));
        BigDecimal totalSugar = new BigDecimal(String.valueOf(sugarPer100ml * volume / 100.0));
    
        System.out.printf("%dml %s:%n", volume, product);
        System.out.printf("%skcal, %sg sugars", customRound(totalEnergy), customRound(totalSugar));
    }
    
    /**
     *
     * @param number BigDecimal number
     * @return String value of BigDecimal number rounded like C# double (data type) without trailing zeroes
     */
    static String customRound(BigDecimal number){
        String numberString = number.setScale(12,BigDecimal.ROUND_HALF_UP).toString();
        int index = 15 - numberString.indexOf('.');
        number = new BigDecimal(numberString).setScale(index,BigDecimal.ROUND_HALF_UP)
                .setScale(12, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        double numDouble = Double.parseDouble(number.toString());
        boolean remainder = numDouble % 1 == 0;
        return remainder ? String.format("%.0f", numDouble) : number.toString();
    }
}
