package TestKata;

import org.junit.Assert;
import org.junit.Test;

public class helloTest {

    @Test
    public void helloShouldReturnTrue(){
        hello h = new hello();
        Assert.assertEquals(true,h.hello(true));
    }

}
