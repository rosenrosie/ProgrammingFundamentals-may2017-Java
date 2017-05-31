import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P01_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xSize = Integer.parseInt(scan.nextLine());
    
        int spacesAfterX = xSize - 2;
        for (int i = 0; i < xSize /2; i++, spacesAfterX -= 2)
        {
            System.out.println(stringRepeater(" ", i) +"x" + stringRepeater(" ", spacesAfterX) + "x");
        }
        System.out.println(stringRepeater(" ", xSize/2) + "x");
        spacesAfterX = 1;
        for (int i = xSize / 2; i > 0; i--, spacesAfterX += 2)
        {
            System.out.println(stringRepeater(" ", i-1) + "x" + stringRepeater(" ", spacesAfterX) + "x");
        }
    }
    
    static String stringRepeater (String stringToRepeat, int stringRepeatCount){
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }
}
