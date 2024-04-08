package src;
import java.util.ArrayList;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class Customer implements ClaimProcessManager{
    private String id;
    private String fullName;
    private InsuranceCard insuranceCard;
    private ArrayList<Claim> claims;
    private String role; // This is to note the role difference between Customer and PolicyHolder. Since the role of PolicyHolder and Dependent. We will use this to differentiate between them. For further update with more differences with the role, we will update the functionality later
    private ArrayList<Customer> dependents; // This is the only difference between Customer and PolicyHolder

    Customer(){
        this.id = "";
        this.fullName = "";
        this.insuranceCard = new InsuranceCard();
        this.claims = new ArrayList<Claim>();
        this.role = "Policy Holder";
        this.dependents = new ArrayList<Customer>();
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

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole(String newRole) { return this.role; }
    public void addDependent(Customer dependent) {
        this.dependents.add(dependent);
    }

    public void deleteDependent(String dependentId) {
        for (int i = 0; i < this.dependents.size(); i++) {
            if (this.dependents.get(i).getId().equals(dependentId)) {
                this.dependents.remove(i);
                break;
            }
        }
    }
}
