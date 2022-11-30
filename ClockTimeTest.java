

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime(11, 00, 00);
        clockTim2 = new ClockTime(11, 00, 00);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testClockTime()
    {
        clockTim1.equals(clockTim1, clockTim2);
    }

    @Test
    public void testOne()
    {
        ClockTime clockTim3 = new ClockTime(11, 00, 00);
        assertEquals("11:00:00", clockTim3.toString());
    }
}


