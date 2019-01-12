package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends Main {

    @Test
    public void sumTest() {
        int x = gcd(6, 4);
        Assert.assertEquals(x,2);
    }
}
