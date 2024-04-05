package src;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the main entry point for the Insurance Claims Management System.
 * It provides a text-based user interface for managing insurance claims.
 * 
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */
public class InsuranceClaimsManagementSystem {
    private Scanner scanner;
    private ArrayList claims;
    private ArrayList policyHolders;
    private ArrayList dependents;
    private ArrayList insuranceCards;
    private ArrayList customers;

    InsuranceClaimsManagementSystem(){
        this.importFile(); // Import data from the file to the arrayList above
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        boolean isRunning = true;

        System.out.println("\n============================================================");
        System.out.println("||   Welcome to the Insurance Claims Management System!   ||");
        System.out.println("============================================================");

        System.out.println("\nHow can I help you today");

        while(isRunning){
            System.out.println("\nMain Menu:");
            System.out.println("1. Check the Customer Dashboard");
            System.out.println("2. Check the Insurance Dashboard");
            System.out.println("3. Check the Claim Dashboard");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice from 1-4: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("You chose to check the customer dashboard.");
                    boolean isCustomerDashboardRunning = true;
                    while(isCustomerDashboardRunning){
                        System.out.println("What do you want to do?");
                        System.out.println("1. Create a new customer");
                        System.out.println("2. Update customer information");
                        System.out.println("3. View the customer dashboard");
                        System.out.println("4. Delete a customer");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Please enter your choice from 1-5: ");
                        int customerDashboardChoice = scanner.nextInt();
                        switch(customerDashboardChoice) {
//                            Create a new customer
                            case 1:
                                System.out.println("You chose to add a new customer. Please enter the customer following details below");
                                System.out.println("Please enter the customer name");
                                String customerName = scanner.next();
                                System.out.println("Please enter the insurance card number");
                                String insuranceCardNumber = scanner.next();
                                System.out.println("Please enter the insurance card holder name");
                                String insuranceCardHolderName = scanner.next();
                                System.out.println("Does this customer have any dependents? (Y/N)");
                                String hasDependents = scanner.next();
                                if(hasDependents.equals("Y")) {
                                    System.out.println("Insert the dependent id");
                                } else if(hasDependents.equals("N")) {
                                    // Create a new policy holder
                                }else {
                                    System.out.println("Invalid input. Please enter Y or N");
                                }
                                break;
//                                Update Customer Information
                            case 2:
                                System.out.println("You chose to update customer information.");
                                System.out.println("Please enter the customer ID to update: ");
                                String customerId = scanner.next();
                                break;
                            case 3:
                                System.out.println("You chose to view the customer dashboard.");
                                // Show the customer dashboard
                                break;
                            case 4:
                                System.out.println("You chose to delete a customer.");
                                System.out.println("Please enter the customer ID to update: ");

                                break;
                            case 5:
                                System.out.println("Going back to the main menu");
                                isCustomerDashboardRunning = false;
                                break;
                            default:
                        }
                    }
                    break;
                case 2:
                    System.out.println("You chose to check the insurance dashboard.");
                    boolean isInsuranceDashboardRunning = true;
                    break;
                case 3:
                    System.out.println("You chose to view all claims.");
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                     System.out.println("Invalid choice. Please enter a number between 1 and 4.");
             }
         }
         scanner.close();
    }

    public void importFile(){
//        Import Customer data
        try {
            File file = new File("data/Customer.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" \\| ");

                String inputId = parts[0].trim();
                String inputFullName = parts[1].trim();
                String inputInsuranceCard = parts[2].trim();
                String inputClaims = parts[3].trim().replace(" |", "");
                String inputDependents = ""; // Default value

                if (parts.length >= 5) {
                    inputDependents = parts[4].trim(); // This will not throw an exception now
                }

                if (inputDependents != null && !inputDependents.isEmpty()) {

                    PolicyHolder policyHolder = new PolicyHolder();
                    policyHolder.setId(inputId);
                    policyHolder.setFullName(inputFullName);
                    policyHolders.add(policyHolder);
                }else{
                    Dependent dependent = new Dependent();
                    dependents.add(dependent);
                }

                // Create a new customer object
                // Add the customer object to the customers list


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void manageCustomer(){

    }

    public void main(String[] args) {


    }
}