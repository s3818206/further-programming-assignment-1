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
        File claimFile = new File("./../data/claims.txt");
        File insuranceCardFile = new File("./../data/insuranceCards.txt");
        File dependentFile = new File("./../data/dependents.txt");
        File policyHolderFile = new File("./../data/policyHolders.txt");

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
        System.out.println("\n============================================================");
        System.out.println("||   Welcome to the Insurance Claims Management System!   ||");
        System.out.println("============================================================\n");

        // this.displayMainMenu();
        System.out.println("\nMain Menu:");
        System.out.println("1. Add a new claim");
        System.out.println("2. Update an existing claim");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        // while(isRunning){
        //     // Add code here to handle the user's menu choice
        // }
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                // Add code here to add a new claim
                System.out.println("You chose to add a new claim.");
                System.out.println("Please enter the following details:");
                System.out.print("Claim ID: ");
                String claimId = scanner.next();
                System.out.print("Date of accident: ");
                String dateOfAccident = scanner.next();
                System.out.print("Location of accident: ");
                String locationOfAccident = scanner.next();
                System.out.print("Description of accident: ");
                String descriptionOfAccident = scanner.next();
                System.out.print("Claimant's ID: ");
                String claimantId = scanner.next();
                System.out.print("Policy holder's ID: ");
                String policyHolderId = scanner.next();
                System.out.print("Insurance card ID: ");
                String insuranceCardId = scanner.next();
                System.out.print("Amount claimed: ");
                double amountClaimed = scanner.nextDouble();
                System.out.print("Status: ");
                String status = scanner.next();
                Claim newClaim = new Claim(claimId, dateOfAccident, locationOfAccident, descriptionOfAccident, claimantId, policyHolderId, insuranceCardId, amountClaimed, status);
                claimList.add(newClaim);
                break;
            case 2:
                // Add code here to update an existing claim
                System.out.println("You chose to update an existing claim.");
                break;
            case 3:
                isRunning = false;
                System.out.println("Exiting the system. Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }
} 