package src;
import java.util.List;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class PolicyOwner extends Customer{
    private List<Dependent> dependents;
    private List<InsuranceCard> insuranceCards;
    

    PolicyOwner (){
        super();
        this.dependents = null;
    }

    PolicyOwner (String id, String name, String address, String phone, String email, List<Dependent> dependents){
        super(id, name, address, phone, email);
        this.dependents = dependents;
    }

    public List<Dependent> getDependents() { return dependents; }
    public void setDependents(List<Dependent> dependents) { this.dependents = dependents; }

}
