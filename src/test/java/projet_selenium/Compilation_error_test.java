import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Compilation_error_test {
    
    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        assertEquals(5, result);
    }
    
    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 2;
        int result = a - b;
        assertEquals(3, result);
    }
}
