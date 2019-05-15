package tund10;

import org.junit.Assert;
import org.junit.Test;

public class Main {

    Jook vesi = new Jook("Vesi", 150, 1000); // sentides, kaal grammides
    Joogipudel joogipudel = new Joogipudel(Joogipudel.Pudelityyp.KLAAS, 1000, 20, 0.10); // maht ml, mass g, maksumus sentides
    Joogivaat veevaat = new Joogivaat(10000, 7500, vesi); // ml, ml
    Joogipudelikast joogipudelikast = new Joogipudelikast(Joogipudelikast.Kastityyp.PAPP, 250, 300, 5);

    @Test
    public void esimene(){
        double before = joogipudel.getMass();
        joogipudel.taidaJoogiga(vesi);
        double after = joogipudel.getMass();

        Assert.assertNotEquals(before, after, 0.001);
        Assert.assertTrue(joogipudel.getKomplektiOmahind() == joogipudel.taara + joogipudel.jook.omahind + joogipudel.jook.erikaal);
    }

    @Test
    public void teine(){
        double before = veevaat.jookMilliLitrites;
        joogipudel.taidaJoogiga(vesi);
        veevaat.pudeliTaitmine(joogipudel);
        double after = veevaat.jookMilliLitrites;

        Assert.assertFalse(before == after);

    }

    @Test
    public void kolmas() throws Exception {
        Joogipudel[] joogipudelid = {joogipudel, joogipudel, joogipudel, joogipudel, joogipudel};
        joogipudelikast.setJoogipudelid(joogipudelid);
        //System.out.println(joogipudelikast.kastiPudeliteMass());

        Assert.assertEquals(0.5, joogipudelikast.kastiPudeliteOmahind(), 0.01);
    }

}
