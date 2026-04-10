import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC11Test {

    @Test
    void testValidTrainID() {
        assertTrue(UC11.isValidTrainID("TRN-1234"));
    }

    @Test
    void testInvalidTrainID() {
        assertFalse(UC11.isValidTrainID("TRAIN12"));
        assertFalse(UC11.isValidTrainID("TRN12A"));
    }

    @Test
    void testValidCargoCode() {
        assertTrue(UC11.isValidCargoCode("PET-AB"));
    }

    @Test
    void testInvalidCargoCode() {
        assertFalse(UC11.isValidCargoCode("PET-ab"));
        assertFalse(UC11.isValidCargoCode("PET123"));
    }

    @Test
    void testDigitLengthValidation() {
        assertFalse(UC11.isValidTrainID("TRN-123"));
        assertFalse(UC11.isValidTrainID("TRN-12345"));
    }

    @Test
    void testEmptyInput() {
        assertFalse(UC11.isValidTrainID(""));
        assertFalse(UC11.isValidCargoCode(""));
    }
}
