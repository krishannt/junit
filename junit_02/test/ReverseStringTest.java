import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testReverseString() {
        ReverseString re = new ReverseString();
        assertEquals("avaj", re.reverseString("java"));
        assertEquals("inias", re.reverseString("saini"));
    }
}
 