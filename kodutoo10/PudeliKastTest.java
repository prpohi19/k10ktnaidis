import org.junit.*;
import static org.junit.Assert.*;

public class PudeliKastTest{

    Jook olu = new Jook("õlu", 0.5, 0.75); //nimetus, liitriomahind, erikaal
    Joogipudel olupudel = new Joogipudel(0.50, "pooleliitrine", 0.10, 0.20, olu); //maht, pudelityyp, mass, taaramaksumus, jook
    Joogivaat oluvaat = new Joogivaat(10, 100, olu); //ruumala, joogikogus, jook

    public static Joogipudel[] pudelimasiiv(int pesadearv, Joogipudel pudel){
        Joogipudel[] joogipudelid = new Joogipudel[pesadearv];
        for(int i = 0; i < pesadearv; i++){
            joogipudelid[i] = pudel;
        }
        return joogipudelid;
    }

    PudeliKast kast1 = new PudeliKast("Suur", 75, 30, 16, pudelimasiiv(16, olupudel)); // kastityyp, kastihind, kastimass, pesadearv, joogipudelid


    @Test
    public void kastiMassTest(){
        assertEquals(1.60 + 30, kast1.kastiMass(), 0.001);
    }

    @Test
    public void kastiOmahindTest(){
        assertEquals(16 * 0.20 + 75, kast1.kastiOmahind(), 0.001);
    }

}
