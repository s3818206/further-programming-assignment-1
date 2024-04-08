package src;
import java.util.Date;

/**
 * This class represents an insurance card, used to identify a customer's insurance policy.
 * Each card has a 10-digit card number, the name of the card holder, the name of the policy owner, and an expiration date.
 * The card number must be 10 digits long.
 * The expiration date must be in the future.
 *
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */
public class InsuranceCard {
    private String cardNumber; // 10-digit card number
    private String cardHolderName; // Name of the card holder
    private String policyOwnerName; // Name of the policy owner - Could be RMIT
    private Date expirationDate; // Expiration date of the card - must in the future

    /**
     * Constructor for the InsuranceCard class.
     * Initializes the cardNumber, cardHolderName, policyOwnerName, and expirationDate.
     */
    InsuranceCard (){
        this.cardNumber = "n/a";
        this.cardHolderName = "n/a";
        this.policyOwnerName = "n/a";
        this.expirationDate = new Date();
    }

    /**
     * Returns the card number of the insurance card.
     * @return A string representing the card number.
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the card number of the insurance card.
     * The card number must be 10 digits long.
     * @param cardNumber A string containing the new card number.
     * @throws IllegalArgumentException if the card number is not 10 digits long.
     */
    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 10) {
            throw new IllegalArgumentException("Card number must be 10 digits");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    /**
     * Returns the card holder's name of the insurance card.
     * @return A string representing the card holder's name.
     */
    public String getCardHolderName() {
        return this.cardHolderName;
    }

    /**
     * Sets the card holder's name of the insurance card.
     * @param cardHolder A string containing the new card holder's name.
     */
    public void setCardHolderName(String cardHolder) {
        this.cardHolderName = cardHolder;
    }

    /**
     * Returns the policy owner's name of the insurance card.
     * @return A string representing the policy owner's name.
     */
    public String getPolicyOwnerName() {
        return this.policyOwnerName;
    }

    /**
     * Sets the policy owner's name of the insurance card.
     * @param policyOwner A string containing the new policy owner's name.
     */
    public void setPolicyOwnerName(String policyOwner) {
        this.policyOwnerName = policyOwner;
    }

    /**
     * Returns the expiration date of the insurance card.
     * @return A Date object representing the expiration date.
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date of the insurance card.
     * The expiration date must be in the future.
     * @param expirationDate A Date object containing the new expiration date.
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}