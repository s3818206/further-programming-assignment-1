package src;
import java.util.ArrayList;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public interface ClaimProcessManager {
    void addClaim(Claim claim);
    void updateClaim(String claimId, Claim claim);
    void deleteClaim(String claimId);
    Claim getOne(String claimId);
    ArrayList<Claim> getAll();
}
