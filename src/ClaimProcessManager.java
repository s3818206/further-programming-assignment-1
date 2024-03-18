package src;
import java.util.ArrayList;

/**
 * This interface defines the operations for managing insurance claims.
 * @author Pham Hoang Duong - S3818206
 * @version 1.0
 */

public interface ClaimProcessManager {
    /**
     * Adds a new claim to the system.
     * @param claim The claim to be added.
     */
    void addClaim(Claim claim);

    /**
     * Updates an existing claim in the system.
     * @param claimId The ID of the claim to be updated.
     * @param claim The updated claim.
     */
    void updateClaim(String claimId, Claim claim);

    /**
     * Deletes a claim from the system.
     * @param claimId The ID of the claim to be deleted.
     */
    void deleteClaim(String claimId);

    /**
     * Retrieves a single claim from the system.
     * @param claimId The ID of the claim to be retrieved.
     * @return The claim with the given ID.
     */
    Claim getOne(String claimId);

    /**
     * Retrieves all claims from the system.
     * @return A list of all claims.
     */
    ArrayList<Claim> getAll();
}