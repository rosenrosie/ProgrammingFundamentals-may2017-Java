import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P03_Megapixels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resolutionWidth = Integer.parseInt(scan.nextLine());
        int resolutionHeight = Integer.parseInt(scan.nextLine());
    
        double megapixels = resolutionWidth * resolutionHeight / 1000000.0;
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.printf("%dx%d => %sMP", resolutionWidth, resolutionHeight, df.format(megapixels));
    }
}
