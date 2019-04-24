import org.junit.*;

public class TestJoogipudelikast {
    public static Joogipudelikast kastlimpsi = new Joogipudelikast(1, (float) 5.0, 2, 10, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.limpsipudel));
    public static Joogipudelikast kastolut = new Joogipudelikast(2, (float) 10.0, 2, 6, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.ollepudel));
    public static Joogipudelikast kastmahla = new Joogipudelikast(3, (float) 3.0, 2, 3, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.mahlapudel));

    public void villiKasti() throws Exception {
        TestJoogivaat.limpsivaat.villiVaatKasti(TestJoogipudelikast.kastlimpsi, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.limpsipudel));
        TestJoogivaat.ollevaat.villiVaatKasti(TestJoogipudelikast.kastolut, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.ollepudel));
        TestJoogivaat.mahlavaat.villiVaatKasti(TestJoogipudelikast.kastmahla, TestJoogivaat.pudeliteMassiiv(5, TestJoogipudel.mahlapudel));
    }

    @Test
    public void massid() throws Exception {
        villiKasti();

        System.out.println(kastlimpsi.kastiPudeliteMass());
        System.out.println(kastolut.kastiPudeliteMass());
        System.out.println(kastmahla.kastiPudeliteMass());
    }

    @Test
    public void omahinnad() throws Exception {
        villiKasti();

        System.out.println(kastlimpsi.kastiPudeliteOmahind());
        System.out.println(kastolut.kastiPudeliteOmahind());
        System.out.println(kastmahla.kastiPudeliteOmahind());
    }
}
