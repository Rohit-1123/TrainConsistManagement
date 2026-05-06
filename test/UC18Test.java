import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    // Linear search helper method
    private boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    @Test
    void testSearch_BogieFound() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(linearSearch(bogieIds, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertFalse(linearSearch(bogieIds, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(linearSearch(bogieIds, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(linearSearch(bogieIds, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {

        String[] bogieIds = {
                "BG101"
        };

        assertTrue(linearSearch(bogieIds, "BG101"));
    }
}
