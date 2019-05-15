package tund10;

public class Joogipudelikast {
    enum Pudelityyp { PLASTIK, KLAAS, METALL }
    Pudelityyp pudelityyp;
    double kastihind;
    double kastimass;
    int pudelitearv;
    Joogipudel[] pudelid;

    public Joogipudelikast(Pudelityyp pudelityyp, double hind, double mass, int pudeleid){
        this.pudelityyp = pudelityyp;
        this.kastihind = hind;
        this.kastimass = mass;
        this.pudelitearv = pudeleid;
    }

    public void setJoogipudelid(Joogipudel[] pudelid){
        this.pudelid = pudelid;
    }

    public double kastiPudeliteMass(){
        double pudelitemass = 0;
        if (pudelid.length > 0){
            for(Joogipudel pudel : pudelid){
                pudelitemass += pudel.mass;
            }
            return pudelitemass + kastimass;
        }
        return kastimass;
    }

    public double kastiPudeliteOmahind() throws Exception {
        double omahinnad = 0;
        if (pudelid.length > 0){
            for(Joogipudel pudel : pudelid){
                omahinnad += pudel.taara;
            }
            return omahinnad;
        }
        else{
            throw new Exception("Kastis pole pudeleid!");
        }
    }
}