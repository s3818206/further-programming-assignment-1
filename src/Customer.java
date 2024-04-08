package src;
import java.util.ArrayList;
/**
 * Represents a customer in the insurance system.
 * Implements ClaimProcessManager interface.
 * This class holds information about a customer, including their ID with with the format c-numbers with 7 numbers, full name, insurance card details,
 * claims, role, and dependents.
 *
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */
public class Customer implements ClaimProcessManager{
    private String id; // The unique identifier for the customer
    private String fullName; // The full name of the customer
    private InsuranceCard insuranceCard; // The insurance card associated with the customer
    private ArrayList<Claim> claims; // The list of claims made by the customer
    private String role; // The role of the customer, differentiating between PolicyHolder and Dependent
    private ArrayList<Customer> dependents; // The list of dependents associated with this customer

    /**
     * Constructs a new Customer object with default values.
     * Initializes ID, full name, insurance card, claims, role, and dependents.
     */
    Customer(){
        this.id = "";
        this.fullName = "";
        this.insuranceCard = new InsuranceCard();
        this.claims = new ArrayList<Claim>();
        this.role = "Policy Holder";
        this.dependents = new ArrayList<Customer>();
    }

    /**
     * Retrieves the ID of the customer.
     * @return The ID of the customer
     */
    public String getId() { 
        return this.id; 
    }


    /**
     * Sets the ID of the customer.
     * @param id The ID to set
     */
    public void setId(String id) {
        this.id = id; 
    }

    /**
     * Retrieves the full name of the customer.
     * @return The full name of the customer
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Sets the full name of the customer.
     * @param fullName The full name to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves the insurance card of the customer.
     * @return The insurance card of the customer
     */
    public InsuranceCard getInsuranceCard() {
        return this.insuranceCard;
    }

    /**
     * Sets the insurance card of the customer.
     * @param insuranceCard The insurance card to set
     */
    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    /**
     * Adds a claim to the list of claims made by the customer.
     * @param claim The claim to add
     */
    public void addClaim(Claim claim) {
        this.claims.add(claim);
    }

    /**
     * Updates a claim in the list of claims made by the customer.
     * @param claimId The ID of the claim to update
     * @param claim The updated claim
     */
    public void updateClaim(String claimId, Claim claim) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claim.getId())) {
                this.claims.set(i, claim);
                break;
            }
        }
    }

    /**
     * Deletes a claim from the list of claims made by the customer.
     * @param claimID The ID of the claim to delete
     */
    public void deleteClaim(String claimID) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claimID)) {
                this.claims.remove(i);
                break;
            }
        }
    }

    /**
     * Retrieves a specific claim by its ID from the list of claims made by the customer.
     * @param claimId The ID of the claim to retrieve
     * @return The claim object if found, otherwise null
     */
    public Claim getOne(String claimId) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claimId)) {
                return this.claims.get(i);
            }
        }
        return null;
    }

    /**
     * Retrieves all claims made by the customer.
     * @return The list of all claims made by the customer
     */
    public ArrayList<Claim> getAll() {
        return this.claims;
    }

    /**
     * Retrieves a string representation of all claims made by the customer.
     * @return A string representing all claims made by the customer
     */
    public String getAllClaimsToString() {
        String result = "";
        if (!claims.isEmpty()) {
            for (Claim claim : this.claims) {
                result += claim.getId() + ",";
            }
            return result;
        } else {
            return result;
        }
    }

    /**
     * Sets the role of the customer.
     * @param role The role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Retrieves the role of the customer.
     * @param newRole The new role to set
     * @return The role of the customer
     */
    public String getRole(String newRole) {
        return this.role;
    }

    /**
     * Adds a dependent to the list of dependents associated with the customer.
     * @param dependent The dependent to add
     */
    public void addDependent(Customer dependent) {
        this.dependents.add(dependent);
    }

    /**
     * Deletes a dependent from the list of dependents associated with the customer.
     * @param dependentId The ID of the dependent to delete
     */
    public void deleteDependent(String dependentId) {
        for (int i = 0; i < this.dependents.size(); i++) {
            if (this.dependents.get(i).getId().equals(dependentId)) {
                this.dependents.remove(i);
                break;
            }
        }
    }

    /**
     * Retrieves a string representation of all dependents associated with the customer.
     * @return A string representing all dependents associated with the customer
     */
    public String getAllDependentToString() {
        String result = "";
        if (dependents.size() > 0) {
            for (Customer dependent : this.dependents) {
                result += dependent.getId() + ",";
            }
            return result;
        } else {
            return result;
        }
    }

    /**
     * Prints customer information including ID, full name, insurance card number,
     * all claims, and all dependents.
     */
    public void getCustomer() {
        System.out.println(this.id + " | " + this.fullName + " | " + this.insuranceCard.getCardNumber()
                + " | " + this.getAllClaimsToString() + " | " + this.getAllDependentToString());
    }
}
