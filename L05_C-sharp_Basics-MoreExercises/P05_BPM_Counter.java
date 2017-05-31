import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 1.06.2017 г..
 */
public class P05_BPM_Counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double beatsPerMinute = Double.parseDouble(scan.nextLine());
        int beatsCount = Integer.parseInt(scan.nextLine());
        double bars = beatsCount / 4.0;
        int durationInSeconds = (int)((beatsCount / beatsPerMinute) * 60);
        int durationMinutes = durationInSeconds / 60;
        durationInSeconds %= 60;
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.printf("%s bars - %dm %ss", df.format(bars), durationMinutes, durationInSeconds);
    }
}
