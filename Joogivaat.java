public class Joogivaat{
  double ruumala;
  double kogus;
  Joogipudel pudel;

public Joogivaat(double ruumala, double kogus, Joogipudel pudel){
  this.ruumala = ruumala;
  this.kogus = kogus;
  this.pudel = pudel;

}

  double t2ituvus = 0;
  public double t2ida(){
    while(kogus > 0){
      if(ruumala <= kogus){
        t2ituvus =  ruumala;
        kogus = 0;
      }
      else{
        t2ituvus = kogus;
        kogus = 0;
      }
    }
    return t2ituvus/1000;
  }

  double count = 0;
  public double villi(){
      while(t2ituvus > 0){
        if(t2ituvus >= pudel.maht){
          count += 1.0;
          t2ituvus = t2ituvus - pudel.maht;
        }
        else{
          count += t2ituvus;
          t2ituvus = 0;
        }
      }
      return count;
    }


  }
