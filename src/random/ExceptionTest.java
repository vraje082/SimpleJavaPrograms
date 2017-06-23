package random;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vasanthan on 2017-06-20.
 */
public class ExceptionTest {

    private ExceptionExcercise exceptionExcercise;

    @Before
    public void setup() {
        exceptionExcercise = new ExceptionExcercise();
    }

    @Test
    public void test() throws Exception {
        assertEquals(1, exceptionExcercise.check("vasanth", 1));
    }

    @Test
    public void test1() {
        try {
            int a = exceptionExcercise.check("", 5);
             assertEquals(0, a);
        } catch (Exception e) {
            assertEquals("The string you are passing cannot be empty", e.getMessage());
        }
    }

    @Test
    public void test2() {
        try {
            int a = exceptionExcercise.check("vasanth", 0);
            assertEquals(0, a);
        } catch (Exception e) {
            assertEquals("Your input cannot be zero", e.getMessage());
        }
    }
}
