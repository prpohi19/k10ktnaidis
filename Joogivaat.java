package joogid;

public class Joogivaat {

    private int ruumala;
    private int liitrid;
    private Jook jook;

    public Joogivaat(int ruumala, int liitrid, Jook jook) {
        this.ruumala = ruumala;
        this.liitrid = liitrid;
        this.jook = jook;
    }

    public boolean fill(Joogipudel joogipudel) {
        if (joogipudel.getMaht() >= liitrid) {
            joogipudel.jook = jook;
            liitrid = liitrid-jook.getErikaal();
            System.out.println("Joogipudel on filled!");
            return true;
        } else {
            System.out.println("Ei mahu enam");
            return false;
        }
    }

    public void VilliPudel(Joogipudel[] joogipudelid) {
        for (Joogipudel joogipudel : joogipudelid) {
            fill(joogipudel);
        }
    }
}
