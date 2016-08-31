package rus.stqa.qatest.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by alena on 31.08.16.
 */
public class PointTest {
    @Test
    public void testAreaa () {
        Point zl = new Point(4.0, 4.0, 4.0, 9.0);
        Assert.assertEquals(zl.area(), 5.0);


    }
}
