import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
    public static Jook siider = new Jook("Siider", 2.50, 800);
    public static Jook mahl = new Jook("Mahl", 2.70, 1100);
    public static Jook vesi = new Jook("Vesi", 1.00, 1000);

    public static Joogipudel siidripurk = new Joogipudel(1000, 1, 0.2, 0.5, Testid.siider);
    public static Joogipudel mahlapakk = new Joogipudel(800, 2, 0.3, 0, Testid.mahl);
    public static Joogipudel veepudel = new Joogipudel(1400, 3, 0.5, 1, Testid.vesi);

    public static Joogipudelikast kastsiidrit = new Joogipudelikast(1, 5.0, 2, 10, Testid.pudeliteMassiiv(5, Testid.siidripurk));
    public static Joogipudelikast kastmahla = new Joogipudelikast(2, 10.0, 2, 6, Testid.pudeliteMassiiv(5, Testid.mahlapakk));
    public static Joogipudelikast kastvett = new Joogipudelikast(3, 3.0, 2, 3, Testid.pudeliteMassiiv(5, Testid.veepudel));

    public static Joogivaat siidrivaat = new Joogivaat(5000, 5, Testid.siider);
    public static Joogivaat mahlavaat = new Joogivaat(10000, 7.5, Testid.mahl);
    public static Joogivaat veevaat = new Joogivaat(1000, 1, Testid.vesi);

    public static Joogipudel[] pudeliteMassiiv(int mitu, Joogipudel pudel) {
        Joogipudel[] pudelid = new Joogipudel[mitu];
        for (int i = 0; i < mitu; i++) {
            pudelid[i] = pudel;
        }

        return pudelid;
    }

    @Test
    public void massid() {
        System.out.println(siidripurk.massKoosJoogiga());
        System.out.println(mahlapakk.massKoosJoogiga());
        System.out.println(veepudel.massKoosJoogiga());
    }

    @Test
    public void villiKasti() throws Exception {
        Testid.siidrivaat.villiVaatKasti(Testid.kastsiidrit, Testid.pudeliteMassiiv(5, Testid.siidripurk));
        Testid.mahlavaat.villiVaatKasti(Testid.kastmahla, Testid.pudeliteMassiiv(5, Testid.mahlapakk));
        Testid.veevaat.villiVaatKasti(Testid.kastvett, Testid.pudeliteMassiiv(5, Testid.veepudel));
    }

    @Test
    public void omahinnad() throws Exception {
        villiKasti();

        System.out.println(kastsiidrit.kastiPudeliteOmahind());
        System.out.println(kastmahla.kastiPudeliteOmahind());
        System.out.println(kastvett.kastiPudeliteOmahind());
    }

    @Test
    public void taidaPudelid() throws Exception {
        siidrivaat.taidaPudel(Testid.siidripurk);
        mahlavaat.taidaPudel(Testid.mahlapakk);
        veevaat.taidaPudel(Testid.veepudel);
    }

    /* 
    JUnit version 4.8.2
    .800.2
    1100.3
    1000.5
    .2.5
    0.0
    5.0
    ..
    Time: 0.036

    OK (4 tests)
*/
}