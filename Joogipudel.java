public class Joogipudel{
  double maht;
  String pudelityyp;
  double mass;
  double taaraMaksumus;
  Jook jook;

  public Joogipudel(double maht, String pudelityyp, double mass, double taaraMaksumus, Jook jook){
    this.maht = maht;
    this.pudelityyp = pudelityyp;
    this.mass = mass;
    this.taaraMaksumus = taaraMaksumus;
    this.jook = jook;
  }

  public double massJoogiga(){
    if(jook != null){
      return mass = jook.erikaal + mass;
    }else{
      return mass;
    }
  }

  public double komplektiOmahind(){
    if(jook != null){
      return taaraMaksumus + jook.liitriOmahind * jook.erikaal;
    }else{
      return taaraMaksumus;
    }
  }


}//ends Joogipudel class
