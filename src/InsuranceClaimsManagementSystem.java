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
    private HashMap<String, Claim> claims;
    private HashMap<String, PolicyHolder> policyHolders;
    private HashMap<String, Dependent> dependents;
    private HashMap<String, InsuranceCard> insuranceCards;
    private ArrayList<Customer> customers;



    public void run(){
        boolean isRunning = true;
        this.scanner = new Scanner(System.in);

        System.out.println("\n============================================================");
        System.out.println("||   Welcome to the Insurance Claims Management System!   ||");
        System.out.println("============================================================");

        // this.displayMainMenu();
        System.out.println("\nHow can I help you today");


         while(isRunning){
             System.out.println("\nMain Menu:");
             System.out.println("1. View my Customer Dashboard");
             System.out.println("2. View my Insurance Dashboard");
             System.out.println("3. Check my Claim Dashboard");
             System.out.println("4. Exit");
             System.out.print("Please enter your choice from 1-4: ");
             int choice = scanner.nextInt();
             switch(choice) {
                 case 1:
                     System.out.println("You chose to check the customer dashboard.");
                     System.out.println("Here is the list of current customer we are having");
//                     this.displayCustomerList();
                     System.out.println("Do you want to process anything in this dashboard(Y/N)");
                     String process = scanner.next();
                     if (process.equals("Y")) {
                         System.out.println("What do you want to do?");
                         System.out.println("1. Add a new customer");
                         System.out.println("2. Update customer information");
                         System.out.println("3. Delete a customer");
                         System.out.println("4. Exit");
                         String customerProcessChoice = scanner.next();
                         switch (customerProcessChoice) {
                             case "1":
                                 System.out.println("You chose to add a new customer. Please enter the details below");
                                 System.out.println("Please enter the customer name");
                                 String customerName = scanner.next();

                                 break;
                             case "2":
                                    System.out.println("You chose to update customer information.");
                                    System.out.println("Please enter the customer ID: ");
                                    break;
                             case "3":
                                 System.out.println("You chose to delete a customer.");
                                 System.out.println("Please enter the customer ID: ");

                                 break;
                             case "4":
                                 System.out.println("Exiting the system. Thank you!");
                                 break;
                             default:
                                 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                         }
                     } else {
                            System.out.println("Do you want to check another dashboard (Y/N)");
                            String checkAnotherDashboard = scanner.next();
                            if (checkAnotherDashboard.equals("N")) {
                                isRunning = false;
                                System.out.println("Exiting the system. Thank you!");
                            } else if (checkAnotherDashboard.equals("Y"){
                                continue;
                            }
                     }
                     break;
                 case 2:
                     System.out.println("You chose to check the insurance dashboard.");
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

    public static void importFile(){
        try {
            File file = new File("data/Customer.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" \\| ");

                String id = parts[0].trim();
                String fullName = parts[1].trim();
                String insuranceCard = parts[2].trim();
                String claims = parts[3].trim().replace(" |", "");
                String dependents = ""; // Default value

                if (parts.length >= 5) {
                    dependents = parts[4].trim(); // This will not throw an exception now
                    if (dependents == null || dependents.isEmpty()) {
                        continue;
                    }
                }

                System.out.println(id);
                System.out.println(fullName);
                System.out.println(insuranceCard);
                System.out.println(claims);
                if (dependents != null && !dependents.isEmpty()) {
                    System.out.println(dependents);
                }

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        importFile();
    }
}