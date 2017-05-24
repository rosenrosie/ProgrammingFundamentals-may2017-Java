import java.util.Scanner;

/**
 * Created by todor on 24.05.2017 г..
 */
public class P03_EmployeeData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String employeeName = scan.nextLine();
        int employeeAge = Integer.parseInt(scan.nextLine());
        int employeeID = Integer.parseInt(scan.nextLine());
        double employeeSalary = Double.parseDouble(scan.nextLine());
    
        System.out.printf("Name: %s%n", employeeName);
        System.out.printf("Age: %d%n", employeeAge);
        System.out.printf("Employee ID: %08d%n", employeeID);
        System.out.printf("Salary: %.2f", employeeSalary);
    }
}
