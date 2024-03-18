package src;
import java.util.ArrayList;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public abstract class Customer implements ClaimProcessManager{
    private String id;
    private String fullName;
    private InsuranceCard insuranceCard;
    private ArrayList<Claim> claims;

    Customer(){
        this.id = "";
        this.fullName = "";
        this.insuranceCard = new InsuranceCard();
        this.claims = null;
    }

    Customer(String id, String fullName, InsuranceCard insuranceCard, ArrayList<Claim> claims){
        this.id = id;
        this.fullName = fullName;
        this.insuranceCard = insuranceCard;
        this.claims = claims;
    }

    public String getId() { 
        return this.id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }

    public String getFullName() { 
        return this.fullName; 
    }

    public void setFullName(String fullName) { 
        this.fullName = fullName; 
    }

    public InsuranceCard getInsuranceCard() { 
        return this.insuranceCard; 
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) { 
        this.insuranceCard = insuranceCard; 
    }

    public void addClaim(Claim claim) {
        this.claims.add(claim);
    }

    public void updateClaim(String claimId, Claim claim) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claim.getId())) {
                this.claims.set(i, claim);
                break;
            }
        }
    }

    public void deleteClaim(String claimID) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claimID)) {
                this.claims.remove(i);
                break;
            }
        }
    }

    public Claim getOne(String claimId) {
        for (int i = 0; i < this.claims.size(); i++) {
            if (this.claims.get(i).getId().equals(claimId)) {
                return this.claims.get(i);
            }
        }
        return null;
    }

    public ArrayList<Claim> getAll() {
        return this.claims;
    }

}
