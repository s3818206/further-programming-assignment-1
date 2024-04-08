package src;
import java.util.Date;
import java.util.ArrayList;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */

public class Claim {
    private String id;
    private Date claimDate;
    private Customer customer;
    private String insuranceCardNumber;
    private Date examDate;
    private ArrayList<String> documents;
    private float claimAmount;
    private String status;  // New, Done, Process
    private String receiverBankingInfo;

    Claim (){
        this.id = "";
        this.claimDate = new Date();
        this.insuredPerson = new Customer();
        this.cardNumber = "";
        this.examDate = new Date();
        this.documents = null;
        this.claimAmount = 0;
        this.status = "";
        this.receiverBankingInfo = "";
    }

    public String getId() { 
        return this.id;
    }

    public void setId(String id){ 
        this.id = id;
    }
    
    public Date getDate() {
        return this.claimDate;
    }
    
    public void setDate(Date claimDate){ 
        this.claimDate = claimDate;
    }
    
    public String getInsuredPerson() { 
        return this.insuredPerson; 
    }
    
    public void setInsuredPerson(String insuredPerson) { 
        this.insuredPerson = insuredPerson;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public void setCardNumber(String cardNumber) { 
        this.cardNumber = cardNumber; 
    }
    
    public Date getExamDate() { 
        return examDate;
    }
    
    public void setExamDate(Date examDate) { 
        this.examDate = examDate; 
    }

    public void addDocument(){
        this.documents.add("Document");
    }

    public float getClaimAmount() { 
        return claimAmount; 
    }

    public void setClaimAmount(float claimAmount) { 
        this.claimAmount = claimAmount; 
    }

    public String getStatus() { 
        return status; 
    }

    public void setStatus(String status) { 
        this.status = status; 
    }

    public String getReceiverBankingInfo() { 
        return receiverBankingInfo; 
    }
    
    public void setReceiverBankingInfo(String receiverBankingInfo) { 
        this.receiverBankingInfo = receiverBankingInfo; 
    }
}