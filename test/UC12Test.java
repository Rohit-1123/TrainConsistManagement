import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC12Test {

    @Test
    void testSafety_AllBogiesValid() {
        List<UC12.GoodsBogie> bogies = Arrays.asList(
                new UC12.GoodsBogie("Cylindrical", "Petroleum"),
                new UC12.GoodsBogie("Box", "Coal")
        );

        assertTrue(UC12.isSafe(bogies));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<UC12.GoodsBogie> bogies = Arrays.asList(
                new UC12.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(UC12.isSafe(bogies));
    }

    @Test
    void testSafety_NonCylindricalAllowed() {
        List<UC12.GoodsBogie> bogies = Arrays.asList(
                new UC12.GoodsBogie("Box", "Coal"),
                new UC12.GoodsBogie("Open", "Grain")
        );

        assertTrue(UC12.isSafe(bogies));
    }

    @Test
    void testSafety_MixedWithViolation() {
        List<UC12.GoodsBogie> bogies = Arrays.asList(
                new UC12.GoodsBogie("Cylindrical", "Petroleum"),
                new UC12.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(UC12.isSafe(bogies));
    }

    @Test
    void testSafety_EmptyList() {
        List<UC12.GoodsBogie> bogies = new ArrayList<>();

        assertTrue(UC12.isSafe(bogies));
    }
}
