package joogid;

import static org.junit.jupiter.api.Assertions.*;

class JoogipudelTest {

    Jook viin = new Jook("Viin", 3, 10);
    Joogipudel lauaviinaPudel = new Joogipudel(2, "Liitrine", 2, 2, viin);

    @org.junit.jupiter.api.Test
    void massjaJook() {
        assertEquals(12.0, lauaviinaPudel.MassjaJook(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void komplektOmahind() {
        assertEquals((2+3*10), lauaviinaPudel.komplektOmahind(), 0.001);
    }
}