import java.util.ArrayList;

public class Kast {
    private String tyyp;
    private double hind;
    private double mass;
    private int pudeliteMahtuvus;
    private ArrayList<Joogipudel> pudelid;
    public Kast(String tyyp, double hind, double mass, int kohad,
                ArrayList<Joogipudel> pudelid){
        this.tyyp = tyyp;
        this.hind = hind;
        this.mass = mass;
        this.pudeliteMahtuvus = kohad;
        this.pudelid = pudelid;
    }

    public double leiaYhineMass(){
        double mass = 0;
        if(this.pudelid == null){
            return 0;
        } else {
            for (Joogipudel p : this.pudelid) {
                mass+= p.leiaMass();
            }
        }
        return mass;
    }
    public double leiaOmahindKokku(){
        double hind = 0;
        if(this.pudelid == null){
            return 0;
        } else {
            for (Joogipudel p : this.pudelid) {
                hind+= p.leiaOmahind();
            }
        }
        return hind;
    }
    public double t2idaTyhjadPudelid(Joogivaat vaat){
            vaat.t2idaPudelid(this.pudelid);
        return this.leiaYhineMass();
    }

}
