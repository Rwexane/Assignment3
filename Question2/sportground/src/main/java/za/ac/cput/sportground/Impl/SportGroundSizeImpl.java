package za.ac.cput.sportground.Impl;

import java.lang.Math;
import za.ac.cput.sportground.*;

public class SportGroundSizeImpl implements SportGroundSize
{
    public double soccerField(double length, double width)
    {
        return length * width;
    }

    public double cricketGround(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }
}
