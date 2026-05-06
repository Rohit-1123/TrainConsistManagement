import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        String[] expected = {
                "AC Chair",
                "First Class",
                "General",
                "Luxury",
                "Sleeper"
        };

        Arrays.sort(bogieNames);

        assertArrayEquals(expected, bogieNames);
    }

    @Test
    void testSort_UnsortedInput() {

        String[] bogieNames = {
                "Luxury",
                "General",
                "Sleeper",
                "AC Chair"
        };

        String[] expected = {
                "AC Chair",
                "General",
                "Luxury",
                "Sleeper"
        };

        Arrays.sort(bogieNames);

        assertArrayEquals(expected, bogieNames);
    }

    @Test
    void testSort_AlreadySortedArray() {

        String[] bogieNames = {
                "AC Chair",
                "First Class",
                "General"
        };

        String[] expected = {
                "AC Chair",
                "First Class",
                "General"
        };

        Arrays.sort(bogieNames);

        assertArrayEquals(expected, bogieNames);
    }

    @Test
    void testSort_DuplicateBogieNames() {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "Sleeper",
                "General"
        };

        String[] expected = {
                "AC Chair",
                "General",
                "Sleeper",
                "Sleeper"
        };

        Arrays.sort(bogieNames);

        assertArrayEquals(expected, bogieNames);
    }

    @Test
    void testSort_SingleElementArray() {

        String[] bogieNames = {
                "Sleeper"
        };

        String[] expected = {
                "Sleeper"
        };

        Arrays.sort(bogieNames);

        assertArrayEquals(expected, bogieNames);
    }
}
