package tund10;

public class Joogipudel {
    enum Pudelityyp { PLASTIK, KLAAS, METALL }
    double maht;
    double mass;
    double taara;
    Jook jook;
    Pudelityyp pudelityyp;

    Joogipudel(Pudelityyp pudelityyp, double maht, double mass, double taara){
        this.pudelityyp = pudelityyp;
        this.maht = maht;
        this.mass = mass;
        this.taara = taara;
    }

    public void taidaJoogiga(Jook jook){
        this.jook = jook;
    }

    public double getMass(){
        if (this.jook != null){
            return mass + jook.erikaal;
        }
        return mass;
    }

    public double getKomplektiOmahind(){
        if (this.jook != null){
            return taara + jook.omahind + jook.erikaal;
        }
        return taara;
    }
}
