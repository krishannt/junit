import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class shapesTest {
    shapes shape = new shapes();
    
    @Test
    void testTestComputeCircleArea() {
          assertEquals(78, shape.testComputeCircleArea(5));
    }

    @Test
    void testTestComputeSquareArea() {
 assertEquals(576, shape.testComputeSquareArea(24));
    }
}
