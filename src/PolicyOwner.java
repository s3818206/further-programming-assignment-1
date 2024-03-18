package src;
import java.util.ArrayList;

/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class PolicyOwner extends Customer{
    private ArrayList<Dependent> dependents;

    PolicyOwner (){
        super();
        this.dependents = null;
    }

    PolicyOwner(String id, String fullName, InsuranceCard insuranceCard, ArrayList<Claim> claims, ArrayList<Dependent> dependents){
        super(id, fullName, insuranceCard, claims);
        this.dependents = dependents;
    }

    public ArrayList<Dependent> getDependents() { return dependents; }


    public void updateClaim(String claimId, Claim claim) {
        
    }

    public void addDependent(Dependent dependent) {
        this.dependents.add(dependent);
    }

    public void removeDependent(Dependent dependent) {
        this.dependents.remove(dependent);
    }

    public void updateDependent(String dependentId, Dependent dependent) {
        for (int i = 0; i < this.dependents.size(); i++) {
            if (this.dependents.get(i).getId().equals(dependent.getId())) {
                this.dependents.set(i, dependent);
                break;
            }
        }
    }
    
}
