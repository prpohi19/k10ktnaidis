import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class JoogivaatTest{

  Jook vesi = new Jook("vesi", 0.25, 0.50); //nimetus, liitriomahind, erikaal
  Joogipudel veepudel = new Joogipudel(0.50, "pooleliitrine", 0.10, 0.20, vesi); //maht, pudelityyp, mass, taaramaksumus, jook
  Joogivaat veevaat = new Joogivaat(10, 100, vesi); //ruumala, joogikogus, jook
  Joogivaat veevaatTyhi = new Joogivaat(10, 0, vesi); //ruumala, joogikogus, jook

  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

// Jooki mahub
  @Test
  public void fillPudelTest(){
    assertEquals(true, veevaat.fillPudel(veepudel));
  }

//Jooki ei mahu
  @Test
  public void fillPudelTest2(){
    assertEquals(false, veevaatTyhi.fillPudel(veepudel));
  }

}
