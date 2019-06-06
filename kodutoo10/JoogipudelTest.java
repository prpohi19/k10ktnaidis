import org.junit.*;
import static org.junit.Assert.*;

public class JoogipudelTest{

    Jook olu = new Jook("õlu", 0.5, 0.75);
    Joogipudel olupudel = new Joogipudel(0.50, "pooleliitrine", 0.10, 0.20, olu);

    @Test
    public void massJoogigaTest(){
        assertEquals(0.60, olupudel.massJoogiga(), 0.001);
    }

    @Test
    public void komplektiOmahindTest(){
        assertEquals((0.20 + 0.25 * 0.50), olupudel.komplektiOmahind(), 0.001);
    }

}
