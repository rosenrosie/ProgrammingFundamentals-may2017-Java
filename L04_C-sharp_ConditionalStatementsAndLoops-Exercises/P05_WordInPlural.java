import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P05_WordInPlural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        boolean isEnding_y = word.endsWith("y");
        boolean isEnding_o_ch_s_sh_x_z = word.endsWith("o") ||
                word.endsWith("ch") ||
                word.endsWith("s") ||
                word.endsWith("sh") ||
                word.endsWith("x") ||
                word.endsWith("z");
                
        if (isEnding_y){
            word = word.substring(0, word.length()-1) + "ies";
        }
        else if (isEnding_o_ch_s_sh_x_z){
            word += "es";
        }
        else {
            word += "s";
        }
    
        System.out.println(word);
    }
}
