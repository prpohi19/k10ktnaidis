import static org.junit.jupiter.api.Assertions.assertEquals;

class JoogipudelTest {

    @org.junit.jupiter.api.Test
    void leiaMass() {
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Joogipudel pudel1 = new Joogipudel(0.75, "klaas", 0.25, 0.10, limonaad);
        assertEquals(0.91, pudel1.leiaMass(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void leiaOmahind() {
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Joogipudel pudel1 = new Joogipudel(0.75, "klaas", 0.25, 0.10, limonaad);
        assertEquals(0.595, pudel1.leiaOmahind(), 0.001);
    }
}