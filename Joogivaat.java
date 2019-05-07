public class Joogivaat{
  double ruumala;
  double joogiKogus;
  Jook jook;

  public Joogivaat(double ruumala, double joogiKogus, Jook jook){
    this.ruumala = ruumala;
    this.joogiKogus = joogiKogus;
    this.jook = jook;
  }

  public boolean fillPudel(Joogipudel joogipudel){
    if(joogipudel.maht <= joogiKogus){
      joogipudel.jook = jook;
      joogiKogus = joogiKogus - jook.erikaal;
      return true;
    }else{
      System.out.println("Täitmiseks ei ole piisavalt jooki");
      return false;
    }
  }

  public void fillTerveJoogivaat(Joogipudel joogipudelid[]){
    for(Joogipudel pudel : joogipudelid){
      fillPudel(pudel);
    }
  }

  public void fillTerveKast(PudeliKast kast, Joogipudel joogipudelid[]){
    kast.joogipudelid = joogipudelid;
    fillTerveJoogivaat(kast.joogipudelid);
  }

}//ends Joogivaat class
