package eu.j2rvaservud;

/**
 * Joogipudel
 */
public class Joogipudel {

    public enum Tyyp {
        PLAST, PLEKK, KLAAS
    }

    private Jook jook = null;
    private float maht; // Liitrites ehk dm3
    private float mass;
    private Tyyp tyyp;
    private int taaraHind; // sentides


    public Joogipudel(Tyyp tyyp, float maht, float mass, int taaraHind) {
        this.tyyp = tyyp;
        this.maht = maht;
        if (mass <= 0) {
            throw new IllegalArgumentException("Mass peab olema 0'st suurem");
        }
        if (maht <= 0) {
            throw new IllegalArgumentException("Maht peab olema 0'st suurem");
        }
        if (taaraHind < 0) {
            throw new IllegalArgumentException("Taara hind ei saa olla negatiivne");
        }
        this.mass = mass;
        this.taaraHind = taaraHind;
    }

    public float getTotalMass() {
        float totalMass = mass;
        if (jook != null) {
            totalMass += maht * 1000 * jook.getErikaal();
        }
        return totalMass;
    }

    public int getHind() {
        int omaHind = taaraHind;
        if (jook != null) {
            omaHind += maht * jook.getHind();
        }
        return omaHind;
    }

    public Jook getJook() {
        return jook;
    }

    public void setJook(Jook jook) {
        this.jook = jook;
    }

    public float getMaht() {
        return maht;
    }

    public void setMaht(float maht) {
        this.maht = maht;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public Tyyp getTyyp() {
        return tyyp;
    }

    public void setTyyp(Tyyp tyyp) {
        this.tyyp = tyyp;
    }

    public int getTaaraHind() {
        return taaraHind;
    }

    public void setTaaraHind(int taaraHind) {
        this.taaraHind = taaraHind;
    }
}