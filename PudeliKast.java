public class PudeliKast{
  String kastityyp;
  double kastihind;
  double kastimass;
  int pesadearv;
  Joogipudel[] joogipudelid;

  public PudeliKast(String kastityyp, double kastihind, double kastimass, int pesadearv, Joogipudel[] joogipudelid){
    this.kastityyp = kastityyp;
    this.kastihind = kastihind;
    this.kastimass = kastimass;
    this.pesadearv = pesadearv;
    this.joogipudelid = joogipudelid;
  }

  public double kastiMass(){
    double yhismass = 0;
    if(joogipudelid != null){
      for(Joogipudel pudel : joogipudelid){
        yhismass += pudel.mass;
      }
      return yhismass + kastimass;
    }else{
      return kastimass;
    }
  }

  public double kastiOmahind(){
    double yhishind = 0;
    if(joogipudelid != null){
      for(Joogipudel pudel : joogipudelid){
        yhishind += pudel.taaraMaksumus;
      }
      return yhishind + kastihind;
  }else{
    System.out.println("Kast on tyhi");
    return 0;
  }
}

}//ends PudeliKast class
