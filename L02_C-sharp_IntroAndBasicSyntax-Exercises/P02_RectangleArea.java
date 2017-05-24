import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P02_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rectangleSideA = Double.parseDouble(scan.nextLine());
        double rectangleSideB = Double.parseDouble(scan.nextLine());
        double rectangleArea = rectangleSideA * rectangleSideB;
    
        System.out.printf("%.2f", rectangleArea);
    }
}
