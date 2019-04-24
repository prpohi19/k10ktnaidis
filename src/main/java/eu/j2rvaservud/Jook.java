package eu.j2rvaservud;

/**
 * Jook
 */
public class Jook {

    private String nimi;
    private int hind; // Hind sentides / liitri kohta
    private float erikaal; // g / cm3

    public Jook(String nimi, int hind, float erikaal) {
        this.nimi = nimi;
        this.hind = hind;
        this.erikaal = erikaal;
    }

    /**
     * @return the hind
     */
    public int getHind() {
        return hind;
    }

    /**
     * @param hind the hind to set
     */
    public void setHind(int hind) {
        this.hind = hind;
    }

    /**
     * @return the erikaal
     */
    public float getErikaal() {
        return erikaal;
    }

    /**
     * @param erikaal the erikaal to set
     */
    public void setErikaal(float erikaal) {
        this.erikaal = erikaal;
    }
           
}