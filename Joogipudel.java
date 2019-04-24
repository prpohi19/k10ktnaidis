public class Joogipudel {
    private double maht;
    private String tyyp;
    private double mass;
    private double maksumus;
    private Jook sisu;
    public Joogipudel(Double maht, String tyyp, double mass, double maksumus
            , Jook sisu){
        this.maht = maht;
        this.tyyp = tyyp;
        this.mass = mass;
        this.maksumus = maksumus;
        this.sisu = sisu;
    }
    public double getMaht(){
        return this.maht;
    }
    public Jook getSisu(){
        return this.sisu;
    }
    public void setSisu(Jook j){
        this.sisu = j;
    }
    public double leiaMass(){
        double mass = 0;
        if(this.sisu == null){
            return this.mass;
        } else {
            mass = this.sisu.erikaal*this.maht+this.mass;
        }
        return mass;
    }
    public double leiaOmahind(){
        double hind = 0;
        if(this.sisu == null){
            hind += this.maksumus;
        } else {
            hind +=
                    this.sisu.erikaal*this.maht*this.sisu.liitriOmahind+this.maksumus;
        }
        return hind;
    }
}
