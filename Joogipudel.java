public class Joogipudel {
    int maht;
    int pudelityyp;
    float mass;
    float taaraMaksumus;
    Jook jook;

    public Joogipudel(int maht, int tyyp, float mass, float taara){
        this.maht = maht;
        this.pudelityyp = tyyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
    }

    public Joogipudel(int maht, int tyyp, float mass, float taara, Jook jook){
        this.maht = maht;
        this.pudelityyp = tyyp;
        this.mass = mass;
        this.taaraMaksumus = taara;
        this.jook = jook;
    }

    public float massKoosJoogiga(){
        if (jook != null){
            return mass + jook.erikaal;
        }
        return mass;
    }

    public float komplektiOmahind(){
        if (jook != null){
            return taaraMaksumus + (jook.liitriOmahind * jook.erikaal);
        }
        return taaraMaksumus;
    }
}
