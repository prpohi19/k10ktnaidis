import org.junit.*;
import static org.junit.Assert.*;

public class JoogivaatTest{

    Jook olu = new Jook("õlu", 0.5, 0.75); //nimetus, liitriomahind, erikaal
    Joogipudel olupudel = new Joogipudel(0.75, "pooleliitrine", 0.10, 0.20, olu); //maht, pudelityyp, mass, taaramaksumus, jook
    Joogivaat oluvaat = new Joogivaat(10, 100, olu); //ruumala, joogikogus, jook
    Joogivaat oluvaatTyhi = new Joogivaat(10, 0, olu); //ruumala, joogikogus, jook

    //mahub
    @Test
    public void fillPudelTest(){
        assertEquals(true, oluvaat.fillPudel(olupudel));
    }

    //ei mahu
    @Test
    public void fillPudelTest2(){
        assertEquals(false, oluvaatTyhi.fillPudel(olupudel));
    }

}
