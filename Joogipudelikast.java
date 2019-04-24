public class Joogipudelikast {
    int kastityyp;
    float kastihind;
    float kastimass;
    int pudelitearv;
    Joogipudel[] pudelid;

    public Joogipudelikast(int tyyp, float hind, float mass, int pudeleid){
        this.kastityyp = tyyp;
        this.kastihind = hind;
        this.kastimass = mass;
        this.pudelitearv = pudeleid;
    }

    public Joogipudelikast(int tyyp, float hind, float mass, int pudeleid, Joogipudel[] pudelid){
        this.kastityyp = tyyp;
        this.kastihind = hind;
        this.kastimass = mass;
        this.pudelitearv = pudeleid;
        this.pudelid = pudelid;
    }

    public float kastiPudeliteMass(){
        float pudelitemass = 0;
        if (pudelid.length > 0){
            for(Joogipudel pudel : pudelid){
                pudelitemass += pudel.mass;
            }
            return pudelitemass + kastimass;
        }
        return kastimass;
    }

    public float kastiPudeliteOmahind() throws Exception {
        float omahinnad = 0;
        if (pudelid.length > 0){
            for(Joogipudel pudel : pudelid){
                omahinnad += pudel.taaraMaksumus;
            }
            return omahinnad;
        }
        else{
            throw new Exception("Kastis pole pudeleid!");
        }
    }
}
