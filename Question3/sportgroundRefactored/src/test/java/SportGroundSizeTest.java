import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.sportground.Impl.SportGroundSizeImpl;
import za.ac.cput.sportground.SportGroundSize;
import za.ac.cput.sportground.Config.AppConfig;

public class SportGroundSizeTest
{

    private SportGroundSize sport;

    private ApplicationContext cntx;

    @Before
    public void setUp() throws Exception {

        cntx = new AnnotationConfigApplicationContext(AppConfig.class);
        sport = (SportGroundSize) cntx.getBean("sport");
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

    @Test
    public void sportPerson() throws Exception
    {
        Assert.assertEquals("Bulelani", sport.sportPerson("Bulelani"));
    }
}
