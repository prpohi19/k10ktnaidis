import static org.junit.Assert.*;
import org.junit.Test;


public class Testid1 {

  @Test
  public void testHind(){
    Jook coca = new Jook ("coca", 90, 1);
    Joogipudel joogipudel = new Joogipudel(coca,2000,Joogipudel.Tyyp.klaas,80,10);
   
    assertEquals(1.8f, joogipudel.omaHind(), 0.01);
  }

  @Test
  public void testiMass(){
    Jook coca = new Jook ("coca", 90, 1);
    Joogipudel joogipudel = new Joogipudel(coca,2000,Joogipudel.Tyyp.klaas,80,10);
   
    assertEquals(2080, joogipudel.pudeliMassJoogiga(), 0.01);
  }




}

//compile command | javac -cp junit4.jar:. FAILINIMI.java
//run command | java -cp junit4.jar:. org.junit.runner.JUnitCore FAILINIMI
