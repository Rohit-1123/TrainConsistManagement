import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UseCase15Test {

    // ✔ Safe Assignment Test
    @Test
    void testCargo_SafeAssignment() {
        UseCase15TrainConsistMgmnt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    // ✔ Unsafe Assignment Handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UseCase15TrainConsistMgmnt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // Should NOT assign cargo
        assertNull(bogie.getCargo());
    }

    // ✔ Cargo Not Assigned After Failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UseCase15TrainConsistMgmnt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    // ✔ Program Continues After Exception
    @Test
    void testCargo_ProgramContinuesAfterException() {
        UseCase15TrainConsistMgmnt.GoodsBogie bogie1 =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        UseCase15TrainConsistMgmnt.GoodsBogie bogie2 =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum"); // unsafe
        bogie2.assignCargo("Coal");      // safe

        assertEquals("Coal", bogie2.getCargo());
    }

    // ✔ Finally Block Execution (Indirect Check)
    @Test
    void testCargo_FinallyBlockExecution() {
        UseCase15TrainConsistMgmnt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmnt.GoodsBogie("Rectangular");

        // If no crash → finally executed
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}
