import static org.junit.Assert.*;
import org.junit.Test;

public class Test1 {
  // nimi, hind (€), kaal(g)
  // jook, maht(kg), tüüp, mass(g), taara
    @Test
    public void test1(){ //mass
        Jook jook = new Jook("Sidruni vesi", 1.1, 1000);
        Joogipudel pudel = new Joogipudel(jook, 0.5, Pudelityyp.PLAST, 100, 0.1);
        assertEquals(600.0 ,pudel.getMass(), 0.01); // 100 + (0.5*1000)
	     }
	   @Test
	   public void test2(){ //hind
		     Jook jook2 = new Jook("Jõhvika mahl", 2.5, 1100);
		     Joogipudel pudel = new Joogipudel(jook2, 1, Pudelityyp.PLEKK, 200, 0.1);
		     assertEquals(2.6, pudel.getHind(), 0.01); // 0.1+ (2.5* 1 )
	}
  //javac -cp junit4.jar:. Test1.java
  //java -cp junit4.jar:. org.junit.runner.JUnitCore Test1
}
