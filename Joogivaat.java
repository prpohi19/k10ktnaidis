public class Joogivaat {
    float ruumala;
    Jook jook;
    float jookLiitrites;

    public Joogivaat(float ruumala, float jookLiitrites, Jook jook){
        this.ruumala = ruumala;
        this.jookLiitrites = jookLiitrites;
        this.jook = jook;
    }

    public void taidaPudel(Joogipudel pudel) throws Exception {
        if(pudel.maht >= jookLiitrites){
            pudel.jook = jook;
            jookLiitrites = jookLiitrites - jook.erikaal;
        }
        else {
            throw new Exception("Pudelisse ei mahu jooki " + jook.nimetus);
        }
    }

    public void villiVaatPudelitesse(Joogipudel[] pudelid) throws Exception {
        for (Joogipudel pudel : pudelid){
            taidaPudel(pudel);
        }
    }

    public void villiVaatKasti(Joogipudelikast kast, Joogipudel[] pudelid) throws Exception {
        kast.pudelid = pudelid;
        villiVaatPudelitesse(kast.pudelid);
    }
}
