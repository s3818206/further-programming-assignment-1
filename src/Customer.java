package src;
import java.util.List;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public abstract class Customer {
    private String id;
    private String fullName;
    private InsuranceCard insuranceCard;
    private List<Claim> claims;

    public  String getId() { return this.id; }

}
