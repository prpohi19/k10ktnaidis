import static org.junit.Assert.*;
import org.junit.Test;


public class testfail {

  @Test
  public void testHind(){
    Jook jook = new Jook ("Test", 1, 2.0f);
    Joogipudel joogipudel = new Joogipudel(Joogipudel.Tyyp.PLAST, 1.0f, 20, 0.10f);
    joogipudel.jook = jook;
    assertEquals(5.10f, joogipudel.getPrice(), 0.000001);
  }

}
//compile command | javac -cp junit4.jar:. testfail.java
//run command | java -cp junit4.jar:. org.junit.runner.JUnitCore klassinimi
