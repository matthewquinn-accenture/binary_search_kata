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

        Assert.assertEquals(0, bs.binSearch(1, new int[]{1}));
}

    @Test
    public void binSearchShouldReturnIndexNegativeOneInEmptyArray(){

        Assert.assertEquals(-1, bs.binSearch(-1, new int[]{}));
    }

    @Test
    public void binSearchShouldReturnIndexNegativeOneWhenNumberSearchIsNotInArray(){

        Assert.assertEquals(-1, bs.binSearch(2, new int[]{1}));
    }

    @Test
    public void binSearchShouldReturnIndexOneWhenArrayHasThreeElement(){

        Assert.assertEquals(1, bs.binSearch(2, new int[]{1,2,3}));
    }

    @Test
    public void binSearchShouldReturnIndexTwoWhenArrayHasThreeElement(){

        Assert.assertEquals(2, bs.binSearch(3, new int[]{1,2,3}));
    }
}
