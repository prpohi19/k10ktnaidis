package joogid;

public class Kast {

    private String kastitype;
    private int kastihind;
    private int kastimass;
    private int pesadearv;
    private Joogipudel[] joogipudelid;
    private int tervemass = 0;
    private int kastmaksabPlaceholder = 0;


    public Kast(String kastitype, int kastihind, int kastimass, int pesadearv, Joogipudel[] joogipudelid) {
        this.kastitype = kastitype;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesadearv = pesadearv;
        this.joogipudelid = joogipudelid;
    }

    public int kastKaalub() {
        if (joogipudelid!=null) {
            for (Joogipudel joogipudel : joogipudelid) {
                tervemass = tervemass + joogipudel.getMass();
            }
            return tervemass + kastimass;
        } else {
            return kastimass;
        }
    }

    public int kastMaksab() {
        if (joogipudelid!=null) {
            for (Joogipudel joogipudel : joogipudelid) {
                kastmaksabPlaceholder = kastmaksabPlaceholder + joogipudel.getTaaraHind();
            }
            return kastmaksabPlaceholder + kastihind;
        } else {
            return 0;
        }
    }

    public Joogipudel[] getJoogipudelid() {
        return joogipudelid;
    }

    public void setJoogipudelid(Joogipudel[] joogipudelid) {
        this.joogipudelid = joogipudelid;
    }

    public String getKastitype() {
        return kastitype;
    }

    public void setKastitype(String kastitype) {
        this.kastitype = kastitype;
    }

    public int getKastihind() {
        return kastihind;
    }

    public void setKastihind(int kastihind) {
        this.kastihind = kastihind;
    }

    public int getKastimass() {
        return kastimass;
    }

    public void setKastimass(int kastimass) {
        this.kastimass = kastimass;
    }

    public int getPesadearv() {
        return pesadearv;
    }

    public void setPesadearv(int pesadearv) {
        this.pesadearv = pesadearv;
    }
}
