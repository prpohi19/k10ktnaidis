package tund10;

public class Joogivaat {
    double ruumala;
    Jook jook;
    double jookMilliLitrites;

    Joogivaat(double ruumala, double jookMilliLitrites, Jook jook){
        this.ruumala = ruumala;
        this.jookMilliLitrites = jookMilliLitrites;
        this.jook = jook;
    }

    public void pudeliTaitmine(Joogipudel joogipudel){
        try {
            if (joogipudel.maht >= jookMilliLitrites) {
                joogipudel.jook = jook;
                jookMilliLitrites -= jook.erikaal;
            }
        } catch (Exception e){
            System.out.println("Ei mahu");
        }
    }

    public void villiPudelitesse(Joogipudel[] joogipudelid){
        try {
            for (Joogipudel pudel : joogipudelid){
                pudeliTaitmine(pudel);
            }

        } catch (Exception e){
            System.out.println("Ei saa");
        }
    }
}
