package krishan.saini;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import krishan.service.PurchaseCourse;

public class PurchaseCourseTest {
    @Test
    void testProceedWithCourse() {

        PurchaseCourse pc = new PurchaseCourse();
       boolean status =  pc.ProceedWithCourse(new JavaCourse());
           assertFalse(status ,"it is faild");
    }
}
