package rus.stqa.qatest.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by alena on 31.08.16.
 */
public class SquareTests {

    @Test
    public void testArea () {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
