package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    public void run(){
        boolean isRunning = true;

        System.out.println("\n============================================================");
        System.out.println("||   Welcome to the Insurance Claims Management System!   ||");
        System.out.println("============================================================");

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
                createNewClaim();
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

    public Claim createNewClaim(){
        System.out.println("You chose to add a new claim.");
        System.out.println("Please enter the following details:");
        System.out.print("Claim ID: ");
        String claimId = scanner.next();
        System.out.print("Claim Date: ");
        String claimDateStr = scanner.next();
        Date claimDate = null;
        try {
            // Assuming the date is in the format "dd-MM-yyyy"
            claimDate = new SimpleDateFormat("dd-MM-yyyy").parse(claimDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Insured Person's ID: ");
        String insuredPersonId = scanner.next();
        // Assuming you have a method to get a Dependent by ID
        // Dependent insuredPerson = getDependentById(insuredPersonId);
        // For now, let's create a new Dependent object
        Dependent insuredPerson = new Dependent();
        System.out.print("Card Number: ");
        String cardNumber = scanner.next();
        System.out.print("Exam Date: ");
        String examDateStr = scanner.next();
        Date examDate = null;
        try {
            // Assuming the date is in the format "dd-MM-yyyy"
            examDate = new SimpleDateFormat("dd-MM-yyyy").parse(examDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Claim Amount: ");
        float claimAmount = scanner.nextFloat();
        System.out.print("Status: ");
        String status = scanner.next();
        System.out.print("Receiver Banking Info: ");
        String receiverBankingInfo = scanner.next();
        // Assuming the documents list is empty for a new claim
        ArrayList<String> documents = new ArrayList<String>();
        Claim newClaim = new Claim();
        scanner.close();
        return newClaim;
    }

    public PolicyHolder createNewPolicyHolder(){
//        this.scanner = new Scanner(System.in);
//        System.out.println("You chose to add a new policy holder.");
//        System.out.println("Please enter the following details:");
//        scanner.close();
        // PolicyHolder policyHolder= new PolicyHolder();
        return new PolicyHolder();
    }

    public Dependent createNewDependent(){
//        this.scanner = new Scanner(System.in);
//        System.out.println("You chose to add a new dependent.");
//        System.out.println("Please enter the following details:");
//        System.out.print("Dependent ID: ");
//        String id = scanner.next();
//        System.out.print("Full Name: ");
//        String fullName = scanner.next();
//        System.out.print("Insurance Card: ");
//        InsuranceCard insuranceCard = createNewInsuranceCard();
//        Dependent newDependent = new Dependent(id, fullName, insuranceCard);
//        scanner.close();
        return new Dependent();
    }

    public InsuranceCard createNewInsuranceCard(){
//        this.scanner = new Scanner(System.in);
//        System.out.println("You chose to add a new insurance card.");
//        System.out.println("Please enter the following details:");
//        System.out.print("Card Number: ");
//        String cardNumber = scanner.next();
//        System.out.print("Card Holder: ");
//        String cardHolder = scanner.next();
//        System.out.print("Policy Owner: ");
//        String policyOwner = scanner.next();
//        System.out.print("Expiration Date: ");
//        String expirationDateStr = scanner.next();
//        Date expirationDate = null;
//        try {
//            // Assuming the date is in the format "dd-MM-yyyy"
//            expirationDate = new SimpleDateFormat("dd-MM-yyyy").parse(expirationDateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        InsuranceCard newInsuranceCard = new InsuranceCard(cardNumber, cardHolder, policyOwner, expirationDate);
//        scanner.close();
        return new InsuranceCard();
    }
} 