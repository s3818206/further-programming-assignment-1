package src;
import java.util.Date;
import java.util.List;
/**
 * @author <Pham Hoang Duong - S3818206>
 */
public class Claim {
    private String id;
    private Date claimDate;
    private Dependent insuredPerson;
    private String cardNumber;
    private Date examDate;
    private List<String> documents;
    private float claimAmount;
    private String status;
    private String receiverBankingInfo;

    Claim(String id, Date claimDate, Dependent insuredPerson, String cardNumber, Date examDate, List<String> documents, float claimAmount, String status, String receiverBankingInfo){
        this.id = id;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankingInfo = receiverBankingInfo;
    }
    public String getId() { return this.id;}
    public void setId(String id){ this.id = id;}
    public Date getDate() {return this.claimDate;}
    public void setDate(Date claimDate){ this.claimDate = claimDate;}
    public Dependent getInsuredPerson() { return this.insuredPerson; }
    public void setInsuredPerson(Dependent insuredPerson) { this.insuredPerson = insuredPerson; }
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public Date getExamDate() { return examDate;}
    public void setExamDate(Date examDate) { this.examDate = examDate; }
    public float getClaimAmount() { return claimAmount; }
    public void setClaimAmount(float claimAmount) { this.claimAmount = claimAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getReceiverBankingInfo() { return receiverBankingInfo; }
    public void setReceiverBankingInfo(String receiverBankingInfo) { this.receiverBankingInfo = receiverBankingInfo; }
}