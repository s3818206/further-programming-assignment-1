package src;
import java.util.ArrayList;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public class Dependent extends Customer{
//    private Dependent dependent;
    Dependent(){
        super();
    }

    Dependent(String id, String fullName, InsuranceCard insuranceCard, ArrayList<Claim> claims){
        super(id, fullName, insuranceCard, claims);
//        this.dependent = dependent;
    }
}
