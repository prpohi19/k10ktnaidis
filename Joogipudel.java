public class Joogipudel{
    enum Tyyp{
        klaas,plast
      }
    Jook jook;
    float maht; //ml
    Tyyp tyyp; // ^
    int pudelikaal; //grammides
    int taaraHind;//sentides
    public Joogipudel(Jook jook,float maht, Tyyp tyyp, int pudelikaal, int taaraHind){
        this.jook=jook;
        this.maht=maht;
        this.tyyp=tyyp;
        this.pudelikaal=pudelikaal;
        this.taaraHind=taaraHind;
    }

    public double pudeliMassJoogiga(){
        if(this.jook==null){
            jook.joogikaal=0;
        }
        return pudelikaal+maht*jook.joogikaal;
        
    }

    public double omaHind(){
        return (taaraHind/100)+maht/1000*jook.hind/100;
    }

}