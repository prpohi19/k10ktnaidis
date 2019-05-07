import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class JoogipudelTest{

  Jook vesi = new Jook("vesi", 0.25, 0.50);
  Joogipudel veepudel = new Joogipudel(0.50, "pooleliitrine", 0.10, 0.20, vesi);

  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

  @Test
  public void massJoogigaTest(){
    assertEquals(0.60, veepudel.massJoogiga(), 0.001);
  }

  @Test
  public void komplektiOmahindTest(){
    assertEquals((0.20 + 0.25 * 0.50), veepudel.komplektiOmahind(), 0.001);
  }

}//ends JoogipudelTest class
