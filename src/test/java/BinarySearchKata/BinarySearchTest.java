package BinarySearchKata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private BinarySearch bs;

    @Before
    public void setUp(){
        bs = new BinarySearch();
    }

    @Test
    public void binSearchShouldReturnIndexZeroInArrayWithOneElement(){

        int [] myArray = {1};

        Assert.assertEquals(0, bs.binSearch(1, myArray));
}

    @Test
    public void binSearchShouldReturnIndexNegativeOneInEmptyArray(){

        int[] myArray = {};

        Assert.assertEquals(-1, bs.binSearch(-1, myArray));
    }

    @Test
    public void binSearchShouldReturnIndexNegativeOneWhenNumberSearchIsNotInArray(){

        int [] myArray = {1};

        Assert.assertEquals(-1, bs.binSearch(2, myArray));
    }

}
