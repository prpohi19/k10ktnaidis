import static org.junit.Assert.*;
import org.junit.Test;

public class Testid1{
    @Test
    public void testPrice(){
        Joo
    @Test
    public void testMass(){
        Jook mahl = new Jook("Mahl", 100, 1);
        Joogipudel jp = new Joogipudel(mahl, 500, Joogipudel.pudelityyp.plast, 50, 10);

		assertEquals(550.0, jp.getMass(), 0.001);
    }k mahl = new Jook("Mahl", 100, 1);
        Joogipudel jp = new Joogipudel(mahl, 500, Joogipudel.pudelityyp.plast, 50, 10);

		assertEquals(0.6, jp.getPrice(), 0.001);

    }

}
//javac -cp junit4.jar:. Testid1.java;
//java -cp junit4.jar:. org.junit.runner.JUnitCore Testid import org.junit.*;