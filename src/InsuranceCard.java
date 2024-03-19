package src;
import java.util.Date;
/**
 * This class represents an insurance card,  used to identify a customer's insurance policy.
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class InsuranceCard {
    private String cardNumber;
    private String cardHolderName;
    private String policyOwnerName;
    private Date expirationDate;

    InsuranceCard (){
        this.cardNumber = "n/a";
        this.cardHolderName = "n/a";
        this.policyOwnerName = "n/a";
        this.expirationDate = new Date();
    }

    InsuranceCard (String cardNumber, String cardHolder, String policyOwner, Date expirationDate){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolder;
        this.policyOwnerName = policyOwner;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() { 
        return cardNumber; 
    }

    public void setCardNumber(String cardNumber) { 
        this.cardNumber = cardNumber; 
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
