import static org.junit.Assert.*;
import org.junit.Test;

public class Testid1{
    @Test
    public void testPrice(){
        Jook pepsi = new Jook("Pepsi", 80, 1.5);
        Joogipudel jp = new Joogipudel(pepsi, 500, Joogipudel.pudelityyp.plast, 50, 10);

        assertEquals(1.8f, jp.getPrice(), 0.01);
    }

    @Test
    public void testMass(){
        Jook pepsi = new Jook("Pepsi", 80, 1.5);
        Joogipudel jp = new Joogipudel(pepsi, 500, Joogipudel.pudelityyp.plast, 50, 10);

        assertEquals(1.8f, jp.getMass(), 0.01);
    }
}

// javac -cp junit4.jar:. Testid1.java
// java -cp junit4.jar:. org.junit.runner.JUnitCore Testid1