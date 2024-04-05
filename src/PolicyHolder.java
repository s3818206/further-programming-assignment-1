package src;
import java.util.ArrayList;

/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class PolicyHolder extends Customer{
    private ArrayList<Dependent> dependents;

    PolicyHolder (){
        super();
        this.dependents = null;
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
