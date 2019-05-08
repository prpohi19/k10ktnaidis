public class Joogipudelikast {
    int kastityyp;
    double kastihind;
    double kastimass;
    int pudelitearv;
    Joogipudel[] pudelid;

    public Joogipudelikast(int tyyp, double hind, double mass, int pudeleid){
        this.kastityyp = tyyp;
        this.kastihind = hind;
        this.kastimass = mass;
        this.pudelitearv = pudeleid;
    }

    public Joogipudelikast(int tyyp, double hind, double mass, int pudeleid, Joogipudel[] pudelid){
        this.kastityyp = tyyp;
        this.kastihind = hind;
        this.kastimass = mass;
        this.pudelitearv = pudeleid;
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
                omahinnad += pudel.taaraMaksumus;
            }
            return omahinnad;
        }
        else{
            throw new Exception("Kasti on tühi!");
        }
    }
}
