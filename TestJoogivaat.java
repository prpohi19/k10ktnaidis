import org.junit.*;

public class TestJoogivaat {
    public static Joogivaat limpsivaat = new Joogivaat(5000,5, TestJook.limps);
    public static Joogivaat ollevaat = new Joogivaat(10000, (float) 7.5, TestJook.olu);
    public static Joogivaat mahlavaat = new Joogivaat(1000,1,  TestJook.mahl);

    @Test
    public void taidaPudelid() throws Exception {
        limpsivaat.taidaPudel(TestJoogipudel.limpsipudel);
        ollevaat.taidaPudel(TestJoogipudel.ollepudel);
        mahlavaat.taidaPudel(TestJoogipudel.mahlapudel);
    }

    @Test
    public void villiPudelitesse() throws Exception {
        limpsivaat.villiVaatPudelitesse(pudeliteMassiiv(5, TestJoogipudel.limpsipudel));
        ollevaat.villiVaatPudelitesse(pudeliteMassiiv(5, TestJoogipudel.ollepudel));
        mahlavaat.villiVaatPudelitesse(pudeliteMassiiv(5, TestJoogipudel.mahlapudel));

    }
    @Test
    public void villiKasti() throws Exception {
        TestJoogivaat.limpsivaat.villiVaatKasti(TestJoogipudelikast.kastlimpsi, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.limpsipudel));
        TestJoogivaat.ollevaat.villiVaatKasti(TestJoogipudelikast.kastolut, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.ollepudel));
        TestJoogivaat.mahlavaat.villiVaatKasti(TestJoogipudelikast.kastmahla, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.mahlapudel));
    }

    // Funktsioon kergelt pudelite massiivi loomiseks, otseselt ülesandes ei nõutud
    public static Joogipudel[] pudeliteMassiiv(int mitu, Joogipudel pudel){
        Joogipudel[] pudelid = new Joogipudel[mitu];
        for(int i = 0; i < mitu; i++){
            pudelid[i] = pudel;
        }

        return pudelid;
    }
}
