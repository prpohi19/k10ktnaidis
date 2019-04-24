import org.junit.*;
import org.junit.Assert.*;

public class TestJoogipudel {
    public static Joogipudel limpsipudel = new Joogipudel(1500, 1, (float) 0.2, (float) 0.5, TestJook.mahl);
    public static Joogipudel ollepudel = new Joogipudel(568, 2, (float) 0.1, (float) 1, TestJook.olu);
    public static Joogipudel mahlapudel = new Joogipudel(1000, 3, (float) 0.4, (float) 0, TestJook.mahl);


    @Test
    public void massid(){
        System.out.println(limpsipudel.massKoosJoogiga());
        System.out.println(ollepudel.massKoosJoogiga());
        System.out.println(mahlapudel.massKoosJoogiga());
    }

    @Test
    public void omahinnad(){
        System.out.println(limpsipudel.komplektiOmahind());
        System.out.println(ollepudel.komplektiOmahind());
        System.out.println(mahlapudel.komplektiOmahind());

    }
}

