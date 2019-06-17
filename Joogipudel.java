public class Joogipudel{
  double maht;
  double mass;
  double hind;
  Jook jook;
  double taara;
  Pudelityyp pudelityyp;

  public Joogipudel(Jook jook, double maht, Pudelityyp pudelityyp, double mass, double taara){
    this.jook= jook;
    this.maht= maht;
    this.pudelityyp= pudelityyp;
    this.mass= mass;
    this.taara= taara;
  }

  public double getMass(){

    if(this.jook != null){
      mass += maht * jook.kaal;
    }

    return mass;
  }

  public double getHind(){

    if(this.jook != null){
      taara += jook.hind * maht;
    }
    return taara;
  }
}
