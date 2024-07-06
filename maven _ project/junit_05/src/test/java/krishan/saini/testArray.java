package krishan.saini;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
public class testArray {


    @Test
    void testArrays(){
       int [] expected = {2,4,6,8};

       int actal [] = {4,8,6,2};
         Arrays.sort(actal);

       assertArrayEquals(expected, actal);
    }
}
