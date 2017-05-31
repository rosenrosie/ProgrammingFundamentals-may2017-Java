import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P14_MagicLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startChar = scan.nextLine().charAt(0);
        char endChar = scan.nextLine().charAt(0);
        char invalidChar = scan.nextLine().charAt(0);
    
        for (char i = startChar; i <= endChar; i++)
        {
            if (i == invalidChar)
            {
                continue;
            }
            for (char j = startChar; j <= endChar; j++)
            {
                if (j == invalidChar)
                {
                    continue;
                }
                for (char k = startChar; k <= endChar; k++)
                {
                    if (k == invalidChar)
                    {
                        continue;
                    }
                    System.out.print("" + i + j + k + " ");
                }
            }
        }
    }
}
