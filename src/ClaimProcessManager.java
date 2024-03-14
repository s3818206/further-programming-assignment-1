package src;
import java.util.List;
/**
 * @author <Pham Hoang Duong - S3818206>
 * @version 1.0
 */
public interface ClaimProcessManager {
    void addClaim(Claim claim);
    void updateClaim(Claim claim);
    void deleteClaim(String claimId);
    Claim getOne(String claimId);
    List<Claim> getAll();
}
