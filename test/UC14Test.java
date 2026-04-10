import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC14Test {

    @Test
    void testValidCapacityCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b = new UC14.PassengerBogie("Sleeper", 50);
        assertEquals(50, b.capacity);
    }

    @Test
    void testNegativeCapacityThrowsException() {
        Exception e = assertThrows(UC14.InvalidCapacityException.class, () -> {
            new UC14.PassengerBogie("AC", -10);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testZeroCapacityThrowsException() {
        assertThrows(UC14.InvalidCapacityException.class, () -> {
            new UC14.PassengerBogie("AC", 0);
        });
    }

    @Test
    void testObjectIntegrityAfterCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b = new UC14.PassengerBogie("First Class", 30);
        assertEquals("First Class", b.type);
        assertEquals(30, b.capacity);
    }

    @Test
    void testMultipleValidBogiesCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b1 = new UC14.PassengerBogie("Sleeper", 60);
        UC14.PassengerBogie b2 = new UC14.PassengerBogie("AC", 40);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}
