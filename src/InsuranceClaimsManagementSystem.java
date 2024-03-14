package src;
import java.util.Scanner;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class InsuranceClaimsManagementSystem {
    private Scanner scanner;

    public InsuranceClaimsManagementSystem() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean isRunning = true;
        System.out.println("Welcome to the Insurance Claims Management System!");
        while(isRunning){
            this.displayMainMenu();
        }
    }

    private void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Add a new claim");
        System.out.println("2. Update an existing claim");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
}
