package tund10;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Main {

    Jook vesi = new Jook("Vesi", 150, 1000); // sentides, kaal grammides
    Joogipudel joogipudel = new Joogipudel(Joogipudel.Pudelityyp.KLAAS, 1000, 20, 0.10); // maht ml, mass g, maksumus sentides
    Joogivaat veevaat = new Joogivaat(10000, 7500, vesi); // ml, ml

    @Test
    public void taitaJoogiga(){
        joogipudel.taidaJoogiga(vesi);
        Assert.assertTrue(joogipudel.getKomplektiOmahind() == joogipudel.taara + joogipudel.jook.omahind + joogipudel.jook.erikaal);
    }

    @Test
    public void taidaPudel(){
        double before = veevaat.jookMilliLitrites;
        joogipudel.taidaJoogiga(vesi);
        veevaat.pudeliTaitmine(joogipudel);
        double after = veevaat.jookMilliLitrites;

        Assert.assertFalse(before == after);

    }

}
