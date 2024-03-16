package src;
import java.util.Date;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class InsuranceCard {
    private String cardNumber;
    private Dependent cardHolder;
    private PolicyOwner policyOwner;
    private Date expirationDate;

    InsuranceCard (){
        this.cardNumber = "";
        this.cardHolder = new Dependent();
        this.policyOwner = new PolicyOwner();
        this.expirationDate = new Date();
    }

    InsuranceCard (String cardNumber, Dependent cardHolder, PolicyOwner policyOwner, Date expirationDate){
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.policyOwner = policyOwner;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public Dependent getCardHolder() { return cardHolder; }
    public void setCardHolder(Dependent cardHolder) { this.cardHolder = cardHolder; }
    public PolicyOwner getPolicyOwner() { return policyOwner; }
    public void setPolicyOwner(PolicyOwner policyOwner) { this.policyOwner = policyOwner; }
    public Date getExpirationDate() { return expirationDate; }
    public void setExpirationDate(Date expirationDate) { this.expirationDate = expirationDate; }
}
