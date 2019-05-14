package joogid;

public class Jook {

    private String nimetus;
    private int liitriOmahind;
    private int erikaal;

    public Jook(String nimetus, int liitriOmahind, int erikaal) {
        this.nimetus = nimetus;
        this.liitriOmahind = liitriOmahind;
        this.erikaal = erikaal;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public int getLiitriOmahind() {
        return liitriOmahind;
    }

    public void setLiitriOmahind(int liitriOmahind) {
        this.liitriOmahind = liitriOmahind;
    }

    public int getErikaal() {
        return erikaal;
    }

    public void setErikaal(int erikaal) {
        this.erikaal = erikaal;
    }
}
