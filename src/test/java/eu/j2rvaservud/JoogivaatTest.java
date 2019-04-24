package eu.j2rvaservud;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eu.j2rvaservud.Joogipudel.Tyyp;

public class JoogivaatTest 
{
    @Test
    public void testHasEnoughDrink()
    {
        Jook jook = new Jook("Test", 100, 2.0f);
        Joogipudel joogipudel = new Joogipudel(Tyyp.PLAST, 1.0f, 20.0f, 10);
        Joogivaat vaat = new Joogivaat(jook, 1.0f);
        assertTrue(vaat.täidaJoogipudel(joogipudel));
    }

    @Test
    public void testNotEnoughDrink()
    {
        Jook jook = new Jook("Test", 100, 2.0f);
        Joogipudel joogipudel = new Joogipudel(Tyyp.PLAST, 1.0f, 20.0f, 10);
        Joogivaat vaat = new Joogivaat(jook, 0.9f);
        assertFalse(vaat.täidaJoogipudel(joogipudel));
    }
}
