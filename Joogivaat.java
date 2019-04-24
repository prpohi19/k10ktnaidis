public class Joogivaat {
  public float ruumala;//detsimeeter kuubis
  public float kogus;
  public Jook jook;

  public Joogivaat(float ruumala, float kogus, Jook jook){
    this.ruumala = ruumala;
    this.kogus = kogus;
    this.jook = jook;
  }

  public boolean t2itmine(Joogipudel pudel){
    //pudel.jook = jook;
    if(kogus - pudel.maht < 0){
      return false;
    }
    pudel.jook = jook;

    kogus = kogus - pudel.maht;
    return true;
  }

}
