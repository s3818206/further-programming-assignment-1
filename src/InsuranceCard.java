package src;
import java.util.Date;
/**
 * This class represents an insurance card,  used to identify a customer's insurance policy.
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class InsuranceCard {
    private String cardNumber; // 10-digit card number
    private String cardHolderName; // Name of the card holder
    private String policyOwnerName; // Name of the policy owner - Could be RMIT
    private Date expirationDate; // Expiration date of the card - must in the future

    InsuranceCard (){
        this.cardNumber = "n/a";
        this.cardHolderName = "n/a";
        this.policyOwnerName = "n/a";
        this.expirationDate = new Date();
    }

    public String getCardNumber() { 
        return cardNumber; 
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 10) {
            throw new IllegalArgumentException("Card number must be 10 digits");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    public String getCardHolderName() { 
        return this.cardHolderName; 
    }

    public void setCardHolderName(String cardHolder) { 
        this.cardHolderName = cardHolder; 
    }

    public String getPolicyOwnerName() { 
        return this.policyOwnerName; 
    }

    public void setPolicyOwnerName(String policyOwner) { 
        this.policyOwnerName = policyOwner; 
    }

    public Date getExpirationDate() { 
        return expirationDate; 
    }

    public void setExpirationDate(Date expirationDate) { 
        this.expirationDate = expirationDate; 
    }
}
