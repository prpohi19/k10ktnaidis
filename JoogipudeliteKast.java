public class JoogipudeliteKast{
  enum kastityyp{
    plastik, papp;
  }
  kastityyp tyyp;

  double kastiHind;
  double kastiMass;
  double pesadeArv;
  Joogipudel pudel;
  Joogivaat vaat;


public JoogipudeliteKast(double kastiHind, double kastiMass, double pesadeArv, Joogipudel pudel, Joogivaat vaat){
  this.kastiHind = kastiHind;
  this.kastiMass = kastiMass;
  this.pesadeArv = pesadeArv;
  this.pudel = pudel;
  this.vaat = vaat;
}

  public double massKokku(){
    double mKokku = (kastiMass/1000 + pudel.mass() * pesadeArv);
    return mKokku;
  }

  public double omahindKokku(){
    double hKokku = (kastiHind/100 + pudel.omahind() * pesadeArv);
    return hKokku;
  }

  public double pudelidKasti(){
    double kastis = pesadeArv + vaat.count;
    return kastis;
  }


}
