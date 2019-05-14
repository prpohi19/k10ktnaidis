package joogid;

public class Joogipudel {

    public Jook jook;
    private int maht;
    private String pudelitype;
    private int mass;
    private int taaraHind;

    public Joogipudel(int maht, String pudelitype, int mass, int taaraHind) {
        this.maht = maht;
        this.pudelitype = pudelitype;
        this.mass = mass;
        this.taaraHind = taaraHind;
    }

    public Joogipudel(int maht, String pudelitype, int mass, int taaraHind, Jook jook) {
        this.maht = maht;
        this.pudelitype = pudelitype;
        this.mass = mass;
        this.taaraHind = taaraHind;
        this.jook = jook;
    }

    public int MassjaJook() {
        if (jook != null) {
            return mass+jook.getErikaal();
        }
        return mass;
    }

    public int komplektOmahind() {
        if (jook!= null) {
            System.out.println(taaraHind+jook.getLiitriOmahind() * jook.getErikaal());
            return taaraHind+jook.getLiitriOmahind() * jook.getErikaal();
        }
        System.out.println(taaraHind);
        return taaraHind;
    }

    public int getMaht() {
        return maht;
    }

    public void setMaht(int maht) {
        this.maht = maht;
    }

    public String getPudelitype() {
        return pudelitype;
    }

    public void setPudelitype(String pudelitype) {
        this.pudelitype = pudelitype;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getTaaraHind() {
        return taaraHind;
    }

    public void setTaaraHind(int taaraHind) {
        this.taaraHind = taaraHind;
    }
}
