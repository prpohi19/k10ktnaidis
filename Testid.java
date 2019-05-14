import static org.junit.Assert.*;
import org.junit.Test;

public class Testid{
  @Test

  public void testiHind(){

    Jook sprite = new Jook("Sprite", 160, 1000.0);
    Joogipudel jp = new Joogipudel(sprite, 1500.0, Joogipudel.pudelityyp.klaas, 20.0, 20.0);
    assertThat(2.6, is(jp.omahind())); //assertequals
  }
/*
  @Test

  public void testiOmahind(){

  }

  @Test

  public void testiT2ituvus(){

  }

  @Test

  public void testiVilli(){

  }

  @Test

  public void testiKoguMass(){

  }

  @Test

  public void testiKoguOmahind(){

  }

  @Test

  public void testiPudelidKasti(){

  }
  */
}
