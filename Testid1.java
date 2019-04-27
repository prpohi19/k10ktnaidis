import static org.junit.Assert.*;
import org.junit.Test;

public class Testid1{
    @Test
    public void testPrice(){
		// Nimi, hind(sentides), erikaal(kg)
        Jook mahl = new Jook("Mahl", 100, 1);
		//jook, maht(grammides), tyyp, mass(grammides), taara hind(sentides)
        Joogipudel jp = new Joogipudel(mahl, 500, Joogipudel.pudelityyp.plast, 50, 10);
		//hind = (taara_hind/100)+maht/1000*jook.hind/100;

        //assertEquals(1.4f, jp.getPrice(), 0.001);
		assertEquals(0.6, jp.getPrice(), 0.001);
		
    }

    @Test
    public void testMass(){
        Jook mahl = new Jook("Mahl", 100, 1);
        Joogipudel jp = new Joogipudel(mahl, 500, Joogipudel.pudelityyp.plast, 50, 10);
		//mass += maht*jook.erikaal;

        //assertEquals(1.5f, jp.getMass(), 0.001);
		assertEquals(550.0, jp.getMass(), 0.001);
    }
}

/*output:
JUnit version 4.8.2
..
Time: 0.031

OK (2 tests)

*/

/*
[darikre@greeny ktnaidis]$ javac -Xlint -cp junit4.jar:. *.java
[darikre@greeny ktnaidis]$ javac -cp junit4.jar:. Testid1.java
[darikre@greeny ktnaidis]$ java -cp junit4.jar:. org.junit.runner.JUnitCore Testid1*/



