import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    
    ReverseString re = new ReverseString();
    @Test
    void testReverseString_OneWord() {


        assertEquals("avaj", re.reverseString("java"));
    }
    @Test 
    void testReverseString_MultWord() {


        

        assertEquals("ysae si avaj", re.reverseString("java is easy"));
    }
}
