import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class PudeliKastTest{

  Jook vesi = new Jook("vesi", 0.25, 0.50); //nimetus, liitriomahind, erikaal
  Joogipudel veepudel = new Joogipudel(0.50, "pooleliitrine", 0.10, 0.20, vesi); //maht, pudelityyp, mass, taaramaksumus, jook
  Joogivaat veevaat = new Joogivaat(10, 100, vesi); //ruumala, joogikogus, jook

//et poleks vaja eraldi methodit teha
  public static Joogipudel[] pudelimasiiv(int pesadearv, Joogipudel pudel){
    Joogipudel[] joogipudelid = new Joogipudel[pesadearv];
    for(int i = 0; i < pesadearv; i++){
        joogipudelid[i] = pudel;
    }
    return joogipudelid;
  }

  PudeliKast kast1 = new PudeliKast("Suur", 75, 30, 16, pudelimasiiv(16, veepudel)); // kastityyp, kastihind, kastimass, pesadearv, joogipudelid


  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

  @Test
  public void kastiMassTest(){
    assertEquals(1.60 + 30, kast1.kastiMass(), 0.001);
  }

  @Test
  public void kastiOmahindTest(){
    assertEquals(16 * 0.20 + 75, kast1.kastiOmahind(), 0.001);
  }

}//ends PudeliKastTest class
