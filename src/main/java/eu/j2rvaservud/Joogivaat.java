package eu.j2rvaservud;

import java.util.ArrayList;
import java.util.List;

/**
 * Joogivaat
 */
public class Joogivaat {

    private Jook jook;
    private float ruumala; // dm3
    private float kogus; // liitrites
    

    public Joogivaat(Jook jook, float ruumala) {
        this.jook = jook;
        this.ruumala = ruumala;
        this.kogus = ruumala;
    }

    public boolean täidaJoogipudel(Joogipudel pudel) {
        if (pudel.getMaht() <= kogus) {
            pudel.setJook(jook);
            kogus -= pudel.getMaht();
            return true;
        }
        return false;
    }

    public List<Joogipudel> villiPudelitesse(Joogipudel pudel) {
        List<Joogipudel> pudelid = new ArrayList<>();
        while (pudel.getMaht() <= kogus) {
            pudelid.add(new Joogipudel(pudel.getTyyp(), pudel.getMaht(), pudel.getMass(), pudel.getTaaraHind()));
            kogus -= pudel.getMaht();
        }
        return pudelid;
    }

    /**
     * @return the jook
     */
    public Jook getJook() {
        return jook;
    }

    /**
     * @param jook the jook to set
     */
    public void setJook(Jook jook) {
        this.jook = jook;
    }

    /**
     * @return the ruumala
     */
    public float getRuumala() {
        return ruumala;
    }

    /**
     * @param ruumala the ruumala to set
     */
    public void setRuumala(float ruumala) {
        this.ruumala = ruumala;
    }

    /**
     * @return the kogus
     */
    public float getKogus() {
        return kogus;
    }

    /**
     * @param kogus the kogus to set
     */
    public void setKogus(float kogus) {
        this.kogus = kogus;
    }
}