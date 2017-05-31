import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P04_PhotoGallery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String imageName = String.format("Name: DSC_%04d.jpg", Integer.parseInt(scan.nextLine()));
        int day = Integer.parseInt(scan.nextLine());
        int month = Integer.parseInt(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        String dateTaken = String.format("Date Taken: %02d/%02d/%d %02d:%02d", day, month, year, hours, minutes);
        double bytes = Double.parseDouble(scan.nextLine());
        int resolutionWidth = Integer.parseInt(scan.nextLine());
        int resolutionHeight = Integer.parseInt(scan.nextLine());
        
        System.out.println(imageName);
        System.out.println(dateTaken);
        String sizeName = "B";
        
        if (bytes > 1000) {
            bytes /= 1000;
            sizeName = "KB";
        }
        
        if (bytes > 1000) {
            bytes /= 1000;
            sizeName = "MB";
        }
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.printf("Size: %s%s%n", df.format(bytes), sizeName);
        
        if (resolutionHeight == resolutionWidth) {
            System.out.printf("Resolution: %sx%s (square)%n", resolutionWidth, resolutionHeight);
        }
        else if (resolutionHeight > resolutionWidth) {
            System.out.printf("Resolution: %sx%s (portrait)%n", resolutionWidth, resolutionHeight);
        }
        else {
            System.out.printf("Resolution: %sx%s (landscape)%n", resolutionWidth, resolutionHeight);
        }
    }
}
