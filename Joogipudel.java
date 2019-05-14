public class Joogipudel{
  double maht;
  enum pudelityyp{
    klaas, plastik, plekk;
  }
  pudelityyp tyyp;
  double mass;
  double maksumus;
  Jook jook;

public Joogipudel(Jook jook, double maht, pudelityyp tyyp, double mass, double maksumus){
  this.jook = jook;
  this.maht = maht;
  this.tyyp = tyyp;
  this.mass = mass;
  this.maksumus = maksumus;
}
  public double mass(){
    mass = (mass + jook.erikaal)/1000;
    return mass;
  }

  public double omahind(){
    maksumus = (maksumus/100) + maht/1000 * jook.hind/100;
    return maksumus;
  }
}
