import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.sportground.Impl.SportGroundSizeImpl;
import za.ac.cput.sportground.SportGroundSize;

public class SportGroundSizeTest
{

    private SportGroundSize sport;

    @Before
    public void setUp() throws Exception
    {
        sport = new SportGroundSizeImpl();

    }

    @Test
    public void crickerGround() throws Exception
    {
        Assert.assertEquals(2827.43, sport.cricketGround(30), 0.01);
    }

    @Test
    public void soccerField() throws Exception
    {
        Assert.assertEquals(240000, sport.soccerField(600, 400), 0.01);
    }
}
