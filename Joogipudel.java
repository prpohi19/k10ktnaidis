public class Joogipudel {
    int maht;
    int pudelityyp;
    double mass;
    double taaraMaksumus;
    Jook jook;

    public Joogipudel(int maht, int tyyp, double mass, double taara){
        this.maht = maht;
        this.pudelityyp = tyyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
    }

    public Joogipudel(int maht, int tyyp, double mass, double taara, Jook jook){
        this.maht = maht;
        this.pudelityyp = tyyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
        this.jook = jook;
    }

    public double massKoosJoogiga(){
        if (jook != null){
            return mass + jook.erikaal;
        }
        return mass;
    }

    public double komplektiOmahind(){
        if (jook != null){
            return taaraMaksumus + (jook.liitriOmahind * jook.erikaal);
        }
        return taaraMaksumus;
    }
}
