package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class represents the main entry point for the Insurance Claims Management System.
 * It provides a text-based user interface for managing insurance claims.
 * 
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */
public class InsuranceClaimsManagementSystem {
    private Scanner scanner;
    private ArrayList<Claim> claimList;
    private ArrayList<InsuranceCard> insuranceCardList;
    private ArrayList<Dependent> dependentList;
    private ArrayList<PolicyOwner> policyHolderList;

    /**
     * Constructs a new InsuranceClaimsManagementSystem.
     * Initializes the scanner and the lists for claims, insurance cards, dependents, and policy holders.
     */
    public InsuranceClaimsManagementSystem() {
        this.scanner = new Scanner(System.in);
        // Initialize the lists here
        File claimFile = new File("/../data/claims.txt");
        File insuranceCardFile = new File("/../data/insuranceCards.txt");
        File dependentFile = new File("/../data/dependents.txt");
        File policyHolderFile = new File("/../data/policyHolders.txt");

        try {
            Scanner claimScanner = new Scanner(claimFile);
            Scanner insuranceCardScanner = new Scanner(insuranceCardFile);
            Scanner dependentScanner = new Scanner(dependentFile);
            Scanner policyHolderScanner = new Scanner(policyHolderFile);

            while (claimScanner.hasNextLine()) {
                String data = claimScanner.nextLine();
                
            }
            claimScanner.close();

            while (insuranceCardScanner.hasNextLine()) {
                String data = insuranceCardScanner.nextLine();
                
            }
            insuranceCardScanner.close();

            while (dependentScanner.hasNextLine()) {
                String data = dependentScanner.nextLine();

            }
            dependentScanner.close();

            while (policyHolderScanner.hasNextLine()) {
                String data = policyHolderScanner.nextLine();

            }
            policyHolderScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    /**
     * Starts the Insurance Claims Management System.
     * Displays a welcome message and the main menu in a loop until the user chooses to exit.
     */
    public void start() {
        boolean isRunning = true;
        System.out.println("\n==================================================");
        System.out.println("||   Welcome to the Insurance Claims Management System!   ||");
        System.out.println("==================================================\n");

        while(isRunning){
            this.displayMainMenu();
            // Add code here to handle the user's menu choice
        }
    }

    /**
     * Displays the main menu of the Insurance Claims Management System.
     * The menu includes options to add a new claim, update an existing claim, and exit the system.
     */

    private void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Add a new claim");
        System.out.println("2. Update an existing claim");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }
} p 