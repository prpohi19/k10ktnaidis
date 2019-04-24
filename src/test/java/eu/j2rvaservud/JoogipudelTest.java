package eu.j2rvaservud;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import eu.j2rvaservud.Joogipudel.Tyyp;

public class JoogipudelTest 
{
    @Test
    public void testHind()
    {
        Jook jook = new Jook("Test", 100, 2.0f);
        Joogipudel joogipudel = new Joogipudel(Tyyp.PLAST, 1.0f, 20.0f, 10);
        joogipudel.setJook(jook);
        assertEquals(110, joogipudel.getHind());
    }

    @Test
    public void testTotalMass()
    {
        Jook jook = new Jook("Test", 100, 2.0f);
        Joogipudel joogipudel = new Joogipudel(Tyyp.PLAST, 1.0f, 20.0f, 10);
        joogipudel.setJook(jook);
        assertEquals(2020.0f, joogipudel.getTotalMass(), 0.00001f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullMass()
    {
        new Joogipudel(Tyyp.PLAST, 1.0f, 0.0f, 10);
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMass()
    {
        new Joogipudel(Tyyp.PLAST, 1.0f, -4.0f, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullMaht()
    {
        new Joogipudel(Tyyp.PLAST, 0.0f, 10.0f, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeMaht()
    {
        new Joogipudel(Tyyp.PLAST, -2.0f, 10.0f, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrice()
    {
        new Joogipudel(Tyyp.PLAST, 5.0f, 10.0f, -1);
    }
}
