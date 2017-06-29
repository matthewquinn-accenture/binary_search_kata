package Test;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void helloShouldReturnTrue(){
        Hello h = new Hello();
        Assert.assertEquals(true,h.hello(true));
    }

}
