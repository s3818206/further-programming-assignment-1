package src;
import java.util.Date;
import java.util.ArrayList;

/**
 * This class represents a Claim in the insurance system.
 * A Claim contains the following information:
 * - id (with the format f-numbers; 10 numbers)
 * - Claim date
 * - Insured person
 * - Card number
 * - Exam date
 * - List of documents (with the format ClaimId_CardNumber_DocumentName.pdf)
 * - Claim amount
 * - Status (New, Processing, Done)
 * - Receiver Banking Info (Bank – Name – Number)
 *
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */
public class Claim {
    /**
     * The id of the claim, formatted as 'f' followed by 10 numbers.
     */
    private String id;
    /**
     * The date the claim was made.
     */
    private Date claimDate;

    /**
     * The customer who made the claim.
     */
    private Customer customer;

    /**
     * The insurance card number associated with the claim.
     */
    private String insuranceCardNumber;

    /**
     * The date of the medical exam associated with the claim.
     */
    private Date examDate;

    /**
     * A list of documents associated with the claim. Each document is named in the format ClaimId_CardNumber_DocumentName.pdf.
     */
    private ArrayList<String> documents;

    /**
     * The amount being claimed.
     */
    private float claimAmount;

    /**
     * The status of the claim. Can be 'New', 'Processing', or 'Done'.
     */
    private String status;

    /**
     * The banking information for the receiver of the claim payout. Formatted as 'Bank – Name – Number'.
     */
    private String receiverBankingInfo;

    /**
     * Constructor for the Claim class.
     * Initializes the id, claimDate, customer, insuranceCardNumber, examDate, documents, claimAmount, status, and receiverBankingInfo.
     */
    Claim (){
        this.id = "";
        this.claimDate = new Date();
        this.customer = new Customer();
        this.insuranceCardNumber = "";
        this.examDate = new Date();
        this.documents = new ArrayList<String>();
        this.claimAmount = 0;
        this.status = "";
        this.receiverBankingInfo = "";
    }

    Claim(String id, Date claimDate, Customer customer, String insuranceCardNumber, Date examDate, ArrayList<String> documents, float claimAmount, String status, String receiverBankingInfo){
        this.id = id;
        this.claimDate = claimDate;
        this.customer = customer;
        this.insuranceCardNumber = insuranceCardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankingInfo = receiverBankingInfo;
    }

    /**
     * Returns the id of the claim.
     * @return A string representing the claim's id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the id of the claim.
     * @param id A string containing the new id of the claim.
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * Returns the claim date.
     * @return A Date object representing the claim date.
     */
    public Date getDate() {
        return this.claimDate;
    }

    /**
     * Sets the claim date.
     * @param claimDate A Date object containing the new claim date.
     */
    public void setDate(Date claimDate){
        this.claimDate = claimDate;
    }

    /**
     * Returns the customer of the claim.
     * @return A Customer object representing the customer.
     */
    public Customer getCustomer() {
        return this.customer;
    }

    /**
     * Sets the customer of the claim.
     * @param customer A Customer object containing the new customer.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Returns the insurance card number of the claim.
     * @return A string representing the insurance card number.
     */
    public String getInsuranceCardNumber() {
        return this.insuranceCardNumber;
    }

    /**
     * Sets the insurance card number of the claim.
     * @param insuranceCardNumber A string containing the new insurance card number.
     */
    public void setInsuranceCardNumber(String insuranceCardNumber) {
        this.insuranceCardNumber = insuranceCardNumber;
    }

    /**
     * Returns the exam date of the claim.
     * @return A Date object representing the exam date.
     */
    public Date getExamDate() {
        return this.examDate;
    }

    /**
     * Sets the exam date of the claim.
     * @param examDate A Date object containing the new exam date.
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    /**
     * Adds a document to the claim's documents.
     */
    public void addDocument(String document){
        this.documents.add(document);
    }

    /**
     * set the whole documents with new list of documents
     * @param documents A list of documents to be set to the claim.
     */
    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }
    /**
     * Returns the claim amount of the claim.
     * @return A float representing the claim amount.
     */
    public float getClaimAmount() {
        return this.claimAmount;
    }

    /**
     * Sets the claim amount of the claim.
     * @param claimAmount A float containing the new claim amount.
     */
    public void setClaimAmount(float claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * Returns the status of the claim.
     * @return A string representing the status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the status of the claim.
     * @param status A string containing the new status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns the receiver banking info of the claim.
     * @return A string representing the receiver banking info.
     */
    public String getReceiverBankingInfo() {
        return this.receiverBankingInfo;
    }

    /**
     * Sets the receiver banking info of the claim.
     * @param receiverBankingInfo A string containing the new receiver banking info.
     */
    public void setReceiverBankingInfo(String receiverBankingInfo) {
        this.receiverBankingInfo = receiverBankingInfo;
    }
}