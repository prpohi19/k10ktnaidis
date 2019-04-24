public class Joogipudel {

  enum Tyyp{
    PLAST, PLEKK, KLAAS
  }

  public Jook jook = null;
  public float maht;
  public Tyyp tyyp;
  public int mass;
  public float taara;


  public Joogipudel(Tyyp tyyp, float maht, int mass, float taara){
    this.tyyp = tyyp;
    this.maht = maht;
    this.mass = mass;
    this.taara = taara;
  }

  public float getMass(){
    float totalmass = mass;
    if(jook != null){
      totalmass = (jook.erikaal * maht) + mass;
    }
    return totalmass;
  }

  public float getPrice(){
    float totalprice = taara;
    if( jook != null){
      totalprice = (jook.hind * maht) + taara;
    }


     return totalprice;
  }

}
