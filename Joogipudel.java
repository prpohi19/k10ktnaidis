public class Joogipudel{
  double maht;
  //mis enum?
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
  public double mass(){ //miks getMass kõigil? mingi põhjus?
    if( jook != null){
      mass += jook.erikaal;
    }

    return mass;
  }

  public double omahind(){//kus need valemid tulevad? peab ise välja mõtlema?
    maksumus = (maksumus/100) + maht/1000 * jook.hind/100;
    return maksumus;
  }
}
