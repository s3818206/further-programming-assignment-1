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
                        this.dashboardMenu("customer");
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
                        this.dashboardMenu("insurance");
                        int insuranceDashboardChoice = scanner.nextInt();
                        switch(insuranceDashboardChoice) {
                            case 1:
                                this.addNewInsurance();
                                break;
                            case 2:
                                this.updateInsuranceDashboard();
                                break;
                            case 3:
                                this.viewInsuranceDashboard();
                                break;
                            case 4:
                                this.deleteInsuranceCard();
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
                    System.out.println("You chose to check the claim dashboard");
                    boolean isClaimDashboardRunning = true;
                    while(isClaimDashboardRunning){
                        this.dashboardMenu("claim");
                        int claimDashboardChoice = scanner.nextInt();
                        switch(claimDashboardChoice) {
                            case 1:
                                this.addNewClaim();
                                break;
                            case 2:
                                this.updateClaim();
                                break;
                            case 3:
                                this.viewClaimDashboard();
                                break;
                            case 4:
                                this.deleteClaim();
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

    private void dashboardMenu(String dashboardType){
        System.out.println("What do you want to do?");
        System.out.println("1. Create a new " + dashboardType);
        System.out.println("2. Update the + " + dashboardType + " information");
        System.out.println("3. View the " + dashboardType + " dashboard");
        System.out.println("4. Delete a " + dashboardType);
        System.out.println("5. Go back to the main menu");
        System.out.print("Please enter your choice from 1-5: ");
    }

    private String readStringInput(String prompt) {
        String input = null;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            input = scanner.nextLine().trim(); // Trim the input to remove leading/trailing spaces
            if (!input.isEmpty()) {
                validInput = true;
            } else {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        } while (!validInput);
        return input;
    }

    private Date readDateInput(String prompt) {
        Date date = null;
        boolean validInput = false;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        do {
            System.out.print(prompt + ": ");
            try {
                String input = scanner.nextLine(); // read the actual input
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty");
                }
                date = formatter.parse(input);
                validInput = true;
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter a date in the format dd-MM-yyyy.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Please try again.");
            }
        } while (!validInput);
        return date;
    }

    private float readFloatInput(String prompt) {
        float value = 0;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            try {
                value = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            }
        } while (!validInput);
        return value;
    }

    private Customer readValidCustomerInput(String prompt){
        Customer customer = null;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            String customerId = scanner.nextLine().trim();
            if (customerId.isEmpty()) {
                System.out.println("Error: Customer ID cannot be empty. Please try again.");
                continue;
            }

            for (Customer c : customers) {
                if (c.getId().equals(customerId)) {
                    customer = c;
                    validInput = true;
                    break;
                }
            }

            if (customer == null) {
                System.out.println("Error: Customer with ID " + customerId + " not found. Please try again.");
            } else {
                validInput = true;
            }
        } while (!validInput);
        return customer;
    }

    private String readValidBankInfo(String prompt){
        String bankInfo = null;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error: Bank information cannot be empty. Please try again.");
                continue;
            }

            String[] parts = input.split(" - ");

            if (parts.length != 3) {
                System.out.println("Error: Invalid bank information format. Please enter the bank name, receiver name, and account number separated by ' - '.");
            } else {
                bankInfo = input;
                validInput = true;
            }
        } while (!validInput);
        return bankInfo;
    }


    private InsuranceCard readValidInsuranceCard(String prompt){
        InsuranceCard insuranceCard = null;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            String cardNumber = scanner.nextLine().trim();
            if (cardNumber.isEmpty()) {
                System.out.println("Error: Card number cannot be empty. Please try again.");
                continue;
            }

            for (InsuranceCard card : insuranceCards) {
                if (card.getCardNumber().equals(cardNumber)) {
                    insuranceCard = card;
                    validInput = true;
                    break;
                }
            }

            if (insuranceCard == null) {
                System.out.println("Error: Insurance card with number " + cardNumber + " not found. Please try again.");
            } else {
                validInput = true;
            }
        } while (!validInput);
        return insuranceCard;
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

    private void viewCustomerDashboard() {
        // Check if there are any customers
        if (customers.isEmpty()) {
            System.out.println("No customers to display.");
            return;
        }

        // Print the header
        System.out.println("\nCustomer Dashboard:");
        System.out.println(String.format("%-15s %-15s %-15s", "Customer ID", "Customer Name", "Insurance Card Number"));

        // Iterate over the customers and print each one
        for (Customer customer : customers) {
            System.out.println(String.format("%-15s %-15s %-15s",
                    customer.getId(),
                    customer.getFullName(),
                    customer.getInsuranceCard().getCardNumber()));
        }
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
        System.out.println("You chose to add a new insurance. Please enter the insurance following details below");

        String insuranceId = String.format("i-%010d", insuranceCards.size() + 1); // Generate new insurance ID
        String insuranceName = readStringInput("Please enter the insurance name");
        String insuranceType = readStringInput("Please enter the insurance type");
        String insuranceDescription = readStringInput("Please enter the insurance description");

        InsuranceCard insuranceCard = new InsuranceCard();
        insuranceCard.setCardNumber(readStringInput("Please enter the insurance card number"));
        insuranceCard.setCardHolderName(readStringInput("Please enter the insurance card holder name"));
        insuranceCard.setPolicyOwnerName("RMIT");
        insuranceCard.setExpirationDate(readDateInput("Please enter the expiration date"));

        insuranceCards.add(insuranceCard);
        System.out.println("Insurance added successfully.");
    }

    private void viewInsuranceDashboard() {
        // Add code to display the insurance dashboard
    }
    
    private void updateInsuranceDashboard() { 
        // Add code to update an existing insurance s
    }

    private void deleteInsuranceCard() {
        String insuranceId = readStringInput("Please enter the insurance ID to delete");

        for (InsuranceCard insuranceCard : insuranceCards) {
            if (insuranceCard.getCardNumber().equals(insuranceId)) {
                insuranceCards.remove(insuranceCard);
                System.out.println("Insurance deleted successfully.");
                return;
            } else {
                System.out.println("Insurance not found. Please try again.");
            }
        }
    }

    private void addNewClaim() {
        System.out.println("You chose to add a new claim. Please enter the following details below");

        String claimId = String.format("f-%010d", claims.size() + 1); // Generate new claim ID
        Date claimDate = new Date();
        Customer customer = readValidCustomerInput("Please enter the customer ID");
        String insuranceCardNumber = readValidInsuranceCard("Please enter the insurance card number").getCardNumber();
        Date examDate = null;
        String inputDocuments = readStringInput("Please enter the documents following this format: ClaimId_CardNumber_Document_1.pdf,ClaimId_CardNumber_DocumentName_1.pdf");
        ArrayList<String> documents = new ArrayList<>(Arrays.asList(inputDocuments.split(",")));
        float claimAmount = readFloatInput("Please enter the claim amount");
        String status = "New";
        String receiverBankingInfo = readValidBankInfo("Please enter the receiver banking information following by format Bank - Name - Number");

        Claim claim = new Claim(claimId, claimDate, customer, insuranceCardNumber, examDate, documents, claimAmount, status, receiverBankingInfo);
        claims.add(claim);
        System.out.println("Claim added successfully.");
    }

    private void viewClaimDashboard() {
        // Check if there are any claims
        if (claims.isEmpty()) {
            System.out.println("No claims to display.");
            return;
        }

        // Print the header
        System.out.println("\nClaim Dashboard:");
        System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Claim ID", "Claim Date", "Customer", "Insurance Card", "Exam Date", "Documents", "Claim Amount", "Status", "Bank Info"));

        // Iterate over the claims and print each one
        for (Claim claim : claims) {
            System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s",
                    claim.getId(),
                    new SimpleDateFormat("dd-MM-yyyy").format(claim.getExamDate()),
                    claim.getCustomer(),
                    claim.getInsuranceCardNumber(),
                    new SimpleDateFormat("dd-MM-yyyy").format(claim.getExamDate()),
                    claim.getClaimAmount(),
                    claim.getStatus(),
                    claim.getReceiverBankingInfo()));
        }
    }

    private void updateClaim() {
        String claimId = readStringInput("Please enter the claim ID to update");
        for (Claim claim : claims){
            if (claim.getId().equals(claimId)){
                System.out.println("Please choose the criteria you want to update");
                System.out.println("1. Customer");
                System.out.println("2. Insurance Card");
                System.out.println("3. Document");
                System.out.println("4. Claim Amount");
                System.out.println("5. Status");
                System.out.println("6. Receiver Banking Info");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Customer customer = readValidCustomerInput("Please enter the customer ID");
                        claim.setCustomer(customer);
                        break;
                    case 2:
                        InsuranceCard insuranceCard = readValidInsuranceCard("Please enter the insurance card number");
                        claim.setInsuranceCardNumber(insuranceCard.getCardNumber());
                        break;
                    case 3:
                        String inputDocuments = readStringInput("Please enter the documents following this format: ClaimId_CardNumber_Document_1.pdf,ClaimId_CardNumber_DocumentName_1.pdf");
                        ArrayList<String> documents = new ArrayList<>(Arrays.asList(inputDocuments.split(",")));
                        claim.setDocuments(documents);
                        break;
                    case 4:
                        float claimAmount = readFloatInput("Please enter the claim amount");
                        claim.setClaimAmount(claimAmount);
                        break;
                    case 5:
                        String status = readStringInput("Please enter the status");
                        claim.setStatus(status);
                        break;
                    case 6:
                        String receiverBankingInfo = readValidBankInfo("Please enter the receiver banking information following by format Bank - Name - Number");
                        claim.setReceiverBankingInfo(receiverBankingInfo);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
                claim.setExamDate(new Date());
                System.out.println("Claim updated successfully.");
            }else {
                System.out.println("Claim not found. Please try again.");
            }
        }
    }

    private void deleteClaim() {
        String claimId = readStringInput("Please enter the claim ID to delete");

        for (Claim claim : claims) {
            if (claim.getId().equals(claimId)) {
                claims.remove(claim);
                System.out.println("Claim deleted successfully.");
                return;
            } else {
                System.out.println("Claim not found. Please try again.");
            }
        }
    }
}