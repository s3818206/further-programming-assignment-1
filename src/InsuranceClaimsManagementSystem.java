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
    private ArrayList<Claim> claims;
    private ArrayList<InsuranceCard> insuranceCards;
    private ArrayList<Customer> customers;

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
                            case 1:
                                this.addNewCustomer();
                                break;
                            case 2:
                                this.updateCustomerDashboard();
                                break;
                            case 3:
                                this.viewCustomerDashboard();
                                break;
                            case 4:
                                this.deleteCustomer();
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
                    while(isInsuranceDashboardRunning){
                        System.out.println("What do you want to do?");
                        System.out.println("1. Create a new insurance");
                        System.out.println("2. Update insurance information");
                        System.out.println("3. View the insurance dashboard");
                        System.out.println("4. Delete an insurance");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Please enter your choice from 1-5: ");
                        int insuranceDashboardChoice = scanner.nextInt();
                        switch(insuranceDashboardChoice) {
                            case 1:
                                System.out.println("You chose to add a new insurance. Please enter the insurance following details below");
                                System.out.println("Please enter the insurance ID");
                                String insuranceId = scanner.next();
                                System.out.println("Please enter the insurance name");
                                String insuranceName = scanner.next();
                                System.out.println("Please enter the insurance type");
                                String insuranceType = scanner.next();
                                System.out.println("Please enter the insurance description");
                                String insuranceDescription = scanner.next();
                                break;
                            case 2:
                                System.out.println("You chose to update the insurance information.");
                                System.out.println("Please enter the insurance ID to update: ");
                                String insuranceIdToUpdate = scanner.next();
                                break;
                            case 3:
                                System.out.println("You chose to view the insurance dashboard.");
                                // Show the insurance dashboard
                                break;
                            case 4:
                                System.out.println("You chose to delete an insurance.");
                                System.out.println("Please enter the insurance ID to delete: ");
                                String insuranceIdToDelete = scanner.next();

                                break;
                            case 5:
                                System.out.println("Going back to the main menu");
                                isInsuranceDashboardRunning = false;
                                break;
                            default:
                        }
                    }
                    break;
                case 3:
                    System.out.println("You chose to view all claims.");
                    boolean isClaimDashboardRunning = true;
                    while(isClaimDashboardRunning){
                        System.out.println("What do you want to do?");
                        System.out.println("1. Create a new claim");
                        System.out.println("2. Update the claim information");
                        System.out.println("3. View the claim dashboard");
                        System.out.println("4. Delete a claim");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Please enter your choice from 1-5: ");
                        int claimDashboardChoice = scanner.nextInt();
                        switch(claimDashboardChoice) {
                            case 1:
                                System.out.println("You chose to add a new claim. Please enter the claim following details below");
                                System.out.println("Please enter the claim ID");
                                String claimId = scanner.next();
                                System.out.println("Please enter the claim amount");
                                double claimAmount = scanner.nextDouble();
                                System.out.println("Please enter the claim date (dd/MM/yyyy)");
                                String claimDate = scanner.next();
                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                                Date date = null;
                                try {
                                    date = formatter.parse(claimDate);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Please enter the claim description");
                                String claimDescription = scanner.next();
                                break;
                            case 2:
                                System.out.println("You chose to update the claim information.");
                                System.out.println("Please enter the claim ID to update: ");
                                String claimIdToUpdate = scanner.next();
                                break;
                            case 3:
                                System.out.println("You chose to view the claim dashboard.");
                                // Show the claim dashboard
                                break;
                            case 4:
                                System.out.println("You chose to delete a claim.");
                                System.out.println("Please enter the claim ID to delete: ");
                                String claimIdToDelete = scanner.next();
                                break;
                            case 5:
                                System.out.println("Going back to the main menu");
                                isClaimDashboardRunning = false;
                                break;
                            default:
                        }
                    }
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
                }else{

                }

                Customer customer = new Customer();
                customer.setId(inputId);
                customer.setFullName(inputFullName);
                customer.setInsuranceCard(new InsuranceCard());
//                customer.addClaim();

                customers.add(customer);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File file = new File("data/Claim.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        try {
            File file = new File("data/Insurance.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }

    private void addNewCustomer(){
        System.out.println("You chose to add a new customer. Please enter the customer following details below");
        String customerId = String.format("c-%07d", customers.size() + 1); // Generate new customer ID
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
    }

    private void viewCustomerDashboard(){
        System.out.println("You chose to view the customer dashboard.");
    
        // Show the customer dashboard
    }

    private void updateCustomerDashboard(){
        System.out.println("You chose to update the customer information.");
        System.out.println("Please enter the customer ID to update: ");
        String customerId = scanner.next();
    }

    private void deleteCustomer(){
        System.out.println("You chose to delete a customer.");
        System.out.println("Please enter the customer ID to delete: ");
        String customerId = scanner.next();
    }

    // Add these methods to your InsuranceClaimsManagementSystem class

    private void addNewInsurance() {
        // Add code to create a new insurance and add it to the insuranceCards list
    }

    private void viewInsuranceDashboard() {
        // Add code to display the insurance dashboard
    }
    
    private void updateInsuranceDashboard() { 
        // Add code to update an existing insurance s
    }

    private void deleteInsurance() {
        // Add code to delete an insurance from the insuranceCards list
    }

    private void addNewClaim() {
        // Add code to create a new claim and add it to the claims list
    }

    private void viewClaimDashboard() {
        // Add code to display the claim dashboard
    }

    private void updateClaimDashboard() {
        // Add code to update an existing claim
    }

    private void deleteClaim() {
        // Add code to delete a claim from the claims list
    }

// Add this to your main method
public static void main(String[] args) {
    InsuranceClaimsManagementSystem system = new InsuranceClaimsManagementSystem();
    system.run();
}



    public void main(String[] args) {


    }
}