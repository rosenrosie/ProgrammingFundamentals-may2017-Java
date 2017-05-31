import java.util.Scanner;

/**
 * Created by todor on 31.05.2017 г..
 */
public class P04_Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nightCount = Integer.parseInt(scan.nextLine());
        
        double studioPrice = 0;
        double doublePrice = 0;
        double suitePrice = 0;
        
        // price per night
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                doublePrice = 65;
                suitePrice = 75;
                break;
            case "June":
            case "September":
                studioPrice = 60;
                doublePrice = 72;
                suitePrice = 82;
                break;
            case "July":
            case "August":
            case "December":
                studioPrice = 68;
                doublePrice = 77;
                suitePrice = 89;
        }
        
        studioPrice *= nightCount > 7 && (month.equals("September") || month.equals("October")) ?
                nightCount - 1 :
                nightCount;
        studioPrice = nightCount > 7 && (month.equals("May") || month.equals("October")) ?
                studioPrice - (studioPrice * 5 / 100) :
                studioPrice;
        doublePrice *= nightCount;
        doublePrice = nightCount > 14 && (month.equals("June") || month.equals("September")) ?
                doublePrice - (doublePrice * 10 / 100) :
                doublePrice;
        suitePrice *= nightCount;
        suitePrice = nightCount > 14 &&
                (month.equals("July") || month.equals("August") || month.equals("December")) ?
                suitePrice - (suitePrice * 15 / 100) :
                suitePrice;
        hotelPricesOutput("Studio", studioPrice);
        hotelPricesOutput("Double", doublePrice);
        hotelPricesOutput("Suite", suitePrice);
    }
    
    static void hotelPricesOutput(String roomType, double roomVisitationPrice){
        System.out.printf("%s: %.2f lv.%n", roomType, roomVisitationPrice);
    }
}
