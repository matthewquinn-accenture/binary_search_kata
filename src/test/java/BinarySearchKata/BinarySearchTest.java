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
    public void binSearchShouldReturnIndexZeroWhenArrayHasOneElement(){

        Assert.assertEquals(0, bs.binSearch(1, new int[]{1}));
}

    @Test
    public void binSearchShouldReturnNegativeOneWhenArrayIsEmpty(){

        Assert.assertEquals(-1, bs.binSearch(-1, new int[]{}));
    }

    @Test
    public void binSearchShouldReturnNegativeOneWhenNumberSearchIsNotInArray(){

        Assert.assertEquals(-1, bs.binSearch(2, new int[]{1}));
    }

    @Test
    public void binSearchShouldReturnIndexOneWhenNumberSearchIsTwoInAnArrayWithThreeElements(){

        Assert.assertEquals(1, bs.binSearch(2, new int[]{1,2,3}));
    }

    @Test
    public void binSearchShouldReturnIndexTwoWhenNumberSearchIsThreeInAnArrayWithThreeElements(){

        Assert.assertEquals(2, bs.binSearch(3, new int[]{1,2,3}));
    }

    @Test
    public void binSearchShouldReturnIndexFiveWhenNumberSearchIsSixInAnArrayWithSixElements(){

        Assert.assertEquals(5, bs.binSearch(6,new int[]{1,2,3,4,5,6,7}));
    }

    @Test
    public void binSearchShouldReturnIndexTwoWhenNumberSearchIs30InAnArrayWithThreeDoubleDigitElements(){

        Assert.assertEquals(2, bs.binSearch(30, new int[]{10,20,30}));
    }
}
