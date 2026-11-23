import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AverageTest {

    Average avg = new Average();

    @Test
    public void testWholeNumbers() {
        double[] nums = {10, 20, 30, 40};
        assertEquals(25.0, avg.findAverage(nums), 0.001);
    }

    @Test
    public void testOneNumber() {
        double[] nums = {7};
        assertEquals(7.0, avg.findAverage(nums), 0.001);
    }

    @Test
    public void testDecimals() {
        double[] nums = {1.5, 2.5, 3.5};
        assertEquals(2.5, avg.findAverage(nums), 0.001);
    }

    @Test
    public void testNegativeNumbers() {
        double[] nums = {-5, 5, -10, 10};
        assertEquals(0.0, avg.findAverage(nums), 0.001);
    }
}
