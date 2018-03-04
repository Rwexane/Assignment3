package za.ac.cput.sportground.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import za.ac.cput.sportground.Impl.SportGroundSizeImpl;
import za.ac.cput.sportground.SportGroundSize;

public class AppConfig
{
    @Bean(name="sport")
    public SportGroundSize getSportGroundSize()
    {
        return new SportGroundSizeImpl();
    }
}
