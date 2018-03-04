package za.ac.cput.datastructures.Impl;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.datastructures.Datastructures;

public class DatastructuresImplTest
{
    @Test
    public void testMyCars() throws Exception
    {
        Datastructures list = new DatastructuresImpl();
        Assert.assertEquals("Audi A4", list.myCars().get(0));
    }

    @Test
    public void testSetOfNumbers() throws Exception
    {
        Datastructures set = new DatastructuresImpl();
        Assert.assertEquals(6, set.setOfNumbers().size());
        Assert.assertTrue(set.setOfNumbers().contains(10));
    }

    @Test
    public void testMyBooks() throws Exception
    {
        Datastructures map = new DatastructuresImpl();

        Assert.assertEquals(6,map.setOfNumbers().size());
        Assert.assertTrue(map.setOfNumbers().contains(10));

        Assert.assertEquals("C#", map.myBooks().get("3"));
    }
}