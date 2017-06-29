package BinarySearchKata;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void binSearchShouldReturnOneElementInArrayWithOneElement(){
        BinarySearch bs = new BinarySearch();

        Assert.assertEquals(0, bs.chop(1, new int[1]));
}

}
