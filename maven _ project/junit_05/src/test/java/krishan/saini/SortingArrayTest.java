package krishan.saini;

import org.junit.jupiter.api.Test;

public class SortingArrayTest {
	@Test
	void testSortingArrays() {

        SortingArray array =new SortingArray();
        int unsorted []  = {2,1,7,4,8,5};
       int sorted [] =  array.SortingArrays(unsorted);

       for(int ele :sorted){
        System.out.println(ele);
       }

	}
}
