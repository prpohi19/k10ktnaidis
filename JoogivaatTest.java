import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JoogivaatTest {

    @Test
    void t2idapudel() {
        ArrayList<Joogipudel> pudelid = new ArrayList<>();
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Joogivaat vaat1 = new Joogivaat(100, limonaad, 30);
        Joogipudel pudel4 = new Joogipudel(0.75, "klaas", 0.25, 0.10, null);
        assertEquals(true, vaat1.t2idapudel(pudel4));
    }
    @Test
    void t2idapudel2() {
        ArrayList<Joogipudel> pudelid = new ArrayList<>();
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Joogivaat vaat1 = new Joogivaat(100, limonaad, 30);
        Joogipudel pudel4 = new Joogipudel(0.75, "klaas", 0.25, 0.10, limonaad);
        assertEquals(false, vaat1.t2idapudel(pudel4));
    }

    @Test
    void t2idaPudelid() {
        ArrayList<Joogipudel> pudelid = new ArrayList<>();
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Jook siirup = new Jook("Siirup", 0.63, 1.12);
        Joogivaat vaat1 = new Joogivaat(100, limonaad, 30);
        Joogipudel pudel4 = new Joogipudel(0.75, "klaas", 0.25, 0.10, null);
        pudelid.add(new Joogipudel(2.25, "plastik", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(0.75, "klaas", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(5.0, "plastik", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(2.25, "plastik", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(0.75, "klaas", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(5.0, "plastik", 0.25, 0.10, null));
        pudelid.add(pudel4);
        assertEquals(13.25, vaat1.t2idaPudelid(pudelid));
        assertEquals(limonaad, pudel4.getSisu());
    }
}