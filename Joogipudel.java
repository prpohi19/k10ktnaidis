public class Joogipudel{
    String nimetus;
    enum pudelityyp{
        klaas, plast, plekk
    }
    double maht;
    double mass;
    double hind;
    Jook jook;
    pudelityyp tyyp;
    double taara_hind;

    public Joogipudel(Jook jook, double maht, pudelityyp tyyp, double mass, double taara_hind){
        this.jook = jook;
        this.maht = maht;
        this.tyyp = tyyp;
        this.mass = mass;
        this.taara_hind = taara_hind;
    }

    public double getMass(){
        mass += maht*jook.erikaal;
        return mass;
    }
    
    public double getPrice(){
        hind = (hind/100)+maht/1000*jook.hind/100;
        return hind;
    }
}