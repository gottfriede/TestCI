import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestBall
{
    private Ball ball1 = null;
    private Ball ball2 = null;
    
    @Before
    public void setUp() throws Exception
    {
        ball1 = new Ball(5);
        ball2 = new Ball(1);
    }
    
    @After
    public void tearDown() throws Exception
    {
        ball1 = null;
        ball2 = null;
    }
    
    @Test
    public void TestGetVolume()
    {
        Assert.assertEquals(ball2.getVolume(), 4.0/3.0 * Math.PI, 1e-7);
    }
}
