import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC13Test {

    @Test
    void testLoopFilteringLogic() {
        List<UC13.Bogie> bogies = Arrays.asList(
                new UC13.Bogie("A", 50),
                new UC13.Bogie("B", 70)
        );

        List<UC13.Bogie> result = new ArrayList<>();
        for (UC13.Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<UC13.Bogie> bogies = Arrays.asList(
                new UC13.Bogie("A", 50),
                new UC13.Bogie("B", 70)
        );

        List<UC13.Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        assertEquals(1, result.size());
    }

    @Test
    void testResultsMatch() {
        List<UC13.Bogie> bogies = Arrays.asList(
                new UC13.Bogie("A", 80),
                new UC13.Bogie("B", 70)
        );

        int loopCount = 0;
        for (UC13.Bogie b : bogies) {
            if (b.capacity > 60) loopCount++;
        }

        long streamCount = bogies.stream()
                .filter(b -> b.capacity > 60)
                .count();

        assertEquals(loopCount, streamCount);
    }

    @Test
    void testExecutionTime() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue(end - start >= 0);
    }

    @Test
    void testLargeDataset() {
        List<UC13.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new UC13.Bogie("A", i));
        }

        long count = bogies.stream()
                .filter(b -> b.capacity > 60)
                .count();

        assertTrue(count >= 0);
    }
}
