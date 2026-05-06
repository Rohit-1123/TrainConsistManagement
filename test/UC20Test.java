import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    // Search helper method with validation
    private boolean searchBogie(String[] bogieIds, String searchId) {

        // Fail-fast validation
        if (bogieIds.length == 0) {

            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        // Linear search logic
        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {

        String[] bogieIds = {};

        assertThrows(IllegalStateException.class, () -> {
            searchBogie(bogieIds, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {

        String[] bogieIds = {
                "BG101",
                "BG205"
        };

        assertDoesNotThrow(() -> {
            searchBogie(bogieIds, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        assertTrue(searchBogie(bogieIds, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        assertFalse(searchBogie(bogieIds, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {

        String[] bogieIds = {
                "BG101"
        };

        assertTrue(searchBogie(bogieIds, "BG101"));
    }
}
